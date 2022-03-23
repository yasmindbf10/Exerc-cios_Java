package be.com.generationObjeto;

public class testeEletronico {
	public static void main(String[] args) {
		eletronico eletronico1 = new eletronico();
		eletronico eletronico2 = new eletronico();
		eletronico eletronico3 = new eletronico();
		
		eletronico1.setNome("radio");
		eletronico2.setNome("liquidificador");
		eletronico3.setNome("TV");
		
		eletronico1.setGarantia(0.5);
		eletronico2.setGarantia(1);
		eletronico3.setGarantia(2);
		
		eletronico1.setPilha(true);
		eletronico2.setPilha(false);
		eletronico3.setPilha(false);
		
		System.out.println("O aparelho " + eletronico1.getNome() + " tem garantia de " + eletronico1.getGarantia() + " ano" );
		if(eletronico1.isPilha() == true) {
		System.out.println(" e vem com pilhas inclusas!");}
		else {
			System.out.println("e vem com tomada");
		}
		System.out.println("O aparelho " + eletronico2.getNome() + " tem garantia de " + eletronico2.getGarantia() + " ano" );
		if(eletronico2.isPilha() == true) {
		System.out.println(" e vem com pilhas inclusas!");}
		else {
			System.out.println("e vem com tomada");
		}
		System.out.println("O aparelho " + eletronico3.getNome() + " tem garantia de " + eletronico3.getGarantia() + " ano" );
		if(eletronico3.isPilha() == true) {
		System.out.println(" e vem com pilhas inclusas!");}
		else {
			System.out.println("e vem com tomada");
		}
		
		
		
		
	}

}
