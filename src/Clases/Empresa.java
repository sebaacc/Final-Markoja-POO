package Clases;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<ALGO> algo = new ArrayList();

    public void agregarALGO(UnidadDeTrabajo unidad){
        this.algo.add(unidad);
    }

    public void quitarALGO(UnidadDeTrabajo unidad){
        this.algo.remove(unidad);
    }
}
