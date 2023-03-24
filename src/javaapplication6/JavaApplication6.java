/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Rodrigo y Ale
 */
public class JavaApplication6 {
////
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("ingresa tu nombre ");
        
        nombre = leer.next();
        System.out.println("hola mundo. Soy " + nombre + " y estoy programando en java");
    }
    
}
