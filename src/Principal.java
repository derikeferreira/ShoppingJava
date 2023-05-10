import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Principal {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcaoMenu ;

        while (true){

            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            opcaoMenu = ler.nextInt();

            if (opcaoMenu == 1){

                ler.nextLine();

                System.out.println("Nome da loja:");
                String nomeLoja = ler.nextLine();

                System.out.println("Logradouro:");
                String ruaLoja = ler.nextLine();

                System.out.println("Complemento:");
                String complementoLoja = ler.nextLine();

                System.out.println("Número:");
                String numeroLoja = ler.nextLine();

                System.out.println("Cep:");
                String cepLoja = ler.nextLine();

                System.out.println("País:");
                String paisLoja = ler.nextLine();

                System.out.println("Estado:");
                String estadoLoja = ler.nextLine();

                System.out.println("Município:");
                String municipioLoja = ler.nextLine();

                System.out.println("Quantidade de funcionários:");
                int quantidFunciLoja = ler.nextInt();

                System.out.println("Salário base:");
                double salarioBaseLoja = ler.nextDouble();

                System.out.println("Informe o dia:");
                int dataDiaLoja = ler.nextInt();
                System.out.println("Informe o mes:");
                int dataMesLoja = ler.nextInt();
                System.out.println("Informe o ano:");
                int dataAnoLoja = ler.nextInt();


                Data dateLojaFundacao = new Data(dataAnoLoja , dataMesLoja , dataDiaLoja );

                Endereco endereco = new Endereco(municipioLoja, ruaLoja, estadoLoja,paisLoja,cepLoja, numeroLoja,complementoLoja);

                Loja loja = new Loja(nomeLoja, quantidFunciLoja, salarioBaseLoja, dateLojaFundacao, endereco);

                System.out.println(loja.toString() );
               // System.out.println(loja.tamanhoDaLoja());
                //System.out.println(endereco);
                //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                //System.out.println("Data formatada: "+sdf.format(dateLojaFundacao));


            } else if (opcaoMenu == 2) {
                ler.nextLine();

                System.out.println("Nome do produto:");
                String nomeProduto = ler.nextLine();

                System.out.println("preco do produto:");
                double precoProduto = ler.nextDouble();

                System.out.println("Informe a data de validade:");

                System.out.println("Dia:");
                int diaValidade = ler.nextInt();

                System.out.println("Mes:");
                int mesValidade = ler.nextInt();

                System.out.println("Ano:");
                int anoValidade = ler.nextInt();

                Data dateValidadeProduto = new Data(diaValidade, mesValidade, anoValidade );

                Produto produto = new Produto(nomeProduto, precoProduto, dateValidadeProduto);



                if(produto.estaVencido(dateValidadeProduto)){
                    System.out.println("Esta vencido!");
                }else {
                    System.out.println("Não está vencido!");
                };




            } else if (opcaoMenu == 3) {

                System.out.println("3");
                break;

            } else {
                System.out.println("Opção inválida");
            }


        }


    }

}
