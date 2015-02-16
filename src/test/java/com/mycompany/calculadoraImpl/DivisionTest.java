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
 * @author USUARIO
 */
public class DivisionTest {
    @Test
    public void divisionPorCero(){
    Command cmd = new ComandoDivision();
    double resultado = cmd.ejecutar(8,2);
    Assert.assertEquals(resultado, 4.0); 
    }
    
    
}
