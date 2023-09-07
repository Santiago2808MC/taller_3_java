/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.punto_5;



/**
 *
 * @author alexs
 */
public class Punto_5 {

    public static void main(String[] args) {
        
        String producto_1 = " producto 1";
        double Venta_1 = 15.0; 
        int unidadesVendidas_1 = 15;
        
        String producto_2 = " producto 2";
        double Venta_2 = 10.4; 
        int unidadesVendidas_2 = 27;
        
        String producto_3 = " producto 3";
        double Venta_3 = 20.3; 
        int unidadesVendidas_3 = 18;
        
        int totalProductosVendidos = unidadesVendidas_1 + unidadesVendidas_2 + unidadesVendidas_3;
        
        double totalIngresos = (Venta_1 * unidadesVendidas_1) + (Venta_2 * unidadesVendidas_2) + (Venta_3 * unidadesVendidas_3);
        
        String productoMasVendido = " ";
        int maxUnidadesVendidas = -1;
        
        if (unidadesVendidas_1 > maxUnidadesVendidas) {
            maxUnidadesVendidas = unidadesVendidas_1;
            productoMasVendido = producto_1;
        }
        if (unidadesVendidas_2 > maxUnidadesVendidas) {
            maxUnidadesVendidas = unidadesVendidas_2;
            productoMasVendido = producto_2;
        }
        if (unidadesVendidas_3 > maxUnidadesVendidas) {
            maxUnidadesVendidas = unidadesVendidas_3;
            productoMasVendido = producto_3;
        }
        
        String productoMascostoso = " ";
        double maxValorVenta = -1.0;
        
        if (Venta_1 > maxValorVenta) {
            maxValorVenta = Venta_1;
            productoMascostoso = producto_1;
        }
        if (Venta_2 > maxValorVenta) {
            maxValorVenta = Venta_2;
            productoMascostoso = producto_2;
        }
        if (Venta_3 > maxValorVenta) {
            maxValorVenta = Venta_3;
            productoMascostoso = producto_3;
        }
        System.out.println("Total productos vendidos en el día: " + totalProductosVendidos);
        System.out.println("Total ingresos por ventas del día: $" + totalIngresos);
        System.out.println("Producto más vendido: " + productoMasVendido);
        System.out.println("Producto más costoso vendido: " + productoMascostoso);
    }
}
