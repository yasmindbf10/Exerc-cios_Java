package br.com.generationlista4;
import java.util.Scanner;
public class exercicio2 {
	public static void main(String[] args) {
		int i, soma = 0, media, s=0;
		int []dado = new int [10];
		
		for (i=0;i<10;i++) {
		System.out.println("Digite o resultado do dado: ");
		Scanner leia = new Scanner(System.in);
		dado[i] = leia.nextInt();
		soma = soma + dado[i];
			if (dado[i]==6) {
				s++;
			}
		
		}
		
		media = soma/10;	
		System.out.println("A media do valor dos dados é: " + media);
		System.out.println("O número 6 saiu: " + s + " vezes.");
}
}