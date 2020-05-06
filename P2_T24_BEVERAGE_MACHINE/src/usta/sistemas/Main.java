package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan Sebastian Arias Moreno
	  DATE: 30/04/2020
	  DESCRIPTION: Este software es similar al de una máquina expendedora de bebidas calientes (como la que esta ubicada en la USTA)
	 */
        f_menu();
        f_menu_bebidas();
        int opcion = f_opcion();
        if (opcion == 1) {  //Aromatica
            f_aromatica();
        } else if (opcion == 2) {  //Café negro
            f_cafe_negro();
        } else if (opcion == 3) {  //Café con leche
            f_cafe_con_leche();
        } else if (opcion == 4) {  //Capuchino
            f_capuchino();
        } else {  //Mocachino
            f_mocachino();
        }

    }

    public static void f_menu() {
        //Description : This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ SoftDrinksMachine USTA 2020             ║");
        System.out.println("║ Version 1.0                             ║");
        System.out.println("║ Created by: Juan Sebastian Arias Moreno ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static void f_menu_bebidas() {
        //Description: This method shows the menu of this software.
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║   PRODUCTO        ║   VALOR   ║  TIEMPO (CREACIÓN)   ║");
        System.out.println("║══════════════════════════════════════════════════════║");
        System.out.println("║1. AROMÁTICA       ║      $1300║           30 SEGUNDOS║");
        System.out.println("║2. CAFÉ NEGRO      ║      $1000║           30 SEGUNDOS║");
        System.out.println("║3. CAFÉ CON LECHE  ║      $1900║           45 SEGUNDOS║");
        System.out.println("║4. CAPUCHINO       ║      $2500║           60 SEGUNDOS║");
        System.out.println("║5. MOCACHINO       ║      $2700║           70 SEGUNDOS║");
        System.out.println("╚══════════════════════════════════════════════════════╝");
    }

    public static int f_opcion() {
        //Descripción: Este metodo le pide al usuario que producto quiere elegir.
        Scanner keyboard = new Scanner(System.in);
        int opcion;
        System.out.println("Introduzca el número del producto que quiere.");
        opcion = keyboard.nextInt();
        while (opcion > 5 || opcion < 1) {
            System.err.println("ERROR: Solo existe la opción desde el 1 hasta el 5.");
            System.out.println("Introduzca de nuevo el número del producto que quiere.");
            opcion = keyboard.nextInt();
        }
        return opcion;
    }


    public static void f_aromatica() {
        Scanner keyboard = new Scanner(System.in);
        int dinero, vueltas, f_dinero, precio_producto;
        precio_producto = 1300;
        System.out.println("Ingrese el billete con el que desea pagar.");
        dinero = keyboard.nextInt();
        vueltas = dinero - precio_producto;
        if (dinero > precio_producto) {
        } else while (dinero < 1300) {
            f_dinero = precio_producto - dinero;
            System.err.println("El dinero que ingresó no es suficiente.");
            System.out.println("El dinero que hace falta es: " + f_dinero);
            System.out.println("Ingrese el dinero que hace falta.");
            dinero += keyboard.nextInt();
            vueltas = dinero - precio_producto;
        }
        System.out.println("Su bebida estará lista en 30 segundos.");
        System.out.println("Sus vueltas son: " + vueltas);
    }

    public static void f_cafe_negro() {
        Scanner keyboard = new Scanner(System.in);
        int dinero, vueltas, f_dinero, precio_producto;
        precio_producto = 1000;
        System.out.println("Ingrese el billete con el que desea pagar.");
        dinero = keyboard.nextInt();
        vueltas = dinero - precio_producto;
        if (dinero > precio_producto) {
        } else while (dinero < 1000) {
            f_dinero = precio_producto - dinero;
            System.err.println("El dinero que ingresó no es suficiente.");
            System.out.println("El dinero que hace falta es: " + f_dinero);
            System.out.println("Ingrese el dinero que hace falta.");
            dinero += keyboard.nextInt();
            vueltas = dinero - precio_producto;
        }
        System.out.println("Su bebida estará lista en 30 segundos.");
        System.out.println("Sus vueltas son: " + vueltas);
    }

    public static void f_cafe_con_leche() {
        Scanner keyboard = new Scanner(System.in);
        int dinero, vueltas, f_dinero, precio_producto;
        precio_producto = 1900;
        System.out.println("Ingrese el billete con el que desea pagar.");
        dinero = keyboard.nextInt();
        vueltas = dinero - precio_producto;
        if (dinero > precio_producto) {
        } else while (dinero < 1900) {
            f_dinero = precio_producto - dinero;
            System.err.println("El dinero que ingresó no es suficiente.");
            System.out.println("El dinero que hace falta es: " + f_dinero);
            System.out.println("Ingrese el dinero que hace falta.");
            dinero += keyboard.nextInt();
            vueltas = dinero - precio_producto;
        }
        System.out.println("Su bebida estará lista en 45 segundos.");
        System.out.println("Sus vueltas son: " + vueltas);
    }

    public static void f_capuchino() {
        Scanner keyboard = new Scanner(System.in);
        int dinero, vueltas, f_dinero, precio_producto;
        precio_producto = 2500;
        System.out.println("Ingrese el billete con el que desea pagar.");
        dinero = keyboard.nextInt();
        vueltas = dinero - precio_producto;
        if (dinero > precio_producto) {
        } else while (dinero < 2500) {
            f_dinero = precio_producto - dinero;
            System.err.println("El dinero que ingresó no es suficiente.");
            System.out.println("El dinero que hace falta es: " + f_dinero);
            System.out.println("Ingrese el dinero que hace falta.");
            dinero += keyboard.nextInt();
            vueltas = dinero - precio_producto;
        }
        System.out.println("Su bebida estará lista en 60 segundos.");
        System.out.println("Sus vueltas son: " + vueltas);
    }

    public static void f_mocachino() {
        Scanner keyboard = new Scanner(System.in);
        int dinero, vueltas, f_dinero, precio_producto;
        precio_producto = 2700;
        System.out.println("Ingrese el billete con el que desea pagar.");
        dinero = keyboard.nextInt();
        vueltas = dinero - precio_producto;
        if (dinero > precio_producto) {
        } else while (dinero < 2700) {
            f_dinero = precio_producto - dinero;
            System.err.println("El dinero que ingresó no es suficiente.");
            System.out.println("El dinero que hace falta es: " + f_dinero);
            System.out.println("Ingrese el dinero que hace falta.");
            dinero += keyboard.nextInt();
            vueltas = dinero - precio_producto;
        }
        System.out.println("Su bebida estará lista en 60 segundos.");
        System.out.println("Sus vueltas son: " + vueltas);
    }
}