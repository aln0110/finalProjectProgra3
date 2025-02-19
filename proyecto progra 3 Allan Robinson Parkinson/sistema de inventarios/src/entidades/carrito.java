package entidades;

public class carrito {
    private int id;
    private String articulo;
    private String marca;
    private int cantidad;
    private int cantidadOriginal;
        
    public int getCantidadOriginal() {
        return cantidadOriginal;
    }
    public void setCantidadOriginal(int cantidadOriginal) {
        this.cantidadOriginal = cantidadOriginal;
    }
    private double precio;
        public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getArticulo() {
        return articulo;
    }
    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public carrito() {
    }

    



}
