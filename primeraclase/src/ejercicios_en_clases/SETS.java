package ejercicios_en_clases;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
public class SETS {
    public static Scanner pant = new Scanner (System.in);
    public static void main(String[] args) {
        //Set hasSet = new HasSet<Integer>();, de esta forma decimos que la lista es integer
        Set hasSet = new HashSet<>();
        Set treeSet = new TreeSet<>();
        Set linkedSet = new LinkedHashSet<>();
        treeSet.add(3);
        System.out.println(treeSet);
        //List listaEdades
        Map<Integer, String> mapa = new HashMap();
        //pila en java
        Stack<String> pila = new Stack<>();
        pila.push("hola");
        pila.push("hola2");
        System.out.println("pila "+pila);
        //se muestra el ultimo valor pero no se lo saca pila.push(pila.peek());
        System.out.println(pila.peek());
        //se saca el ultimo valor
        pila.pop();
        System.out.println("pila "+pila);
  
        Queue<String> cola = new PriorityQueue<String>();
        cola.add("asd");
        cola.add("asd");
        cola.add("asd");
        cola.add("asd");
        //peek para ver el ultimo elemento sin sacarlo de la lista
        //poll ve el ultimo elemento y lo saca de la cola
        //isEmpty
    }
    
}
