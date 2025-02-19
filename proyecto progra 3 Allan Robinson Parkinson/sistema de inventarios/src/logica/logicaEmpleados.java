package logica;

import java.util.List;

import accesoDatos.acEmpleados;
import entidades.empleados;

public class logicaEmpleados {
    public boolean crearEmpleado(empleados nEmpleados){
        acEmpleados acEmpleados = new acEmpleados();
        return acEmpleados.crearEmpleado(nEmpleados);
    }
    public boolean actualizarEmpleado(empleados nEmpleados){
        acEmpleados acEmpleados = new acEmpleados();
        return acEmpleados.actualizarEmpleado(nEmpleados);
    }
    public boolean eliminarEmpleado(String cedula){
        acEmpleados acEmpleados = new acEmpleados();
        return acEmpleados.eliminarEmpleado(cedula);
    }
    public empleados consultarEmpleado(String cedula){
        acEmpleados acEmpleados = new acEmpleados();
        empleados empleados = new empleados();
        empleados = acEmpleados.consultarEmpleados(cedula);
        return empleados;
    }
    public List<empleados> todosEmpleados(){
        acEmpleados acEmpleados = new acEmpleados();
        return acEmpleados.todosEmpleados();
    }
    public boolean login (empleados nEmpleados){
         acEmpleados acEmpleados = new acEmpleados();
         return acEmpleados.login(nEmpleados);
    }
}
