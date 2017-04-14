package org.coursera.ita.palavras.embaralhadas.mecanica;

import java.util.Random;

public class FabricaMecanicaDoJogo {

	public MecanicaDoJogo getEmbaralhadorHandom() {

		Random gerador = new Random();

		int tipo = gerador.nextInt(4) + 1;

		if (TipoMecanicaDoJogo.MORTE_SUBITA.tipo == tipo) {
			return new MecanicaDoJogoMorteSubita();
		} else if (TipoMecanicaDoJogo.POR_VIDAS.tipo == tipo) {
			return new MecanicaDoJogoPorVidas();
		} else if (TipoMecanicaDoJogo.TENTATIVAS_POR_PALAVRAS.tipo == tipo) {
			return new MecanicaDoJogoTentativasPorPalavras();
		}
		return null;

	}
}
