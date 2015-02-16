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
public class RestaTest {
    
    @Test
    public void pruebaConmutacionResta(){
        Command cmd=new ComandoResta();
        double resultado=cmd.ejecutar(5, 10);
        Assert.assertEquals(resultado, -5.0);
    }
    
    @Test
    public void restaNegativa(){
         Command cmd=new ComandoResta();
        double resultado=cmd.ejecutar(-5, -10);
        Assert.assertEquals(5.0,resultado);
    }
}
