package liga;

public class Program {

    public static void main(String[] args) {

        Druzyna a = new Druzyna("A");
        Druzyna b = new Druzyna("B");
        Druzyna c = new Druzyna("C");
        Druzyna d = new Druzyna("D");


        Druzyna[] druzyny = new Druzyna[4];
        druzyny[0] = a;
        druzyny[1] = b;
        druzyny[2] = c;
        druzyny[3] = d;




        System.out.println("ile moge rozegrac meczy = " + Mecz.ileMozliwychMeczy(4));

        Mecz[] rozgrywki = new Mecz[Mecz.ileMozliwychMeczy(4)];

    }
    }


