package be.com.generationObjeto;

public class testaCliente  extends Cliente{
	public static void main(String[] args) {
		Cliente comprador1 = new Cliente ();
		Cliente comprador2 = new Cliente ();
		Cliente comprador3 = new Cliente ();
		Cliente comprador4 = new Cliente ();
		
		comprador1.setNome ("Magazine Luciola");
		comprador2.setNome("Dona Eustacia");
		comprador3.setNome(" Ponto Morno");
		comprador4.setNome("Zezinho");
		
		comprador1.setIdade(25);
		comprador2.setIdade(73);
		comprador3.setIdade(4);
		comprador4.setIdade(30);
		
		comprador1.setFrequente (true);
		comprador2.setFrequente ( false);
		comprador3.setFrequente (true);
		comprador4.setFrequente(true);
		
		System.out.println(comprador1.getNome() +" tem " + comprador1.getIdade() + " anos  e");
		if (comprador1.isFrequente() == true) {
		System.out.println("é um comprador frequente");
		}
		else {
			System.out.println("é um comprador esporádico.");
		}
		System.out.println(comprador2.getNome() +" tem " + comprador2.getIdade ()+ " anos  e");
		if (comprador2.isFrequente() == true) {
		System.out.println("é um comprador frequente");
		}
		else {
			System.out.println("é um comprador esporádico.");
	}
		System.out.println(comprador3.getNome () +" tem " + comprador3.getIdade() + " anos  e");
		if (comprador3.isFrequente() == true) {
		System.out.println("é um comprador frequente");
		}
		else {
			System.out.println("é um comprador esporádico.");
}
		System.out.println(comprador4.getNome() +" tem " + comprador4.getIdade() + " anos  e");
		if (comprador4.isFrequente() == true) {
		System.out.println("é um comprador frequente");
		}
		else {
			System.out.println("é um comprador esporádico.");
		}
	}
}
