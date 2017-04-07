package org.coursera.ita.palavras.embaralhadas.embaralhador;

public class FabricaEmbaralhador {

	public Embaralhador getEmbaralhador(TipoEmbaralhador tipo) {

		if (tipo == null) {
			return null;
		}
		if (TipoEmbaralhador.INVERTIDA == tipo) {
			return new Ivertertida();
		} else if (TipoEmbaralhador.TROCA_LETRA_VOGAL_CONSOANTE == tipo) {
			return new TrocadaLetraVogalPorConsoante();
		} else if (TipoEmbaralhador.TROCA_LETRA_PAR_IMPAR == tipo) {
			return new TrocaLetraParPorImpar();
		}
		return null;

	}
}
