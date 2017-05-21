package org.coursera.ita.palavras.embaralhadas.embaralhador;

import org.coursera.ita.palavras.embaralhadas.util.NivelDificuldade;

public class EmbaralhadorPalavraIvertertida implements Embaralhador {

	@Override
	public String getPalavraEmparalha(String palavra) {
		String retorno = null;
		StringBuilder stringBuilder = new StringBuilder(palavra);
		retorno = stringBuilder.reverse().toString();
		return retorno;
	}

	@Override
	public NivelDificuldade getDificuldade() {
		return NivelDificuldade.NIVEL_QUATRO;
	}

}
