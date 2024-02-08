package org.example.interaccion;

import org.example.catalogo.Cliente;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static Scanner dato = new Scanner(System.in);
    public static Scanner datoString = new Scanner(System.in);

    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public static void main(String[] args) {
        int opc;

        do {
            opc = menu();

            switch (opc) {
                case 1:
                    altaCliente();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
                    System.out.println(". . .opción no válida!");
            }
        } while (opc != 10);
    }
    public static int menu() {
        System.out.println("MENU Catalogo");
        System.out.println("1. Clientes");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. Salir");
        System.out.println("\nTeclee su opción");
        return dato.nextInt();
    }

    public static void altaCliente(){

        System.out.println("Ingrese la clave del cliente: ");
        int clave = dato.nextInt();
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = datoString.nextLine();

        clientes.add(new Cliente(clave,nombre));

        System.out.println("Se ha creado un nuevo cliente con Clave: "+clave+" y Nombre: "+nombre+" exitosamente!!");
    }
}