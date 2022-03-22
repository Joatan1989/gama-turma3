package br.santos;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
  @Test
    public void deveRetornarASomadosValores() {
  Calculadora c = new  Calculadora();

  double resultado = c.somar(10, 20);
 
  assertEquals("Soma", 30, resultado, 0);



}
}
