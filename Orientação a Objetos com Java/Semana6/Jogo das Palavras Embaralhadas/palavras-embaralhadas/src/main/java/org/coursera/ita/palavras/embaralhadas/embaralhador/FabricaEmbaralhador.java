package org.coursera.ita.palavras.embaralhadas.embaralhador;

import java.util.Random;

public class FabricaEmbaralhador {

	public Embaralhador getMecanicaDoJogoHandom() {

		Random gerador = new Random();

		int tipo = gerador.nextInt(3) + 1;

		if (TipoEmbaralhador.INVERTIDA.tipo == tipo) {
			return new Ivertertida();
		} else if (TipoEmbaralhador.TROCA_LETRA_VOGAL_CONSOANTE.tipo == tipo) {
			return new TrocadaLetraVogalPorConsoante();
		} else if (TipoEmbaralhador.TROCA_LETRA_PAR_IMPAR.tipo == tipo) {
			return new TrocaLetraParPorImpar();
		}
		return null;

	}
}
