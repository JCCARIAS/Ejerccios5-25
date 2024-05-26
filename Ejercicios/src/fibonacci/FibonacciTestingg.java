/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;


import static fibonacci.Fibonacci.CalcularFibonacci;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class FibonacciTestingg {
    
      public static void main(String[] args) {
                  Scanner scanner = new Scanner(System.in);
                   System.out.print("Ingrese el numero de terminos de Fibonacci que desea mostrar: ");
                           int n = scanner.nextInt();
        
                        System.out.println("Los primeros " + n + " terminos de la serie de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(CalcularFibonacci(i) + " ");
            
           
    }
          scanner.close();
        }
        
      }