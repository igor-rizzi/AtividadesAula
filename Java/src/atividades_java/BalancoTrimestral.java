package atividades_java;

public class BalancoTrimestral {

	public static void main(String[] args) {
			int gastosJaneiro = 15000;
			int gastosFevereiro = 23000;
			int gastosMarco = 17000;
			int gastosTrimestre, mediaMensal;
			boolean gastoControlado = true;
			
			gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
			mediaMensal = gastosTrimestre / 3;
		
		
			System.out.println("O total de gastos no trimestre � de: " + gastosTrimestre);
			System.out.println("A media de gastos mensais � de: " + mediaMensal);
			if(mediaMensal < 30000){
				System.out.println("O valor est� controlado!");
			}else {
				boolean gastoControlado = false;
				System.out.println("O valor est� descontrolado!");
			}
		}
	}

}
