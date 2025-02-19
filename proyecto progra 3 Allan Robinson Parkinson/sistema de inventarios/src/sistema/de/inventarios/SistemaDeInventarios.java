/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.de.inventarios;

import java.util.List;

import accesoDatos.acArticulo;
import accesoDatos.acVenta;
import entidades.venta;
import logica.logCalculos;
import logica.logVenta;

/**
 *
 * @author Allan
 */
public class SistemaDeInventarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        acVenta acVenta =new acVenta();
        System.out.println(acVenta.ventaPorVendedor("ced01"));
        acArticulo acArticulo = new acArticulo();
        System.out.println(acArticulo.obtenerCantidad(1));


       
        logVenta logVenta = new logVenta();
        logCalculos logCalculos = new logCalculos();
        List<venta> miLista = logVenta.todoVentas();
        System.out.println(logCalculos.totalDescuento(miLista));
        System.out.println(logCalculos.totalCantidad(miLista));
        System.out.println(logCalculos.totales(miLista));
        System.out.println(logCalculos.subTotales(miLista));
    
    }
    
}
