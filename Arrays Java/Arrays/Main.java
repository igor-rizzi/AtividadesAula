
import javax.swing.JOptionPane;

import jdk.jfr.internal.Control;
import jdk.nashorn.internal.parser.Scanner;

import java.lang.reflect.Array;
import java.util.*;

class Main{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        ArrayList ListaConta = new ArrayList<>();
        
        do{ 
		    System.out.println("Digite o que deseja realizar na conta\n (0) Criar nova Conta\n (2) Efetuar Saque\n (3) Efetuar Depósito\n (4) Sair\n");
		    opt = entrada.nextInt();
			if (opt ==0){
                Conta conta1 = new Conta();
				conta1.dono = JOptionPane.showInputDialog("Insira o nome do titular da conta:");
                 

				
				
			}else if (opt == 2){
				System.out.println("\n\nConta do(a): " + minhaConta.dono);
				System.out.println ("Qual eh o valor do saque\n?");
				
				if (minhaConta.saca(entrada.nextDouble())){
					System.out.println("Saque efetuado!\nNovo Saldo" + minhaConta.saldo);

				}else{
					System.out.println("Saldo insuficiente!\n");
				}	
				
			}else if(opt == 3){
				System.out.println("\n\nConta do(a): " + minhaConta.dono);
				System.out.println ("Qual eh o valor do deposito\n?");
				minhaConta.deposita(entrada.nextDouble());
				
			}else if (opt == 4){
				System.out.println("Saiu da aplicacao\n");
			}else{
				System.out.println("Opção inválida\n");
			}
		} while(opt != 4);

        
    }
}