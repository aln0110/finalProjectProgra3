/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Allan
 */
public class venta {
    private int id;
    private String vendedor;
    private String cedVendedor;
    private String cliente;
    private String cedCliente;
    private int cantidad;
    private int descuento;
    private double total;
    private double subTotal;
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVendedor() {
        return vendedor;
    }
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    public String getCedVendedor() {
        return cedVendedor;
    }
    public void setCedVendedor(String cedVendedor) {
        this.cedVendedor = cedVendedor;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getCedCliente() {
        return cedCliente;
    }
    public void setCedCliente(String cedCliente) {
        this.cedCliente = cedCliente;
    }
    public int getDescuento() {
        return descuento;
    }
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
        public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
 
    public venta() {
    }

   


    
    
}
