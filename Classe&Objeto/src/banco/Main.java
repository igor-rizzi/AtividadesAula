package banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Conta minhaConta = new Conta();
		System.out.println("Digite o n�mero de sua conta:");
		minhaConta.numero = entrada.nextInt();
		String lixo = entrada.nextLine();
		System.out.println("Digite o nome do titular dessa conta:");
		minhaConta.dono = entrada.nextLine();
		System.out.println("\n\nConta do(a):" + minhaConta.dono);
		System.out.println("Digite o saldo inicial dessa conta:");
		minhaConta.saldo = entrada.nextDouble();
		System.out.println("Seu saldo atual � R$" + minhaConta.saldo);
		minhaConta.saca(500);
		System.out.println("Seu saldo atual � R$" + minhaConta.saldo);
		minhaConta.deposita(200);
		System.out.println("Seu saldo atual � R$" + minhaConta.saldo);
		
	}
}