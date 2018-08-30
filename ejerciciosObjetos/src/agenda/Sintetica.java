package agenda;
public class Sintetica extends Agenda {
    private String color;
    private int precio=20;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
    
    public void calcularPrecio(int cantidad){
        int precio=cantidad*this.precio;
        System.out.println(precio);
    }
}
