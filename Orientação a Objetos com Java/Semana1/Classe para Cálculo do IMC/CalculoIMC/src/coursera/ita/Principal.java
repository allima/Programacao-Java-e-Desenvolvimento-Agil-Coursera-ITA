package coursera.ita;

public class Principal {

	public static void main(String[] args) {

		Paciente paciente1 = new Paciente(70.520,1.75);
		System.out.println(paciente1.calcularIMC());
		System.out.println(paciente1.diagnostico());
		
		Paciente paciente2 = new Paciente(37.00,1.75);
		System.out.println(paciente2.calcularIMC());
		System.out.println(paciente2.diagnostico());
		
		Paciente paciente3 = new Paciente(120.00,2.34);
		System.out.println(paciente3.calcularIMC());
		System.out.println(paciente3.diagnostico());

	}

}
