package br.com.generationlista2;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		int idade;
		System.out.println("Digite a idade sua idade: ");
		Scanner leia = new Scanner(System.in);
		idade = leia.nextInt();
		
		if (idade>= 10 && idade<= 14) {
			System.out.println("Você pertence a categoria: INFANTIL");
			
		}
		else if (idade >=15 && idade <=17) {
			System.out.println("Você pertence a categoria: JUVENIL");
		}
		else if (idade >=18 && idade <=25) {
			System.out.println("Você pertence a categoria: ADULTO");
	}
		else {
				System.out.println("Você não se encaixa em nenhuma das categorias");
		}

}
}
