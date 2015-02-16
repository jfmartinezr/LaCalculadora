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
public class ElevarTest {

@Test
public void potenciaDeUnNumero()
{
Command cmd = new ComandoElevar();
double resultado = cmd.ejecutar(2,5);
Assert.assertEquals(resultado, 32.0);
}
}
