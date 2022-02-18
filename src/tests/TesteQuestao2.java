package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import desafio.Questao2;

class TesteQuestao2 {

	//teste que conefere se o número passado é igual ao retorno da função dado uma certa string 
	@Test
	void test() {
		assertEquals(5,Questao2.senhaImprover("a"));
		
	}
	//teste que conefere se o número passado é igual ao retorno da função dado uma certa string 
	@Test
	void test2() {
		assertEquals(0,Questao2.senhaImprover("Aa6+4567"));
		
	}
	//teste que conefere se o número passado é diferente do retorno da função dado uma certa string 
	@Test
	void test3() {
		assertNotEquals(5,Questao2.senhaImprover("aY"));
	
	}

}
