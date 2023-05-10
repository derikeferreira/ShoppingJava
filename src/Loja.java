import java.text.SimpleDateFormat;
import java.util.Date;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Data date;
    private Endereco endereco;

    public Loja(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Data date, Endereco endereco){

        this.nome = nome;
        this.quantidadeFuncionarios = QuantidadeFuncionarios;
        this.salarioBaseFuncionario = SalarioBaseFuncionario;
        this.date = date;
        this.endereco = endereco;

    }

    public Loja(String nome, int QuantidadeFuncionarios){

        this.nome = nome;
        this.quantidadeFuncionarios = QuantidadeFuncionarios;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){

        this.nome = nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int QuantidadeFuncionarios){
        this.quantidadeFuncionarios = QuantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDate() {
        return date;
    }

    public Endereco getEndereco() {
        return endereco;
    }


    public String toString() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return "Loja{" +
                "nome='" + nome +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                ", date=" + sdf.format(date) +
                ", endereco=" + endereco +
                '}';
    }

    public double gastosComSalario() {

        int QuantidadeFunci = getQuantidadeFuncionarios();
        double SalarioFun = getSalarioBaseFuncionario();
        double GastoSalario = QuantidadeFunci * SalarioFun;
        return GastoSalario;
    }

    public String tamanhoDaLoja() {
        int QuantidadeFunci = getQuantidadeFuncionarios();
        String CaracterTamanho;
        if (QuantidadeFunci > 30) {
            CaracterTamanho = "G";
            return CaracterTamanho;
        } else if (QuantidadeFunci > 9 && QuantidadeFunci < 31 ) {
            CaracterTamanho = "M";
            return CaracterTamanho;
        } else if (QuantidadeFunci < 10 ) {
            CaracterTamanho = "P";
            return CaracterTamanho;
        } else {
            CaracterTamanho = "Erro";
            return CaracterTamanho;
        }
    }

}
