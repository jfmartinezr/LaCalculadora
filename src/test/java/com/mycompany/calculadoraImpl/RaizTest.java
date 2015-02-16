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
public class RaizTest {

    @Test
    public void raizDeUnNumero() {
        Command cmd = new ComandoRaiz();
        double resultado = cmd.ejecutar(64);
        Assert.assertEquals(resultado, 8.0);
    }
}
