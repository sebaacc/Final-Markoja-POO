package Clases;

public class ServicioSimple extends Servicio {
    //Atributos
    private double precioBase;
    private boolean incluyeColocacion;
    //Métodos
    @Override
    public double calcularPrecio() {
        if (incluyeColocacion == true){
            return (getPrecioBase() + (getPrecioBase()*0.10));
        } else {
            return getPrecioBase();
        }
    }
    //Getters y setters
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public boolean isIncluyeColocacion() {
        return incluyeColocacion;
    }
    public void setIncluyeColocacion(boolean incluyeColocacion) {
        this.incluyeColocacion = incluyeColocacion;
    }
}
