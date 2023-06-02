public class Vestuario extends Loja {

    private boolean produtosImportados;

    public Vestuario(String nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario, Endereco endereco, Data dateFundacao,boolean produtosImportados, int tamanhoEstoque ){

        super( nome,  QuantidadeFuncionarios, SalarioBaseFuncionario,  endereco,  dateFundacao, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    }

    //get
    public boolean getProdutosImportados() { return produtosImportados; }

    //set
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return getNome()
                + "/" + getQuantidadeFuncionarios()
                + "/" + getSalarioBaseFuncionario()
                + "/" + getEndereco()
                + "/" + getDataFundacao()
                + "/" + produtosImportados;
    }
}
