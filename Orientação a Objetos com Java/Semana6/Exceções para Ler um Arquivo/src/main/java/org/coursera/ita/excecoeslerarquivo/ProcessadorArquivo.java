package org.coursera.ita.excecoeslerarquivo;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

	public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException {
		Map<String, String> mapa = new HashMap<String, String>();
		//Scanner sc = null;
		// String linha = null;
		try {
			File file = new File("arquivo.txt");
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String linha = sc.nextLine();

				linha += linha;
			}

		} catch (IOException e) {

			throw new LeituraArquivoException("Erro ao abrir o arquivo" + e);
		}
		return mapa;
	}
}
