
package ejercicio7y8;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class pruebas {

    public static void main(String[] args) throws ParseException  {
        Tiempop fecha = new Tiempop();
        fecha.setFecha("20/10/1999");
        Cliente nuevo = new Cliente("Rodrigo", "Perez", 42202512, sexo.m, "3624010201", fecha.getFecha());
        Cliente nuevo1 = new Cliente("Pedro", "Perez", 42202513, sexo.m, "3624010201", fecha.getFecha());
        Cliente nuevo2 = new Cliente("Clara", "Perez", 42202514, sexo.f, "3624010201", fecha.getFecha());
        Cliente nuevo3 = new Cliente("Lucas", "Perez", 42202515, sexo.m, "3624010201", fecha.getFecha());
        Cliente nuevo4 = new Cliente("Maria", "Perez", 42202516, sexo.f, "3624010201", fecha.getFecha());
        Concesionaria.NuevoCliente(nuevo);
        Concesionaria.NuevoCliente(nuevo1);
        Concesionaria.NuevoCliente(nuevo2);
        Concesionaria.NuevoCliente(nuevo3);
        Concesionaria.NuevoCliente(nuevo4);
        Autos autito = new Autos("Camioneta", "Fiat", "123ABC", "Blanco", 250);
        Autos autito2 = new Autos("Camioneta", "Fiat", "123ADC", "Blanco", 250);
        Autos autito3 = new Autos("Camioneta", "Fiat", "123ADB", "Blanco", 250);
        System.out.println("lista de clientes");
        Concesionaria.listarClientes();
        Concesionaria.NuevoAuto(autito);
        Concesionaria.NuevoAuto(autito2);
        Concesionaria.NuevoAuto(autito3);
        System.out.println("lista de autos");
        Concesionaria.listarAutosStock();
        Concesionaria.VenderAuto(42202512, autito, "123ABC");
        Concesionaria.VenderAuto(42202514, autito2, "123ADC");
        System.out.println("lista de autos");
        Concesionaria.listarAutosStock();
        Concesionaria.EliminarAuto("123ADB");
        System.out.println("lista de autos");
        Concesionaria.listarAutosStock();
        System.out.println("lista de clientes");
        Concesionaria.listarClientes();
//        System.out.println("Cantidad de autos"+nuevo.getAutos().size());
        System.out.println();
        Concesionaria.EliminarCliente(42202515);
        Concesionaria.listarClientes();
        System.out.println();
        Concesionaria.EliminarCliente(42202519);
        Concesionaria.listarClientes();
        
        
        
    }
    
}
