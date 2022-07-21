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
public class Num24 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n, notas_aprobadas, notas_reprobadas;
        double nota, promedio_de_notas = 0, promedio_notas_aprobadas, promedio_notas_reprobadas;
        notas_aprobadas = 0;
        notas_reprobadas = 0;
        promedio_notas_aprobadas = 0;
        promedio_notas_reprobadas = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingresa el valor de nota: ");
            nota = in.nextDouble();
            in.nextLine();
            if(nota<7)
            {
                notas_reprobadas=notas_reprobadas+1;
                promedio_notas_reprobadas=promedio_notas_reprobadas+nota;
            }
            else
            {
                notas_aprobadas=notas_aprobadas+1;
                promedio_notas_aprobadas=promedio_notas_aprobadas+nota;
            }
            promedio_de_notas=promedio_de_notas+nota;
            System.out.println("Valor de promedio de notas: " + promedio_de_notas);
            System.out.println();
        }
        if (n == 0) {
            promedio_de_notas = 0;
        } else {
            promedio_de_notas=promedio_de_notas/n;
        }
        if (notas_aprobadas == 0) {
            promedio_notas_aprobadas = 0;
        } else {
            promedio_notas_aprobadas=promedio_notas_aprobadas/notas_aprobadas;
        }
        if (notas_reprobadas == 0) {
            promedio_notas_reprobadas = 0;
        } else {
            promedio_notas_reprobadas=promedio_notas_reprobadas/notas_reprobadas;
        }
        System.out.println("Valor de notas aprobadas: " + notas_aprobadas);
        System.out.println("Valor de notas reprobadas: " + notas_reprobadas);
        System.out.println("Valor de promedio notas aprobadas: " + promedio_notas_aprobadas);
        System.out.println("Valor de promedio notas reprobadas: " + promedio_notas_reprobadas);
    }

}

