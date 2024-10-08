package Vista;

import AccesosDatos.Conexion;
import AccesosDatos.alumnoData;
import Entidades.Alumno;
import java.time.LocalDate;


public class Transversal {
public Conexion miConexion;
    
    
    public static void main(String[] args) {
        
        Alumno alumno = new Alumno (1,"Godoy","Dario", LocalDate.now(), true);
        conectar(alumno);
    }
    public static void conectar (Alumno alumno){
        alumnoData aluData = new alumnoData();
        aluData.guardarAlumno(alumno);
        aluData.listarAlumnos();
    }
}
    

