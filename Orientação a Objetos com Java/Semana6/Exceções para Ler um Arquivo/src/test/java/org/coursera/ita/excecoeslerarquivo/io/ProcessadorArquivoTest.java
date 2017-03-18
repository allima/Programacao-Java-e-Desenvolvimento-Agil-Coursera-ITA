package org.coursera.ita.excecoeslerarquivo.io;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.coursera.ita.excecoeslerarquivo.io.exception.LeituraArquivoException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ProcessadorArquivoTest {
	Map<String, String> mapa = null;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Before
	public void iniciliza() {
		mapa = ProcessadorArquivo.processar("d:\\arquivo.txt");

	}

	@Test
	public void testProcessarDeNome() {
		assertEquals("Alexandre", mapa.get("nome").trim());
	}

	@Test
	public void testProcessarDeSobrenome() {
		assertEquals("de Lima", mapa.get("sobrenome"));
	}

	@Test
	public void testProcessarDeIdade() {
		assertEquals("25", mapa.get("idade"));
	}

	@Test
	public void testProcessarComExecaoDeArquivoVazio() {

		thrown.expect(LeituraArquivoException.class);
		thrown.expectMessage("Arquivo vazio");
		mapa = ProcessadorArquivo.processar("d:\\arquivo2.txt");
	}

	@Test
	public void testProcessarComExecaoDeFormatoDeArquivoInvalido() {
		thrown.expect(LeituraArquivoException.class);
		thrown.expectMessage("Formato de arquivo inválido");
		mapa = ProcessadorArquivo.processar("d:\\arquivo1.txt");
	}

	@Test
	public void testProcessarComExecaoErroAoAbrirOArquivo() {

		thrown.expect(LeituraArquivoException.class);
		thrown.expectMessage("Erro ao abrir o arquivo");
		mapa = ProcessadorArquivo.processar("d:\\arquiv.txt");

	}

}
