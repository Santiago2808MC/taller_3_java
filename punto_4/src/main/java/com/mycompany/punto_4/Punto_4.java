/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto_4;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class Punto_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("ingrese cantidad de N naturales :");
        int cantidadObjeto = in.nextInt();
        int suma = 0, n = 0;
        
        while(suma <= cantidadObjeto){
            n++;
            suma += n;
        }
        System.out.println(" el numero natural N mas pequeño cuya suma supera "+ cantidadObjeto + " es " + n);
    }
}
