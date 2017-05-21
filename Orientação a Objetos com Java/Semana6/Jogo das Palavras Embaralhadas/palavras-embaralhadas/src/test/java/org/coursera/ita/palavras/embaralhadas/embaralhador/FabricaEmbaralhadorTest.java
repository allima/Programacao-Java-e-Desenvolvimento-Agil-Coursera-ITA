package org.coursera.ita.palavras.embaralhadas.embaralhador;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class FabricaEmbaralhadorTest {

	FabricaEmbaralhador fabricaEmbaralhador;

	@Before
	public void inicializa() {
		fabricaEmbaralhador = new FabricaEmbaralhador();
	}

	@Test
	public void testGetEmbaralhadorPorTipo1() {
		Embaralhador em = fabricaEmbaralhador.getEmbaralhadorPorTipo(TipoEmbaralhador.INVERTIDA);
		assertThat(em, instanceOf(EmbaralhadorPalavraIvertertida.class));
	}

	@Test
	public void testGetEmbaralhadorPorTipo2() {
		Embaralhador em = fabricaEmbaralhador.getEmbaralhadorPorTipo(TipoEmbaralhador.TROCA_LETRA_PAR_IMPAR);
		assertThat(em, instanceOf(EmbaralhadorLetraParPorImpar.class));
	}

	@Test
	public void testGetEmbaralhadorHandom() {
		Embaralhador em = fabricaEmbaralhador.getEmbaralhadorAleatorio();
		assertThat(em, instanceOf(Embaralhador.class));
	}

}
