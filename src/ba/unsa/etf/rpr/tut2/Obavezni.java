package ba.unsa.etf.rpr.tut2;

public class Obavezni {
    public String nazivObaveznogPredmeta;
    public int ECTS;

    public Obavezni() {}

    public Obavezni(String nazivObaveznogPredmeta, int ECTS) {
        this.nazivObaveznogPredmeta = nazivObaveznogPredmeta;
        this.ECTS = ECTS;
    }

    public String getNazivObaveznogPredmeta() {
        return nazivObaveznogPredmeta;
    }

    public void setNazivObaveznogPredmeta(String nazivObaveznogPredmeta) {
        this.nazivObaveznogPredmeta = nazivObaveznogPredmeta;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }
}
