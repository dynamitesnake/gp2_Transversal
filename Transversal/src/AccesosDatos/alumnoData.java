
package AccesosDatos;

import AccesosDatos.Conexion;
import Entidades.Alumno;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class alumnoData {
    private Connection conn =null;
    
    public alumnoData () {
        this.conn = Conexion.getConexion();
    }
    public void guardarAlumno(Alumno alumno) {
        System.out.println("\nGuardar alumno: " + alumno.getNombre());
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNacimiento()));//localDate a Date
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("pruebas");
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    
    public Alumno buscarAlumnoPorId(int idAlumno) {
        System.out.println("\nBuscar alumno por id: " + idAlumno);
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(idAlumno);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setfechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;
    }
    
    public Alumno buscarAlumnoPorDni(int dni) {
        System.out.println("\nBuscar alumno por DNI: " + dni);
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE dni = ? AND estado = 1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno=new Alumno(); 
                alumno.setIdAlumno(rs.getInt("idAlumno")); 
                alumno.setDni(rs.getInt("dni")); 
                alumno.setApellido(rs.getString("apellido")); 
                alumno.setNombre(rs.getString("nombre")); 
                alumno.setfechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;
    }

    public List<Alumno> listarAlumnos() {
        System.out.println("\nLista de todos los alumnos");
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumno";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setfechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate()); 
                alumno.setActivo(rs.getBoolean("estado"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
        return alumnos;
    }
    
    public void modificarAlumno(Alumno alumno) {
        System.out.println("\nModificar alumno: " + alumno.getNombre());
        String sql = "UPDATE alumno SET dni = ? , apellido = ?, nombre = ?, fechaNacimiento = ? WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno()); 
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }
    
    public void darDeBajaPorId(int idAlumno) {
        System.out.println("\nDar de baja a id: " + idAlumno);
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            int fila=ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Baja al alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }
    }
    
    public void darDeAltaPorId(int idAlumno) {
        System.out.println("\nDar de alta a id: " + idAlumno);
        String sql = "UPDATE alumno SET estado = 1 WHERE idAlumno = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            int fila=ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Alta al alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
    }
    
    public void borrarAlumnoPorId(int idAlumno) {
        System.out.println("\nBorrar alumno con id: " + idAlumno);
        String sql = "DELETE FROM alumno WHERE idAlumno = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            int fila = ps.executeUpdate();
            if (fila == 1) {
               JOptionPane.showMessageDialog(null, "Alumno borrado exitosamente");
            } else {
               JOptionPane.showMessageDialog(null, "El alumno no existe o ya ha sido eliminado");
            }
           ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
    }
    
}
