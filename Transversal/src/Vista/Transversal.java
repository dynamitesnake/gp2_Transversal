package Vista;

import AccesosDatos.Conexion;
import AccesosDatos.alumnoData;
import Entidades.Alumno;
import java.time.LocalDate;
import java.util.List;

public class Transversal {
public Conexion miConexion;

    public static void main(String[] args) {
        Alumno alumnoDario = new Alumno(1, "Dario", "Godoy", LocalDate.now(), true);
        Alumno alumnoFer = new Alumno (2,"Fernando","Hernandez", LocalDate.now(), true);
        conectar(alumnoDario);
        conectar(alumnoFer);
    }
    
    public static void conectar (Alumno alumno){
        alumnoData alumnoData = new alumnoData();
        alumnoData.guardarAlumno(alumno);
        
        List<Alumno> alumnos = alumnoData.listarAlumnos();
        for (Object alumnosLista : alumnos) {
            System.out.println(alumnosLista);
        }
        
        
    }
    
}
    

