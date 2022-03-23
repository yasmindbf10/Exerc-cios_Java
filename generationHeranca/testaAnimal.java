package br.com.generationHeranca;

public class testaAnimal  {
	public static void main(String[] args) {

		Doguinho dog = new Doguinho("Fifi", 13, true, true);
		Cavalo pocoto = new Cavalo ("Trovao", 20 , true, true);
		Preguica nhaca = new Preguica ("Nhaca ", 1 , true , false);
	
	
 	System.out.println("Chama-se: "+ dog.getNome()+ ", " + dog.getIdade() +  " anos , emite som? : "
 		 	+ dog.isEmiteSom() );
 	if (dog.isCorrer() == true) {
 		System.out.println("É um animal que corre");
 	}
 	else {
 		System.out.println("É um animal que gosta de subir em árvores");
 	}
 	System.out.println("Chama-se: "+ pocoto.getNome()+ ", " + pocoto.getIdade() +  " anos , emite som? : "
 		 	+ pocoto.isEmiteSom());
 	if (pocoto.isCorrer() == true) {
 		System.out.println("É um animal que corre");
 	}
 	else {
 		System.out.println("É um animal que gosta de subir em árvores");
 	}
 	System.out.println("Chama-se: "+ nhaca.getNome()+ ", " + nhaca.getIdade() +  " anos, emite som?  "+ nhaca.isEmiteSom());
 	if (nhaca.isCorrer() == true) {
 		System.out.println("É um animal que corre");
 	}
 	else {
 		System.out.println("É um animal que gosta de subir em árvores");
 	}
	}
}
