public class Alimentacao {

    private Data dataAlvara;

    public Alimentacao(Data dataAlvara){
        this.dataAlvara = dataAlvara;
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
