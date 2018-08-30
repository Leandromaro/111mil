//Escriba un programa que permita crear dos listas de palabras y que, a
//continuación, escriba las siguientes listas (en las que no debe haber repeticiones)
//a. Lista de palabras que aparecen en las dos listas.
//b. Lista de palabras que aparecen en la primera lista, pero no en la segunda
//c. Lista de palabras que aparecen en la segunda lista, pero no en la primera.
//Nota: Para evitar las repeticiones, el programa deberá empezar eliminando los
//elementos repetidos en cada lista.
package listasguia5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio10 {

    public static void main(String[] args) {
        List <String> listaP1 = new ArrayList ();
        List <String> listaP2 = new ArrayList ();
        List <String> mostrar = new ArrayList ();
        listaP1.add("perro");
        listaP1.add("perro");
        listaP1.add("camion");
        listaP1.add("camion");
        listaP1.add("gato");
        listaP1.add("gato");
        listaP1.add("gato");
        listaP2.add("casa");
        listaP2.add("casa");
        listaP2.add("perro");
        listaP2.add("perro");
        listaP2.add("gato");
        System.out.println("lista 1");
        mostrarLista(listaP1);
        System.out.println("lista 2");
        mostrarLista(listaP2);
        antiRepetido(listaP1);
        antiRepetido(listaP2);
        System.out.println("lista 1");
        mostrarLista(listaP1);
        System.out.println("lista 2");
        mostrarLista(listaP2);
        palabrasEnAmbas(listaP1, listaP2, mostrar);
        System.out.println("lo que hay en ambas");
        mostrarLista(mostrar);
        limpiador(mostrar);
        palabrasen(listaP1, listaP2, mostrar);
        System.out.println("lista de palabras que aparecen en la primera pero no en la segunda");
        mostrarLista(mostrar);
        limpiador(mostrar);
        palabrasen(listaP2, listaP1, mostrar);
        System.out.println("lista de palabras que aparecen en la segunda pero no en la primera");
        mostrarLista(mostrar);
        limpiador(mostrar);
    }
    public static void mostrarLista(List<String> amostar){
        for(String i:amostar){
            System.out.println(i);
        }
    }
    public static void antiRepetido(List paralimpiar){
        
        for (int i=0;i<paralimpiar.size();i++){
            int cont=0;
            for (int x=0;x<paralimpiar.size();x++){
                if(paralimpiar.get(i).equals(paralimpiar.get(x))){
                    cont++;
                }
                if (cont>1){
                    paralimpiar.remove(x);
                }
            }
        }
    }
    public static void limpiador(List alimpiar){
        alimpiar.removeAll(alimpiar);
    }
    public static void palabrasEnAmbas(List lista1, List lista2, List mostrar){
        for (int i=0;i<lista1.size();i++){
            for (int x=0;x<lista2.size();x++){
                if(lista1.get(i).equals(lista2.get(x))){
                    mostrar.add(lista1.get(i));
                }
            }
        }
    }
    public static void palabrasen(List<String> lista1,List<String> lista2, List mostrar){
        for (int i=0;i<lista1.size();i++){
                if (!lista2.contains(lista1.get(i))){
                    mostrar.add(lista1.get(i));
                }
            }
        }
    }

