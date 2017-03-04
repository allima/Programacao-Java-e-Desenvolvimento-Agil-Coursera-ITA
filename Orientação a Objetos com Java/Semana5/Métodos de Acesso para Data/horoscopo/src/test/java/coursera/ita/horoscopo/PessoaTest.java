package coursera.ita.horoscopo;

import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
	Pessoa pessoa = new Pessoa();
	DateUtil dataUtil = new DateUtil();

	@Test
	public void vinteAnosDoSignoDeGemios() {

		pessoa.setDataDeNascimento(dataUtil.StringToDate("21/05/1996"));
		Assert.assertEquals(20,pessoa.getIdade());
		Assert.assertEquals("gêmios",pessoa.getSigno());
	}

	@Test
	public void tritaESeteAnosDoSignoDeCabriconio() {

		pessoa.setDataDeNascimento(dataUtil.StringToDate("23/12/1979"));
		Assert.assertEquals(37,pessoa.getIdade());
		Assert.assertEquals("capricornio",pessoa.getSigno());
	}
	@Test
	public void CinquentaECincoAnosDoSignoDeLeao() {

		pessoa.setDataDeNascimento(dataUtil.StringToDate("22/07/1961"));
		Assert.assertEquals(55,pessoa.getIdade());
		Assert.assertEquals("leão",pessoa.getSigno());
	}

}
