package org.coursera.ita.palavras.embaralhadas.mecanica;

public enum TipoMecanicaDoJogo {
	MORTE_SUBITA(1), SEM_LIMITES(2), TENTATIVAS_POR_PALAVRAS(3),;

	private int tipo;

	TipoMecanicaDoJogo(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

}
