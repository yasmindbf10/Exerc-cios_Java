package br.com.genereationlista1;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		double fabrica, imposto, distribuidor, valorCliente;
		
		System.out.println("Digite o valor de fabrica ");
		Scanner leia = new Scanner(System.in);
		fabrica = leia.nextDouble();

	imposto = 0.28;
	distribuidor = 0.45;
	valorCliente = ((fabrica * imposto) + (fabrica * distribuidor) + fabrica);


		System.out.println("O valor para o cliente final é  " + valorCliente);
	}

}
