/*
Suponga que se tiene las calificaciones de un grupo de 40 alumnos. 
Realizar un algoritmo paracalcular la calificación media 
y la calificación más baja de todo el grupo */
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int alumnos=40, sumaNotas=0, promedio=0, notaBaja=10,alumno=0;
        for (int x=1;x<=alumnos;x++){
            System.out.println("ingrese la calificacion del alumno "+x);
            int nota=pant.nextInt();
            sumaNotas=sumaNotas+nota;
            if (nota<notaBaja){
                notaBaja=nota;
                alumno=x;
            }
        }
        System.out.println("Calificacion mas baja: "+notaBaja+" del alumno "+alumno);
        promedio=sumaNotas/alumnos;
        System.out.println("calificacion media: "+promedio);
    }
    
}
