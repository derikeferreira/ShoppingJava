import java.text.SimpleDateFormat;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){

       //else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30 ) { nao pode passar de 30 dias

        boolean validarData = true;

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (ano<1){
            validarData = false;
        } else if (dia > 31 || dia < 1) {
            validarData = false;
        } else if (mes == 2 && dia > 28) {
            if (dia == 29 && verificaAnoBissexto()){
                //faz nada
            } else {
                validarData = false;
            }
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            validarData = false;
        }

        if (validarData){
            //faz nada
        } else {
            System.out.println("ERRO, data alterada para 1/1/2000!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2020;
        }


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


    @Override
    public String toString() {


        return "Data{" +
                dia + "/" + mes + "/" + ano +
                '}';

    }

    public boolean verificaAnoBissexto(){
        boolean verificaAno = true;

        if((ano % 4) != 0){

            verificaAno = false;

        }

        return verificaAno;
    }
}

