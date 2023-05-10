public class Bijuteria {

    private double metaVendas;

    public Bijuteria(double metaVendas) {
        this.metaVendas = metaVendas;
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
