package desafio;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao2 {

	public static int senhaImprover(String s) {

		int n = s.length();
		Matcher num, mi, ma, spe;
		num = Pattern.compile("[0123456789]").matcher(s);
		mi = Pattern.compile("[abcdefghijklmnopqrstuvwxyz]").matcher(s);
		ma = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]").matcher(s);
		spe = Pattern.compile("[!@#$%^&*()-+]").matcher(s);
		int cont = 0;
		if (!num.find())
			cont++;
		if (!mi.find())
			cont++;
		if (!ma.find())
			cont++;
		if (!spe.find())
			cont++;
		if (n + cont < 6) {
			cont += 6 - n - cont;
		}
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

		System.out.print("insira sua senha: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		senhaImprover(s);
		sc.close();
	}

}
