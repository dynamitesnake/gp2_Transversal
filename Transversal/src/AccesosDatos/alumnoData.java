
package AccesosDatos;

import AccesosDatos.Conexion;
import Entidades.Alumno;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class alumnoData {
    private Connection conn =null;
    
    public alumnoData (Conexion miConexion) {
        this.conn = miConexion.getConexion();
    }
    public void guardarAlumno(Alumno alu) {
        String sql = "INSERT * INTO alumno (nombre, apellido, edad, activo) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alu.getNombre());
            ps.setString(2, alu.getApellido());
            //ps.setDate(3, Date.valueOf(alu.getFechaNac()));
            ps.setBoolean(4, alu.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alu.getIdAlumno(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
    }

    public List<Alumno> listarAlumnos() {
        Alumno alu=null;
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumno";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                alu = new Alumno();
                alu.setIdAlumno(rs.getInt("id"));
                alu.setNombre(rs.getString("nombre"));
                alu.setApellido(rs.getString("apellido"));
                alu.setFechaNac(rs.getDate("fechaNac").toLocalDate()); 
                alu.setActivo(rs.getBoolean("activo"));
                alumnos.add(alu);
            }
            ps.close();
        } catch (SQLException ex) {
            
        }
        return alumnos;
    }
    
}
