package org.coursera.ita.palavras.embaralhadas.embaralhador;

import org.junit.Assert;
import org.junit.Test;

public class EmbaralhadorLetraParPorImparTest {

	@Test
	public void testGetPalavraEmparalha() {
		FabricaEmbaralhador fabricaEmbaralhador = new FabricaEmbaralhador();
		Embaralhador embaralador = fabricaEmbaralhador.getEmbaralhadorPorTipo(TipoEmbaralhador.TROCA_LETRA_PAR_IMPAR);
		String resultado = embaralador.getPalavraEmparalha("Alexandre");
		Assert.assertEquals("lAxenarde", resultado);
	}

}
