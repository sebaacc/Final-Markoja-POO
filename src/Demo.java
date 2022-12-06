import Clases.ComboDeServiciosComposite;
import Clases.Empresa;
import Clases.ServicioSimple;
import FactorySingleton.ServicioFactoryMethodSingleton;

public class Demo {
    public static void main(String[] args) {
        Empresa empresaTecnologia = new Empresa("Venta de Electrodomésticos y Tecnología S.A.");
        ServicioFactoryMethodSingleton fabricaDeServicios = ServicioFactoryMethodSingleton.obtenerInstancia();

        ServicioSimple servicioSimple1 = (ServicioSimple) fabricaDeServicios.crearServicio("servicio_simple");
        ServicioSimple servicioSimple2 = (ServicioSimple) fabricaDeServicios.crearServicio("servicio_simple");
        ComboDeServiciosComposite combo1 = (ComboDeServiciosComposite) fabricaDeServicios.crearServicio("COMBO_DE_SERVICIOS");

        servicioSimple1.setNombreServicio("Venta Aire Acondicionado");
        servicioSimple1.setPrecioBase(65000);

        servicioSimple2.setNombreServicio("Colocacion Aire Acondicionado");
        servicioSimple2.setPrecioBase(10000);
        servicioSimple2.setIncluyeColocacion(true);

        combo1.setNombreServicio("Full aire acondicionado");
        combo1.agregarServicio(servicioSimple1);
        combo1.agregarServicio(servicioSimple2);
        combo1.setDescuento(0.10);

        empresaTecnologia.agregarServicio(combo1);
        System.out.println(empresaTecnologia.mostrarServiciosDisponibles());
    }
}
