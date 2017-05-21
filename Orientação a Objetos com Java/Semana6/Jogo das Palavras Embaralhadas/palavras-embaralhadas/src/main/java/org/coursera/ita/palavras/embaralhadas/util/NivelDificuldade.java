package org.coursera.ita.palavras.embaralhadas.util;

public enum NivelDificuldade {

	NIVEL_UM(1), NIVEL_DOIS(2), NIVEL_TRES(3), NIVEL_QUATRO(4), NIVEL_CINCO(5);

	private int dificuldade;

	NivelDificuldade(int tipo) {
		this.dificuldade = tipo;
	}

	public int getDificuldade() {
		return dificuldade;
	}

}
