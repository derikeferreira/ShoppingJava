public class Alimentacao extends Loja{

    private Data dataAlvara;
    private String tipoLoja;

    public Alimentacao(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco endereco, Data dateFundacao , Data dataAlvara, int tamanhoEstoque){

        super( nome,  QuantidadeFuncionarios, SalarioBaseFuncionario,  endereco,  dateFundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
        this.tipoLoja = "Alimentacao";
    }

    //get
    public Data getDataAlvara() {
        return dataAlvara;
    }

    //set
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }


    @Override
    public String toString() {
        return "Alimentacao{" +
                "dataAlvara=" + dataAlvara +
                '}';
    }
}
