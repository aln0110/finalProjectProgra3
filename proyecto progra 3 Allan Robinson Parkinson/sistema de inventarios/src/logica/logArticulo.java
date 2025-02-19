package logica;

import java.util.List;

import accesoDatos.acArticulo;
import entidades.articulos;

public class logArticulo {
    public boolean crearArticulo(articulos articulos){
        acArticulo acArticulo = new acArticulo();
        return acArticulo.crearArticulo(articulos);
    }
    public boolean actualizarArticulo(articulos articulos){
        acArticulo acArticulo = new acArticulo();
        return acArticulo.actualizarArticulo(articulos);
    }
    public boolean eliminarArticulo(int id){
        acArticulo articulo = new acArticulo();
        return  articulo.eliminarArticulo(id);
    }
    public articulos buscarArticulos(int id){
        acArticulo acArticulo = new acArticulo();
        return acArticulo.obteneArticulos(id);
    }
    public List<articulos> todosArticulos(){
        acArticulo acArticulo = new acArticulo();
        return acArticulo.todosArticulos();
    }
    public void nuevaCantidad(int cantidad, int id){
        acArticulo acArticulo = new acArticulo();
         acArticulo.nuevaCantidad(cantidad, id);
    }
    public int obtenerCantidad(int id){
        acArticulo acArticulo = new acArticulo();
        return acArticulo.obtenerCantidad(id);
    }
}
