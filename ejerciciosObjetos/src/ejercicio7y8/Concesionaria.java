package ejercicio7y8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Concesionaria {
    public static final String nombreLegal="Acapulco Autos";
    public static final String direccion="Remedios de Escalada de San Martín 1700, Gerli, Buenos Aires.";
    public static final Date fechaCreacion= new Date (1973);
    public static List<Cliente> clientes= new ArrayList();
    public static List<Autos> autos= new ArrayList();
    public static List<Autos> ventas= new ArrayList ();
    
    public static void NuevoCliente(Cliente clientenuevo){
         clientes.add(clientenuevo);
    }
    public static void EliminarCliente(int dni){
        boolean encontrado=true;
        for (int i=0;i<clientes.size();i++){
            if (clientes.get(i).getDNI()==dni){
                Concesionaria.clientes.remove(i);
                System.out.println("Borrado correctamente");
                encontrado=false;
            }
        }
        if (encontrado){
            System.out.println("El cliente con el DNI indicado no existe");
        }
    }
    public static void EliminarAuto(String patente){
        boolean encontrado=true;
        for (int i=0;i<autos.size();i++){
            if (autos.get(i).getPatente().equals(patente)){
                Concesionaria.autos.remove(i);
                System.out.println("Borrado correctamente");
                encontrado=false;
            }
        }
        if (encontrado){
            System.out.println("el auto con la patente que ingreso no existe");
        }
    }
    public static void listarClientes(){
        for (Cliente x:clientes){
            System.out.println(x);
        }
    }
    
    public static void VenderAuto(int clienteEstable,Autos auto, String patente){
        for (int i=0;i<autos.size();i++){
            if (autos.get(i).getPatente().equals(patente)){
                Concesionaria.autos.remove(i);
                Concesionaria.ventas.add(auto);
            }
        }
        for (int i=0;i<clientes.size();i++){
            int dni=clientes.get(i).getDNI();
            if (dni==clienteEstable){
                clientes.get(i).cargarAuto(auto);
            }
        }
    }
   
    public static void listarAutosStock(){
        for (Autos x:autos){
            System.out.println(x);
        }
    }
    public static void listarAutosVendidos(){
        for (Autos x:ventas){
            System.out.println(x);
        }
    }
    
    public static void NuevoAuto(Autos autonuevo){
         autos.add(autonuevo);
    }
    
    public static void BorrarAuto(String patente){
        boolean encontrado=true;
         for (int i=0;i<autos.size();i++){
             if (autos.get(i).getPatente().equals(patente)){
                 autos.remove(i);
                 System.out.println("auto borrado correctamente");
                 encontrado=false;
             }
             if (encontrado){
            System.out.println("el auto no existe");
            }
         }
    }

    

    
    
}
