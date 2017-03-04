package coursera.ita;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoDeComprasTest {
	private Produto p, p1;
	private CarrinhoDeCompras c;

	@Before
	public void inicinaliza() {
		p = new ProdutoComTamanho("blusa", "1231BL", 50.00, 23);
		p1 = new ProdutoComTamanho("calça", "1235CS", 50.00, 42);
		new CarrinhoDeCompras();
		c.adicionaProduto(p, 2);
		c.adicionaProduto(p1, 2);
	}

	@Test
	public void testAdicionaProduto() {
		assertTrue(c.itens.containsKey(p));
	}

	@Test
	public void testRemoveProduto() {
		assertFalse(c.itens.containsKey(p));
		assertTrue(c.itens.containsKey(p1));
	}

	@Test
	public void testCalcula() {
		assertEquals(c.calcula(), 200, 0.9);
	}

}
