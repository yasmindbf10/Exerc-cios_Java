package be.com.generationObjeto;

public class testaFuncionario {
	public static void main(String[] args) {

	Funcionario funcionario1 = new Funcionario();
	Funcionario funcionario2= new Funcionario();
	Funcionario funcionario3= new Funcionario();
	
	funcionario1.setNome("Zezinho");
	funcionario2.setNome("Gertrudes");
	funcionario3.setNome ("Melissa");
	
	funcionario1.setSalario(3000);
	funcionario2.setSalario(2000);
	funcionario3.setSalario(1500);
	
	funcionario1.setCargo("Professor");
	funcionario2.setCargo("Secret�ria");
	funcionario3.setCargo("Merendeira");
	

	System.out.println("O/a funcion�rio/a " + funcionario1.getNome() + " � " + funcionario1.getCargo() + 
			" e recebe " + funcionario1.getSalario() + " por m�s ");
	System.out.println("O/a funcion�rio/a " + funcionario2.getNome() + " � " + funcionario2.getCargo() + 
			" e recebe " + funcionario2.getSalario() + " por m�s ");
	System.out.println("O/a funcion�rio/a " + funcionario3.getNome() + " � " + funcionario3.getCargo() + 
			" e recebe " + funcionario3.getSalario() + " por m�s ");
	
	
	}
	

}
