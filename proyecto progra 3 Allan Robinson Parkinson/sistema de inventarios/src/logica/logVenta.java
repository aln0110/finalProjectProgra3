package logica;

import java.util.List;

import accesoDatos.acVenta;
import entidades.venta;

public class logVenta {
    public boolean crearVenta(venta venta){
        acVenta acVenta = new acVenta();
        return acVenta.crearVenta(venta);
    }
    public boolean actualizarVenta(venta venta){
        acVenta acVenta = new acVenta();
        return acVenta.actualizarVenta(venta);
    }
    public boolean eliminarVenta(int id){
        acVenta acVenta = new acVenta();
        return acVenta.eliminarVenta(id);
    }

    public venta obtenerVenta(int id){
        acVenta acVenta = new acVenta();
        venta venta =new venta();
        venta = acVenta.obtenerVenta(id);
        return venta;
    }
    public List<venta> todoVentas(){
        acVenta acVenta = new acVenta();
        return acVenta.todasVentas();
    }
    public List<venta> ventaPorVendedor(String cedula){
        acVenta acVenta = new acVenta();
        return acVenta.ventaPorVendedor(cedula);
    }
    public List<venta> ventaPorCliente(String cedula){
        acVenta acVenta = new acVenta();
        return acVenta.ventaPorCliente(cedula);
    }
}
