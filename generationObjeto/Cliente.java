package be.com.generationObjeto;

public class Cliente 
{
	private String nome;
	private int idade;
	private boolean frequente = true;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isFrequente() {
		return frequente;
	}
	public void setFrequente(boolean frequente) {
		this.frequente = frequente;
	}

}

