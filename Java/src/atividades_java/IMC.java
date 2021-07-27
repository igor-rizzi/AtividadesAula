package atividades_java;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		double IMC, peso, altura;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua altura:");
		altura = scan.nextDouble();
		
		System.out.println("Digite o seu peso:");
		peso = scan.nextDouble();
		
		IMC = peso/(altura*altura);
		
		System.out.println("O seu IMC é de: " + IMC);

	}

}
