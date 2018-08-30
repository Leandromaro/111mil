package guia5.pkg1colasypilas;

import java.util.LinkedList;
import java.util.Queue;

public class Ej3Main {
    public static void main(String[] args) {
        Ej3 hola = new Ej3();
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        hola.cargaOrdenada(q1);
        hola.cargaOrdenada(q2);
        System.out.println(hola.merge(q1, q2));
    }
    
}
