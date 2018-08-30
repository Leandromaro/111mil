package ejemplos;
import java.util.ArrayList;
import java.util.List;
public class Alumnosejemplos {
    public static void main(String[] args) {
        
        // crear 3 objetos/instancias alumnos
        Alumno primerAlumno = new Alumno ("pedro", 16, 42202512);
        Alumno segundoAlumno = new Alumno ("marcos", 32, 14214321);     
        Alumno tercerAlumno = new Alumno("jose", 19, 49434434);
        //System.out.println(primerAlumno); esto sirve si tengo el to string 
        // crear una lista de alumnos
        //list_arraylist clases
        List<Alumno> listadoAlumnos = new ArrayList<>(); 
        
        //cargar la lista de alumnos
        listadoAlumnos.add(primerAlumno);
        listadoAlumnos.add(segundoAlumno);
        listadoAlumnos.add(tercerAlumno);
        
        //cree un objeto agenda con el listado alumnos
        Agenda agenda = new Agenda(listadoAlumnos);
         Agenda agenda2 = new Agenda();
         agenda2.agregarContacto(segundoAlumno);
         
        //metodo para printear
        agenda.MostrarAgenda();
    }
}