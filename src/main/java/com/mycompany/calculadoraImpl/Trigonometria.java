/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraImpl;

/**
 *
 * @author usuario
 */
public class Trigonometria {
 
   
    public double seno(double angulo) {
      double result;
      result=Math.sin(angulo);
      return result;
    }
    
    public double coseno(double angulo) {
      double result;
      result=Math.cos(angulo);
      return result;
    }
    
    public double tangente(double angulo) {
      double result;
      result=Math.tan(angulo);
      return result;
    }
  }
