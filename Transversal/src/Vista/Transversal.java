package Vista;

import AccesosDatos.*;
import Entidades.*;
import java.time.LocalDate;

public class Transversal {
public Conexion miConexion;

    public static void main(String[] args) {
        /*
        ALTER TABLE inscripcion AUTO_INCREMENT = 0;
        ALTER TABLE materia AUTO_INCREMENT = 0;
        ALTER TABLE alumno AUTO_INCREMENT = 0;
        */
        
        //conectarAlumno();
        //conectarMateria();
        conectarInscripcion();
    }
    
    public static void conectarAlumno(){
        Alumno alumnoEze = new Alumno(123, "Ezequiel", "Herrera", LocalDate.now(), true);
        Alumno alumnoDebo = new Alumno(234, "Deborah", "Gomez", LocalDate.now(), true);
        Alumno alumnoAgos = new Alumno(345, "Agostina", "Camargo", LocalDate.now(), true);
        Alumno alumnoDario = new Alumno(456, "Dario", "Godoy", LocalDate.now(), true);
        Alumno alumnoFer = new Alumno (567, "Fernando","Hernandez", LocalDate.now(), true);
        
        AlumnoData alumnoData = new AlumnoData();
        
        alumnoData.guardarAlumno(alumnoFer);
        alumnoData.guardarAlumno(alumnoAgos);
        alumnoData.guardarAlumno(alumnoDario);
        alumnoData.guardarAlumno(alumnoDebo);
        alumnoData.guardarAlumno(alumnoEze);

        System.out.println(alumnoData.buscarAlumnoPorDni(123));
        System.out.println(alumnoData.buscarAlumnoPorId(3));
        
        //PARA MODIFICAR SE TIENE QUE ESPECIFICAR EL 'ID' EN EL CONSTRUCTOR, EL ID DE LA MATERIA A MODIFICAR
        //EN ESTE CASO SERIA EL 'ID' 1 DEL ALUMNO FERNANDO
        Alumno alumnoModificado = new Alumno(1, 666,"Fernando2.0","Hernandez2.0", LocalDate.now(), true);
        alumnoData.modificarAlumno(alumnoModificado);
        
        alumnoData.darDeBajaPorId(3);
        alumnoData.darDeAltaPorId(3);
        
        alumnoData.borrarAlumnoPorId(1);
        
        for (Alumno alumnos: alumnoData.listarAlumnos()) {
            System.out.println(alumnos);
        }
        
    }

    public static void conectarMateria(){
        Materia matematica = new Materia("Matematica", 2, true);
        Materia programacion = new Materia("Programacion",2,true);
        Materia ingles = new Materia("Ingles", 1, true);
        Materia lengua = new Materia("Lengua",1,true);
        Materia estadistica = new Materia("Estadistica",3,true);

        MateriaData materiadata= new MateriaData();

        materiadata.guardarMateria(matematica);
        materiadata.guardarMateria(programacion);
        materiadata.guardarMateria(ingles);
        materiadata.guardarMateria(lengua);
        materiadata.guardarMateria(estadistica);
    
        System.out.println(materiadata.buscarMateria(1));
        System.out.println(materiadata.buscarMateria(2));
        
        //PARA MODIFICAR SE TIENE QUE ESPECIFICAR EL 'ID' EN EL CONSTRUCTOR, EL ID DE LA MATERIA A MODIFICAR
        //EN ESTE CASO SERIA EL 'ID' 1 DE LA MATERIA MATEMATICAS
        Materia matematicasModificado = new Materia (1, "matematica2.0", 666, true);
        materiadata.modificarMateria(matematicasModificado);

        materiadata.darBajaPorId(3);
        materiadata.darAltaPorId(3);
        
        materiadata.borrarMateriaPorId(1);
        
        for (Materia materias: materiadata.listarMaterias()) {
            System.out.println(materias);
        }
        
    }
    
    public static void conectarInscripcion() {
        AlumnoData alumnoData = new AlumnoData();
        MateriaData materiaData = new MateriaData();
        InscripcionData inscripcionData = new InscripcionData();
        Alumno alumno = alumnoData.buscarAlumnoPorId(1);
        Materia materia = materiaData.buscarMateria(7);
        Inscripcion inscripcion = new Inscripcion(alumno, materia, 10);
        
        //inscripcionData.guardarInscripcion(inscripcion);
        //inscripcionData.actualizarNota(3, 6, 10);
        //inscripcionData.borrarInscripcionMateriaAlumno(3, 6);
        /*
        for (Inscripcion inscripciones: inscripcionData.obtenerInscripciones()) {
            System.out.println(inscripciones);
        }
        
        for (Inscripcion inscripciones: inscripcionData.obtenerInscripcionesPorAlumno(1)) {
            System.out.println(inscripciones);
        }
        
        for (Materia materias: inscripcionData.obtenerMateriasCursadas(1)) {
            System.out.println(materias);
        }
        
        for (Materia materias: inscripcionData.obtenerMateriasNoCursadas(1)) {
            System.out.println(materias);
        }
        */
        for (Alumno alumnos: inscripcionData.obtenerAlumnosXMateria(1)) {
            System.out.println(alumnos);
        }
        
    }
    
}

