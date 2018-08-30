package guia5.pkg1colasypilas;

import java.util.LinkedList;
import java.util.Queue;

public class Ej4Main {

    public static void main(String[] args) {
        Queue<Ej4Persona> cola = new LinkedList<>();
        Ej4Persona nuevo = new Ej4Persona("Jose",42202512,Ej4TipoPersona.especial,Ej4Razon.deposito);
        Ej4Persona nuevo2 = new Ej4Persona("Pablo",42202512,Ej4TipoPersona.normal,Ej4Razon.extraccion);
        Ej4Persona nuevo3 = new Ej4Persona("Sergio",42202512,Ej4TipoPersona.especial,Ej4Razon.deposito);
        Ej4Persona nuevo4 = new Ej4Persona("Sergio",42202512,Ej4TipoPersona.normal,Ej4Razon.deposito);
        Ej4Persona nuevo5 = new Ej4Persona("Sergio",42202512,Ej4TipoPersona.normal,Ej4Razon.extraccion);
        Ej4Persona nuevo6 = new Ej4Persona("Sergio",42202512,Ej4TipoPersona.especial,Ej4Razon.extraccion);
        cola.add(nuevo);
        cola.add(nuevo2);
        cola.add(nuevo3);
        cola.add(nuevo4);
        cola.add(nuevo5);
        cola.add(nuevo6);
        cola.peek().comparador(cola);
        cola.peek().mostrarTurnos(cola);
        Queue<Ej4Empleados> empleados = new LinkedList<>();
        Ej4Empleados nuevoE = new Ej4Empleados ("jose");
        empleados.add(nuevoE);
        empleados.peek().añadirEmpleado(nuevoE);
        Ej4Empleados nuevoE2 = new Ej4Empleados ("pedro");
        empleados.add(nuevoE2);
        empleados.peek().añadirEmpleado(nuevoE2);
        empleados.peek().atender(cola, empleados);
    }
    
}
