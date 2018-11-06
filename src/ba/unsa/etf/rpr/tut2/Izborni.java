package ba.unsa.etf.rpr.tut2;

public class Izborni {
    public String nazivIzbornogPredmeta;
    public int ECTS;

    public Izborni() {}

    public Izborni(String nazivIzbornogPredmeta, int ECTS) {
        this.nazivIzbornogPredmeta = nazivIzbornogPredmeta;
        this.ECTS=ECTS;
    }

    public String getNazivIzbornogPredmeta() {
        return nazivIzbornogPredmeta;
    }

    public void setNazivIzbornogPredmeta(String nazivIzbornogPredmeta) {
        this.nazivIzbornogPredmeta = nazivIzbornogPredmeta;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }
    String Ispisi(){
        return nazivIzbornogPredmeta;
    }
}
