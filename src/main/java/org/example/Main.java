package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) {
        int opc;

        do {
            opc = menu();

            switch (opc) {
                case 1:

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
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. ");
        System.out.println("7. Salir");
        System.out.println("\nTeclee su opción");
        return dato.nextInt();
    }
}