package com.ivan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    /*public void ejercicio1() {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(101);

    } */
    

    public void ejercicio2() {

        try (Scanner teclado = new Scanner (System.in)){

            int anyoIntroducido = 0;
            int esBisiesto = 0;
            boolean entradaValida = false;

            System.out.println("");
            System.out.println("Introduce un año para saber si es bisiesto hasta el año actual");
            System.out.println("");
            
            while (!entradaValida){
                try {
                    anyoIntroducido = teclado.nextInt();
                    entradaValida = true;
                    
                } catch (InputMismatchException error) {
                    System.out.println("ERROR: El debe ser un numero");
                    System.out.println("");
                    System.out.println("Vuelve a intentarlo, introduce un año...");
                    teclado.nextLine();
                    entradaValida = false;
                }
                if (anyoIntroducido <= 1899 || anyoIntroducido >= 2025){
                    System.out.println("ERROR: No puedes introducir años menores a 1900 y mayores a 2024");
                    System.out.println("Vuelve a intentarlo, introduce el año:");
                    teclado.next();
                    entradaValida = false;
                }
                
            }

            for (int anyoMinimo = anyoIntroducido; anyoMinimo <= 2024; anyoMinimo++){

                if (anyoMinimo % 4 == 0 && anyoMinimo % 100 != 0 || (anyoMinimo % 400 == 0)){
                    System.out.println("El año" + anyoMinimo + " es bisiesto");
                    esBisiesto++;
                }
                
            }
            System.out.println("");
            System.out.println("Ha habido " + esBisiesto + " años bisiestos");
        }
    }
}
