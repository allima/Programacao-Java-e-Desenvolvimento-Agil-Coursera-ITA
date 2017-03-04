package coursera.ita;

public class CompraParcelada extends Compra {

	private int quantidadeParcelas;
	private double jurosMensal;

	public CompraParcelada(double valor, int quantidadeParcelas, double jurosMensal) {
		super(valor);
		this.quantidadeParcelas = quantidadeParcelas;
		this.jurosMensal = jurosMensal;

	}

	@Override
	public double total() {
		// M = C * (1 + i) elevado a t

		return super.total()*Math.pow((1.0 + this.jurosMensal/100.0), this.quantidadeParcelas);
	}

}
