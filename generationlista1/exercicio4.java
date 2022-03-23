package br.com.genereationlista1;

import java.util.Scanner;

public class exercicio4 {
public static void main(String[] args) {
	int A, B, C, R, S, D;
	
	System.out.println("Digite o valor de A: ");
	Scanner leia = new Scanner(System.in);
	A = leia.nextInt();

	System.out.println("Digite o valor de B: ");
	B = leia.nextInt();

	System.out.println("Digite o valor de C: ");
	C = leia.nextInt();

	R = (A + B) * (A + B);
	S = (B + C) * (B + C);
	D = (R + S) / 2;


	System.out.println("O resultado da expressão é: " + D);
	
}
}
