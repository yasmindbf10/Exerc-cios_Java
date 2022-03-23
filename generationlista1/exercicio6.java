package br.com.genereationlista1;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		double x1, x2, y1, y2, d;
		
		System.out.println("Digite o valor de X1: ");
		Scanner leia = new Scanner(System.in);
		x1 = leia.nextDouble();

		System.out.println("Digite o valor de X2: ");
		x2 = leia.nextDouble();

		System.out.println("Digite o valor de Y1: ");
		y1 = leia.nextDouble();

		System.out.println("Digite o valor de Y2: ");
		y2 = leia.nextDouble();

		d = Math.sqrt((Math.pow(x2 - x1,2))+Math.pow(y2 - y1,2));
 		
		System.out.println("O resultado da expressão é: "+ d);
		
	}

}
