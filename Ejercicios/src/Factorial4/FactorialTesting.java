 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factorial4;
   
import static Factorial4.Factorial.Factorial;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactorialTesting {
          public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          Factorial fact = new Factorial();
          
            System.out.println("ingrese numero a factoriar");

         int numero =  scanner.nextInt();
        int factorial = Factorial(numero);
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
    
}
