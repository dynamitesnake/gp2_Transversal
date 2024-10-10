package Vista;

import AccesosDatos.Conexion;
import AccesosDatos.MateriaData;
import AccesosDatos.AlumnoData;
import Entidades.Alumno;
import Entidades.Materia;
import java.time.LocalDate;
import java.util.List;

public class Transversal {
public Conexion miConexion;

    public static void main(String[] args) {
        conectarAlumno();
        conectaMateria();
    }
    
    public static void conectarAlumno(){
        //SI SE VAN A HACER PRUEBAS EN LA BASE DE DATOS
        //SE RECOMIENDA TENER LA BASE DE DATOS SIN TABLAS 
        //Y UTILIZAR ESTE COMANDO SQL: ALTER TABLE alumno AUTO_INCREMENT = 0;
        
        Alumno alumnoEze = new Alumno("Ezequiel", "Herrera", LocalDate.now(), true);
        Alumno alumnoDebo = new Alumno("Deborah", "Gomez", LocalDate.now(), true);
        Alumno alumnoAgos = new Alumno("Agostina", "Camargo", LocalDate.now(), true);
        Alumno alumnoDario = new Alumno( "Dario", "Godoy", LocalDate.now(), true);
        Alumno alumnoFer = new Alumno ("Fernando","Hernandez", LocalDate.now(), true);
        
        AlumnoData alumnoData = new AlumnoData();
        
        alumnoData.guardarAlumno(alumnoFer);
        alumnoData.guardarAlumno(alumnoAgos);
        alumnoData.guardarAlumno(alumnoDario);
        alumnoData.guardarAlumno(alumnoDebo);
        alumnoData.guardarAlumno(alumnoEze);

        System.out.println(alumnoData.buscarAlumnoPorDni(1));
        System.out.println(alumnoData.buscarAlumnoPorId(3));
        
        Alumno alumnoFerModificado = new Alumno(1, 666,"Fernando2.0","Hernandez2.0", LocalDate.now(), true);
        alumnoData.modificarAlumno(alumnoFerModificado);
        
        alumnoData.darDeBajaPorId(1);
        alumnoData.darDeAltaPorId(1);
        
        alumnoData.borrarAlumnoPorId(1);
        
        List<Alumno> alumnos = alumnoData.listarAlumnos();
        for (Alumno alumno: alumnos) {
            System.out.println(alumno);
        }
     
    }

    public static void conectaMateria(){
        Materia matematica = new Materia("matematica", 2, true);
        Materia programacion = new Materia("programacion",2,true);
        Materia ingles = new Materia("ingles", 1, true);
        Materia lengua = new Materia("lengua",1,true);
        Materia estadistica = new Materia("estadistica",3,true);

        MateriaData materiadata= new MateriaData();

        materiadata.guardarMateria(matematica);
        materiadata.guardarMateria(programacion);
        materiadata.guardarMateria(ingles);
        materiadata.guardarMateria(lengua);
        materiadata.guardarMateria(estadistica);
    
        System.out.println(materiadata.buscarMateria(1));
        System.out.println(materiadata.buscarMateria(2));
        
        Materia matematicasModificado = new Materia ("mate", 2, true);
        materiadata.modificarMateria(matematicasModificado);

        materiadata.darBajaPorId(3);
        materiadata.darAltaPorId(3);
        
        materiadata.borrarMateriaPorId(4);
        
        
        List<Materia> materias = materiadata.listarMaterias();    
        for (Materia materia : materias) {
            System.out.println(materia);
        }
    }
}

