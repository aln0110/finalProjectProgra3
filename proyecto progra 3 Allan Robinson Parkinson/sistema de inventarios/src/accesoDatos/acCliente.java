package accesoDatos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import entidades.cliente;

public class acCliente {

    public boolean crearCliente(cliente cliente) {

        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("insert into tbcliente values (?,?,?,?,?)");
            sentence.setString(1, "0");
            sentence.setString(2, cliente.getCedula());
            sentence.setString(3, cliente.getNombre());
            sentence.setString(4, cliente.getApellidos());
            sentence.setString(5, cliente.getTelefono());
            sentence.execute();
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean actualizarCliente(cliente cliente) {
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("update tbcliente set cedula=?, nombre=?, apellidos=?, telefono=? where cedula=?");
            sentence.setString(1, cliente.getCedula());
            sentence.setString(2, cliente.getNombre());
            sentence.setString(3, cliente.getApellidos());
            sentence.setString(4, cliente.getTelefono());
            sentence.setString(5, cliente.getCedula());
            sentence.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);

            return false;
        }
    }

    public boolean eliminarCliente(String cedula) {
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("delete from tbcliente where cedula=?");
            sentence.setString(1, cedula);
            sentence.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public cliente consularCliente(String cedula) {
        cliente cliente = new cliente();
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbcliente where cedula=?");
            sentence.setString(1, cedula);
            ResultSet rs = sentence.executeQuery();
            while (rs.next()) {
                cliente.setCedula(rs.getString("cedula"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setTelefono(rs.getString("telefono"));
            }
        } catch (Exception e) {
            System.out.println(e);
            cliente = null;
        }
        return cliente;
    }

    public List<cliente> todosClientes() {

        List<cliente> listaCliente = new ArrayList<>();
        try {
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
            PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbcliente");
            ResultSet rs = sentence.executeQuery();
            while (rs.next()) {
                cliente cliente = new cliente();
                cliente.setCedula(rs.getString("cedula"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidos(rs.getString("apellidos"));
                cliente.setTelefono(rs.getString("telefono"));
                listaCliente.add(cliente);
            }

        } catch (Exception e) {
            System.out.println(e);
            listaCliente = null;
        }

        return listaCliente;
    }
}
