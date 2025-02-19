package accesoDatos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import entidades.empleados;

public class acEmpleados {
    
    public boolean crearEmpleado(empleados nEmpleados){
      try {
        Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
        PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("insert into tbempleado values (?,?,?,?,?,?,?)");
        sentence.setString(1, "0");
        sentence.setString(2, nEmpleados.getCedula());
        sentence.setString(3, nEmpleados.getNombre());
        sentence.setString(4, nEmpleados.getApellidos());
        sentence.setString(5, nEmpleados.getTelefono());
        sentence.setString(6, nEmpleados.getUserName());
        sentence.setString(7, nEmpleados.getPassword());
        sentence.execute();
        return true;
      } catch (Exception e) {
        System.out.println(e);
        return false;
      }

    }
    public boolean eliminarEmpleado(String cedula){
        try {
        Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
        PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("delete from tbempleado where cedula=?");
        sentence.setString(1, cedula);
        sentence.execute();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean actualizarEmpleado(empleados nEmpleados){
          try {
        Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
        PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("UPDATE tbempleado set cedula=?, nombre=?, apellidos=?, telefono=?, userName=?, password=? where cedula=?");
        sentence.setString(1, nEmpleados.getCedula());
        sentence.setString(2, nEmpleados.getNombre());
        sentence.setString(3, nEmpleados.getApellidos());
        sentence.setString(4, nEmpleados.getTelefono());
        sentence.setString(5, nEmpleados.getUserName());
        sentence.setString(6, nEmpleados.getPassword());
        sentence.setString(7, nEmpleados.getCedula());
        sentence.execute();
        return true;
      } catch (Exception e) {
        System.out.println(e);
        return false;
      }
    }
    public empleados consultarEmpleados(String cedula){
        empleados empleados = new empleados();
        try {
        Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
        PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbempleado where cedula=?");
        sentence.setString(1, cedula);
        ResultSet rs = sentence.executeQuery();
        if (rs.next()) {
            empleados.setCedula(rs.getString("cedula"));
            empleados.setNombre(rs.getString("nombre"));
            empleados.setApellidos(rs.getString("apellidos"));
            empleados.setTelefono(rs.getString("telefono"));
            empleados.setUserName(rs.getString("userName"));
        }
            
        } catch (Exception e) {
            // TODO: handle exception
            empleados=null;
        }
        return empleados;

    }

    public List<empleados> todosEmpleados(){
         List<empleados> listaEmpleados  = new ArrayList<>();
         try {
        Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
        PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbempleado");
        ResultSet rs = sentence.executeQuery();
        while (rs.next()) {
            empleados empleados = new empleados();
            empleados.setCedula(rs.getString("cedula"));
            empleados.setNombre(rs.getString("nombre"));
            empleados.setApellidos(rs.getString("apellidos"));
            empleados.setTelefono(rs.getString("telefono"));
            empleados.setUserName(rs.getString("userName"));
            listaEmpleados.add(empleados);
        }


         } catch (Exception e) {
            listaEmpleados=null;
         }

         return listaEmpleados;
    }

    public boolean login(empleados nEmpleados){
        try {
        Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdinventario", "root", "");
        PreparedStatement sentence = (PreparedStatement) cn.prepareStatement("select * from tbempleado where userName=? AND password=?");
        sentence.setString(1, nEmpleados.getUserName());
        sentence.setString(2, nEmpleados.getPassword());
        ResultSet rs = sentence.executeQuery();

            if (rs.next()) {
                
                return true;
            }else{
                
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }


    }
}
