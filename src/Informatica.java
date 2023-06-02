public class Informatica extends Loja{

    private double seguroEletronicos;
    private String tipoLoja;


    public Informatica(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco endereco, Data dateFundacao ,int tamanhoEstoque,double seguroEletronicos){

        super( nome,  QuantidadeFuncionarios, SalarioBaseFuncionario,  endereco,  dateFundacao, tamanhoEstoque);
        this.seguroEletronicos = seguroEletronicos;
        this.tipoLoja = "Informatica";

    }

    //get

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public String getTipoLoja() {
        return tipoLoja;
    }
    //set

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public void setTipoLoja(String tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + seguroEletronicos;
    }
}
