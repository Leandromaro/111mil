/*
Un Zoólogo pretende determinar el porcentaje de animales que hay en las siguientes tres
categorías de edades: de 0 a 1 año, de más de 1 año y menos de 3 y de 3 o más años. El
zoológico todavía no está seguro del animal que va a estudiar. Si se decide por elefantes solo
tomara una muestra de 20 de ellos; si se decide por las jirafas, tomara 15 muestras, y si son
chimpancés tomara 40.
*/
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int cantidad=0, edad, sumaEdades=0;
        double g1=0, g2=0, g3=0;
        System.out.println("que animales va a estudiar\n1=elefantes\n2=jirafas\n3=chmpances");
        int animal=pant.nextInt();
        switch (animal){
            case 1:
                cantidad=20;
                break;
            case 2:
                cantidad=15;
                break;
            case 3:
                cantidad=40;
                break;
        }
        for (int x=0; x<cantidad; x++){
            System.out.println("ingrese edad");
            edad=pant.nextInt();
            if (edad==0 || edad==1){
                g1++;
            }
            else if (edad>1 && edad<3){
                g2++;
            }
            else if (edad>=3){
                g3++;
            }
            
        }
        g1=((g1/cantidad)*100);
        g2=((g2/cantidad)*100);
        g3=((g3/cantidad)*100);
        System.out.println("el porcentaje de cantidad entre 0 y 1 es "+g1+"%");
        System.out.println("el porcentaje de cantidad entre 1 y 3 es "+g2+"%");
        System.out.println("el porcentaje de cantidad entre 3 y mayores es "+g3+"%");
    }
    
}
