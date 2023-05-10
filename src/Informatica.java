public class Informatica {

    private double seguroEletronicos;

    public Informatica(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    //get

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }


    //set

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica{" +
                "seguroEletronicos=" + seguroEletronicos +
                '}';
    }
}
