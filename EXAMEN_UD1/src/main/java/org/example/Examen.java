package org.example;
import java.util.Scanner;

public class Examen {
    public void ejercicio1() {
        try {
            System.out.print("Introduce un número:");
            Scanner entrada = new Scanner(System.in);//para saber el input del usuario
            int num1 = entrada.nextInt();
            if (num1 <0) {//comprueba que sea menor que 0 el numero introducido
                int num2 = num1 * (-1);//al serlo se multiplica por -1 para hacerlo entero
                System.out.println("El valor absoluto es:" + num2);
            }
            else {
                System.out.println("El valor absoluto es:" + num1);


            }
                
        }catch (NumberFormatException e) {
            System.out.println ("Error introducir un valor valido");
        }


    }


    public void ejercicio2() {
        System.out.println("Introduce tu nombre:");
        Scanner entrada = new Scanner(System.in);
        String nombre=entrada.next();
        System.out.println("La obra de " + nombre);
        try {//coje las medidas del usuario
            System.out.println("Introudce el ancho de la pared...");
            int ancho = Integer.parseInt(entrada.next());
            System.out.println("Introudce el largo de la pared...");
            int largo = Integer.parseInt(entrada.next());
            System.out.println("Introudce el ancho del azulejo...");
            int ancho2 = Integer.parseInt(entrada.next());
            System.out.println("Introudce el largo del azulejo...");
            int largo2 = Integer.parseInt(entrada.next());
            while(largo2 == ancho2) {
                System.out.println("El azulejo no puede ser cuadrado.");
            }
            if (ancho2>=ancho) {
                System.out.println("El azulejo no puede ser mas grande que la pared");
            if (largo2>=largo){
                System.out.println("El azulejo no puede ser mas grande que la pared");
            }
            }
            int resultado = ancho * largo;
            int resultado2 = ancho2 * largo2;
            System.out.println("Se necesitan" + resultado/resultado2 + "azulejos");

        }catch(NumberFormatException e){
            System.out.println("Introduce un número válido.");
        }

    }
}
