package br.com.genereationlista1;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		 double nota1, nota2, nota3, notaFinal;
		 
			System.out.println("Digite a nota da P1: ");
			Scanner leia = new Scanner (System.in);
			nota1 = leia.nextDouble();

			System.out.println("Digite a nota da P2: ");
			nota2 = leia.nextDouble();

			System.out.println("Digite a nota da P3: ");
			nota3 = leia.nextDouble();

			notaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
			

			System.out.println("A Média final do aluno é: " + notaFinal);
	}

}
