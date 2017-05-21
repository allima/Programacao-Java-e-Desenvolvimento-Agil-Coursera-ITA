package org.coursera.ita.palavras.embaralhadas.mecanica;

import java.util.Random;

public class FabricaMecanicaDoJogo {

	public static MecanicaDoJogo getMecanicaAleatoria() {

		Random gerador = new Random();

		int tipo = gerador.nextInt(4) + 1;

		if (TipoMecanicaDoJogo.MORTE_SUBITA.getTipo() == tipo) {
			return new MecanicaDoJogoMorteSubita();
		} else if (TipoMecanicaDoJogo.SEM_LIMITES.getTipo() == tipo) {
			return new MecanicaDoJogoSemLimites();
		} else if (TipoMecanicaDoJogo.TENTATIVAS_POR_PALAVRAS.getTipo() == tipo) {
			return new MecanicaDoJogoTresTentativasPorPalavras();
		}
		return null;

	}

}
