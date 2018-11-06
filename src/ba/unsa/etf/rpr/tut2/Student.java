package ba.unsa.etf.rpr.tut2;

public class Student {
    public String ime;
    public String prezime;
    public int brIndexa;
    public int godFaxa;

    public Student(String ime, String prezime, int brIndexa, int godFaxa) {
        this.ime = ime;
        this.prezime=prezime;
        this.brIndexa=brIndexa;
        this.godFaxa=godFaxa;
    }

    public Student() {}

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getGodFaxa() {
        return godFaxa;
    }

    public void setGodFaxa(int godFaxa) {
        this.godFaxa = godFaxa;
    }
}
