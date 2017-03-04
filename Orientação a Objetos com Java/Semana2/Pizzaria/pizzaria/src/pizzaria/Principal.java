package pizzaria;

public class Principal {

	public static void main(String[] args) {

		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Calaresa");
		p1.adicionaIngrediente("Musarela");

		Pizza p2 = new Pizza();
		p1.adicionaIngrediente("Portuguesa");
		p1.adicionaIngrediente("Frango com Catupiri");
		
		Pizza p3 = new Pizza();
		p1.adicionaIngrediente("Quatro Queijo");
		p1.adicionaIngrediente("Nata");

		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(p1);
		carrinho.adiciona(p2);
		carrinho.adiciona(p3);
		
		System.out.println(carrinho.valorCompra());
		
		System.out.println(carrinho.totalIngredientes());
		
	}
}
