package Clases;

import java.util.ArrayList;

public class ComboDeServiciosComposite extends Servicio{
    //Atributos
    private ArrayList<ServicioSimple> comboDeServicios = new ArrayList();
    private double descuento;

    //Métodos
    public void agregarServicio(ServicioSimple servicio) {
        this.comboDeServicios.add(servicio);
    }

    public void quitarServicio(ServicioSimple servicio) {
        this.comboDeServicios.remove(servicio);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        for (ServicioSimple servicio : comboDeServicios) {
            precioTotal += servicio.calcularPrecio();
        }
        double precioTotalConDescuento = precioTotal - (precioTotal * this.getDescuento());
        return precioTotalConDescuento;
    }

    @Override
    public String toString() {
        return "ComboDeServiciosComposite{" +
                "comboDeServicios=" + comboDeServicios +
                '}';
    }

    //getter y setter de descuento
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
