import java.util.Date;

public class Produto {

    private String nome;
    private double preco;

    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDataValidade(Date dataValidade) {
        dataValidade = dataValidade;
    }

    public Data getDataValidade() {
        return dataValidade;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "Nome='" + nome +
                ", Preco=" + preco +
                ", DataValidade=" + dataValidade +
                '}';
    }

    public boolean estaVencido(Data validadeProduto) {


        boolean esta_S_N = true;

        Date dateVenceu = new Date(123, 9, 20);

        Date validadeProdutoTipoDate = new Date(validadeProduto.getAno()-1900, validadeProduto.getMes()-1, validadeProduto.getDia() );

        int numeroAserRetornado = validadeProdutoTipoDate.compareTo(dateVenceu); // retorna  zero se a data é igual, retorna um número menor que zero se a data é inferior e maior que zero se a data e superior a da comparacao

        if (numeroAserRetornado < 0){  esta_S_N = false;  }



        return esta_S_N;
    }


}

