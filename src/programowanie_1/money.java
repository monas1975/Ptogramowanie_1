package programowanie_1;

abstract class money {




    public static void howMuchCatch(double amount){
        int amountOf200 = 0;
        int amountOf100 = 0;
        int amountOf50 =0;
        int amountOf20 = 0;
        int amountOf10 = 0;
        int amountOf5 = 0;
        int amountOf2 = 0;
        int amountOf1 = 0;
        int amountOf50gr = 0;
        int amountOf20gr =0;
        int amountOf10gr = 0;
        int amountOf5gr = 0;
        int amountOf2gr = 0;
        int amountOf1gr = 0;

        // how much 200zl
        double temp1 =  amount / 200.0;
        amountOf200 = (int) Math.floor(temp1);



        // calculate how much left
         double temp2 = amount - (amountOf200*200.0);
        //System.out.println("temp2 = " + temp2);
        //System.out.println("200zl = " + amountOf200);

         //how much 100zl
         amountOf100 = (int) Math.floor(temp2/100.0);


        // calculate how much left
        double temp3 = temp2 - (amountOf100*100.0);
        //System.out.println("temp3 = " + temp3);
        //System.out.println("100zl = " + amountOf100);

       //how much  50zl
        amountOf50 = (int) Math.floor(temp3/50.0);

        // calculate how much left
        double temp4 = temp3 - (amountOf50*50.0);
        //System.out.println("temp4 = " + temp4);
        //System.out.println("50zl = " + amountOf50);

        //how much  20zl
        amountOf20 = (int) Math.floor(temp4/20.0);

        // calculate how much left
        double temp5 = temp4 - (amountOf20*20.0);
       // System.out.println("temp5 = " + temp5);
        //System.out.println("20zl = " + amountOf20);

        //how much  10zl
        amountOf10 = (int) Math.floor(temp4/10.0);

        // calculate how much left
        double temp6 = temp5 - (amountOf10*10.0);

        //how much  5zl
        amountOf5 = (int) Math.floor(temp6/5.0);
        // calculate how much left
        double temp7 = temp6 - (amountOf5*5.0);

        //how much  1zl
        amountOf1 = (int) Math.floor(temp7/5.0);
        // calculate how much left
        double temp8 = temp7 - (amountOf1*1.0);

        //how much  50gr
        amountOf50gr = (int) Math.floor(temp8/0.5);
        // calculate how much left
        double temp9 = temp8 - (amountOf50gr*0.50);

        //how much  20gr
        amountOf20gr = (int) Math.floor(temp9/0.2);
        // calculate how much left
        double temp10 = temp9 - (amountOf20gr*0.2);

        //how much  10gr
        amountOf10gr = (int) Math.floor(temp10/0.1);

        // calculate how much left
        double temp11 = temp10 - (amountOf10gr*0.1);

        //how much  5gr
        amountOf5gr = (int) Math.floor(temp11/0.05);

        // calculate how much left
        double temp12 = temp11 - (amountOf5gr*0.05);

        //how much  2gr
        amountOf2gr = (int) Math.floor(temp12/0.02);
        double temp13 = temp12 - (amountOf2gr*0.02);
        System.out.println("temp13 = " + temp13);
        System.out.println("2gr = " + amountOf2gr);

        //how much  1gr
        amountOf1gr = (int) Math.floor(temp13/0.01);
        double temp14 = temp13 - (amountOf1gr*0.01);
        System.out.println("temp14 = " + temp14);
        System.out.println("1gr = " + amountOf1gr);

        if (amountOf200 !=0) {System.out.println("200zł-   " + amountOf200);}
        if (amountOf100 !=0) {System.out.println("100zł-   " + amountOf100);}
        if (amountOf50 !=0) {System.out.println("50zł-   " + amountOf50);}
        if (amountOf20 !=0) System.out.println("20zł-   " + amountOf20);
        if (amountOf10 !=0) System.out.println("10zł-   " + amountOf10);
        if (amountOf5 !=0) System.out.println("5zł-   " + amountOf5);
        if (amountOf2 !=0) System.out.println("2zł-   " + amountOf2);
        if (amountOf1 !=0)System.out.println("1zł-   " + amountOf1);
        if (amountOf50gr !=0) System.out.println("50gr-   " + amountOf50gr);
        if (amountOf20gr !=0) System.out.println("20gr-   " + amountOf20gr);
        if (amountOf10gr !=0) System.out.println("10gr-   " + amountOf10gr);
        if (amountOf5gr !=0) System.out.println("5gr-   " + amountOf5gr);
        if (amountOf2gr !=0) System.out.println("2gr-   " + amountOf2gr);
        if (amountOf1gr !=0) System.out.println("1gr-   " + amountOf1gr);



    }

}
