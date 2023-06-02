import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Principal {
    public static void main(String[] args) {

        //Inicializando variaveis vazias
        Loja loja = null;
        Produto produto = null;

        Scanner ler = new Scanner(System.in);
        int opcaoMenu ;

        while (true) {

            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            System.out.println("Escolha uma opção:");
            opcaoMenu = ler.nextInt();

            switch (opcaoMenu) {
                case 1:

                    ler.nextLine();

                    System.out.println("Nome da loja:");
                    String nomeLoja = ler.nextLine();
                    System.out.println("Quantidade de funcionários:");
                    int quantidFunciLoja = ler.nextInt();
                    System.out.println("Salário dos funcionários:");
                    double salarioBaseLoja = ler.nextDouble();


                    System.out.println("Informe o dia de fundação da loja:");
                    int dataDiaLoja = ler.nextInt();
                    System.out.println("Informe o mes de fundação da loja:");
                    int dataMesLoja = ler.nextInt();
                    System.out.println("Informe o ano de fundação da loja:");
                    int dataAnoLoja = ler.nextInt();


                    System.out.println("Digite o logradouro da loja: ");
                    String ruaLoja = ler.nextLine();
                    System.out.println("Digite o nº da loja: ");
                    String numeroLoja = ler.nextLine();
                    System.out.println("Digite o CEP da loja: ");
                    String cepLoja = ler.nextLine();
                    System.out.println("Digite o complemento da loja: ");
                    String complementoLoja = ler.nextLine();
                    System.out.println("Digite o município da loja: ");
                    String municipioLoja = ler.nextLine();
                    System.out.println("Digite o estado da loja: ");
                    String estadoLoja = ler.nextLine();
                    System.out.println("Digite o país da loja: ");
                    String paisLoja = ler.nextLine();


                    System.out.println("Digite o tamanho do estoque: ");
                    int tamanhoEstoqueLoja = ler.nextInt();


                    Endereco endereco = new Endereco(municipioLoja, ruaLoja, estadoLoja, paisLoja, cepLoja, numeroLoja, complementoLoja);
                    Data dataLojaFundacao = new Data(dataDiaLoja, dataMesLoja, dataAnoLoja);
                    loja = new Loja(nomeLoja, quantidFunciLoja, salarioBaseLoja, endereco, dataLojaFundacao, tamanhoEstoqueLoja);


                    System.out.println("Loja criada com sucesso!");
                    break;

                case 2:

                    ler.nextLine();

                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = ler.nextLine();
                    System.out.println("Digite o preco do produto: ");
                    double precoProduto = ler.nextDouble();


                    System.out.println("Informe a data de validade (Dia): ");
                    int diaValidade = ler.nextInt();
                    System.out.println("Informe a data de validade (Mes): ");
                    int mesValidade = ler.nextInt();
                    System.out.println("Informe a data de validade (Ano): ");
                    int anoValidade = ler.nextInt();



                    Data dataValidadeProduto = new Data(diaValidade, mesValidade, anoValidade);
                    produto = new Produto(nomeProduto, precoProduto, dataValidadeProduto);



                    System.out.println("Produto criado com sucesso!");
                    break;

                case 3:

                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
