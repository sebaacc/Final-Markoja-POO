package FactorySingleton;

import Clases.ComboDeServiciosComposite;
import Clases.Servicio;
import Clases.ServicioSimple;

public class ServicioFactoryMethodSingleton {
    //Atributo
    private static ServicioFactoryMethodSingleton instancia;

    //Constructor privado
    private ServicioFactoryMethodSingleton() {}

    //Métodos
    public static ServicioFactoryMethodSingleton obtenerInstancia(){
        if (ServicioFactoryMethodSingleton.instancia == null){
            ServicioFactoryMethodSingleton.instancia = new ServicioFactoryMethodSingleton();
        }
        return ServicioFactoryMethodSingleton.instancia;
    }

    public Servicio crearServicio (String tipo){
        switch (tipo.toUpperCase()){
            case "SERVICIO_SIMPLE":
                return new ServicioSimple();
            case "COMBO_DE_SERVICIOS" :
                return new ComboDeServiciosComposite();
        }
        return null;
    }
}
