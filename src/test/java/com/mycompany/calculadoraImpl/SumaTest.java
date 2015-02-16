/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraImpl;

import com.mycompany.calculadoracmd.Command;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author f212
 */
public class SumaTest {
    
    @Test
    public void debeSumarDosNumeros(){
        Command cmd=new ComandoSuma();
        double resultado=cmd.ejecutar(1,1);
        Assert.assertEquals(resultado, 2.0);
    }
    
     @Test
    public void sumaNegativa(){
         Command cmd=new ComandoSuma();
        double resultado=cmd.ejecutar(-5, -10);
        Assert.assertEquals(-15.0,resultado);
    }
}
