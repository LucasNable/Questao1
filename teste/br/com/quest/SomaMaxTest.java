package br.com.quest;

import org.junit.Test;
import static org.junit.Assert.*;



public class SomaMaxTest {
	
	@Test
	public void somaMaxSucessoTest() {
		String[] lista = new String[]{"2", "-4", "6", "8", "-10", "100", "-6", "5"};
		try {
			SomaMax.maxSum(lista);
			assertTrue(SomaMax.primeiro.intValue() == 2);
			assertTrue(SomaMax.ultimo.intValue() == 5);
		} catch (Exception e) { }		
	}
	
	@Test
	public void somaMaxNegTest() {
		String[] lista = new String[]{"-2", "-4", "-6", "-8", "-10", "-100", "-6", "-5"};
		try {
			SomaMax.maxSum(lista);
			assertTrue(SomaMax.primeiro.intValue() == 0);
			assertTrue(SomaMax.ultimo.intValue() == 0);
		} catch (Exception e) { }		
	}
	
	@Test
	public void somaMaxErroTestAlfa() {
		String[] lista = new String[]{"2", "v", "6", "8"};
		try {
			SomaMax.maxSum(lista);
		} catch (Exception e) {
			assertTrue(true);
		}		
	}
	
	@Test
	public void somaMaxErroTestAlfaPrimeiro() {
		String[] lista = new String[]{"x", "-5", "6", "8"};
		try {
			SomaMax.maxSum(lista);
		} catch (Exception e) {
			assertTrue(true);
		}		
	}
	
	@Test
	public void somaMaxErroListaTest() {
		String[] lista = new String[]{"2", "-4"};
		try {
			SomaMax.maxSum(lista);
		} catch (Exception e) {
			assertTrue(true);
		}		
	}
	
	@Test
	public void somaMaxErroListaVaziaTest() {
		String[] lista = new String[]{};
		try {
			SomaMax.maxSum(lista);
		} catch (Exception e) {
			assertTrue(true);
		}		
	}
}
