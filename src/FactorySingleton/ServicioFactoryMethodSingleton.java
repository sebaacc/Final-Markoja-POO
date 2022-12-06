package FactorySingleton;

public class ServicioFactoryMethodSingleton {
    private static ServicioFactoryMethodSingleton instancia;

    private ServicioFactoryMethodSingleton() {}


    public static ServicioFactoryMethodSingleton obtenerInstancia(){
        if (ServicioFactoryMethodSingleton.instancia == null){
            ServicioFactoryMethodSingleton.instancia = new ServicioFactoryMethodSingleton();
        }
        return ServicioFactoryMethodSingleton.instancia;
    }

    public Algo crearALGO (String tipo){
        switch (tipo.toUpperCase()){
            case "SIMPLE":
                return new UnidadDeTrabajoSimple();
            case "COMBINADA" :
                return new UnidadDeTrabajoCombinadaComposite();
        }
        return null;
    }
}
