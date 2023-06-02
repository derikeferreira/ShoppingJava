public class Produto {

    private String nome;
    private double preco;

    private Data dataValidade;


    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Data getDataValidade() {
        return dataValidade;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "Nome='" + nome +
                ", Preco=" + preco +
                ", DataValidade=" + dataValidade +
                '}';
    }

    public boolean estaVencido(Data vencido) {

        if (dataValidade.getAno() < vencido.getAno()){
            return true;
        } else if (dataValidade.getAno()> vencido.getAno()) {

            return false;
        }else {
            if(dataValidade.getMes() < vencido.getMes()){
                return true;
            } else if (dataValidade.getMes() > vencido.getMes()) {
                return false;

            }else {
                if (dataValidade.getDia() > vencido.getDia()){
                    return false;
                }else {
                    return true;
                }
            }
        }

    }


}

