package br.com.generationlista3;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
int idade = 0, quantidadeM=0, quantidadeN=0;
		
		while (idade != -99 ) {
			
			System.out.println("Digite sua idade:");
			Scanner leia = new Scanner (System.in);
			idade = leia.nextInt();
			
			if(idade >50) {
				quantidadeM = quantidadeM + 1;}
			if (idade< 21 && idade >= 0){
				quantidadeN = quantidadeN+1;
				}
			
			}	
		System.out.println("Há" +" "+ quantidadeM + " " + "pessoas com mais de 50 anos e \n " + " "+ quantidadeN +" "+ "pessoas com menos de 21.");
	}
	}

