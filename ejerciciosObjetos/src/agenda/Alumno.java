package agenda;

public class Alumno {
    private String nombre;
    private int edad;
    private int dni;
    
    public Alumno(){
    }
    
    public Alumno(String nombre, int edad, int dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
    }
    
    public int getDni (){
        return this.dni;
    }
    
    public int getEdad (){
        return this.edad;
    }
    
    public String getNombre (){
        return this.nombre;
    }
    
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad (int edad){
        this.edad=edad;
    }
    
    public void setDni (int dni){
        this.dni=dni;
    }
}
