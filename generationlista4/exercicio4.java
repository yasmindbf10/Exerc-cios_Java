package br.com.generationlista4;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		int matriz[][] = new int [3][3];
		int l, c, soma=0, somaDiagonal=0;
		
		for(l=0;l<3;l++) {
			for(c=0;c<3; c++) {
				System.out.println("Digite o valor: ");
				Scanner leia = new Scanner(System.in);
				matriz[l][c]=leia.nextInt();
				soma = soma + matriz[l][c];
				if (l==c) {
					somaDiagonal = somaDiagonal + matriz[l][c];
				}
			}
		}

			System.out.println("A soma total da matriz é: "+ soma);
			System.out.println("A soma da Diagonal Principal é: " + somaDiagonal);
	}

}
