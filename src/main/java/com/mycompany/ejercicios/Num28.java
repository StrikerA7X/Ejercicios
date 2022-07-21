/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author TUF GAMING
 */
public class Num28 {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num,i;
         String cad="";
          System.out.println("Ingresa 20 numeros al azar");
        for(i=0;i<20;i++){
             System.out.println("Ingresa Numero");
             num=sc.nextInt();
             if(num<=25){
              cad=cad+" "+num;
             }
        }        
        System.out.println(cad);
     }
}  

