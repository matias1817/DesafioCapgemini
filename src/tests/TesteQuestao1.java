package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import desafio.Questao1;

class TesteQuestao1 {

	//teste que confere se a string passada é igual a base da saida da função
	@Test
	@DisplayName("primeiro teste")	
	void test() {
		   assertEquals("*****", Questao1.escadaGenerator(5));
		
	}
	//teste que confere se a string passada é diferente da saida função
	@Test
	@DisplayName("segundo teste")	
	void test2() {
		assertNotEquals("*****", Questao1.escadaGenerator(8));
		
	}
}