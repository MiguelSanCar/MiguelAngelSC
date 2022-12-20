package empleadoCRUD;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import converter.EmpleadoDocConverter;
import model.Empleado;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import static converter.EmpleadoDocConverter.empleadoADoc;

public class EmpleadoCRUD {

    EmpleadoDocConverter converter = new EmpleadoDocConverter();


    //Listar libros

    public List<Empleado> listarEmpleados(MongoCollection<Document> mongodb){

        List <Empleado> listaEmpleados = new ArrayList<>();

        List<Document> listaDocumentos = mongodb.find().into(new ArrayList<Document>());

        Empleado empleado;

        for(Document documento : listaDocumentos){
            empleado = converter.docAEmpleado(documento);

            listaEmpleados.add(empleado);
        }

        return listaEmpleados;
    }

    public  Empleado consultarEmpleado(MongoCollection<Document> mongoCollection,String nombre){
        Document documento = mongoCollection.find(Filters.eq("nombre", nombre)).first();
        return converter.docAEmpleado(documento);
            }

    public  void insertarEmpleado(MongoCollection<Document> mongoCollection, Empleado empleado){
        Document documento = empleadoADoc(empleado);

        try{
            if(consultarEmpleado(mongoCollection, empleado.getNombre()) == null){
                mongoCollection.insertOne(documento);
            }else{
                System.out.println("Error -> No se puede insertar" );
            }


        }catch (Exception e){
        e.printStackTrace();
        }
    }


    public void actualizarEmpleado(MongoCollection<Document> mongoCollection, Empleado empleado){

        Document documento = empleadoADoc(empleado);

        try{
            mongoCollection.replaceOne(Filters.eq("nombre",empleado.getNombre()), documento);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void  eliminarEmpleado(MongoCollection<Document> mongoCollection, String nombre){

        try {
            mongoCollection.deleteOne(Filters.eq("nombre",nombre));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
