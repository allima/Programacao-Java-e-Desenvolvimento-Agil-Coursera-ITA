package coursera.ita;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ProdutoComTamanhoTest {

	private ProdutoComTamanho p, p1;

	@Before
	public void inicializa() {
		p = new ProdutoComTamanho("blusa", "1231BL", 50.00, 23);
		p1 = new ProdutoComTamanho("blusa", "1231BL", 50.00, 24);
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

}
