package com.mycompany.mavenproject1;

import static com.mycompany.mavenproject1.MensajesService.*;
import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author ohmyfi
 */
public class Inicio {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Conexion conexion = new Conexion();
        int opcion = 0;
        do {
            System.out.println("----------------");
            System.out.println(" Aplicacion de Mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensaje");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. Salir");
            //Aqui usuario eligue opcion
            System.out.println("Eliga una opcion");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    crearMensaje();
                    break;
                case 2:
                    listarMensajes();
                    break;
                case 3:
                    borrarMensajes();
                    break;
                case 4:
                    editarMensaje();
                    break;
                default:
                    break;
            }
        } while (opcion != 5);

        try (Connection cnx = conexion.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
