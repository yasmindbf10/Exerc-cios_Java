package br.com.generationlista3;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
	
int idade, sexo, tipo, cont=0, calmosTotal = 0, outrosCalmos = 0, 
jovensCalmos = 0, mulherNervosa = 0, adultoNervoso = 0, homemAgressivo = 0;

while(cont<150) {
	System.out.println("Digite a sua idade: ");
	Scanner leia = new Scanner(System.in);
	idade = leia.nextInt();
	System.out.println("Você é: 1 - mulher, 2 - homem, 3 - outros?");
	sexo = leia.nextInt();
	System.out.println("Você se considera: 1 - calma, 2 - nervosa, 3 - agressiva?");
	tipo = leia.nextInt();
	cont++;
	if (tipo == 1) {
		calmosTotal = calmosTotal + 1;
		if (sexo == 3) {
			outrosCalmos = outrosCalmos+1;
		}
		if (idade<18) {
			jovensCalmos++;
		}
	}
	else if (tipo==2 && sexo == 1)
	{mulherNervosa++;
	}
	else if (tipo==2 && idade>40)
	{
		adultoNervoso++;
	}
	else if (tipo == 3 && sexo ==2)
	{
		homemAgressivo++;
	}
}
System.out.println(calmosTotal + " são pessoas calmas,sendo " + outrosCalmos + " do sexo outros e " + 
jovensCalmos + " menores de 18 anos.");	
System.out.println(adultoNervoso + " pessoas acima de 40 anos que se consideram nervosas " + " e " +
mulherNervosa + " das mulheres se consideram nervosas");
System.out.println(homemAgressivo + " são homens que se consideram agressivos.");

}
}
