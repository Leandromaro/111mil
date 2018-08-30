package Ejercicio2_Shape;

public class Main {

    public static void main(String[] args) {
        //shape
        Shape forma = new Shape();
        System.out.println(forma);
        forma.setColor("verde");
        forma.setFilled(false);
        System.out.println(forma);
        System.out.println();
        //circle
        Circle circulo = new Circle();
        System.out.println(circulo);
        double perimetro1=circulo.getPerimeter();
        double area1=circulo.getArea();
        System.out.println("perimetro="+perimetro1+" area="+area1);
        circulo.setRadius(6);
        circulo.setColor("azul");
        circulo.setFilled(false);
        System.out.println(circulo);
        double perimetro=circulo.getPerimeter();
        double area=circulo.getArea();
        System.out.println("perimetro="+perimetro+" area="+area);
        System.out.println();
        //rectangle
        Rectangle rectangulo = new Rectangle();
        System.out.println(rectangulo);
        rectangulo.setColor("amarillo");
        rectangulo.setWidth(10);
        rectangulo.setLength(3);
        rectangulo.setFilled(false);
        System.out.println(rectangulo);
        System.out.println();
        //square
        Square cuadrado = new Square();
        System.out.println(cuadrado);
        cuadrado.setSide(30);
        System.out.println(cuadrado); 
    }
    
}
