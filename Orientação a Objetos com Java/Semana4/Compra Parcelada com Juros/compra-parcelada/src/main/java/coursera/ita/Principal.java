package coursera.ita;

public class Principal {

	public static void main(String[] args) {

		Compra c1 = new CompraParcelada(100.0, 1, 14.25);
		System.out.println("Total das Parcelas "+c1.total());
		
		Compra c2 = new CompraParcelada(100.0, 2, 14.25);
		System.out.println("Total das Parcelas "+c2.total());
		
		Compra c5 = new CompraParcelada(100.0, 5, 14.25);
		System.out.println("Total das Parcelas "+c5.total());
		
		Compra c10 = new CompraParcelada(100.0, 10, 14.25);
		System.out.println("Total das Parcelas "+c10.total());
		
	}
}
