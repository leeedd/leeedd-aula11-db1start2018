package br.com.db1.teste.Integer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.classe.Integer.ClasseInteger;

public class IntegerTest {

	private ClasseInteger classeInteger = new ClasseInteger();

	@Before
	public void inicio() {
		classeInteger.setValor1(10);
		Assert.assertTrue(10 == classeInteger.getValor1());

		classeInteger.setValor2(10);
		Assert.assertTrue(10 == classeInteger.getValor2());

	}

	@Test
	public void testeSomar() {
		Assert.assertTrue(20 == classeInteger.Somar(10, 10));
	}

	@Test
	public void testeSubtrair() {
		Assert.assertTrue(0 == classeInteger.Subtrair(10, 10));
	}

	@Test
	public void testeMultiplicar() {
		Assert.assertTrue(100 == classeInteger.Multiplicar(10, 10));
	}

	@Test
	public void testeDividir() {
		Assert.assertTrue(1 == classeInteger.Dividir(10, 10));
	}

}
