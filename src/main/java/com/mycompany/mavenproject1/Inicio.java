package com.mycompany.mavenproject1;
import java.sql.Connection;

/**
 *
 * @author ohmyfi
 */
public class Inicio {
    
    public static void main(String[] args){
    
       Conexion conexion = new Conexion();
       
       try(Connection cnx = conexion.get_connection()){
           
       }catch(Exception e) {
           System.out.println(e);
       }
    }
    
}
