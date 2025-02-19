package logica;

import java.util.List;

import accesoDatos.acCliente;
import entidades.cliente;

public class logCliente {
    public boolean crearCliente(cliente cliente){
        acCliente acCliente = new acCliente();
        return acCliente.crearCliente(cliente);
    }
    public boolean actualizarCliente(cliente cliente){
        acCliente acCliente = new acCliente();
        return acCliente.actualizarCliente(cliente);
    }
    public boolean eliminarCliente(String cedula){
        acCliente acCliente = new acCliente();
        return acCliente.eliminarCliente(cedula);
    }
    public cliente consultarCliente(String cedula){
        acCliente acCliente = new acCliente();
        cliente cliente = new cliente();
        cliente = acCliente.consularCliente(cedula);
        return cliente;
    }
    public List<cliente> todosClientes(){
        acCliente acCliente = new acCliente();
        return acCliente.todosClientes();
    }
}
