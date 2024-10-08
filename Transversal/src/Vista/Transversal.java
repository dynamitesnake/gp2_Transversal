package Vista;

import AccesosDatos.Conexion;
import AccesosDatos.alumnoData;
import Entidades.Alumno;
import java.time.LocalDate;

public class Transversal {
public Conexion miConexion;

    public static void main(String[] args) {
        conectar();
    }
    
    public static void conectar (){
        Alumno alumnoEze = new Alumno(1, "Ezequiel", "Herrera", LocalDate.now(), true);
        Alumno alumnoDebo = new Alumno(2, "Deborah", "Gomez", LocalDate.now(), true);
        Alumno alumnoAgos = new Alumno(3, "Agostina", "Camargo", LocalDate.now(), true);
        Alumno alumnoDario = new Alumno(4, "Dario", "Godoy", LocalDate.now(), true);
        Alumno alumnoFer = new Alumno (5,"Fernando","Hernandez", LocalDate.now(), true);
        
        alumnoData alumnoData = new alumnoData();
        alumnoData.guardarAlumno(alumnoFer);
        alumnoData.guardarAlumno(alumnoAgos);
        alumnoData.guardarAlumno(alumnoDario);
        alumnoData.guardarAlumno(alumnoDebo);
        alumnoData.guardarAlumno(alumnoEze);
        Alumno alumnoFerModificado = new Alumno(1, 666,"Fernando2.0","Hernandez2.0", LocalDate.now(), true);
        alumnoData.modificarAlumno(alumnoFer);
        alumnoData.eliminarAlumnoPorId(1);
    }
    
}