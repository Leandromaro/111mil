package Ejercicio2_Shape;

public class Circle extends Shape {

private double radius=1.0;
//private Double area;
//private Double perimieter;

public Circle(){
    super();
}

public Circle(double radius){
    this.radius=radius;
}

public Circle (double radius, String color, boolean filled){
    this.radius=radius;
    setColor(color);
    setFilled(filled);
}

public void setRadius(double radius){
    this.radius=radius;
}

public double getRadius(){
    return this.radius;
}

public double getArea (){
    double area=Math.PI*(Math.pow(radius, 2));
    return area;
}

public double getPerimeter(){
    double perimeter=2*Math.PI*radius;
    return perimeter;
}

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}'+super.toString();
    }
   
}
