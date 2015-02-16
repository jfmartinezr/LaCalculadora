package com.mycompany.calculadoraImpl;
/**
 *
 * @author usuario
 */
public class Calculadora {

    public double sumar(double num1, double num2) {
        double result;
        result = num1 + num2;
        return result;
    }

    public double restar(double num1, double num2) {
        double result;
        result = num1 - num2;
        return result;
    }

    public double multiplicar(double num1, double num2) {
        double result;
        result = num1 * num2;
        return result;
    }

    public double dividir(double num1, double num2) {
        double result;
        result = num1 / num2;
        return result;
    }

    public double cociente(double num1, double num2) {
        double result;
        result = num1 % num2;
        return result;
    }

    public double elevar(double base, double expo) {
        double result;
        result = Math.pow(base, expo);
        return result;
    }

    public double raiz2(double base) {
        double result;
        result = Math.sqrt(base);
        return result;
    }

    public double logaritmo(double num1) {
        double result;
        result = Math.log10(num1);
        return result;
    }

}
