
package Entidades;

public class Inscripcion {
    private int idInscripcion;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Inscripcion() {
    }

    public Inscripcion(double nota) {
        this.nota = nota;
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public double getNota() {
        return nota;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion " + "{" +
                "\nAlumno= " + alumno.getNombre() + " " + alumno.getApellido() +
                ",\nMateria= " + materia.getNombreMateria() + " " + materia.getAño() +
                ",\nNota= " + nota +
                "}\n";
    }
    
}
