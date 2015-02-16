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
public class Logaritmo10Test {

    @Test
    public void logaritmoDeUnNumero() {
        Command cmd = new ComandoLogaritmo10();
        double resultado = cmd.ejecutar(8);
        Assert.assertEquals(resultado, 0.9030899869919435);

    }
}
