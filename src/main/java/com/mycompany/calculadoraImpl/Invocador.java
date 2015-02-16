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
        comandos.put("-"    ,   new ComandoResta());
        comandos.put("+"    ,   new ComandoSuma());
        comandos.put("*"    ,   new ComandoMultiplicar());
        comandos.put("/"    ,   new ComandoDivision());
        comandos.put("%"    ,   new ComandoCociente());
        comandos.put("raiz2",   new ComandoRaiz2());
        comandos.put("raiz" ,   new ComandoRaiz());
        comandos.put("^"    ,   new ComandoElevar());
        comandos.put("log10",   new ComandoLogaritmo10());
        comandos.put("sen"  ,   new ComandoSeno());
        comandos.put("cos"  ,   new ComandoCoseno());
        comandos.put("tang" ,   new ComandoTangente());
        
        
    }
    
    public double ejecutarUnitaria(double op1, String operador){
        Command cmd=comandos.get(operador);
        return cmd.ejecutar(op1);
    }
    
    public double ejecutarBinaria(double op1, double op2, String operador){
        Command cmd=comandos.get(operador);
        return cmd.ejecutar(op1, op2);
    }    
    
}
