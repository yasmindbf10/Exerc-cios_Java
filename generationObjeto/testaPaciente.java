package be.com.generationObjeto;

public class testaPaciente {
public static void main(String[] args) {
	Paciente paciente1 = new Paciente();
	Paciente paciente2 = new Paciente();
	Paciente paciente3 = new Paciente();
	
	paciente1.setNome("Jair");
	paciente2.setNome("Wesley");
	paciente3.setNome("Regina");
	
	paciente1.setDoen�a("Dem�ncia severa");
	paciente2.setDoen�a("gripezinha");
	paciente3.setDoen�a("alcoolismo");
	
	paciente1.setGrave(true);
	paciente2.setGrave(true);
	paciente3.setGrave(true);
	
	System.out.println("O/a paciente " + paciente1.getNome() + " est� com " + paciente1.getDoen�a());
	if (paciente1.isGrave() == true) {
		System.out.println("� um quadro grave");
	}
	else {
		System.out.println("� um quadro simples, de f�cil recupera��o..");
	}
	System.out.println("O/a paciente " + paciente2.getNome() + " est� com " + paciente2.getDoen�a());
	if (paciente2.isGrave() == true) {
		System.out.println("� um quadro grave");
	}
	else {
		System.out.println("� um quadro simples, de f�cil recupera��o..");
}
	System.out.println("O/a paciente " + paciente3.getNome() + " est� com " + paciente3.getDoen�a());
	if (paciente3.isGrave() == true) {
		System.out.println("� um quadro grave");
	}
	else {
		System.out.println("� um quadro simples, de f�cil recupera��o..");
}}}
