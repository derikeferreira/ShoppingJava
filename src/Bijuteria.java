public class Bijuteria extends Loja{

    private double metaVendas;
    private String tipoLoja;


    public Bijuteria(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco endereco, Data dateFundacao, int tamanhoEstoque , double metaVendas) {

        super( nome,  QuantidadeFuncionarios, SalarioBaseFuncionario,  endereco,  dateFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
        this.tipoLoja = "Cosmetico";
    }


    //get
    public double getMetaVendas() {
        return metaVendas;
    }

    //set
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Bijuteria{" +
                "metaVendas=" + metaVendas +
                '}';
    }
}
