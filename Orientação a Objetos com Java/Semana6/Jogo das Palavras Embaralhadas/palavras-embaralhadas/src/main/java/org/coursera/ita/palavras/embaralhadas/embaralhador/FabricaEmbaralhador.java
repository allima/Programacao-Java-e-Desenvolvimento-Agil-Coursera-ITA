package org.coursera.ita.palavras.embaralhadas.embaralhador;

import java.util.Random;

public class FabricaEmbaralhador {

	public Embaralhador getEmbaralhadorAleatorio() {

		Random gerador = new Random();

		int tipo = gerador.nextInt(2) + 1;

		if (TipoEmbaralhador.INVERTIDA.getTipo() == tipo) {
			return new EmbaralhadorPalavraIvertertida();
		} else if (TipoEmbaralhador.TROCA_LETRA_PAR_IMPAR.getTipo() == tipo) {
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
