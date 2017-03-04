package coursera.ita;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompraParceladaTest {
	private Compra c;

	@Test
	public void testComUmaParcela() {
		c = new CompraParcelada(100.0, 1, 14.25);
		assertEquals(c.total(), 114.25, 0.9);

	}

	@Test
	public void testComDuasParcela() {
		c = new CompraParcelada(100.0, 2, 14.25);
		assertEquals(c.total(), 130.53, 0.9);

	}

	@Test
	public void testComCincoParcela() {
		c = new CompraParcelada(100.0, 5, 14.25);
		assertEquals(c.total(), 194.66, 0.9);

	}

	@Test
	public void testComDezParcela() {
		c = new CompraParcelada(100.0, 10, 14.25);
		assertEquals(c.total(), 378.93, 0.9);

	}

}
