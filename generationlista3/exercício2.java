package br.com.generationlista3;

import java.util.Scanner;

public class exerc�cio2 {
	public static void main(String[] args) {
		int numero, quantidadeP=0, quantidadeI=0;
		
		for (int cont = 0; cont<10 ; cont++) {
			
			System.out.println("Digite um n�mero:");
			Scanner leia = new Scanner (System.in);
			numero = leia.nextInt();
			
			if(numero%2 == 0) {
				quantidadeP = quantidadeP + 1;
			}
				else {
				quantidadeI = quantidadeI+1;
				}
			}
		System.out.println("Foram digitados" +" "+ quantidadeP + " " + "n�meros pares e " + " "+ quantidadeI +" "+ "de n�meros �mpares!");
			
			
		}
	}


