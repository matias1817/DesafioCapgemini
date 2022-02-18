package desafio;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {

	//função que recebe uma senha(string) e informa a quantidade de letras necessárias para tornar ela uma senha segura
	public static int senhaImprover(String s) {
		//variável que irá armazenar a quantidade de letras na senha
		int n = s.length();
		//declarações da engine matcher que irão detectar a presença ou falta de certos carcteres na string
		Matcher num, mi, ma, spe;
		//definições de quais caracteres serão esses
		num = Pattern.compile("[0123456789]").matcher(s);
		mi = Pattern.compile("[abcdefghijklmnopqrstuvwxyz]").matcher(s);
		ma = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]").matcher(s);
		spe = Pattern.compile("[!@#$%^&*()-+]").matcher(s);
		//contador que serve para saber quantos carcteres faltam para a senha ser segura ou indicar que a senha é segura
		int cont = 0;
		//ifs que tentaram encontrar a ocorrência dos carcteres que aumentam a segurança da senha
		if (!num.find())
			cont++;
		if (!mi.find())
			cont++;
		if (!ma.find())
			cont++;
		if (!spe.find())
			cont++;
		//if que tentara definir a quantidade de caracteres que faltam pra senha ser segura 
		if (n + cont < 6) {
			cont += 6 - n - cont;
		}
		//output dos resultados em ambos casos 
		if (cont == 0) {
			System.out.println(cont);
			System.out.print("senha segura");
		}
		if (cont > 0) {
			System.out.println(cont);
			System.out.print("Sua senha é insegura, uma senha segura deve ter no mínimo 6 caracteres"
					+ "\nno mínimo 1 digito, no mínimo 1 letra em minúsculo "
					+ "\nno mínimo 1 letra em maiúsculo, no mínimo 1 caractere especial"
					+ "\nOs caracteres especiais são: !@#$%^&*()-+");
		}
		return cont;

	}

	public static void main(String[] args) {
		//input que envia a string para a função
		System.out.print("insira sua senha: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//chamada da função utilizando a string que vem do scanner
		senhaImprover(s);
		sc.close();
	}

}
