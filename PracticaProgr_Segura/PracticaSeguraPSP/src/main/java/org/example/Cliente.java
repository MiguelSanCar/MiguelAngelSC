package org.example;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Cliente
{
    public static void main( String[] args ) throws IOException {
        //escaner de teclado para introducir la cantidad de clientes a realizar
        Scanner teclado = new Scanner(System.in);

        int numeroPuerto = 6061;// Puerto1
        int cantidadClientes = 0;

        //comprobar clientes
        boolean comprobar = false;

        //contador de los clientes
        int cont = 0;


        do{
            System.out.println("Buenas, introduce la cantidad de clientes que van a contactar con el " +
                    "servidor, por favor, debe ser numérica");
            try{
                cantidadClientes = teclado.nextInt();
            }catch (Exception e){
                System.out.println("Ha ocurrido un error, introduce de nuevo la cantidad");
            }
            if(cantidadClientes < 0){
                System.out.println("Por favor, introduce un valor válido");
            }else{
                comprobar = true;
            }
        }while (comprobar);

        ServerSocket servidor = new ServerSocket(numeroPuerto);
        //por cada mensaje recibido por el cliente se ejecuta el bucle,
        // cada vez mandandole un mensaje diferente a cada cliente
        do{
            Socket clienteConectado = null;
            System.out.println("Esperando al cliente " + cont);
            clienteConectado = servidor.accept();
// CREO FLUJO DE SALIDA AL CLIENTE
            OutputStream salida = null;
            salida = clienteConectado.getOutputStream();
            DataOutputStream flujoSalida = new DataOutputStream(salida);
// ENVIO UN SALUDO AL CLIENTE
            flujoSalida.writeUTF("Saludos al cliente " + cont);
// CERRAR STREAMS Y SOCKETS
            salida.close();
            flujoSalida.close();
            clienteConectado.close();

            cont++;
        }while(cont < 4);

        servidor.close();

    }
}
