package accesoDatos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import entidades.articulos;


public class acArticulo {
    public boolean crearArticulo(articulos articulos){
     try {
        Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
        PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("insert into tbarticulo values (?,?,?,?,?,?,?)");
        sentence.setString(1, "0");
        sentence.setString(2, articulos.getNombre());
        sentence.setString(3, articulos.getMarca());
        sentence.setString(4, articulos.getDescripcion());
        sentence.setString(5, articulos.getCategoria());
        sentence.setString(6, String.valueOf(articulos.getCantidad()));
        sentence.setString(7, String.valueOf(articulos.getPrecioUnitario()));
        sentence.execute();
        return true;
     } catch (Exception e) {
        System.out.println(e);
        return false;
     }
    }
    public boolean eliminarArticulo(int id){
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("delete from tbarticulo where id=?");
            sentence.setString(1, String.valueOf(id));
            sentence.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean actualizarArticulo(articulos articulos){
        try {
             Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
             PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("UPDATE tbarticulo set nombre=? , marca=?, descripcion =?,  categoria=?,  cantidad=?,  precioUnitario =? where id=?");
             sentence.setString(1, articulos.getNombre());
             sentence.setString(2, articulos.getMarca());
             sentence.setString(3, articulos.getDescripcion());
             sentence.setString(4, articulos.getCategoria());
             sentence.setString(5, String.valueOf(articulos.getCantidad()));
             sentence.setString(6, String.valueOf(articulos.getPrecioUnitario()));
             sentence.setString(7, String.valueOf(articulos.getId()));
             sentence.execute();

            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public articulos obteneArticulos(int id){
        articulos articulos= new articulos();
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbarticulo where id=?");
            sentence.setString(1, String.valueOf(id));
            ResultSet rs = sentence.executeQuery();

            while (rs.next()) {
                articulos.setId(Integer.parseInt(rs.getString("id")));
                articulos.setNombre(rs.getString("nombre"));
                articulos.setMarca(rs.getString("marca"));
                articulos.setDescripcion(rs.getString("descripcion"));
                articulos.setCategoria(rs.getString("categoria"));
                articulos.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                articulos.setPrecioUnitario(Double.parseDouble(rs.getString("precioUnitario")));
                
            }
        } catch (Exception e) {
            System.out.println(e);
            articulos=null;
        }

        return articulos;
    }

    public List<articulos> todosArticulos(){
        List<articulos> listaArticulos = new ArrayList<>();
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbarticulo");
            ResultSet rs = sentence.executeQuery();
            while (rs.next()) {
                articulos articulos = new articulos();
                articulos.setId(Integer.parseInt(rs.getString("id")));
                articulos.setNombre(rs.getString("nombre"));
                articulos.setMarca(rs.getString("marca"));
                articulos.setDescripcion(rs.getString("descripcion"));
                articulos.setCategoria(rs.getString("categoria"));
                articulos.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                articulos.setPrecioUnitario(Double.parseDouble(rs.getString("precioUnitario")));
                listaArticulos.add(articulos);
        
            }
            
        } catch (Exception e) {
            listaArticulos = null;
            System.out.println(e);
        }
        return listaArticulos;
    }

    public void nuevaCantidad(int cantidad, int id){
         try {
             Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
             PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("update tbarticulo set cantidad =? where id=?");
             sentence.setString(1,String.valueOf(cantidad));
             sentence.setString(2,String.valueOf(id));
             sentence.execute();

         } catch (Exception e) {
            System.out.println(e);
         }

    }

    public int obtenerCantidad(int id){
        int cantidad=0;
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("SELECT cantidad FROM tbarticulo WHERE id=?;");
            sentence.setString(1, String.valueOf(id));
            ResultSet rs = sentence.executeQuery();
            if (rs.next()) {
                cantidad=Integer.parseInt(rs.getString("cantidad"));
            }
            return cantidad;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }

    }


}
