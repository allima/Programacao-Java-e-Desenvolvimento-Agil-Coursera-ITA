package org.coursera.ita.excecoeslerarquivo;

import java.util.Map;

import org.coursera.ita.excecoeslerarquivo.io.ProcessadorArquivo;
import org.coursera.ita.excecoeslerarquivo.io.exception.LeituraArquivoException;

public class Principal {

	public static void main(String[] args) throws LeituraArquivoException {
		Map<String, String> mapa = ProcessadorArquivo.processar("d:\\arquivo.txt");

		System.out.println(mapa.get("nome"));
		System.out.println(mapa.get("sobrenome"));
		System.out.println(mapa.get("idade"));
	}
}
