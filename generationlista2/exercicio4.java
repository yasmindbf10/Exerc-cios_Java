package br.com.generationlista2;

import java.util.Scanner;

public class exercicio4 {
public static void main(String[] args) {
	double numero, quadrado, potencia;
	System.out.println("Digite um n�mero: ");
	Scanner leia = new Scanner(System.in);
	numero = leia.nextDouble();
	
	if (numero%2 == 0) {
		quadrado = Math.sqrt(numero);
	System.out.println("O n�mero � par e sua raiz � " + quadrado);
	}
	else {
		potencia = Math.pow(numero, 2);
	System.out.println("O n�mero � �mpar e o resultado dele elevado a dois �: " + potencia);
}
}
}