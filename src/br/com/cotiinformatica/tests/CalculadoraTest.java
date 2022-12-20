package br.com.cotiinformatica.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.cotiinformatica.programs.Calculadora;
import br.com.cotiinformatica.programs.Operacao;

public class CalculadoraTest {

	@Test
	public void testSomar() {

		// vari�veis para o teste
		Double numero1 = 20.0;
		Double numero2 = 10.0;
		Double resultadoEsperado = 30.0;

		// executando a opera��o de soma da calculadora
		Calculadora calculadora = new Calculadora();
		Double resultadoObtido = calculadora.calcular(numero1, numero2, Operacao.SOMAR);

		// verificando se o resultado esperado � igual ao obtido
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testSubtrair() {

		// vari�veis para o teste
		Double numero1 = 20.0;
		Double numero2 = 10.0;
		Double resultadoEsperado = 10.0;

		// executando a opera��o de subtra��o da calculadora
		Calculadora calculadora = new Calculadora();
		Double resultadoObtido = calculadora.calcular(numero1, numero2, Operacao.SUBTRAIR);

		// verificando se o resultado esperado � igual ao obtido
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testMultiplicar() {

		// vari�veis para o teste
		Double numero1 = 20.0;
		Double numero2 = 10.0;
		Double resultadoEsperado = 200.0;

		// executando a opera��o de multiplica��o da calculadora
		Calculadora calculadora = new Calculadora();
		Double resultadoObtido = calculadora.calcular(numero1, numero2, Operacao.MULTIPLICAR);

		// verificando se o resultado esperado � igual ao obtido
		assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testDividir() {

		// vari�veis para o teste
		Double numero1 = 20.0;
		Double numero2 = 10.0;
		Double resultadoEsperado = 2.0;

		// executando a opera��o de divis�o da calculadora
		Calculadora calculadora = new Calculadora();
		Double resultadoObtido = calculadora.calcular(numero1, numero2, Operacao.DIVIDIR);

		// verificando se o resultado esperado � igual ao obtido
		assertEquals(resultadoEsperado, resultadoObtido);
	}
}
