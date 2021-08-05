import java.util.Scanner;
class Medicamento{
    Scanner entrada = new Scanner (System.in);
    String nome;
    Double precoVenda; 
    boolean receitaObrigatoria;
    int qtdEstoque;
    Laboratorio lab;
    Data dataValidade;
    
    void reajustarPrecoVenda(){
        int reajuste;
        double porcento, percentual = 0;
        System.out.println("Informe o percentual para o reajuste: ");
        percentual = entrada.nextDouble();
        System.out.println("1 - Desconto \n2 - Acrescer valor");
        reajuste = entrada.nextInt();
        if(reajuste == 1){
            porcento = percentual/100;
            this.precoVenda = this.precoVenda - (this.precoVenda * porcento);
            System.out.println("O valor atual de venda é de: R$" + this.precoVenda + "\n");
        }else if(reajuste == 2){
            porcento = percentual/100;
            this.precoVenda = this.precoVenda + (this.precoVenda * porcento);
            System.out.println("O valor atual de venda é de: R$" + this.precoVenda);
        }
    }
    
    void vender(int quantidade){
        if(quantidade < this.qtdEstoque){
            System.out.println("Este medicamento nescessita de receita!\n");
            this.qtdEstoque -= quantidade;
            System.out.println("\nA quantidade em estoque foi alterada!" + "\nA quantidade do seu estoque agora é: " + this.qtdEstoque + "\n");
        }else{
            System.out.println("A quantidade de venda não pode ser maior do que a quantidade em estoque!\n");
        }
    }
    
    void comprar(int quantidade){
        this.qtdEstoque += quantidade;
    }

    void mostrar(){
        System.out.println("\nO seu medicamento é:");
        System.out.println(this.nome);
        System.out.println("R$" + this.precoVenda);
        this.dataValidade.mostra();
        System.out.println(this.lab.nomeFantasia);
        System.out.println("A quantidade em estoque é: " + this.qtdEstoque + "\n");
    }
    
}