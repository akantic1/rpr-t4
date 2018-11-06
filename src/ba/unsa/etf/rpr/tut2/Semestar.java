package ba.unsa.etf.rpr.tut2;

import java.util.ArrayList;

public class Semestar {
    public int semestar;
    public int ukupniECTS;
    public ArrayList<Predmet> predmeti;

    public Semestar(int semestar, int ukupniECTS) {
        this.semestar = semestar;
        this.ukupniECTS=ukupniECTS;
    }

    public int getUkupniECTS() {
        return ukupniECTS;
    }

    public void setUkupniECTS(int ukupniECTS) {
        this.ukupniECTS = ukupniECTS;
    }

    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }
}
