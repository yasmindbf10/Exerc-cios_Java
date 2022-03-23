package be.com.generationObjeto;

public class testaPatinete {
	public static void main(String[] args) {
		Patinete patinete1 = new Patinete();
		Patinete patinete2 = new Patinete();
		Patinete patinete3 = new Patinete();
		
		patinete1.setCor ("Rosa");
		patinete2.setCor("Roxo");
		patinete3.setCor ("Prateado");
		
		patinete1.setPreco(1000);
		patinete2.setPreco(1100);
		patinete3.setPreco(3500);
		
		patinete1.setEletrico(false);
		patinete2.setEletrico(false);
		patinete3.setEletrico(true);
		
		System.out.println("Este modelo de patinete vem na cor " + patinete1.getCor() + " custa " + patinete1.getPreco());
		if (patinete1.isEletrico() ==true) {
			System.out.println("é elétrico!");
		}
		else {System.out.println("é tradicional");}
		
		System.out.println("Este modelo de patinete vem na cor " + patinete2.getCor() + " custa " + patinete2.getPreco());
		if (patinete2.isEletrico() ==true) {
			System.out.println("é elétrico!");
		}
		else {System.out.println("é tradicional");}
		System.out.println("Este modelo de patinete vem na cor " + patinete3.getCor() + " custa " + patinete3.getPreco());
		if (patinete3.isEletrico() ==true) {
			System.out.println("é elétrico!");
		}
		else {System.out.println("é tradicional");}
		
	}

}
