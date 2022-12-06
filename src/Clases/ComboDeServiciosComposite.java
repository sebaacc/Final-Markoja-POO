package Clases;

import java.util.ArrayList;

public class ComboDeServiciosComposite {
    private ArrayList<ALGO> algo = new ArrayList();


    public void agregarALGO(UnidadDeTrabajo unidad) {
        this.unidadesDeTrabajo.add(unidad);
    }

    public void quitarALGO(UnidadDeTrabajo unidad) {
        this.unidadesDeTrabajo.remove(unidad);
    }


}
