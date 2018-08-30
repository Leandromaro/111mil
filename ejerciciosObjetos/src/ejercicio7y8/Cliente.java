package ejercicio7y8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private int DNI;
    private sexo Sexo;
    private String Telefono;
    private String FechaNac;
    private List<Autos> Autos=new ArrayList();
    private int cantidadAutos;

    public Cliente(String nombre, String apellido, int dni, sexo Sexo, String Telefono, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.FechaNac = fecha;
        this.DNI=dni;
    }
    
    
    public Cliente(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public sexo getSexo() {
        return Sexo;
    }

    public String getTelefono() {
        return Telefono;
    }


    public void listarAutos() {
        Iterator<Autos> iterator = Autos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void cargarAuto(Autos nuevo){
        this.Autos.add(nuevo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSexo(sexo Sexo) {
        this.Sexo = Sexo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    public List getAutos(){
        return this.Autos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", Sexo=" + Sexo + ", Telefono=" + Telefono + ", FechaNac=" + FechaNac + ", Autos=" + Autos + " cantidad de Autos: "+this.Autos.size()+'}';
    }
    
    
}
