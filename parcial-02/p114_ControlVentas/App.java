package p114_ControlVentas;

public class App {

    public static void main(String[] args) {

        Tienda miTienda = new Tienda("Abarrotes El Checo", "Carlos Castaneda", "Av. Luis Moya 345");

        Cliente c1 = new Cliente("Felipe Calderon", "Las Lomas 123", "calde@msn.com");
        Cliente c2 = new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com");
        Cliente c3 = new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com");
        Cliente c4 = new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@precidencia.gob.mx");

        miTienda.agregarCliente(c1);
        miTienda.agregarCliente(c2);
        miTienda.agregarCliente(c3);
        miTienda.agregarCliente(c4);

        c1.agregarVenta(new VentaContado("Martillo", 10.0, 60.50, 0.10, "Sacabrocados"));
        c1.agregarVenta(new VentaCredito("Pala", 2.0, 1170.55, 3.0, 0.10));

        c2.agregarVenta(new VentaCredito("Clavo", 2.5, 160.34, 2.0, 0.20));
        c2.agregarVenta(new VentaCredito("Cinta de Aislar", 5.0, 71.34, 6.0, 0.20));
        c2.agregarVenta(new VentaContado("Pinzas", 10.0, 650.33, 0.20, "Taladro"));

        c3.agregarVenta(new VentaContado("Thiner", 50.0, 65.00, 0.10, "Aerosol"));

        System.out.print("\033[H\033[3J");
        miTienda.reporte();
    }
}