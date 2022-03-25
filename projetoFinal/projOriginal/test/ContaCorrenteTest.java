 package projOriginal.test;

 import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import projOriginal.original.Conta;
import projOriginal.original.ContaCorrente;

 public class ContaCorrenteTest {

    @Test
    public void deveRetornarOvalorMenosOSaque(){
        Conta cc = new ContaCorrente(1234, 700);
        cc.saque(70);
        assertEquals("1234: 630.0 ", cc);
    }

}