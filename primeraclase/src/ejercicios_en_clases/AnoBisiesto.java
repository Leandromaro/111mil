package ejercicios_en_clases;




public class AnoBisiesto {
    public static void main (String[]args){
        int ano=2000;
        if ((ano%4==0 && ano%100!=0) || (ano%400==0)){
           System.out.println("el año no es bisiesto");
           
        }
    }
    
}
