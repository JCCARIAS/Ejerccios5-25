/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primo5;
import java.util.Scanner;

import primo5.Primo;
import static primo5.Primo.esPrimo;
/**
 *
 * @author chris
 */
public class PrimoTesting {
    
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero para evaluar si es primo ");
        int numero= scanner.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
}
    }
