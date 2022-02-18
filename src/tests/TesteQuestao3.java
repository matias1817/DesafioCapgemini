package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import desafio.Questao3;

class TesteQuestao3 {

	//teste que conefere se a quantidade passada � igual ao retorno da fun��o dada uma certa string 
	@Test
	void test() {
		assertEquals(2, Questao3.anagramaFinder("ana"));
	}
	//teste que conefere se o n�mero passado � igual ao retorno da fun��o dado uma certa string 
	@Test
	void test2() { 
		assertEquals(3, Questao3.anagramaFinder("ifailuhkqq"));
	}
	//teste que conefere se o n�mero passado � diferente do retorno da fun��o dado uma certa string 
	@Test
	void test3() {
		assertNotEquals(9, Questao3.anagramaFinder("alma"));
	}

}
