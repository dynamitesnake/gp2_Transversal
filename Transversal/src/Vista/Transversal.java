package Vista;

import AccesosDatos.Conexion;
import AccesosDatos.alumnoData;
import Entidades.Alumno;
import java.time.LocalDate;


public class Transversal {
public Conexion miConexion;
    
    
    public static void main(String[] args) {
        
        LocalDate fecha = LocalDate.now();
        Alumno alumno = new Alumno (1,"Dario","Godoy", LocalDate.now(), true);
        new Transversal().conectar(alumno);
    }
   void conectar (Alumno alu){
        miConexion = new Conexion (); 
        alumnoData aluData = new alumnoData(miConexion);
        aluData.guardarAlumno(alu);
        aluData.listarAlumnos();
      
    }
}
    

