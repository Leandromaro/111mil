package guia5.pkg1colasypilas;

import java.util.LinkedList;
import java.util.Queue;

public class Ej4Empleados {
    private String nombre;
    private Queue<Ej4Empleados> empleados = new LinkedList();
    private Queue<Ej4Empleados> empleadosOcupados = new LinkedList();
    private Queue<Ej4Persona> cliente = new LinkedList();

    public Ej4Empleados(String nombre) {
        this.nombre = nombre;
    }
    
    public void añadirEmpleado(Ej4Empleados empleado){
        this.empleados.add(empleado);
    }
    
    public void atender(Queue<Ej4Persona> poratender, Queue<Ej4Empleados> empleados){
        while(!poratender.isEmpty()){
            this.cliente.add(poratender.poll());
            this.empleadosOcupados.add(empleados.poll());
            System.out.println(empleados);
            empleados.add(empleadosOcupados.poll());
        }
        System.out.println("clientes atendidos");
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Ej4Empleados{" + "nombre=" + nombre + ", empleados=" + empleados + ", empleadosDesocupados=" + empleadosOcupados + ", cliente=" + cliente + '}';
    }
    
}
