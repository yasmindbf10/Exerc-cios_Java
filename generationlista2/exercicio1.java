package br.com.generationlista2;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args)
	{
		int A, Contador, maior=0;
		
		for(Contador=0; Contador<3;Contador++) {
			System.out.println("Digite um número:");
			Scanner leia = new Scanner(System.in);
			A = leia.nextInt();
			if (Contador == 0) {
				maior=A;
			
			}
			if (A> maior) {
				maior=A;
			}
			
		}
		System.out.println(maior);
		
	
	}

}