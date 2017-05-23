package org.coursera.ita.palavras.embaralhadas.mecanica;

import org.coursera.ita.palavras.embaralhadas.embaralhador.Embaralhador;
import org.coursera.ita.palavras.embaralhadas.embaralhador.FabricaEmbaralhador;

public class MecanicaDoJogoMorteSubita implements MecanicaDoJogo {

	private int pontos;
	private int quantidadeDeErros;
	private static final int MAXIXO_DE_ERROS_PERMITIDOS = 1;
	private Embaralhador embaralhador;
	FabricaEmbaralhador fabricaEmbaralhadores = new FabricaEmbaralhador();

	public MecanicaDoJogoMorteSubita() {
		this.embaralhador = fabricaEmbaralhadores.getEmbaralhadorAleatorio();
	}

	@Override
	public boolean isAcabou() {
		return quantidadeDeErros > MAXIXO_DE_ERROS_PERMITIDOS;
	}

	@Override
	public boolean isAcertou(String palavra, String palavraDoUsuario) {
		if (palavra.equalsIgnoreCase(palavraDoUsuario)) {
			this.computarPontos(palavraDoUsuario);
			return true;
		}
		quantidadeDeErros++;
		return false;
	}

	@Override
	public String novaPalavraEmbaralhada(String palavra) {
		return this.embaralhador.getPalavraEmparalha(palavra);
	}

	@Override
	public void computarPontos(String palavra) {
		this.pontos += embaralhador.getDificuldade().getDificuldade() * palavra.length();
	}

	@Override
	public int getPontos() {
		return pontos;
	}

	@Override
	public int getQuantidadeMaximaDeErros() {
		return MAXIXO_DE_ERROS_PERMITIDOS;
	}

	@Override
	public boolean tentarNovamente() {
		return false;
	}

	@Override
	public String getNome() {

		return "Mecanica do Jogo: Morte Subita";
	}

	@Override
	public String getDescricao() {

		return "Errou perdeu";
	}

}
