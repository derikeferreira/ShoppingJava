public class Cosmetico extends Loja {

    private double taxaComercializacao;
    private String tipoLoja;

    public Cosmetico(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco endereco, Data dateFundacao ,int tamanhoEstoque, double taxaComercializacao){

        super( nome,  QuantidadeFuncionarios, SalarioBaseFuncionario,  endereco,  dateFundacao, tamanhoEstoque);

        this.taxaComercializacao = taxaComercializacao;
        this.tipoLoja = "Cosmetico";

    }


    //get

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public String getTipoLoja() {
        return tipoLoja;
    }

    //set
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public void setTipoLoja(String tipoLoja) {
        this.tipoLoja = tipoLoja;
    }

    @Override
    public String toString() {
        return super.toString() + " / " + taxaComercializacao;
    }
}
