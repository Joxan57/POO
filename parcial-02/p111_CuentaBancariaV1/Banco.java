package p111_CuentaBancariaV1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Banco {
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes; 

    public Banco(){
        Clientes = new ArrayList<Cliente>();
    }
    
    public Banco(String nombre, String domicilio){
        this();
        Nombre = nombre;
        Domicilio = domicilio;
    }

    public void agregarCliente(Cliente cliente){
        Clientes.add(cliente);
    }

    public List<Cliente> getClientes(){
        return Clientes;
    }

    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Clientes=" + getClientes().size() + "]";
    }

    
}
