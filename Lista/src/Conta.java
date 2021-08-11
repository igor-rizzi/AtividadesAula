
class Conta {
    double saldo;
    int numero;
    String dono;

	Conta(String varDono, int list, double saldoConvertido){
		this.dono = varDono;
    	this.numero = list;
    	this.saldo = saldoConvertido;
    }
    
    boolean saca(double valor){
        if(valor>this.saldo){
            return false;
        }else{
            this.saldo -= valor;
            return true;
        }
    }
    
    void deposita(double valor){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Novo saldo: " + this.saldo + "\n");
    }
}
