package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import desafio.Questao2;

class TesteQuestao2 {

	@Test
	void test() {
		assertEquals(5,Questao2.senhaImprover("a"));
		
	}
	@Test
	void test2() {
		assertEquals(0,Questao2.senhaImprover("Aa6+4567"));
		
	}
	@Test
	void test3() {
		assertNotEquals(5,Questao2.senhaImprover("aY"));
	
	}

}
