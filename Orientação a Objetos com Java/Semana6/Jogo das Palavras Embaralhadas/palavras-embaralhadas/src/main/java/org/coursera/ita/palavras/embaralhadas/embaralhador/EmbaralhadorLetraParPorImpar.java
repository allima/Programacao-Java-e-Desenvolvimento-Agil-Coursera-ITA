package org.coursera.ita.palavras.embaralhadas.embaralhador;

import org.coursera.ita.palavras.embaralhadas.util.NivelDificuldade;

public class EmbaralhadorLetraParPorImpar implements Embaralhador {

	@Override
	public String getPalavraEmparalha(String palavra) {
		String resultado = null;
		char[] palavraDividida = palavra.trim().toCharArray();

		for (int i = 0; i < palavra.length(); i += 2) {

			if (i + 2 < palavra.length()) {
				char aux = palavraDividida[i];
				palavraDividida[i] = palavraDividida[i + 1];
				palavraDividida[i + 1] = aux;
			}
		}

		resultado = new String(palavraDividida);
		return resultado;
	}

	@Override
	public NivelDificuldade getDificuldade() {
		return NivelDificuldade.NIVEL_TRES;
	}

}
