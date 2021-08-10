
class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;
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