package logica;

import java.util.List;

import entidades.articulos;
import entidades.venta;

//import org.omg.CORBA.PUBLIC_MEMBER;

public class logCalculos {
    
   // este metodo calcula el sub total o el precio despues del descuento 
    public double calcularDescuento(double total, int Descuento){
        double aux = total*Descuento/100;
        return total-aux;
    }
     //este metodo se encarga de calcular la nueva cantidad despues de hacer la compra 
    public int ActualizarCantidad(int cantidad, int resta){
        return cantidad-resta;
    }
    //este metodo calcula el precio o total que se paga de x compra 
   public  double calcularPrecio(double precio, int cantidad){
        return precio*cantidad;
    }

    //este metodo se encarga de verificar si la cantidad ingresada es mayor a la disponible
    public boolean calcularCantidad(int cantidadDiponible, int cantidadSolicitada){
        if (cantidadSolicitada <= cantidadDiponible) {
            return true;
        } else {
            return false;
        }
    }
/* 
 * public double calcularTotal(double total){
        double aux=0.0;
        return aux = aux + total;
    }
*/

    public int totalCantidad(List<venta> mList){
        int aux=0;
         for (int i = 0; i < mList.size(); i++) {
            aux=aux+mList.get(i).getCantidad();
         }
        return aux;
    }
    public double totalDescuento(List<venta> mList){
      double aux=0.0;
      for (int i = 0; i < mList.size(); i++) {
        aux = aux + (mList.get(i).getTotal()*mList.get(i).getDescuento())/100;
      }
       return aux;
    }
    public double totales(List<venta> mList){
        double aux = 0.0;
        for (int i = 0; i < mList.size(); i++) {
            aux = aux + mList.get(i).getSubTotal();
        }

        return aux;
    }
    public double subTotales(List<venta> mList){
        double aux = 0.0;
        for (int i = 0; i < mList.size(); i++) {
            aux = aux + mList.get(i).getTotal();           
        }
       return aux;
    }

    public int totalArticulos(List<articulos> mList){
        int aux = 0;
        for (int i = 0; i < mList.size(); i++) {
            aux = aux + mList.get(i).getCantidad();
        }
        return aux;
    }

    public double totalPrecios(List<articulos> mList){
        double aux = 0.0;
        for (int i = 0; i < mList.size(); i++) {
            aux = aux + mList.get(i).getPrecioUnitario();
        }
        return aux;
    }

    
}
