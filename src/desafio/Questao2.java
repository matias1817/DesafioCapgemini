package desafio;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {

	//fun��o que recebe uma senha(string) e informa a quantidade de letras necess�rias para tornar ela uma senha segura
	public static int senhaImprover(String s) {
		//vari�vel que ir� armazenar a quantidade de letras na senha
		int n = s.length();
		//declara��es da engine matcher que ir�o detectar a presen�a ou falta de certos carcteres na string
		Matcher num, mi, ma, spe;
		//defini��es de quais caracteres ser�o esses
		num = Pattern.compile("[0123456789]").matcher(s);
		mi = Pattern.compile("[abcdefghijklmnopqrstuvwxyz]").matcher(s);
		ma = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]").matcher(s);
		spe = Pattern.compile("[!@#$%^&*()-+]").matcher(s);
		//contador que serve para saber quantos carcteres faltam para a senha ser segura ou indicar que a senha � segura
		int cont = 0;
		//ifs que tentaram encontrar a ocorr�ncia dos carcteres que aumentam a seguran�a da senha
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
			System.out.print("Sua senha � insegura, uma senha segura deve ter no m�nimo 6 caracteres"
					+ "\nno m�nimo 1 digito, no m�nimo 1 letra em min�sculo "
					+ "\nno m�nimo 1 letra em mai�sculo, no m�nimo 1 caractere especial"
					+ "\nOs caracteres especiais s�o: !@#$%^&*()-+");
		}
		return cont;

	}

	public static void main(String[] args) {
		//input que envia a string para a fun��o
		System.out.print("insira sua senha: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//chamada da fun��o utilizando a string que vem do scanner
		senhaImprover(s);
		sc.close();
	}

}
