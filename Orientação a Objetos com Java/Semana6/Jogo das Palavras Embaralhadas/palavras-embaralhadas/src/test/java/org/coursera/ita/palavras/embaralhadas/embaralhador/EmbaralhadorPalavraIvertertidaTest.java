package org.coursera.ita.palavras.embaralhadas.embaralhador;

import org.junit.Assert;
import org.junit.Test;

public class EmbaralhadorPalavraIvertertidaTest {

	@Test
	public void testGetPalavraEmparalha() {
		FabricaEmbaralhador fabricaEmbaralhador = new FabricaEmbaralhador();
		Embaralhador embaralador = fabricaEmbaralhador.getEmbaralhadorPorTipo(TipoEmbaralhador.INVERTIDA);
		String resultado = embaralador.getPalavraEmparalha("Alexandre");
		Assert.assertEquals("erdnaxelA", resultado);
	}

}
