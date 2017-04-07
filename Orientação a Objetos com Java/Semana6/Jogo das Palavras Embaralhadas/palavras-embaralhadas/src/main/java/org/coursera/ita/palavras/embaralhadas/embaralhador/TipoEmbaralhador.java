package org.coursera.ita.palavras.embaralhadas.embaralhador;

public enum TipoEmbaralhador {
	INVERTIDA(1), TROCADO_PALAVRA(2), TROCA_LETRA_VOGAL_CONSOANTE(3), TROCA_LETRA_PAR_IMPAR(4);

	public int tipo;

	TipoEmbaralhador(int tipo) {
		this.tipo = tipo;
	}

}
