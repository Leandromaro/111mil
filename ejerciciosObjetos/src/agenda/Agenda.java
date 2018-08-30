package agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Alumno> listaAlumno;
    
    public Agenda(){
        this.listaAlumno = new  ArrayList<> ();
    }
    
    public Agenda(List<Alumno> listaAlumno){
        this.listaAlumno=listaAlumno;
    }

    public List<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(List<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }
    
    public void mostrarAgenda (){
        for(int i =0; i<listaAlumno.size();i++){
            System.out.println("nombre: "+  listaAlumno.get(i).getNombre());
            System.out.println("edad: "+  listaAlumno.get(i).getEdad());
            System.out.println("dni: "+ listaAlumno.get(i).getDni());
        }
    }
    
    public void agregarContacto(Alumno alumno){
        this.listaAlumno.add(alumno);
    }
    
    public void eliminarContacto (String nombre){
        for(int i =0; i<listaAlumno.size(); i++){
            if (listaAlumno.get(i).getNombre().equals(nombre)){
                this.listaAlumno.remove(i);                
            }
            
        }
    }
    
    public void buscarContacto (String nombre){
        int i=0;
        boolean bandera=true;
        while(bandera && i<listaAlumno.size()){
            if (listaAlumno.get(i).getNombre().equals(nombre)){
                bandera=false;
                System.out.println("nombre: "+  listaAlumno.get(i).getNombre());
                System.out.println("edad: "+  listaAlumno.get(i).getEdad());
                System.out.println("dni: "+ listaAlumno.get(i).getDni());            
            }
            i++;
        }
    }
}
