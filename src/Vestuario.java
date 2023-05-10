public class Vestuario {

    private boolean produtosImportados;
    public Vestuario(boolean produtosImportados){
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
        return "Vestuario{" +
                "produtosImportados=" + produtosImportados +
                '}';
    }
}
