package atividades_java;

import java.util.Scanner;

public class BalancoTrimestral {

	public static void main(String[] args) {
			int gastosJaneiro;
			int gastosFevereiro;
			int gastosMarco;
			int gastosTrimestre, mediaMensal; 
			boolean gastoControlado = true;
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Digite o valor dos gastos de janeiro: ");
			gastosJaneiro = scan.nextInt();
	
			System.out.println("Digite o valor dos gastos de fevereiro: ");
			gastosFevereiro = scan.nextInt();
	
			System.out.println("Digite o valor dos gastos de março: ");
			gastosMarco = scan.nextInt();
			
			gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
			mediaMensal = gastosTrimestre / 3;
		
		
			System.out.println("O total de gastos no trimestre é de: " + gastosTrimestre);
			System.out.println("A media de gastos mensais é de: " + mediaMensal);
			if(mediaMensal < 30000){
				System.out.println("O valor está controlado!");
			}else {
				gastoControlado = false;
				System.out.println("O valor está descontrolado!");
			}
		}
	}
