package coursera.ita;

import java.util.HashMap;

public class CarrinhoDeCompras {

	HashMap<Produto, Integer> itens = new HashMap<>();

	public void adicionaProduto(Produto iten, int quantidade) {
		if (itens.containsKey(iten)) {
			int quantidadeProduto = itens.get(iten);
			itens.put(iten, quantidadeProduto + quantidade);
		} else {
			itens.put(iten, quantidade);
		}

	}

	public void removeProduto(Produto iten, int quantidade) {
		if (itens.containsKey(iten)) {
			int quantidadeProduto = itens.get(iten);
			if (quantidade < quantidadeProduto) {
				itens.put(iten, quantidadeProduto - quantidade);
			} else {
				itens.remove(iten);
			}

		}
	}

	public double calcula() {
		double valorTotal = 0;
		for (Produto produto : itens.keySet()) {
			valorTotal += produto.getPreco()*itens.get(produto);
		}

		return valorTotal;
	}
}
