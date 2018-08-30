package Ejercicio2_Shape;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    
    public Rectangle(){
        super();
    }
    
    public Rectangle(double width, double length){
        this.width=1.0;
        this.length=1.0;
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        this.width=1.0;
        this.length=1.0;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}'+super.toString();
    }
    
    
}
