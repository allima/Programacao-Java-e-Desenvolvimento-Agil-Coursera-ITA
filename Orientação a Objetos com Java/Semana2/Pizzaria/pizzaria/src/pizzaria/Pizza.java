package pizzaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {

	private List<String> ingredientes = new ArrayList<>();

	public static HashMap<String, Integer> listaIngredientes = new HashMap<>();

	public static int totalIngredientes;

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void adicionaIngrediente(String Ingrediente) {
		this.ingredientes.add(Ingrediente);
		contabilizaIngrediente(Ingrediente);
	}

	public double getPreco() {

		if (ingredientes.size() < 2) {
			return 15;
		} else if (ingredientes.size() >= 3 && ingredientes.size() <= 5) {
			return 20;
		} else if (ingredientes.size() > 5) {
			return 23;
		}
		return 0;

	}

	public static void contabilizaIngrediente(String ingrediente) {

		if (listaIngredientes.containsKey(ingrediente)) {
			int value = listaIngredientes.get(ingrediente);
			listaIngredientes.put(ingrediente, value + 1);
		} else {
			listaIngredientes.put(ingrediente, 1);
		}
		totalIngredientes++;
	}
}
