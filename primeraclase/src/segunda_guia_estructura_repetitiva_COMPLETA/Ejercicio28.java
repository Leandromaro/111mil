/*
Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día 
desde las 0:00:00 horas hasta las 23:59:59 horas  
 */
//usar currentTimeMillis();
package segunda_guia_estructura_repetitiva_COMPLETA;
public class Ejercicio28 {
    //long t0, t1;
    public static void main(String[] args) {
       for (int hora=0;hora<=23;hora++){
           for (int minutos=0;minutos<=59;minutos++){
               for (int segundos=0;segundos<=59;segundos++){
                   System.out.print(hora+":"+minutos+":"+segundos);
                   /*t0= System.currentTimeMillis();
                   do{
                       t1 = System.currentTimeMillis();
                   }while (t0 - t1) < (i * 1000)*/
               }
           }
       }
    }
    
}
