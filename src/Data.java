public class Data {

    private int dia;
    private int mes;
    private int ano;

    public String Data(int dia, int mes, int ano){


        boolean validarData = true;

        if(mes > 0 && ano > 0 && dia >0 && mes <= 12 && dia <= 31 ){

            if (mes == 2 && dia > 28 && (ano%4) != 0){

                validarData = false;

            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30 ) {

                validarData = false;

            }


        }else {

            validarData = false;

        }


        if(validarData = false){

            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

            String CaracterTamanho = "Erro";
            return CaracterTamanho;
        }else {

            this.dia = dia;
            this.mes = mes;
            this.ano = ano;

        }


        return null;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }

    public boolean verificaAnoBissexto(){
        if((ano%4) == 0){
            return true;
        } else{
            return false;
        }

    }
}

