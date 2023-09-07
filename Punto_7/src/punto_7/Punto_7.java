/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_7;

import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class Punto_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese las horas semanales trabajadas: ");
        int horasTrabajadas = in.nextInt();
        
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = in.nextDouble();
        
        double salarioBruto;
        
        if(horasTrabajadas <= 38){
            salarioBruto = horasTrabajadas* tarifaPorHora;
        }else{
            // Si hay horas extras, calcular el salario con tasa 50% superior Debes multiplicar la tarifa normal por 1,5 para obtener el 50% adicional.
            salarioBruto = 38 * tarifaPorHora + (horasTrabajadas - 38) * (tarifaPorHora * 1.5);
        }
        
        double impuesto;
        
        if(salarioBruto <= 750){
            impuesto = 0.0;
        }else{
            impuesto = salarioBruto * 0.10;
        }
        
        double salarioNeto = salarioBruto - impuesto;
        
        System.out.println("Salario Bruto: " + salarioBruto + " euros");
        System.out.println("Impuestos: " + impuesto + " euros");
        System.out.println("Salario Neto: " + salarioNeto + " euros");
    }
    
}
