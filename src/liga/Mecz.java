package liga;

public class Mecz {
    private Druzyna gospodarz;
    private Druzyna goscie;

    public Mecz(Druzyna gospodarz, Druzyna goscie){
        this.gospodarz = gospodarz;
        this.goscie = goscie;
    }

    public Druzyna getGoscie() {
        return goscie;
    }

    public Druzyna getGospodarz() {
        return gospodarz;
    }

    public void setGoscie(Druzyna goscie) {
        this.goscie = goscie;
    }

    public void setGospodarz(Druzyna gospodarz) {
        this.gospodarz = gospodarz;
    }

    @Override
    public String toString(){
      return this.gospodarz + " - " + this.goscie;
    }

    public static int ileMozliwychMeczy(int iloscDruzyn){
        int wynik = 0;
                wynik =((silnia(iloscDruzyn)/(silnia(2)*(silnia(iloscDruzyn-2))))-2)*2;
                return wynik;
    }

    public static int silnia(int x) {
        int wynik = 1;

        if (x == 0) {
            wynik = 1;
        } else if (wynik > 0) {
            wynik = 1;
            for (int i = 1; i <= x; i++) {
                wynik = wynik * i;
            }
        }
        return wynik;
    }

    public static Mecz[] zorganizujMecze(Druzyna[] druzyny){
        int ileMeczyuSiebie = ileMozliwychMeczy(druzyny.length)/2;
        Mecz[] gry =new Mecz[ileMozliwychMeczy(druzyny.length)];
        Mecz[] tempTable = new Mecz[ileMeczyuSiebie];

        for (int i=0; i<tempTable.length;i++){

        }



        return gry;
    }
}
