package br.com.generationHeranca;

public class Doguinho extends Animal{
	private boolean correr;
	
	public Doguinho(String nome, int idade,  boolean emiteSom, boolean correr) {
		super (nome,idade, emiteSom);
		this.correr = correr;
	}
	public boolean isCorrer() {
		return correr;
	}
	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	}
