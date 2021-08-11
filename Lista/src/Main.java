import javax.swing.JOptionPane;
import java.util.*;

class Main{
    private static final String String = null;

	public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int opt, list;
        String varDono;
        
        list = 0;
        ArrayList ListaConta = new ArrayList<>();
        
        JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Banco do Igão!",null, 1);
        
        do{ 
		    System.out.println("\nDigite o que deseja realizar na conta\n (0) Criar nova Conta\n (1) Listar contas\n (3) Efetuar Saque\n (4) Efetuar Depósito\n (5) Sair\n");
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
					System.out.println("O número da conta é: " + cc.numero);
					System.out.println("O nome do titular da conta é: " + cc.dono);
					System.out.println("O saldo da conta é: " + cc.saldo + "\n");
				}
			}
			
			
			/*else if (opt == 2){
				System.out.println("\n\nConta do(a): " + minhaConta.dono);
				System.out.println ("Qual eh o valor do saque\n?");
				
				if (conta.saca(entrada.nextDouble())){
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
				System.out.println("OpÃ§Ã£o invÃ¡lida\n");
			}*/
		} while(opt != 4);

        
    }
}