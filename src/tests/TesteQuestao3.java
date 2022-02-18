package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import desafio.Questao3;

class TesteQuestao3 {

	@Test
	void test() {
		assertEquals(2, Questao3.anagramaFinder("ana"));
	}
	@Test
	void test2() {
		assertEquals(3, Questao3.anagramaFinder("ifailuhkqq"));
	}
	@Test
	void test3() {
		assertNotEquals(9, Questao3.anagramaFinder("alma"));
	}

}
