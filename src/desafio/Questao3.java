package desafio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao3 {

	//função que recebe uma string e informa quantos anagramas tem nela
	public static int anagramaFinder(String s) {
		
		//declaração do hashMap que armazenará todas as substrings da string
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		//fors para achar todas as possiveis substrigs
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				//armazena as partes da strings(substrings)
				char[] c = s.substring(i, j + 1).toCharArray();
				//ordena as substrings
				Arrays.sort(c);
				String k = new String(c);
				
				//if que insere a substring no hashmap  
				if (hashMap.containsKey(k)) {
					hashMap.put(k, hashMap.get(k) + 1);
				} else {
					hashMap.put(k, 1);
				}
			}
		}
		int p = 0;
		//conta a frequência dos anagramas no hashmap
		for (String k : hashMap.keySet()) {
			int v = hashMap.get(k);
			p += (v * (v - 1)) / 2;
		}
				
		return p;

	}
	public static void main(String[] args) {
		//input que envia a string para a função
		System.out.println("Insira uma palavra para ver quantos anagramas ela possui: ");
		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		//chamada da função utilizando a string que vem do scanner
		 System.out.println(anagramaFinder(s));
		 sc.close();

	}
}
