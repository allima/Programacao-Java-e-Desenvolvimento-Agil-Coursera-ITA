package coursera.ita;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {

	private Produto p;
	private Produto p1;

	@Before
	public void inicializa() {
		p = new Produto("blusa", "1231BL", 50.00);
		p1 = new Produto("blusa", "1230BL", 50.00);
	}

	@Test
	public void testHashCodeNotEquals() {
		assertFalse(p.hashCode() == p1.hashCode());
	}

	@Test
	public void testEqualsObjectNotEquals() {
		assertFalse(p.equals(p1));
	}

	@Test
	public void testHashCode() {
		assertTrue(p.hashCode() == p.hashCode());
	}

	@Test
	public void testEqualsObject() {
		assertTrue(p.equals(p));
	}

	@Test
	public void testGetPreco() {
		assertEquals(p.getPreco(), 50.00, 0.9);
	}

	@Test
	public void testGetNome() {
		assertEquals(p.getNome(), "blusa");
	}

}
