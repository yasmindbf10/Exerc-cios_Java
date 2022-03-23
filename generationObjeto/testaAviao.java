package be.com.generationObjeto;

public class testaAviao {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao();
		
		aviao1.setModelo ("Boing");
		aviao2.setModelo("Junkers");
		aviao3.setModelo("Airbus");
		
		aviao1.setDestino("Acapulco");
		aviao2.setDestino("Porto Alegre");
		aviao3.setDestino("Moscou");
		
		aviao1.setPartir(true);
		aviao2.setPartir(false);
		aviao3.setPartir(false);
		
		
		
		System.out.println("O aviao: " + aviao1.getModelo() + " com destino à " + aviao1.getDestino() + " está ");
		if(aviao1.isPartir() == true)
		{System.out.println("aguardando passageiros");}
		else {
			System.out.println("voando");
		}
		System.out.println("O aviao: " + aviao2.getModelo() + " com destino à " + aviao2.getDestino() + " está " );
		if(aviao2.isPartir() == true)
		{System.out.println("aguardando passageiros");}
		else {
			System.out.println("voando");
		System.out.println("O aviao: " + aviao3.getModelo() + " com destino à " + aviao3.getDestino() + " está " );
		if(aviao3.isPartir() == true)
		{System.out.println("aguardando passageiros");}
		else {
			System.out.println("voando");
	}
		}}}
