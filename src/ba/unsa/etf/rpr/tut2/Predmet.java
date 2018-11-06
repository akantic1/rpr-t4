package ba.unsa.etf.rpr.tut2;

import java.util.ArrayList;

public class Predmet {
    public String nazivPredmeta;
    public ArrayList<Student> student;

    public Predmet() {}

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }
    String Ispisi(){
        return nazivPredmeta;
    }
}
