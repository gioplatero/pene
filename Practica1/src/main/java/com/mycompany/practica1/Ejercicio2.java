/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practica1;
import java.util.Scanner;
/**
 *
 * @author UFG
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner (System.in);
         double total;
         double n_compra;
         System.out.println("Porfavor ingrese el numero de compras que ha realizado: ");
         n_compra = sc.nextDouble();
         if (n_compra < 3 ){
             System.out.println("Perdon usted no aplica para el descuento de frecuencia de compras.");
         }else{
             System.out.println("Porfavor ingrese el valor total de su compra:");
             total = sc.nextDouble();
             if (total < 10000){
                 double res = total * 0.025;
                 double desc= total - res;
                 double res3 = desc * 0.13;
                 double res4 = res3 + desc;
                 System.out.println("Su total a pagar sin descuento es de y SIN IVA es de: "+total);
                 double iva = total * 0.13;
                 double iva_total = total + iva;
                 System.out.println("Su total a pagar sin descuento y CON IVA es de: "+iva_total);
                 System.out.println("Usted aplico a un descuento del 10% su total a SIN IVA pagar es de: "+desc);
                 System.out.println("Usted aplico a un descuento del 10% su total a CON IVA pagar es de: "+res4);
                 
                 
                
                 
             }
             else if(total > 10000 && total < 19999){
                 double res = total * 0.04;
                 double desc= total - res;
                 double res3 = desc * 0.13;
                 double res4 = res3 + desc;
                 System.out.println("Su total a pagar sin descuento es de y SIN IVA es de: "+total);
                 double iva = total * 0.13;
                 double iva_total = total + iva;
                 System.out.println("Su total a pagar sin descuento y CON IVA es de: "+iva_total);
                 System.out.println("Usted aplico a un descuento del 10% su total a SIN IVA pagar es de: "+desc);
                 System.out.println("Usted aplico a un descuento del 10% su total a CON IVA pagar es de: "+res4);
                 
             }
             else if (total > 20000 && total < 40000){
                 double res = total * 0.07;
                 double desc= total - res;
                 double res3 = desc * 0.13;
                 double res4 = res3 + desc;
                 System.out.println("Su total a pagar sin descuento es de y SIN IVA es de: "+total);
                 double iva = total * 0.13;
                 double iva_total = total + iva;
                 System.out.println("Su total a pagar sin descuento y CON IVA es de: "+iva_total);
                 System.out.println("Usted aplico a un descuento del 10% su total a SIN IVA pagar es de: "+desc);
                 System.out.println("Usted aplico a un descuento del 10% su total a CON IVA pagar es de: "+res4); 
             }
             else if (total > 40000){
                 double res = total * 0.10;
                 double desc= total - res;
                 double res3 = desc * 0.13;
                 double res4 = res3 + desc;
                 System.out.println("Su total a pagar sin descuento es de y SIN IVA es de: "+total);
                 double iva = total * 0.13;
                 double iva_total = total + iva;
                 System.out.println("Su total a pagar sin descuento y CON IVA es de: "+iva_total);
                 System.out.println("Usted aplico a un descuento del 10% su total a SIN IVA pagar es de: "+desc);
                 System.out.println("Usted aplico a un descuento del 10% su total a CON IVA pagar es de: "+res4); 
             }
            
         }
         
         
        
    }
    
}
