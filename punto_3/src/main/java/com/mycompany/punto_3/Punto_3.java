/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto_3;

/**
 *
 * @author alexs
 */
public class Punto_3 {

    public static void main(String[] args) {
        
        int n= 3;
        System.out.println("Suma terminos = " + sumaTerminos(n));   
    }
    
    public static double sumaTerminos(int n){
        
        double suma = 0;
        
        for(int i=1; i<=n; i++){
            double termino = i / Math.pow(2,i);
            suma+=termino;
        }
        return suma;
    }
}
