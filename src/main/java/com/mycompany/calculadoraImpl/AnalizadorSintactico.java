/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraImpl;

import java.util.ArrayList;
/**
 *
 * @author usuario
 */
public class AnalizadorSintactico {

    ComandoResta restar = new ComandoResta();
    ArrayList<Double> numero = new ArrayList<Double>();
    ArrayList<String> operador = new ArrayList<String>();

    public void declarar() {

    }

    public String analizadorSintactico(String ecuación) {
        numero.add(3.00);
        numero.add(40.00);
        numero.add(50.00);
        operador.add("*");
        operador.add("+");
        operador.add("/");
        operador.add("-");
        System.out.println("inicia");

        for (int i = 0; i < numero.size(); i++) {

            System.out.print(numero.get(i));

            for (int j = 0; j < operador.size(); j++) {

                if (operador.get(j).equals("*")) {

                    System.out.print(operador.get(j));
                    break;
                }
                if (operador.get(j).equals("+")) {

                    System.out.print(operador.get(j));
                    break;
                }
                if (operador.get(j).equals("/")) {

                    System.out.print(operador.get(j));
                    break;
                }
                if (operador.get(j).equals("-")) {

                    System.out.print(operador.get(j));
                    break;
                }
            }
        }
        System.out.println("finaliza");

        return "";
    }

    public int analizadorSintactico2(String ecuacion) {

        char[] charA = ecuacion.toCharArray();
        int[] intA = new int[100];
        System.out.println(charA);
        for (int i = 0; i < charA.length; i++) {
            int varint;
            if (charA[i] == '0'||charA[i] == '1'||charA[i] == '2'||charA[i] == '3'||charA[i] == '4'||charA[i] == '5'||charA[i] == '6'||charA[i] == '7'||charA[i] == '8'||charA[i] == '9') {
                char aux = charA[i];
                varint = Character.getNumericValue(aux);
                return varint;
            }    
        }

        return 0;

    }

}
