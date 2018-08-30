package ejercicio7y8;

public class Autos {
    public String Nombre;
    public String Modelo;
    public String Patente;
    public String Caracteristicas;
    public int Capacidad;

    public Autos(String Nombre, String Modelo, String Patente, String Caracteristicas, int Capacidad) {
        this.Nombre = Nombre;
        this.Modelo = Modelo;
        this.Patente = Patente;
        this.Caracteristicas = Caracteristicas;
        this.Capacidad = Capacidad;
    }
    
    public Autos(){
        
    }

    public String getNombre() {
        return Nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getPatente() {
        return Patente;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    @Override
    public String toString() {
        return "Autos{" + "Nombre=" + Nombre + ", Modelo=" + Modelo + ", Patente=" + Patente + ", Caracteristicas=" + Caracteristicas + ", Capacidad=" + Capacidad + '}';
    }
    
    
}
