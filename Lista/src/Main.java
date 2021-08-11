import javax.swing.JOptionPane;
import java.util.*;

class Main{
	public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int opt, list;
        String varDono;
        
        list = 1;
        ArrayList ListaConta = new ArrayList<>();
        
        JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Banco do Igão!",null, 1);
        
        do{ 
		    System.out.println("\nDigite o que deseja realizar na conta\n (0) Criar nova Conta\n (1) Listar contas\n (2) Efetuar Saque\n (3) Efetuar Depósito\n (4) Sair\n");
		    opt = entrada.nextInt();
		   
			if (opt == 0){
				String a = entrada.nextLine();
				double saldoConvertido;
				
                varDono =  JOptionPane.showInputDialog("Insira o nome do titular da conta:");
                String saldo = JOptionPane.showInputDialog("Insira o saldo da conta:");
                saldoConvertido = Integer.parseInt(saldo);
                
                Conta conta1 = new Conta(varDono, list, saldoConvertido);
                
                ListaConta.add(conta1);
                list++;		
                
			}else if (opt == 1) {
				int i;
				for(i = 0; i < ListaConta.size(); i++) {
					Conta cc = (Conta) ListaConta.get(i);
					JOptionPane.showMessageDialog(null, "O número da conta é: " + cc.numero + "\nO nome do titular da conta é: " + cc.dono + "\nO saldo da conta é: " + cc.saldo, "Conta: " + cc.numero, 1);
				}

			}else if (opt == 2){
				int i;
				for(i = 0; i < ListaConta.size(); i++) {
					Conta cc = (Conta) ListaConta.get(i);

					JOptionPane.showMessageDialog(null, "A conta é!",null, 1);
					JOptionPane.showMessageDialog(null, "O número da conta é: " + cc.numero + "\nO nome do titular da conta é: " + cc.dono + "\nO saldo da conta é: " + cc.saldo, "Conta: " + cc.numero, 1);
					
					System.out.println("Insira o valor do saque:");

					if (cc.saca(entrada.nextDouble())){
						System.out.println("Saque efetuado!\nPara a conta do(a): " + cc.dono + "! O saldo foi atualizado para: " + cc.saldo);
					}else{
						System.out.println("Saldo insuficiente!\n");
					}	
					
				}
				
			}else if(opt == 3){
				int i;
				
				for(i = 0; i < ListaConta.size(); i++) {
					Conta cc = (Conta) ListaConta.get(i);
					
					JOptionPane.showMessageDialog(null, "A conta é!",null, 1);
					JOptionPane.showMessageDialog(null, "O número da conta é: " + cc.numero + "\nO nome do titular da conta é: " + cc.dono + "\nO saldo da conta é: " + cc.saldo, "Conta: " + cc.numero, 1);
					
					System.out.println ("Qual eh o valor do deposito\n?");
		
					cc.deposita(entrada.nextDouble());
				}
				
			}else if (opt == 4){
				JOptionPane.showMessageDialog(null, "O banco do Igão agradece a preferencia, volte sempre!", "Nunca será um adeus!", 3);
			}else{
				JOptionPane.showMessageDialog(null, "Ops... A sua opção é invalida!", "Algo de errado não está certo!", 2);
			}
		} while(opt != 4);
    }
}