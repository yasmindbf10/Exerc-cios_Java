package br.com.generationlista2;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		int A, B, C;
		System.out.println("Digite o 1º número: ");
		Scanner leia = new Scanner(System.in);
		A = leia.nextInt();
		
		System.out.println("Digite o 2º número: ");
		B = leia.nextInt();
		
		
		System.out.println("Digite o 3º número: ");
		C = leia.nextInt();
		
		if(A<=B && B<=C) {
			System.out.println("A ordem crescente é: " + A +"," + B + ","+ C);
		}
			else if(B<=C && C<=A) 
			System.out.println("A ordem crescente é: " + B + ", "+  C + ","+ A);
			else if(C<=A && A <=B)
			System.out.println("A ordem crescente é: " + C + "," + A +","+ B);
			else if (B<=A && A<=C)
			System.out.println("A ordem crescente é: " + B + ","+ A + ","+ C);
			else if(C<=B && B <=A)
			System.out.println("A ordem crescente é: " + C + "," +B +","+ A);
			else
				System.out.println("A ordem crescente é: " + A + ","+ C +","+ B);
				
			
		
	}

}
