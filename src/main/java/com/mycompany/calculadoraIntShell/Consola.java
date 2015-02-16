/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraIntShell;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Consola {

    public void menu (){
        System.out.println(" _________________________________________________  ");
        System.out.println("|                  Calculadora 1.0      [-][ ][x] |");
        System.out.println("|_________________________________________________|  ");
        System.out.println("  ");
        System.out.println("Ingrese la Ecuación:  ");
        Scanner sc = new Scanner(System.in);
        String entrada =sc.next();
        
    }
    
    public static void main(String[] args) {
        
        Consola consola = new Consola();
        consola.menu();
    }

}
