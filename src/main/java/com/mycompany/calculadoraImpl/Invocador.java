/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraImpl;

import com.mycompany.calculadoracmd.Command;
import java.util.HashMap;

/**
 *
 * @author f212
 */
public class Invocador {
    
    HashMap<String,Command> comandos;

    public Invocador() {
        comandos= new HashMap<>();
        comandos.put("-", new ComandoResta());
        comandos.put("+", new ComandoSuma());
    }
    
    public double ejecutar(double op1, double op2, String operador){
        Command cmd=comandos.get(operador);
        return cmd.ejecutar(op1, op2);
    }
    
    
    
}
