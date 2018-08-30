package guia5.pkg1colasypilas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ejercicio1 {
    private Queue<String> cola = new LinkedList<>();
    private Stack<String> pila = new Stack<>();
    
    public Ejercicio1(){
    }
    
    public void cargar(String pcola, String ppila){
        this.cola.add(pcola);
        this.pila.push(ppila);
    }
    
    public void mostrar(){
        System.out.println(this.cola.peek());
        System.out.println(this.pila.peek());
    }
    
    public void eliminar(){
        this.cola.poll();
        this.pila.pop();
    }
}
