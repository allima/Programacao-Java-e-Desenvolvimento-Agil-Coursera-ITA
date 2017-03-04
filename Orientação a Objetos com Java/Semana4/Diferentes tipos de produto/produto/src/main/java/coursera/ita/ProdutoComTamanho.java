package coursera.ita;

public class ProdutoComTamanho extends Produto {

	private double tamanho;

	public ProdutoComTamanho(String nome, String codigo, double preco, double tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(tamanho);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (Double.doubleToLongBits(tamanho) != Double.doubleToLongBits(other.tamanho))
			return false;
		return true;
	}

}
