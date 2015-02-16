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
public class TangenteTest {

    @Test
    public void tangenteDeUnNumero() {
        Command cmd = new ComandoTangente();
        double resultado = cmd.ejecutar(360);
        Assert.assertEquals(resultado, 0); //debe dar cero si esta en grados
    }

}
