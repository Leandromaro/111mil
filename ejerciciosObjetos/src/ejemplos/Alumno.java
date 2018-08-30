package ejemplos;

//clase es un "molde" para generar objetos
public class Alumno {
    //atributos
    private String nombre;
    private int edad;
    private int dni;
    
    //contrusctor estandar, vacio pero valido
    public Alumno(){
        
    }
    //constructor, para crear el objeto
    public Alumno (String nombre, int edad, int dni){
        this.edad=edad;
        this.nombre=nombre;
        this.dni=dni;
    }
    //metodos de instancia
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    public int getDni() {
        return dni;
    }
    
    public void setDni(int dnis){
        this.dni = dni;
    }
    /*formas de printear
    @Override
    public String toString (){
        return this.nombre+this.dni+this.edad;
    }*/
}   


