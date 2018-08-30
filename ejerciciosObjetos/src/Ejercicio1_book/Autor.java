package Ejercicio1_book;
public class Autor {

private String nombre;
private String email;
private char genero;

    public Autor(){
    
    }   

    public Autor(String nombre, String email, char genero){
        this.nombre=nombre;
        this.genero=genero;
        this.email=email;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }
    
    @Override
    public String toString (){
        return "Nombre: "+this.nombre+" Email: "+this.email+" Genero: "+this.genero;
    }
}
