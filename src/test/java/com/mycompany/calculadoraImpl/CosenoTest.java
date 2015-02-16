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
public class CosenoTest {
   @Test
   public void cosenoDeUnNumero(){
   Command cmd = new ComandoCoseno();
   Double resultado = cmd.ejecutar(360);
   Assert.assertEquals(resultado, -0.2836910914865273);
}
}

