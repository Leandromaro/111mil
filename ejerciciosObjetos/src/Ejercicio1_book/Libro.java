package Ejercicio1_book;
public class Libro {
    private Autor autor;
    private String nombre;
    private Double precio;
    private int cantidad=0;

    public Libro() {
  
    }
    
    public Libro(String nombre, Autor autor, Double precio){
        this.nombre=nombre;
        this.autor=autor;
        this.precio=precio;
    }
    
    public Libro(String nombre, Autor autor, Double precio, int cantidad){
        this.nombre=nombre;
        this.autor=autor;
        this.precio=precio;
        this.cantidad=cantidad;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString (){
        return "Nombre: "+this.nombre+" Autor: "+this.autor+" Precio: "+this.precio+" Cantidad: "+this.cantidad;
    }
}


