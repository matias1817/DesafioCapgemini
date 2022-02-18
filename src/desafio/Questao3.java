package desafio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questao3 {

	public static int anagramaFinder(String s) {

		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				char[] c = s.substring(i, j + 1).toCharArray();
				Arrays.sort(c);
				String k = new String(c);

				if (hashMap.containsKey(k)) {
					hashMap.put(k, hashMap.get(k) + 1);
				} else {
					hashMap.put(k, 1);
				}
			}
		}
		int p = 0;
		for (String k : hashMap.keySet()) {
			int v = hashMap.get(k);
			p += (v * (v - 1)) / 2;
		}
				
		return p;

	}
	public static void main(String[] args) {
		
		System.out.println("Insira uma palavra para ver quantos anagramas ela possui: ");
		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 System.out.println(anagramaFinder(s));
		 sc.close();

	}
}
