package org.coursera.ita.palavras.embaralhadas.embaralhador;

import org.coursera.ita.palavras.embaralhadas.util.NivelDificuldade;

public interface Embaralhador {

	String getPalavraEmparalha(String palavra);

	public NivelDificuldade getDificuldade();
}
