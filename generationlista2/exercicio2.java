package br.com.generationlista2;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		int A, B, C;
		System.out.println("Digite o 1� n�mero: ");
		Scanner leia = new Scanner(System.in);
		A = leia.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		B = leia.nextInt();
		
		
		System.out.println("Digite o 3� n�mero: ");
		C = leia.nextInt();
		
		if(A<=B && B<=C) {
			System.out.println("A ordem crescente �: " + A +"," + B + ","+ C);
		}
			else if(B<=C && C<=A) 
			System.out.println("A ordem crescente �: " + B + ", "+  C + ","+ A);
			else if(C<=A && A <=B)
			System.out.println("A ordem crescente �: " + C + "," + A +","+ B);
			else if (B<=A && A<=C)
			System.out.println("A ordem crescente �: " + B + ","+ A + ","+ C);
			else if(C<=B && B <=A)
			System.out.println("A ordem crescente �: " + C + "," +B +","+ A);
			else
				System.out.println("A ordem crescente �: " + A + ","+ C +","+ B);
				
			
		
	}

}
