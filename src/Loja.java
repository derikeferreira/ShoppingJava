import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Data DataFundacao;
    private Endereco endereco;

    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double SalarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque){

        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = SalarioBaseFuncionario;
        this.endereco = endereco;
        this.DataFundacao = dataFundacao;
        estoqueProdutos = new Produto[tamanhoEstoque];


    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque){

        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.DataFundacao = dataFundacao;
        estoqueProdutos = new Produto[tamanhoEstoque];
    }


    public String getNome(){
        return nome;
    }


    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public Data getDataFundacao() {
        return DataFundacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }


    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int QuantidadeFuncionarios){
        this.quantidadeFuncionarios = QuantidadeFuncionarios;
    }



    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setDataFundacao(Data dateFundacao) {
        this.DataFundacao = dateFundacao;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }




    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", dateFundacao=" + DataFundacao +
                ", endereco=" + endereco +
                '}';
    }

    public void imprimeProdutos(){
        if (estoqueProdutos != null)
            System.out.println(getEstoqueProdutos());
        else
            System.out.println("No momento não a produtos no estoque");
    }

    public boolean removeProduto(String nomeProduto){
        if(estoqueProdutos != null){
            for(int i = 0; i < estoqueProdutos.length; i++){
                if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)){
                    estoqueProdutos = null;
                    return true; // Produto removido com sucesso
                }
            }
        }
        return false; // Produto não encontrado no estoque
    }


    public boolean insereProduto(Produto novoProduto){
        if(estoqueProdutos != null){
            for(int i = 0; i < estoqueProdutos.length; i++){
                if(estoqueProdutos[i] == null){
                    estoqueProdutos[i] = novoProduto;
                    return true; // Produto inserido com sucesso
                }
            }
        }
        return false; // Produto não inserido no estoque
    }


    public double gastosComSalario() {

        if (salarioBaseFuncionario == -1){
            return -1;
        } else {

            return  quantidadeFuncionarios * salarioBaseFuncionario;


        }


    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

}
