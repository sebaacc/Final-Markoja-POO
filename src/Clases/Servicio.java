package Clases;

public abstract class Servicio {
    //Atributos
    private String nombreServicio, descripcion;

    //Métodos
    public abstract double calcularPrecio();

    //Getters y Setters
    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
