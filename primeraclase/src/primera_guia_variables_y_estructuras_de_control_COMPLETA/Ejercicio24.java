package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio24 {
    public static Scanner pant = new Scanner(System.in);
public static void main (String[]args){
    
    System.out.println("de que figura quiere calcular el area calcular\n1.Cuadrado\n2.Triangulo\n3.Circulo");
    int opcion=pant.nextInt();
    if (opcion==1){
        areacuadrado();
    }
    else if (opcion==2){
        areatriangulo();
}
    else if (opcion==3){
        areacirculo();
    }
}
static public void areacuadrado(){
    System.out.println("ingrese un lado del cuadrado");
    double area=pant.nextDouble();
    System.out.println("El area del cuadrado ingresado es:"+(area*area));
}
static public void areacirculo(){
    System.out.println("ingrese el area del circulo");
    double radio=pant.nextDouble();
    double elevar=(Math.pow(radio, 2))*Math.PI;
    System.out.println("El area del circulo ingresado es de:"+elevar);
}
static public void areatriangulo(){
    double base, altura;
    System.out.println("ingrese la base del triangulo");
    base=pant.nextDouble();
    System.out.println("ingrese la altura del triangulo");
    altura=pant.nextDouble();
    System.out.println("El area del triangulo ingresado es:"+((base*altura)/2));
}
}
