package ejemplos;
/*crear un arreglo de 10 personas y ordenarlos por edad, mostrar persona con
la edad mas chica y la mas grande
*/
public class Ejercicio1 {
    private int edad;
    private String nombre;
    //constructor por defecto
    public Ejercicio1(){
        
    }
    // constructor parametrisado
    public Ejercicio1(int edad, String nombre){
        this.edad=edad;
        this.nombre=nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad (int dni){
        this.edad=edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
