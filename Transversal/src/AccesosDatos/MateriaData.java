

package AccesosDatos;

import AccesosDatos.Conexion;
import Entidades.Materia;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;


public class MateriaData {
    private Connection conn =null;

    public MateriaData() {
        this.conn = Conexion.getConexion();
    }
    public void guardarMateria(Materia materia) {
        System.out.println("\nGuardar materia");
        String sql = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
        
         try {
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
    
    public Materia buscarMateria(int idMateria) {
        System.out.println("\nBuscar materia por id");
        Materia materia = null;
        String sql = "SELECT nombre, año FROM materia WHERE idMateria = ? AND estado = 1";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                materia=new Materia();
                materia.setIdMateria(idMateria);
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(true);
               
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materia;
    }
    
    public List<Materia> listarMaterias() {
        System.out.println("\nLista de todas las materias");
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAño(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
        return materias;
    }
    
    public void modificarMateria(Materia materia) {
        System.out.println("\nModificar materia");
        String sql = "UPDATE materia SET nombre = ? , año = ? WHERE idMateria = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAño());
            ps.setInt(3, materia.getIdMateria()); 
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
    
     public void eliminarMateria(int idMateria) {
        System.out.println("\nEliminar Materia");
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int fila=ps.executeUpdate();
            
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el materia.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla materia");
        }
    }
    
      public void darBajaPorId(int idMateria) {
        System.out.println("\nDar de baja");
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int fila=ps.executeUpdate();
            
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Baja de materia.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia.");
        }
    }
    
    public void darAltaPorId(int idMateria) {
        System.out.println("\nDar de alta");
        String sql = "UPDATE materia SET estado = 1 WHERE idMateria = ? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idMateria);
            int fila=ps.executeUpdate();
            
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Alta de materia.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
    }
}
