/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicacion;


import java.util.Scanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author chris
 */
public class MultiplicacionTesting {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        
        Multiplicacion calc = new Multiplicacion();
                System.out.println("Ingrese dos numeros que al multiplicarse el resultado sea 8 ");

        System.out.println("Ingrese cantidad para a");
      
        int  a = scanner.nextInt();
       
           System.out.println("Ingrese cantidad para b");
                   int  b = scanner.nextInt();
       
        int resultado = calc.multiplicar(a, b);
               assertEquals(8, resultado);
        System.out.println("La multiiplicacion de " + a + " y " + b + " es: " + resultado);
    }
}
