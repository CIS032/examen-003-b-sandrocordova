package prueba_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prueba_3 {

    public static void main(String[] args) {
//        try {
//            Class.forName("org.apache.derby.jdbc.ClientDriver");
//            System.out.println("Driver Cargado");
//
//        } catch (Exception e) {
//            System.out.println("Error al cargar Driver" + e);
//        }
//        Connection conexion = null;
//        try {
//            String urlbd = "jdbc:derby://localhost:1527/prueba";//derby es el tipo de la base de datos
//            conexion = DriverManager.getConnection(urlbd, "prueba", "12345");
//            System.out.println("Conexión satisfactoria");
//        } catch (Exception e) {
//            System.out.println("EROR" + e);
//        }
//        try {
//            Statement sentencia = conexion.createStatement();
//            ResultSet registros = sentencia.executeQuery("select *from PROFESOR");
//            while (registros.next()) {
//                String nombres = registros.getString("NOMBRES");
//                String cedula = registros.getString("CEDULA");
//                String apellidos= registros.getString("APELLIDOS");
//                String carrera= registros.getString("CARRERA");
//                String tipoProfesor= registros.getString("TIPOPROFESOR");
//                int horasClase = registros.getInt("HORASCLASE");
//                int horasComplementarias = registros.getInt("HORASCOMPLEMENTARIAS");
//
//                System.out.println("ISBN: " + isbn + " Titulo: " + title + " Edición: " + edition + " CopyRight: " + copyright);
//                
//            }
////            registros.close();
//////            sentencia.close();
////            conexion.close();
//        } catch (SQLException sql) {
//            System.out.println("ERROR al enviar consulta" + sql);
//        }

    }    
}
