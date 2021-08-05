import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opt = 0;

        Data umaData = new Data();
        umaData.dia = 25;
        umaData.mes = 10;
        umaData.ano = 2022;

        Laboratorio umLaboratorio = new Laboratorio();
        umLaboratorio.cnpj = "50.200.705/0001-42";
        umLaboratorio.endereco = "Rua da Alegria, Florianopolis, SC";
        umLaboratorio.inscricaoEstadual = "110.800.654";
        umLaboratorio.nomeFantasia = "Butantan";
        umLaboratorio.razaoSocial = "Instituto Butantan";
        umLaboratorio.telefone =  "(11)2627-9300";
    

        Medicamento umMedicamento = new Medicamento();
        umMedicamento.nome = "Paracetamol";
        umMedicamento.precoVenda = 15.90;
        umMedicamento.receitaObrigatoria = true;

        umMedicamento.lab = umLaboratorio;
        umMedicamento.dataValidade = umaData;

        do {
            System.out.println("1 - Comprar Medicamento \n2 - Vender Medicamento \n3 - Reajustar preço \n4 - Mostrar Medicamento \n5 - Sair");
            opt = entrada.nextInt();
            if (opt == 1) {
                System.out.println("\nInforme a quantidade de medicamentos a serem comprados");
                umMedicamento.comprar(entrada.nextInt());
                System.out.println("A quantidade em estoque foi alterada!" + "\nA quantidade do seu estoque agora é: " + umMedicamento.qtdEstoque + "\n");
            } else if (opt == 2) {
                System.out.println("\nInforme a quantidade de medicamentos a serem vendidos");
                umMedicamento.vender(entrada.nextInt());
                System.out.println("\n");
            } else if (opt == 3) {
                umMedicamento.reajustarPrecoVenda();
            } else if (opt == 4){
                umMedicamento.mostrar();
            } else if (opt == 5){
                System.out.println("\nObrigado! Até breve!");
            }

        } while (opt != 5);

    }

}
