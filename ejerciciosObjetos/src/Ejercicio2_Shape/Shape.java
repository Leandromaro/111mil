package Ejercicio2_Shape;

public class Shape {
protected String color="rojo";
protected boolean filled = true;

public Shape(){
    
}

public Shape(String color, boolean filled){
    this.color=color;
    this.filled=filled;
}

public String getColor(){
    return this.color;
}

public boolean isFilled(){
    return this.filled;
}

public void setColor(String color){
    this.color=color;
}

public void setFilled (boolean filled){
    this.filled=filled;
}

@Override
public String toString (){
    String a;
    if (filled){
        a="llena";
    }
    else{
        a="vacia";
    }
    return "una figura de color "+color+" "+a;
}
}

