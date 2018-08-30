
package Ejercicio1_book;

import java.util.Scanner;

public class ProbarLibro {

    public static void main(String[] args) {
        String aNombre, email, lNombre;
        char genero;
        int lCantidad;
        double  lPrecio;
        //genero
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese el nombre del autor");
        aNombre=pant.nextLine();
        System.out.println("ingrese el email del autor");
        email=pant.nextLine();
        System.out.println("ingrese el genero del autor (F/M)");
        genero=pant.next().charAt(0);
        Autor autor = new Autor(aNombre, email, genero);
        System.out.println(autor);
        //libro
        System.out.println("ingrese el nombre del libro");
        lNombre=pant.next();
        System.out.println("ingrese el precio del libro");
        lPrecio=pant.nextInt();
        System.out.println("ingrese el Cantidad del libro");
        lCantidad=pant.nextInt();
        Libro libro = new Libro(lNombre, autor, lPrecio, lCantidad);
        System.out.println(libro);
    }
    
}
