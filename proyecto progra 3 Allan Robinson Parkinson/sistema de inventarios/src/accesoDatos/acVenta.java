package accesoDatos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import entidades.venta;


public class acVenta {
    public boolean crearVenta(venta venta){
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("insert into tbventa values (?,?,?,?,?,?,?,?,?)");
            sentence.setString(1, "0");
            sentence.setString(2, venta.getVendedor());
            sentence.setString(3, venta.getCedVendedor());
            sentence.setString(4, venta.getCliente());
            sentence.setString(5, venta.getCedCliente());
            sentence.setString(6, String.valueOf(venta.getDescuento()));
            sentence.setString(7, String.valueOf(venta.getCantidad()));
            sentence.setString(8, String.valueOf(venta.getTotal()));
            sentence.setString(9, String.valueOf(venta.getSubTotal()));
            sentence.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
            
        }

    }
    public boolean eliminarVenta(int id){
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("delete from tbventa where id=?");
            sentence.setString(1, String.valueOf(id));
            sentence.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean actualizarVenta(venta venta){

        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("update tbventa set  vendedor=?, cedVendedor=?, cliente=?, cedCliente=?, descuento=? , subTotal=? where id=?");
            sentence.setString(1, venta.getVendedor());
            sentence.setString(2, venta.getCedVendedor());
            sentence.setString(3, venta.getCliente());
            sentence.setString(4, venta.getCedCliente());
            sentence.setString(5, String.valueOf(venta.getDescuento()));
            sentence.setString(6, String.valueOf(venta.getSubTotal()));
            sentence.setString(7, String.valueOf(venta.getId()));
    
            sentence.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public venta obtenerVenta(int id){
        venta venta = new venta();
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbventa where id=?");
            sentence.setString(1, String.valueOf(id));
            ResultSet rs = sentence.executeQuery();

            while (rs.next()) {
                venta.setId(Integer.parseInt(rs.getString("id")));
                venta.setVendedor(rs.getString("vendedor"));
                venta.setCedVendedor(rs.getString("cedVendedor"));
                venta.setCliente(rs.getString("cliente"));
                venta.setCedCliente(rs.getString("cedCliente"));
                venta.setDescuento( Integer.parseInt(rs.getString("descuento")));
                venta.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                venta.setTotal(Double.parseDouble(rs.getString("total")));
                venta.setSubTotal(Double.parseDouble(rs.getString("subTotal")));
            }
        } catch (Exception e) {
            System.out.println(e);
            venta = null;
        }
        return venta;
    }

    public List<venta> todasVentas(){
        List<venta> listaVentas = new ArrayList<>();
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbventa ");
            ResultSet rs = sentence.executeQuery();
            while (rs.next()) {
                venta venta = new venta();
                venta.setId(Integer.parseInt(rs.getString("id")));
                venta.setVendedor(rs.getString("vendedor"));
                venta.setCedVendedor(rs.getString("cedVendedor"));
                venta.setCliente(rs.getString("cliente"));
                venta.setCedCliente(rs.getString("cedCliente"));
                venta.setDescuento( Integer.parseInt(rs.getString("descuento")));
                venta.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                venta.setTotal(Double.parseDouble(rs.getString("total")));
                venta.setSubTotal(Double.parseDouble(rs.getString("subTotal")));
                listaVentas.add(venta);

            }
            
        } catch (Exception e) {
            System.out.println(e);
            listaVentas=null;
        }
       return listaVentas;
    }

    public  List<venta> ventaPorVendedor(String cedula){
         List<venta> listaVentas = new ArrayList<>();
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbventa where cedVendedor=?");
            sentence.setString(1, cedula);
            ResultSet rs = sentence.executeQuery();
            while (rs.next()) {
                venta venta = new venta();
                venta.setId(Integer.parseInt(rs.getString("id")));
                venta.setVendedor(rs.getString("vendedor"));
                venta.setCedVendedor(rs.getString("cedVendedor"));
                venta.setCliente(rs.getString("cliente"));
                venta.setCedCliente(rs.getString("cedCliente"));
                venta.setDescuento( Integer.parseInt(rs.getString("descuento")));
                venta.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                venta.setTotal(Double.parseDouble(rs.getString("total")));
                venta.setSubTotal(Double.parseDouble(rs.getString("subTotal")));
                listaVentas.add(venta);

            }
            
        } catch (Exception e) {
            System.out.println(e);
            listaVentas=null;
        }
       return listaVentas;
    }

    public List<venta> ventaPorCliente(String cedula){
        List<venta> listaVentas = new ArrayList<>();
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbventa where cedCliente=?");
            sentence.setString(1, cedula);
            ResultSet rs = sentence.executeQuery();
            while (rs.next()) {
                venta venta = new venta();
                venta.setId(Integer.parseInt(rs.getString("id")));
                venta.setVendedor(rs.getString("vendedor"));
                venta.setCedVendedor(rs.getString("cedVendedor"));
                venta.setCliente(rs.getString("cliente"));
                venta.setCedCliente(rs.getString("cedCliente"));
                venta.setDescuento( Integer.parseInt(rs.getString("descuento")));
                venta.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                venta.setTotal(Double.parseDouble(rs.getString("total")));
                venta.setSubTotal(Double.parseDouble(rs.getString("subTotal")));
                listaVentas.add(venta);

            }
            
        } catch (Exception e) {
            System.out.println(e);
            listaVentas=null;
        }
       return listaVentas;
    }
}
