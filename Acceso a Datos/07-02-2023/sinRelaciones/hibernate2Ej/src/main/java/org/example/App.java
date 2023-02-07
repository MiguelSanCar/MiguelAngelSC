package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args ) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();


        HttpURLConnection connection = null;
        OutputStreamWriter wr = null;
        String line = null;

        Cocktail cocktail = null;
        try {
            // LLamar a API
            URL serverAddress = new URL("https://www.thecocktaildb.com/api/json/v1/1/search.php?f=a");
            connection = (HttpURLConnection) serverAddress.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setReadTimeout(10000);
            connection.connect();

            // Leer resultados API
            BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder sb = new StringBuilder();

            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }

            // Formatear resultados API
            JsonObject objetoJson = new Gson().fromJson(sb.toString(), JsonObject.class);
            JsonArray cocktails = objetoJson.get("drinks").getAsJsonArray();

            //ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();

            for (int i = 0; i < cocktails.size(); i++) {
                session = HibernateUtil.getSessionFactory().getCurrentSession();

                cocktail = new Cocktail();


                System.out.println(cocktails.get(i).getAsJsonObject().get("idDrink"));
                cocktail.setIdDrink(cocktails.get(i).getAsJsonObject().get("idDrink").getAsInt());

                System.out.println(cocktails.get(i).getAsJsonObject().get("strDrink"));
                cocktail.setStrDrink(cocktails.get(i).getAsJsonObject().get("strDrink").getAsString());

                System.out.println(cocktails.get(i).getAsJsonObject().get("strAlcoholic"));
                cocktail.setStrAlcoholic(cocktails.get(i).getAsJsonObject().get("strAlcoholic").getAsString());

                System.out.println(cocktails.get(i).getAsJsonObject().get("strInstructions"));
                cocktail.setStrInstructions(cocktails.get(i).getAsJsonObject().get("strInstructions").getAsString());

                System.out.println(cocktails.get(i).getAsJsonObject().get("strDrinkThumb"));
                cocktail.setStrDrinkThumb(cocktails.get(i).getAsJsonObject().get("strDrinkThumb").getAsString());

                Transaction transaction = session.beginTransaction();
                session.save(cocktail);

                for (int x = 1; x < 16; x++) {
                    if (!cocktails.get(i).getAsJsonObject().get("strIngredient" + x).isJsonNull()) {
                        System.out.println(cocktails.get(i).getAsJsonObject().get("strIngredient" + x));
                        Ingredientes ingrediente = new Ingredientes(cocktails.get(i).getAsJsonObject().get("strIngredient" + x).getAsString(), cocktail.getId());
                        session.save(ingrediente);
                    }
                }
                /*
                for (int x = 1; x < 16; x++) {
                    if (!cocktails.get(i).getAsJsonObject().get("strMeasure" + x).toString().equals("null")) {
                        System.out.println(cocktails.get(i).getAsJsonObject().get("strMeasure" + x));
                        ingredientes.add(cocktails.get(i).getAsJsonObject().get("strMeasure" + x));
                    }
                }*/
                transaction.commit();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
            System.out.println(cocktail);
        }
    }

    public static void insertarDatos(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    }
}
