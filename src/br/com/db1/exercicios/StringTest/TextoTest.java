package br.com.db1.exercicios.StringTest;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.exercicios.String.ClasseString;

public class TextoTest{
	
	@Test
	public void testeString() {
		ClasseString vetor = new ClasseString("banana, ma�a, melancia");
		ClasseString textoMinusculo = new ClasseString("fl�vio prado");
		ClasseString textoMaiusculo = new ClasseString("Fl�vio Prado");
		ClasseString db1 = new ClasseString("DB1START");
		ClasseString texto = new ClasseString(" DB1START ");		
		ClasseString vogais = new ClasseString("vogal");

			Assert.assertEquals("FL�VIO PRADO", textoMinusculo.retornaMaiuscula());

			Assert.assertEquals("fl�vio prado", textoMaiusculo.retornaMinuscula());

			Assert.assertTrue(8 == db1.retornaQuantidadeLetras());

			Assert.assertTrue(10 == texto.retornaQuantidadeLetras());

			Assert.assertEquals(8, texto.retornaTrin().intValue());

			Assert.assertEquals("fl�v", textoMinusculo.retornaQuatroLetras());

			Assert.assertEquals("�vio prado", textoMinusculo.retornaDepoisDoTerceiroChar());

			Assert.assertEquals("rado", textoMaiusculo.retornaQuatroUltimosChar());

			Assert.assertEquals("ALUNO Prado", textoMaiusculo.retornaAlteracaoPrimeiroNome());

			Assert.assertEquals(3, vetor.retornaSplit().length);

			Assert.assertEquals(2, vogais.retornaQuantidadeDeVogais().intValue());

			Assert.assertEquals("TRATS1BD", db1.retornaInvertido());

		}
	}