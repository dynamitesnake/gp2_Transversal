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
        
        List<Alumno> alumnos = alumnoData.listarAlumnos();
        for (Alumno alumno: alumnos) {
            System.out.println(alumno);
        }
        
    }

    public static void conectaMateria(){
        //SI SE VAN A HACER PRUEBAS EN LA BASE DE DATOS
        //SE RECOMIENDA TENER LA BASE DE DATOS SIN TABLAS 
        //Y UTILIZAR ESTE COMANDO SQL: ALTER TABLE materia AUTO_INCREMENT = 0;
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
        
        List<Materia> materias = materiadata.listarMaterias();    
        for (Materia materia : materias) {
            System.out.println(materia);
        }
        
    }
    
}

