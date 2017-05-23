package org.coursera.ita.palavras.embaralhadas;

import java.io.IOException;
import java.util.Scanner;

import org.coursera.ita.palavras.embaralhadas.banco.BancoDePalavras;
import org.coursera.ita.palavras.embaralhadas.mecanica.FabricaMecanicaDoJogo;
import org.coursera.ita.palavras.embaralhadas.mecanica.MecanicaDoJogo;

public class Principal {
	static BancoDePalavras bancoDePalavras;

	public static void main(String[] args) throws IOException {

		System.out.println("Jogo da Forca");

		Scanner scan = new Scanner(System.in);

		MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanicaAleatoria();

		bancoDePalavras = new BancoDePalavras();

		while (!mecanica.isAcabou()) {
			System.out.println(mecanica.getNome());
			System.out.println(mecanica.getDescricao());
			String palavra = bancoDePalavras.getPalavrasDoArquivo();

			if (palavra != null) {
				String palavraEmbaralhada = mecanica.novaPalavraEmbaralhada(palavra);

				System.out.println("Tente acertar, a palavra é... " + "'" + palavraEmbaralhada + "'");
				System.out.print("digite a palavra corretamente: ");
				String palavraDoUsuario = scan.nextLine();

				if (mecanica.isAcertou(palavra, palavraDoUsuario)) {
					System.out.println("Parabéns você acertou, você tem " + mecanica.getPontos() + " pontos");
				} else {

					while (mecanica.tentarNovamente()) {
						System.out.println("Tente novamente, a palavra é... " + "'" + palavraEmbaralhada + "'");
						System.out.print("digite a palavra corretamente: ");
						String palavraDoUser = scan.nextLine();
						if (mecanica.isAcertou(palavra, palavraDoUser)) {
							System.out.println("Parabéns você acertou, você tem " + mecanica.getPontos() + " pontos");
							break;
						}
					}
					if (!mecanica.tentarNovamente()) {
						System.out.println("você errou");
					}

				}

			} else {
				System.out.println("O jogo acabou, parabéns, você fez " + mecanica.getPontos() + " pontos");
				System.exit(0);
			}
		}

		System.out.println("você errou mais de " + mecanica.getQuantidadeMaximaDeErros() + " vezes, Fim de Jogo :( ");

	}

}