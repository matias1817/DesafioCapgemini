package desafio;

import java.util.Scanner;

public class Questao1 {

	public static String escadaGenerator(int n) {
		String e = "";
		for (int i = 0; i < n; i++) {
			e = e + "*";
			System.out.printf("%" + n + "s\n", e);

		}
		return e;

	}

	public static void main(String[] args) {

		System.out.print("insira um número: ");
		Scanner sc = new Scanner(System.in);
		escadaGenerator(sc.nextInt());
		sc.close();
	}
}
