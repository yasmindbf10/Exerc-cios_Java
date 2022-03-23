package br.com.generationPolimorfismo;

public class testaAnimais {
	public static void main(String[] args) {
		Cachorro cao = new Cachorro();
		cao.setNome("Costelinha");
		cao.setIdade(11);
		
		Cavalo cavalin = new Cavalo ();
		cavalin.setNome("Cavalin");
		cavalin.setIdade(8);
		
		Preguica preguica = new Preguica();
		preguica.setNome("Preguica");
		preguica.setIdade(60);
		
		System.out.println("O cachorro " + cao.getNome() + " tem " + cao.getIdade() + " anos e faz " + cao.getSom()+ " e também");
		cao.Correr();
		System.out.println(" O  cavalo " + cavalin.getNome() + " tem " +  cavalin.getIdade() +  " anos e faz " + cavalin.getSom() +", além disso:");
		cavalin.Correr();
		System.out.println(" A "+ preguica.getNome() + " tem " +  preguica.getIdade() +  " anos e faz " + preguica.getSom() + " e ");
		preguica.arvore();
		
	}
}
