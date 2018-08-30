package agenda;
import agenda.Agenda;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner pant = new Scanner(System.in);
        boolean bandera=true;
        System.out.println("cantidad de agendas");
        int cantidad=pant.nextInt();
        Agenda listacontactos = new Agenda();
        Cuero agcue = new Cuero();
        agcue.calcularPrecio(cantidad);
        System.out.println("");
        while (bandera){
            System.out.println("que desea hacer?\n1.Añadir Contacto\n2.Buscar Contacto\n3.Eliminar Contacto\n4.Mostrar Contactos\n5.Terminar");
            int opcion=pant.nextInt();
            System.out.println();
            if (opcion==5){
                bandera=false;
            }
            else if (opcion==1){
                System.out.print("nombre:");
                String nombre=pant.next();
                System.out.println();
                System.out.print("edad:");
                int edad=pant.nextInt();
                System.out.println();
                System.out.print("dni:");
                int dni=pant.nextInt();
                Alumno contacto = new Alumno (nombre, edad, dni);
                listacontactos.agregarContacto(contacto);
            }
            else if (opcion==2){
                System.out.println("ingrese nombre");
                String nombre=pant.next();
                listacontactos.buscarContacto(nombre);
            }
            else if (opcion==3){
                System.out.println("ingrese nombre");
                String nombre=pant.next();
                listacontactos.eliminarContacto(nombre);
            }
            else if (opcion==4){
                listacontactos.mostrarAgenda();
            }
            System.out.println();
        }
    }
    
}
