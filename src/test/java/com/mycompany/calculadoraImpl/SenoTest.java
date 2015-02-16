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
public class SenoTest {
    @Test
    public void senoDeUnNumero() {
        Command cmd = new ComandoSeno();
        double resultado = cmd.ejecutar(90);
        Assert.assertEquals(resultado, 1.0); //deberia dar 1.0 en grados 

    }  
}
