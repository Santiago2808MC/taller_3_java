/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto_1;

/**
 *
 * @author alexs
 */ 
    
    public class Punto_1 {
        
        /**
        * @param args the command line arguments
        */
        
        public static void main(String[] args) {
            
            double longitud = 50.9; //tipo de dato  de la variable decimal longitud
            double anchura = 40.4; // tipo de dato variable decimal
            double superficie = calcularSuperficie(longitud, anchura); //
            System.out.println("Superficie = " + superficie);
        }
        
        public static double calcularSuperficie(double longitud, double anchura){
            
            return longitud * anchura;
        }
    }

