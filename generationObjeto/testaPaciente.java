package be.com.generationObjeto;

public class testaPaciente {
public static void main(String[] args) {
	Paciente paciente1 = new Paciente();
	Paciente paciente2 = new Paciente();
	Paciente paciente3 = new Paciente();
	
	paciente1.setNome("Jair");
	paciente2.setNome("Wesley");
	paciente3.setNome("Regina");
	
	paciente1.setDoença("Demência severa");
	paciente2.setDoença("gripezinha");
	paciente3.setDoença("alcoolismo");
	
	paciente1.setGrave(true);
	paciente2.setGrave(true);
	paciente3.setGrave(true);
	
	System.out.println("O/a paciente " + paciente1.getNome() + " está com " + paciente1.getDoença());
	if (paciente1.isGrave() == true) {
		System.out.println("é um quadro grave");
	}
	else {
		System.out.println("é um quadro simples, de fácil recuperação..");
	}
	System.out.println("O/a paciente " + paciente2.getNome() + " está com " + paciente2.getDoença());
	if (paciente2.isGrave() == true) {
		System.out.println("é um quadro grave");
	}
	else {
		System.out.println("é um quadro simples, de fácil recuperação..");
}
	System.out.println("O/a paciente " + paciente3.getNome() + " está com " + paciente3.getDoença());
	if (paciente3.isGrave() == true) {
		System.out.println("é um quadro grave");
	}
	else {
		System.out.println("é um quadro simples, de fácil recuperação..");
}}}
