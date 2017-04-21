package org.coursera.ita.palavras.embaralhadas.embaralhador;

import java.util.Random;

public class FabricaEmbaralhador {

	public Embaralhador getEmbaralhadorHandom() {

		Random gerador = new Random();

		int tipo = gerador.nextInt(2) + 1;

		if (TipoEmbaralhador.INVERTIDA.tipo == tipo) {
			return new EmbaralhadorPalavraIvertertida();
		} else if (TipoEmbaralhador.TROCA_LETRA_PAR_IMPAR.tipo == tipo) {
			return new EmbaralhadorLetraParPorImpar();
		}
		return null;

	}

	public Embaralhador getEmbaralhadorPorTipo(TipoEmbaralhador tipo) {

		if (TipoEmbaralhador.INVERTIDA == tipo) {
			return new EmbaralhadorPalavraIvertertida();
		} else if (TipoEmbaralhador.TROCA_LETRA_PAR_IMPAR == tipo) {
			return new EmbaralhadorLetraParPorImpar();
		}
		return null;

	}
}
