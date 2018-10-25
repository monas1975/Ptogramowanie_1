package liga;

public class Druzyna {
    private String nazwa;
    private String miasto;
    private String trener;

    public Druzyna(String nazwa){
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getTrener() {
        return trener;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public void setTrener(String trener) {
        this.trener = trener;
    }

    @Override
    public String toString() {
        return this.nazwa;
    }
}
