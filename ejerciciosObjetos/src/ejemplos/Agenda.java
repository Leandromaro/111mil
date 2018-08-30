package ejemplos;

import java.util.ArrayList;
import java.util.List;
//clase agenda
public class Agenda {
    //atributo, lista
    private List<Alumno> alumnosLista;

    
    
   //constructor
    public Agenda(List<Alumno> alumnosLista) {
        this.alumnosLista = alumnosLista;
        
    }
    public Agenda() {
        this.alumnosLista = new ArrayList<>();
        
    }
    
    //metodo que no devuelve nada
    public void MostrarAgenda(){
        //imprimir por pantalla
        for(int i =0; i<alumnosLista.size();i++){
            System.out.println("nombre: "+  alumnosLista.get(i).getNombre());
            System.out.println("edad: "+  alumnosLista.get(i).getEdad());
            System.out.println("dni: "+ alumnosLista.get(i).getDni());
        }
    }
    public void agregarContacto(Alumno alumno){
        this.alumnosLista.add(alumno);
    }
    
    
}