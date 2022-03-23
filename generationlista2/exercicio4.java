package br.com.generationlista2;

import java.util.Scanner;

public class exercicio4 {
public static void main(String[] args) {
	double numero, quadrado, potencia;
	System.out.println("Digite um número: ");
	Scanner leia = new Scanner(System.in);
	numero = leia.nextDouble();
	
	if (numero%2 == 0) {
		quadrado = Math.sqrt(numero);
	System.out.println("O número é par e sua raiz é " + quadrado);
	}
	else {
		potencia = Math.pow(numero, 2);
	System.out.println("O número é ímpar e o resultado dele elevado a dois é: " + potencia);
}
}
}