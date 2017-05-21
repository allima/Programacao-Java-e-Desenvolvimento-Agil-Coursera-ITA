package org.coursera.ita.palavras.embaralhadas.embaralhador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TipoEmbaralhadorTest {

	@Test
	public void testTipoEmbaralhadorInvertida() {
		assertEquals(TipoEmbaralhador.INVERTIDA.getTipo(), 1);
	}

	@Test
	public void testTipoEmbaralhadorTrocaLetraParImpar() {
		assertEquals(TipoEmbaralhador.TROCA_LETRA_PAR_IMPAR.getTipo(), 2);
	}

	@Test
	public void valueOfTest() {
		assertSame(TipoEmbaralhador.INVERTIDA, TipoEmbaralhador.valueOf(TipoEmbaralhador.INVERTIDA.toString()));
	}

}
