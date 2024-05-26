/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedio3;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PromedioTesting {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        Promedio calc = new Promedio();
                System.out.println("Ingrese dos numeros que al multiplicarse el resultado sea 8 ");

        System.out.println("Ingrese primer calificacion");
       
        int  a = scanner.nextInt();
       
           System.out.println("Ingrese segunda calificacion  ");
                   int  b = scanner.nextInt();
             System.out.println("Ingrese tercera calificacion");
                   int  c = scanner.nextInt();
                      System.out.println("Ingrese cuarta calificacion");
                   int  d = scanner.nextInt();
            
 
        int resultado = calc.promedio(a, b,c,d);
               assertEquals(80, resultado);
        System.out.println("Su promedio es  " + resultado);
    }
}
