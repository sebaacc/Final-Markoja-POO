package Clases;

import java.util.ArrayList;

public class Empresa {
    //Atributos
    private String razonSocial;
    private ArrayList<Servicio> servicios = new ArrayList();

    //Constructor
    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    //Métodos
    public void agregarServicio(Servicio servicio){
        this.servicios.add(servicio);
    }

    public void quitarServicio(Servicio servicio){
        this.servicios.remove(servicio);
    }

    public String mostrarServiciosDisponibles(){




    }

    //Getter y setter razonSocial
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
