package desafio;

import java.util.Scanner;

public class Questao1 {

	//fun��o que recebe a vari�vel(n�mero inteiro) do tamanho da escada e executa sua tarefa
	public static String escadaGenerator(int n) {
		String e = "";
		//for que armazena como ira ficar a escada e a imprime na tela
		for (int i = 0; i < n; i++) {
			e = e + "*";
			System.out.printf("%" + n + "s\n", e);

		}
		return e;

	}

	public static void main(String[] args) {
		//input que envia a variavel para a fun��o
		System.out.print("insira um n�mero: ");
		Scanner sc = new Scanner(System.in);
		//chamada da fun��o utilizando a vari�vel que vem do scanner
		escadaGenerator(sc.nextInt());
		sc.close();
	}
}
