public class Endereco {


    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;
    private String nomeDaRua;


    public Endereco(String municipioLoja, String ruaLoja, String estadoLoja, String paisLoja, String cepLoja, String numeroLoja, String complementoLoja){

        this.nomeDaRua = ruaLoja;
        this.cidade = municipioLoja;
        this.estado = estadoLoja;
        this.pais = paisLoja;
        this.cep = cepLoja;
        this.numero = numeroLoja;
        this.complemento = complementoLoja;

    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEstado() {
        return estado;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public String getNumero() {
        return numero;
    }

    public String getPais() {
        return pais;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    @Override
    public String toString() {
        return "Endereco{" +
                "nomeDaRua='" + nomeDaRua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
