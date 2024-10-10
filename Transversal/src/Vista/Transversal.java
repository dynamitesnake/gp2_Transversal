package Vista;

import AccesosDatos.Conexion;
import AccesosDatos.MateriaData;
import AccesosDatos.alumnoData;
import Entidades.Alumno;
import Entidades.Materia;
import java.time.LocalDate;
import java.util.List;

public class Transversal {
public Conexion miConexion;

    public static void main(String[] args) {
        conectar();
    }
    
    public static void conectar (){
        //SI SE VAN A HACER PRUEBAS EN LA BASE DE DATOS
        //SE RECOMIENDA TENER LA BASE DE DATOS SIN TABLAS 
        //Y UTILIZAR ESTE COMANDO SQL: ALTER TABLE alumno AUTO_INCREMENT = 0;
        
        Alumno alumnoEze = new Alumno("Ezequiel", "Herrera", LocalDate.now(), true);
        Alumno alumnoDebo = new Alumno("Deborah", "Gomez", LocalDate.now(), true);
        Alumno alumnoAgos = new Alumno("Agostina", "Camargo", LocalDate.now(), true);
        Alumno alumnoDario = new Alumno( "Dario", "Godoy", LocalDate.now(), true);
        Alumno alumnoFer = new Alumno ("Fernando","Hernandez", LocalDate.now(), true);
        
        alumnoData alumnoData = new alumnoData();
        
        alumnoData.guardarAlumno(alumnoFer);
        alumnoData.guardarAlumno(alumnoAgos);
        alumnoData.guardarAlumno(alumnoDario);
        alumnoData.guardarAlumno(alumnoDebo);
        alumnoData.guardarAlumno(alumnoEze);

        //System.out.println(alumnoData.buscarAlumnoPorDni(1));
        //System.out.println(alumnoData.buscarAlumnoPorId(3));
        
        //Alumno alumnoFerModificado = new Alumno(1, 666,"Fernando2.0","Hernandez2.0", LocalDate.now(), true);
        //alumnoData.modificarAlumno(alumnoFerModificado);
        
        //alumnoData.darDeBajaPorId(1);
        //alumnoData.darDeAltaPorId(1);
        
        //alumnoData.borrarAlumnoPorId(1);
        
        /*
        List<Alumno> alumnos = alumnoData.listarAlumnos();
        for (Alumno alumno: alumnos) {
            System.out.println(alumno);
        }
        */
    }
    Materia mateMa = new Materia("matematica", 2, true);
    Materia programacion = new Materia("programacion",2,true);
    Materia ingles = new Materia("ingles", 1, true);
    Materia lengua = new Materia("lengua",1,true);
    Materia estadistica = new Materia("estadistica",3,true);
    
    MateriaData materiadata= new MateriaData();
    
    
    
}