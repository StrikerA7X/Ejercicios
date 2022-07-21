/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author TUF GAMING
 */
public class Num26 {
public int factorial (double numero) {
if (numero==0)
return 1;
else
return (int) (numero * factorial(numero-1));
}
}
