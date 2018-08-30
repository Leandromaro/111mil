package guia5.pkg1colasypilas;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ej4Persona {
    private String nombre;
    private Ej4Razon razon;
    private int dni;
    private Ej4TipoPersona tipo;
    private Queue<Ej4Empleados> empleados;
    
    private static int cont=0;
    public Ej4Persona() {
    }

    public Ej4Persona(String nombre, int dni, Ej4TipoPersona tipo, Ej4Razon razon) {
        this.nombre = nombre;
        this.dni = dni;
        this.tipo = tipo;
        this.razon = razon;
    }
    
  
    
    public void comparador(Queue<Ej4Persona> cola){
        Iterator <Ej4Persona> colaIte = cola.iterator();
        List<Ej4Persona> personas = new ArrayList();
        Ej4Persona aux;
        while(colaIte.hasNext()){
            personas.add(colaIte.next());
        }
        
        for(int i=0; i<personas.size();i++){
            for (int j = i; j < personas.size(); j++) {
                
            if (personas.get(i).getTipo().compareTo(personas.get(j).getTipo())<0){
                aux=personas.get(j);
                personas.set(j, personas.get(i));
                personas.set(i, aux);
            }
            }
        }
        
        cola.clear();
        for(int i=0;i<personas.size();i++){
            cola.add(personas.get(i));
        }
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public void setRazon(Ej4Razon razon) {
        this.razon = razon;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTipo(Ej4TipoPersona tipo) {
        this.tipo = tipo;
    }
    

    public String getNombre() {
        return nombre;
    }

    

    public Ej4Razon getRazon() {
        return razon;
    }

    public int getDni() {
        return dni;
    }

    public Ej4TipoPersona getTipo() {
        return tipo;
    }

    
    
    public void mostrarTurnos(Queue<Ej4Persona> cola){
        Iterator<Ej4Persona> iterator = cola.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            cont++;
        }
    }
    
    

    @Override
    public String toString() {
        return "turno:"+cont + " nombre=" + nombre + ", razon=" + razon + ", dni=" + dni + ", tipo=" + tipo ;
    }
    
    
}
