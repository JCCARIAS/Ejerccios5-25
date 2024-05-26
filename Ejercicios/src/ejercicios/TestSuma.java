
package ejercicios;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestSuma {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        Suma calc = new Suma();
        System.out.println("Ingrese cantidad para a");
      
        int  a = scanner.nextInt();
       
           System.out.println("Ingrese cantidad para b");
                   int  b = scanner.nextInt();
        
        int resultado = calc.sumar(a, b);
               assertEquals(8, resultado);
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
    }
    }
