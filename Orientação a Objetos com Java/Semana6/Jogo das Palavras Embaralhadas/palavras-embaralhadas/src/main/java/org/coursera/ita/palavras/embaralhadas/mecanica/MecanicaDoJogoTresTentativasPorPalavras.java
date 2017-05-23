package org.coursera.ita.palavras.embaralhadas.mecanica;

import org.coursera.ita.palavras.embaralhadas.embaralhador.Embaralhador;
import org.coursera.ita.palavras.embaralhadas.embaralhador.FabricaEmbaralhador;

public class MecanicaDoJogoTresTentativasPorPalavras implements MecanicaDoJogo {

	private int pontos;
	private int quatidadeDeErros;
	private int quatidadeTentativas;
	private static final int MAXIXO_DE_TENTATIVAS_PERMITIDAS = 3;
	private static final int MAXIXO_DE_ERROS_PERMITIDOS = 2;
	private Embaralhador embaralhador;
	FabricaEmbaralhador fabricaEmbaralhador = new FabricaEmbaralhador();

	public MecanicaDoJogoTresTentativasPorPalavras() {
		this.embaralhador = fabricaEmbaralhador.getEmbaralhadorAleatorio();
	}

	@Override
	public boolean isAcabou() {
		return quatidadeDeErros > MAXIXO_DE_ERROS_PERMITIDOS;

	}

	@Override
	public boolean isAcertou(String palavra, String palavraDoUsuario) {
		if (palavra.trim().equalsIgnoreCase(palavraDoUsuario.trim())) {
			this.computarPontos(palavraDoUsuario);
			this.quatidadeTentativas = 0;
			return true;
		}
		if (tentarNovamente()) {
			quatidadeTentativas++;
			return false;
		}
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
		if (quatidadeTentativas == MAXIXO_DE_TENTATIVAS_PERMITIDAS) {
			quatidadeDeErros++;
			quatidadeTentativas = 0;
			return false;
		}
		return true;

	}

	@Override
	public String getNome() {
		
		return "Mecanica do Jogo: Tres Tentativas por Palavra com tres erro 2 permitidos";
	}

	@Override
	public String getDescricao() {
		
		return "Você tem Três tentativa por Palavra com erro 2 permitidos";
	}
}
