
package AccesosDatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="universidadulp";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion(){
        
        if(connection==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection= DriverManager.getConnection(URL + DB, USUARIO,PASSWORD);
                 JOptionPane.showMessageDialog(null,"Conexion exitosa");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error a cargar driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error a conectarse a la base de datos");
            }
       }
     return connection;}    
    
}
