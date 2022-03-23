package br.com.generationlista4;
import java.util.Scanner;
public class exercicio1 {
	public static void main(String[] args) {
		int notas[] = new int [5];
		int posicao=0, maior =0, length;
		
	do {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua nota ");
		notas[posicao] = leia.nextInt();
		
		
		if(notas[posicao] > maior) {
			maior = notas[posicao];}	
			posicao++;		
		
	}
		while (posicao<5);	

		System.out.println("A maior nota foi "+ maior);
		
		for (posicao = 0; posicao < notas.length; posicao++) {
			   System.out.println("Elemento " + posicao + " = " + notas[posicao]);
		
		
		}
		
	}
	
}