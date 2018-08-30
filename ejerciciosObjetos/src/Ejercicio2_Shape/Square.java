package Ejercicio2_Shape;

public class Square extends Rectangle{

public Square (){
    super();
}

public Square (double side){
    setWidth(side);
}

public Square (double side, String color, boolean filled){
    setWidth(side);
    setColor(color);
    setFilled(filled);
}



public void setSide(double side){
    setWidth(side);
}

public double getSide(){
    return this.getWidth();
}

    @Override
    public void setLength(double side) {
        super.setLength(side); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "lado del cuadrado ="+super.getWidth();
    }
    
}
