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
public class MultiplicarTest {
    @Test
    public void MultiplicarDosNumeros() {
        Command cmd = new ComandoMultiplicar();
        double resultado = cmd.ejecutar(8,5);
        Assert.assertEquals(resultado, 40.0);
    }
}
