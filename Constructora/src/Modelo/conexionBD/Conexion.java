
package Modelo.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
     private static Connection cn = null;
   
    public static Connection conectar() {
        String drive = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/constructora";
        String usuario = "root";
        String clave = "";
        if (cn == null) {
            try {
                Class.forName(drive);
                cn = DriverManager.getConnection(url, usuario, clave);
                 System.out.println("¡¡Conexión activa!!");
            } catch (ClassNotFoundException ex) {
                System.out.println("Ha ocurrido un error: "+ ex);
            } catch (SQLException ex) {
                System.out.println("Error en la conexión: "+ ex);
            }
        }
        return cn;
    }
}
