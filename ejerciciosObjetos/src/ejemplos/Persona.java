package ejemplos;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String genero;
    private String cuil;
    
    public Persona(int dni, String nombre, String apellido, String genero, String cuil){
        //recomendado siempre ocupar this
        this.dni=dni;
        this.nombre=nombre;
        this.genero=genero;
        this.apellido=apellido;
        this.cuil=cuil;    
    }
    /*existen 2 metodos para poder cambiar, set para setear los valores de atributo y get para obtener
    */
    public int getDni(){
        return this.dni;
    }
    public void setDni (int dni){
        this.dni=dni;
    }    
}
