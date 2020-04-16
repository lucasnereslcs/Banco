package banco;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws DominioExecoes {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		int num;
		String holder;
		double balanco, saque;
		double limite_saque;

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados da conta:");
		System.out.print("Numero:");
		num = sc.nextInt();
		System.out.print("Proprietario:");
		holder = sc.next();
		System.out.print("Valor Inicial:");
		balanco = sc.nextDouble();
		System.out.print("Limite de Saque:");
		limite_saque = sc.nextDouble();

		Conta c = new Conta(num, holder, balanco, limite_saque);

		System.out.println();
		System.out.print("Entre com o valor do saque:");
		saque = sc.nextDouble();

		try {
			c.Saque(saque);
		}

		catch (DominioExecoes e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}
}
