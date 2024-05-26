/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablademultipplicar;


import java.util.Scanner;


public class MultiplilcationTest {
    
    
        public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese  numero: ");
              int numero = scanner.nextInt();

             
               Tabla.Multiplicando(numero);
        
               scanner.close();
        }
    
}
