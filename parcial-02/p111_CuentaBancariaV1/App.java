package p111_CuentaBancariaV1;

public class App {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(5000);
        System.out.println(cuenta1.getSaldo());
        cuenta1.deposita(10000);
        System.out.println(cuenta1.getSaldo());
        boolean retiro = cuenta1.retira(2000);
        System.out.println(retiro);
        System.out.println(cuenta1.getSaldo());

        Cliente cliente1 = new Cliente("Juan", cuenta1);
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getCuenta().getSaldo());
        System.out.println(cliente1);

        Cliente cliente2 = new Cliente("Maria", new CuentaBancaria(10000));
        System.out.println(cliente2);

        Banco banco = new Banco("Banco Nacional", "Calle Principal 123");
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
        banco.agregarCliente(new Cliente("Carlos Castaneda", new CuentaBancaria(50000)));
        System.out.println(banco);
        System.out.println("Clientes del banco : " + "Cantidad : " + banco.getClientes().size());
        double totalSaldo = 0;
        for (Cliente cliente : banco.getClientes()) {
            totalSaldo += cliente.getCuenta().getSaldo();
        }
        System.out.println("Total de saldo de los clientes: " + totalSaldo);


    }
}
