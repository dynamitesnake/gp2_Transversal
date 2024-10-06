
package Entidades;


public class Materia {
    private int idMateria;
    private String nombre;
    private int año;
    private boolean estado;

    public Materia() {
    }

    public Materia(String nombre, int año, boolean estado) {
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public Materia(int idMateria, String nombre, int año, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", a\u00f1o=" + año + '}';
    }
    
    
}
