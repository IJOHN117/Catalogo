package org.example.interaccion;

import org.example.catalogo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner dato = new Scanner(System.in);
    public static Scanner datoString = new Scanner(System.in);

    public static ArrayList<Clientes> clientes = new ArrayList<Clientes>();
    public static ArrayList<Estados> estados = new ArrayList<Estados>();
    public static ArrayList<Productos> productos = new ArrayList<Productos>();
    public static ArrayList<Proveedores> proveedores = new ArrayList<Proveedores>();
    public static ArrayList<Ciudades> ciudades = new ArrayList<Ciudades>();

    public static void main(String[] args) {
        int opc;

        do {
            opc = menu();

            switch (opc) {
                case 1:
                    altaCliente();
                    break;
                case 2:
                    nuevoProducto();
                    break;
                case 3:
                    altaProveedores();
                    break;
                case 4:
                    altaCiudades();
                    break;
                case 5:
                    altaEstado();
                    break;
                case 6:
                    reporte();
                    break;

                case 7:
                    System.out.println("...Bye!");
                    break;
                default:
                    System.out.println(". . .opción no válida!");
            }
        } while (opc != 7);
    }
    public static int menu() {
        System.out.println("MENU Catalogo");
        System.out.println("1. Registrar Clientes");
        System.out.println("2. Registrar Productos");
        System.out.println("3. Registrar Proveedores");
        System.out.println("4. Registrar Ciudades");
        System.out.println("5. Registrar Estados");
        System.out.println("6. Reporte");
        System.out.println("7. Salir");
        System.out.println("\nTeclee su opción");
        return dato.nextInt();
    }

    public static void altaCliente(){

        System.out.println("Ingrese la clave del cliente: ");
        int clave = dato.nextInt();
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = datoString.nextLine();

        clientes.add(new Clientes(clave,nombre));

        System.out.println("Se ha creado un nuevo cliente con Clave: "+clave+" y Nombre: "+nombre+" exitosamente!!");
    }

    public static void altaEstado(){
        System.out.println("Ingrese la clave del Estado");
        int clave =dato.nextInt();
        System.out.println("Ingrese la clave del Estado");
        String nombre = datoString.nextLine();
        estados.add(new Estados(clave,nombre));
        System.out.println("Estado registrado > Clave: "+clave+ " > Nombre:" +nombre);
    }
    public static void nuevoProducto(){

        System.out.println("Ingrese la clave del producto");
        int clave = dato.nextInt();
        System.out.println("Ingrese el nombre del producto");
        String nombre = datoString.nextLine();

        productos.add(new Productos(clave,nombre));

        System.out.println("Se ingreso un nuevo producto con clave"+clave+"y es un@:"+nombre+"en el sistema");
    }
    public static void altaProveedores(){
        System.out.println("Ingrese la clave del Proveedor");
        int clave =dato.nextInt();
        System.out.println("Ingrese la clave del Proveedor");
        String nombre = datoString.nextLine();
        proveedores.add(new Proveedores(clave,nombre));
        System.out.println("Proveedor registrado > Clave: "+clave+ " > Nombre:" +nombre);
    }

    public static void altaCiudades(){
        System.out.println("Ingrese la clave del Proveedor");
        int clv_cdd =dato.nextInt();
        System.out.println("Ingrese la clave del Proveedor");
        String nom_cdd = datoString.nextLine();
        ciudades.add(new Ciudades(clv_cdd,nom_cdd));
        System.out.println("Proveedor registrado > Clave: "+clv_cdd+ " > Nombre:" +nom_cdd);
    }

    public static void reporte() {
        System.out.println("Reporte de Catálogo --------------");

        if (!clientes.isEmpty()) {
            System.out.println("Clientes:");
            for (Clientes clientes : Main.clientes) {
                System.out.println("Clave: " + clientes.getClave() + ", Nombre: " + clientes.getNombre());
            }
        }

        if (!productos.isEmpty()) {
            System.out.println("\nProductos:");
            for (Productos productos : Main.productos) {
                System.out.println("Clave: " + productos.getClave() + ", Nombre: " + productos.getNombre());
            }
        }

        if (!proveedores.isEmpty()) {
            System.out.println("\nProveedores:");
            for (Proveedores proveedor : proveedores) {
                System.out.println("Clave: " + proveedor.getClave() + ", Nombre: " + proveedor.getNombre());
            }
        }

        if (!estados.isEmpty()) {
            System.out.println("\nEstados:");
            for (Estados estado : estados) {
                System.out.println("Clave: " + estado.getClave() + ", Nombre: " + estado.getNombre());
            }
        }

        if (!ciudades.isEmpty()) {
            System.out.println("\nCiudades:");
            for (Ciudades ciudad : ciudades) {
                System.out.println("Clave: " + ciudad.getClv_cdd() + ", Nombre: " + ciudad.getNom_cdd());
            }
        }

        System.out.println("Fin del Reporte --------------");
    }
}