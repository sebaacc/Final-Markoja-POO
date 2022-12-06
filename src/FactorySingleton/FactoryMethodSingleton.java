package FactorySingleton;

public class FactoryMethodSingleton {
    private static FactoryMethodSingleton instancia;

    private FactoryMethodSingleton() {}


    public static FactoryMethodSingleton obtenerInstancia(){
        if (FactoryMethodSingleton.instancia == null){
            FactoryMethodSingleton.instancia = new FactoryMethodSingleton();
        }
        return FactoryMethodSingleton.instancia;
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
