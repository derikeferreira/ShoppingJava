public class Cosmetico {

    private double taxaComercializacao;

    public Cosmetico(double taxaComercializacao){

        this.taxaComercializacao = taxaComercializacao;

    }


    //get

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }


    //set
    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico{" +
                "taxaComercializacao=" + taxaComercializacao +
                '}';
    }
}
