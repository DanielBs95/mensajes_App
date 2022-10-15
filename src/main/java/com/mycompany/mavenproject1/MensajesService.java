package com.mycompany.mavenproject1;

import static com.mycompany.mavenproject1.MensajesDAO.*;
import java.util.Scanner;

/**
 *
 * @author cleys
 */
public class MensajesService {
    
    public static void crearMensaje(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = teclado.nextLine();
        
        System.out.println("Tu nombre:");
        String nombre = teclado.nextLine();
        
        Mensajes message = new Mensajes();
        message.setMensaje(mensaje);
        message.setAutorMensaje(nombre);
        //mandas el mensaje a la clase MensajesDao
        crearMensajeDB(message);
    }
    public static void listarMensajes(){
        leerMensajesDB();
    }
    public static void borrarMensajes(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("El ID del mensaje a borrar:");
        int id = Integer.parseInt(teclado.nextLine());
        borrarMensajeDB(id);
        
    }
    public static void editarMensaje(){
        
    }
}
