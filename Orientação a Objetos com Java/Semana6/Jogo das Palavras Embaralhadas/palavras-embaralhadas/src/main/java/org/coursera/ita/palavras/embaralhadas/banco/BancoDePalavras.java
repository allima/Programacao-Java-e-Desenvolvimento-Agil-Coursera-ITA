package org.coursera.ita.palavras.embaralhadas.banco;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BancoDePalavras {
	private static final Logger LOGGER = LogManager.getLogger(BancoDePalavras.class.getName());

	private RandomAccessFile arquivo;
	private String palavraGerada;

	public BancoDePalavras() {

		try {
			arquivo = new RandomAccessFile("C:/Users/Alexandre de Lima/Desktop/palavras.txt", "r");
		} catch (FileNotFoundException e) {
			LOGGER.info("Não foi possivel acesso o arquivo", e);
		}
	}

	public String getPalavrasDoArquivo() {

		try {
			this.palavraGerada = arquivo.readLine();
		} catch (IOException e) {
			LOGGER.info("Não foi possivel ler o conteudo do arquivo", e);
		}
		return palavraGerada;
	}
}
