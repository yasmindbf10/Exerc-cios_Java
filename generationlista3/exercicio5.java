package br.com.generationlista3;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		int numero, soma = 0;
		
		do {
		System.out.println("Digite um número: ");
		Scanner leia = new Scanner (System.in);
		numero = leia.nextInt();
		soma = soma + numero;
		}
		while (numero!=0);
		System.out.println("A soma destes números é:  " + soma);
	}
	
	
}
