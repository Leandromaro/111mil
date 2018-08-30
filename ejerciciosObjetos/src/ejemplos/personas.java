package ejemplos;

import java.util.Scanner;



public class personas {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        Persona variable = new Persona(12321, "pepe","argento","nose","12312");
        System.out.println("Dni: "+variable.getDni());
        variable.setDni(pant.nextInt());
        System.out.println("Dni: "+variable.getDni());
        variable.setDni(0); 
        System.out.println("Dni: "+variable.getDni());
    } 
}
//intelij IDEA