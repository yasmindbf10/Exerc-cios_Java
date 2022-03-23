package br.com.genereationlista1;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		int dias, meses, anos, diasTotais;
		
		System.out.println("Digite quantos dias você viveu: ");
		
		Scanner leia = new Scanner (System.in);
		
		diasTotais = leia.nextInt();

		anos = diasTotais/365;

		System.out.println("Você viveu:  " + anos + " anos");

		meses = (diasTotais - anos * 365) / 30;

		System.out.println("\nE: " + meses + " meses");

		dias = diasTotais - (anos * 365) - (meses * 30);

		System.out.println("\nE: " + dias + " dias");
		
	}

}
