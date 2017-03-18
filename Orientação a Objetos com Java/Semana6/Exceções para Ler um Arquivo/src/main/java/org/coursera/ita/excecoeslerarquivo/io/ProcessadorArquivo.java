package org.coursera.ita.excecoeslerarquivo.io;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

import org.coursera.ita.excecoeslerarquivo.io.exception.LeituraArquivoException;

public class ProcessadorArquivo {

	public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException {
		Map<String, String> mapa = null;

		try {
			mapa = new HashMap<String, String>();
			File file = new File(nomeArquivo);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				adicionaNoMapa(mapa, linha);
			}
			if (mapa.isEmpty()) {
				throw new LeituraArquivoException("Arquivo vazio");
			}

		} catch (IOException e) {

			throw new LeituraArquivoException("Erro ao abrir o arquivo" + e);
		}

		return mapa;
	}

	private static void adicionaNoMapa(Map<String, String> mapa, String linha) throws LeituraArquivoException {
		String chaveValor[] = linha.split("->");
		if (chaveValor.length > 2 || chaveValor.length < 0) {
			throw new LeituraArquivoException("Formato de arquivo inválido");
		} else {
			mapa.put(chaveValor[0], chaveValor[1]);
		}
	}
}
