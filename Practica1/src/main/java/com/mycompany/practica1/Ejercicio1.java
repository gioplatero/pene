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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner (System.in);
   
    double colegiatura = 150;
    double evaluacion1;
    double evaluacion2;
    double evaluacion3;
    double evaluacion_final;  
    
    System.out.println("Nota primera evaluación: ");
     evaluacion1 = entrada.nextDouble();
   
    System.out.println("Nota segunda evaluación: ");
    evaluacion2 = entrada.nextDouble();
   
    System.out.println("Nota tercera evaluación: ");
    evaluacion3 = entrada.nextDouble();
   
    evaluacion_final = (evaluacion1 + evaluacion2 + evaluacion3)/3; 
    

    
    if (evaluacion_final < 8.5){
        double calculo1 = colegiatura * 0.13;
        
        double pago_total = calculo1 + colegiatura;

        
        System.out.println("La nota final es de: " + evaluacion_final + " no aplica a descuento por notas altas su colegiatura es de: "+pago_total);
       
    }
    else{
         double calculo1 = colegiatura * 0.30;
        
         double pago_total = colegiatura - calculo1;
        System.out.println("La nota final es de " + evaluacion_final + " felicidades usted aplica al descuento por notas altas su colegiatura es de: "+pago_total);
    }
   
    }
    
}
