/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_6;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class Punto_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingresa la longitud del cateto A: ");
        double catetoA = in.nextDouble();
        
        System.out.print("Ingrese la longitud del cateto B:" );
        double catetoB = in.nextDouble();
        
        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB );
        
        
        double angulo1 = Math.atan(catetoA / catetoB);
        
        double angulo2 = Math.atan(catetoB / catetoA);
        
        System.out.println("Hipotenusa (c): " + hipotenusa);
        System.out.println("Ángulo agudo Alfa: " + angulo1 + " grados");
        System.out.println("Ángulo agudo Beta: " + angulo2 + " grados");
    }    
}
