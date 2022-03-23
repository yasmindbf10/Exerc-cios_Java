package br.com.genereationlista1;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		int segundosTotais, minuto, hora, segundo, x;
		
		System.out.println("Escreva a duração em segundos: ");
		Scanner leia = new Scanner(System.in);
		segundosTotais = leia.nextInt();
		
		hora = segundosTotais / 3600;

		
		minuto = (segundosTotais - (hora * 3600)) / 60;
		
		
		segundo = segundosTotais  - (hora * 3600) - (minuto * 60);

		
		System.out.println("Esta duração correspondem a " + hora + " horas");
		System.out.println(" , " + minuto + " minutos");
		System.out.println(" e " + segundo + " segundos");
		
	}

}
