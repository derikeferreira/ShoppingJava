import java.util.Date;

public class Loja {

    private String Nome;
    private int QuantidadeFuncionarios;
    private double SalarioBaseFuncionario;
    private Date date;
    private Endereco endereco;

    public Loja(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Date date, Endereco endereco){

        this.Nome = nome;
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;
        this.SalarioBaseFuncionario = SalarioBaseFuncionario;
        this.date = date;
        this.endereco = endereco;

    }

    public Loja(String nome, int QuantidadeFuncionarios){

        this.Nome = nome;
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;

    }

    public String getNome(){
        return Nome;
    }

    public void setNome(String nome){

        this.Nome = nome;
    }

    public int getQuantidadeFuncionarios(){
        return QuantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int QuantidadeFuncionarios){
        this.QuantidadeFuncionarios = QuantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return SalarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        SalarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getDate() {
        return date;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String toString() {
        return "Nome da loja: " + this.Nome + ", Quantidade de funcionarios: " + this.QuantidadeFuncionarios +
                ", Salario base: ";  // + this.(salarioBaseFuncionario + " ") ;
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
