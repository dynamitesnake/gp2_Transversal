
package Entidades;

public class Materia {
    private int idMateria;
    private String nombreMateria;
    private int año;
    private boolean estado;

    public Materia() {
    }
 public Materia(int idMateria, String nombreMateria, int año, boolean estado) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.año = año;
        this.estado = estado;
    }
 
    public Materia(String nombreMateria, int año, boolean estado) {
        this.nombreMateria = nombreMateria;
        this.año = año;
        this.estado = estado;
    }

   

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getIdMateria() {
        return idMateria;
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

    
    public void setAño(int año) {
        this.año = año;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Materia " + getNombreMateria() + "{" +
                "\nidMateria= " + idMateria +
                ",\nnombreMateria= " + nombreMateria +
                ",\naño= " + año +
                ",\nestado= " + estado +
                "}\n";
    }
    
}
