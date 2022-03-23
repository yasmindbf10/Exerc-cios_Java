package be.com.generationObjeto;

public class Contabank {
	double valorTotal;
	boolean cardCredito;
	String titular;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public boolean isCardCredito() {
		return cardCredito;
	}
	public void setCardCredito(boolean cardCredito) {
		this.cardCredito = cardCredito;
	}
	

}
