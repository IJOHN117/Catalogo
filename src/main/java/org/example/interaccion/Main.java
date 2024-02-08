package org.example.interaccion;

import org.example.catalogo.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static Scanner dato = new Scanner(System.in);
    public static Scanner datoString = new Scanner(System.in);

    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ArrayList<Estados> estados = new ArrayList<Estados>();
    public static ArrayList<Producto> productos = new ArrayList<Producto>();
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

        clientes.add(new Cliente(clave,nombre));

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

        productos.add(new Producto(clave,nombre));

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
}