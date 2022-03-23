package be.com.generationObjeto;

public class testaContaBank {
	public static void main(String[] args) {
		Contabank cliente1 = new Contabank();
		Contabank cliente2 = new Contabank();
		Contabank cliente3 = new Contabank();
		
		cliente1.setTitular("Tiffany");
		cliente2.setTitular("Brittany");
		cliente3.setTitular("Latrew");
		
		cliente1.setValorTotal(29000);
		cliente2.setValorTotal(-500);
		cliente3.setValorTotal(1000000);
		
		cliente1.setCardCredito(false);
		cliente2.setCardCredito(true);
		cliente3.setCardCredito(true);
		
		System.out.println(" O/ a titular da conta,  " + cliente1.getTitular() + " , possui " + cliente1.getValorTotal() );
		if (cliente1.isCardCredito() == true) {
			System.out.println("e possui cartão de crédito");
		}
		else {
			System.out.println("e ainda não possui cartão de crédito");
		}
		System.out.println(" O/ a titular da conta,  " + cliente2.getTitular() + " , possui " + cliente2.getValorTotal() );
		if (cliente2.isCardCredito() == true) {
			System.out.println("e possui cartão de crédito");
		}
		else {
			System.out.println("e ainda não possui cartão de crédito");
		}
		System.out.println(" O/ a titular da conta,  " + cliente3.getTitular() + " , possui " + cliente3.getValorTotal() );
		if (cliente3.isCardCredito() == true) {
			System.out.println("e possui cartão de crédito");
		}
		else {
			System.out.println("e ainda não possui cartão de crédito");
		}
		
	}
	

}
