package org.coursera.ita.palavras.embaralhadas.embaralhador;

public enum TipoEmbaralhador {
	INVERTIDA(1), TROCA_LETRA_PAR_IMPAR(2);

	private int tipo;

	TipoEmbaralhador(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

}
