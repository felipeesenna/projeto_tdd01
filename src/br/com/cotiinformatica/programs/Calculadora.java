package br.com.cotiinformatica.programs;

public class Calculadora {

	// função para calculadora
	public Double calcular(Double num1, Double num2, Operacao operacao) {

		switch (operacao) {

		case SOMAR:
			return num1 + num2;

		case SUBTRAIR:
			return num1 - num2;

		case MULTIPLICAR:
			return num1 * num2;

		case DIVIDIR:
			return num1 / num2;

		default:
			return null;
		}
	}
}
