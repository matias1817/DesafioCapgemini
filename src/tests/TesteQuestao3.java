package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import desafio.Questao3;

class TesteQuestao3 {

	//teste que conefere se a quantidade passada é igual ao retorno da função dada uma certa string 
	@Test
	void test() {
		assertEquals(2, Questao3.anagramaFinder("ana"));
	}
	//teste que conefere se o número passado é igual ao retorno da função dado uma certa string 
	@Test
	void test2() {
		assertEquals(3, Questao3.anagramaFinder("ifailuhkqq"));
	}
	//teste que conefere se o número passado é diferente do retorno da função dado uma certa string 
	@Test
	void test3() {
		assertNotEquals(9, Questao3.anagramaFinder("alma"));
	}

}
