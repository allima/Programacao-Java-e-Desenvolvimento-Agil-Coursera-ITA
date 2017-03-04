package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Pizza> pizzas = new ArrayList<>();

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}

	public double valorCompra() {
		double valor = 0;
		for (Pizza pizza : this.pizzas) {
			valor += pizza.getPreco();
		}
		return valor;
	}

	public void adiciona(Pizza pizza) {

		if (!pizza.getIngredientes().isEmpty()) {
			this.pizzas.add(pizza);
		}
	}

	public int totalIngredientes() {
		return Pizza.totalIngredientes;
	}
}
