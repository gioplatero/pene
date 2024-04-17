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
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
   
  Scanner entrada = new Scanner (System.in);
   
  String nombre_alumno;
  double evaluacion1;
  double evaluacion2;
  double evaluacion3;
  double evaluacion_final;  
   
  System.out.println("Nombre alumno: ");
  nombre_alumno = entrada.nextLine();
   
  System.out.println("Nota primera evaluación: ");
  evaluacion1 = entrada.nextDouble();
   
  System.out.println("Nota segunda evaluación: ");
  evaluacion2 = entrada.nextDouble();
   
  System.out.println("Nota tercera evaluación: ");
  evaluacion3 = entrada.nextDouble();
   
  evaluacion_final = (evaluacion1 + evaluacion2 + evaluacion3)/3;  
   
  System.out.println("La nota media de " + nombre_alumno + " es " + evaluacion_final);
 }
}

        
    
