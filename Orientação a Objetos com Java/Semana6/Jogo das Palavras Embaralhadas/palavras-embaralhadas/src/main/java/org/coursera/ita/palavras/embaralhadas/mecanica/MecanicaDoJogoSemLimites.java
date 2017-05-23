package org.coursera.ita.palavras.embaralhadas.mecanica;

import org.coursera.ita.palavras.embaralhadas.embaralhador.Embaralhador;
import org.coursera.ita.palavras.embaralhadas.embaralhador.FabricaEmbaralhador;

public class MecanicaDoJogoSemLimites implements MecanicaDoJogo {

	private int pontos;
	private int quatidadeDeErros;
	private int qtdTentativas;
	private static final int MAXIXO_DE_TENTATIVAS_PERMITIDAS = Integer.MAX_VALUE;
	private static final int MAXIXO_DE_ERROS_PERMITIDOS = Integer.MAX_VALUE;
	private Embaralhador embaralhador;
	FabricaEmbaralhador fabricaEmbaralhador = new FabricaEmbaralhador();

	public MecanicaDoJogoSemLimites() {
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
			this.qtdTentativas = 0;
			return true;
		}
		if (tentarNovamente()) {
			qtdTentativas++;
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
		if (qtdTentativas == MAXIXO_DE_TENTATIVAS_PERMITIDAS) {
			quatidadeDeErros++;
			qtdTentativas = 0;
			return false;
		}
		return true;

	}

	@Override
	public String getNome() {

		return "Mecanica do Jogo: Sem Limites";
	}

	@Override
	public String getDescricao() {

		return "Só acaba quando as palavras terminarem";
	}
}
