package br.com.generationlista3;

import java.util.Scanner;

public class exercicio6 {
		public static void main(String[] args) {
			int numero, media,cont = 0, somaMultiplos = 0;
			
			do{
			System.out.println("Digite um n�mero: ");
			Scanner leia = new Scanner (System.in);
			numero = leia.nextInt();
			
				if (numero%3 == 0 && numero!=0) {
					cont++;
					somaMultiplos = somaMultiplos + numero;
				}
			}
				
			while (numero!=0);
			media = somaMultiplos/cont;
			System.out.println("A m�dia dos n�meros multiplos de 3 digitados �: " + media);
			
		}
}
