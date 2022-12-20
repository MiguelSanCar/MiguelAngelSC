package org.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import empleadoCRUD.EmpleadoCRUD;
import model.Empleado;
import org.bson.Document;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        MongoClient mongoClient = null;







        try{

            mongoClient = new MongoClient("localhost",27017);
            MongoDatabase conexion =  mongoClient.getDatabase("PracticaMongo");
            MongoCollection<Document> coleccion = conexion.getCollection("empleados");

            //INSERTAR EMPLEADOS
            //Alta es tipo de dato String porque los date daban problemas

            Empleado empleado1 = new Empleado("Ricardo",32,true, "2000-01-14",1500);
            empleadoCRUD.insertarEmpleado(coleccion, empleado1);
            Empleado empleado2 = new Empleado("Nelson",24,false, "2015-05-20",3500);
            empleadoCRUD.insertarEmpleado(coleccion, empleado2);

            //CONSULTAR EMPLEADO

            Empleado empleadoConsultado = empleadoCRUD.consultarEmpleado(coleccion,"Ricardo");
            System.out.println("\nResultado de la consulta:"+ empleadoConsultado.toString());


            //ELIMINAR EMPLEADO
            empleadoCRUD.eliminarEmpleado(coleccion,"Ricardo");


            //ACTUALIZAR EMPLEADO

            empleado2.setEdad(10);
            empleadoCRUD.actualizarEmpleado(coleccion, empleado2);



            //LISTAR TODOS LOS EMPLEADOS DE LA BBDD
            List<Empleado> empleados = empleadoCRUD.listarEmpleados(coleccion);

            empleados = empleadoCRUD.listarEmpleados(coleccion);
            System.out.println("\nLista empleados\n-----------------");

            for(Empleado empleado: empleados){
                System.out.println(empleado.toString());
            }

        }catch (Exception e){
            System.out.println("Error 404" +e.getCause().getMessage());
        }finally {
            if(mongoClient != null){
                mongoClient.close();
            }
        }
    }
}