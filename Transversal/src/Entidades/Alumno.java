
package Entidades;

import java.time.LocalDate;

public class Alumno {
    private int idAlumno;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private boolean activo;

    public Alumno() {
    }

    public Alumno(int dni, String nombre, String apellido, LocalDate fechaNac, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }

    public Alumno(int idAlumno, int dni, String nombre, String apellido, LocalDate fechaNac, boolean activo) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }

    public int getIdAlumno(int IdAlumno) {
        return idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
