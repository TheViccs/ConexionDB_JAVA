package javajdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class ConexionSQL {

    static Connection conection = null;

    //Definir un método que haga la conexión
    public static Connection getConexion() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Conexion;" + "user=sa;" + "password=1234";

        try {
            Connection con = DriverManager.getConnection(url);
            
            System.out.println("Conectado");
            return con;
        } catch (Exception e) {
            System.out.println("Error de url");
        }
        return null;
    }

}


