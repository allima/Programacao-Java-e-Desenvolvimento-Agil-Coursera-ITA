package org.coursera.ita.palavras.embaralhadas.embaralhador;

public class EmbaralhadorPalavraIvertertida implements Embaralhador {

	@Override
	public String getPalavraEmparalha(String palavra) {
		String retorno = "";
		StringBuilder stringBuilder = new StringBuilder(palavra);
		retorno = stringBuilder.reverse().toString();
		return retorno;
	}

}
