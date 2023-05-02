import java.util.Date;

public class Produto {

    private String Nome;
    private double Preco;

    private Date DataValidade;

    public Produto(String nome, double preco, Date dataValidade){
        this.Nome = nome;
        this.Preco = preco;
        this.DataValidade = dataValidade;
    }


    public String getNome(){
        return Nome;
    }

    public void setNome(String nome){
        this.Nome = nome;
    }

    public double getPreco(){
        return Preco;
    }

    public void setPreco(double preco){
        this.Preco = preco;
    }

    public void setDataValidade(Date dataValidade) {
        DataValidade = dataValidade;
    }

    public Date getDataValidade() {
        return DataValidade;
    }

    public String toString() {
        return "Nome do produto: " + this.Nome + ", valor: " + this.Preco;

    }

}

