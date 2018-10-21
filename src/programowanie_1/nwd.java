package programowanie_1;

import java.util.Scanner;

public class nwd {

    public static void main(String[] args){






        int liczba_1 = 42;
        int liczba_2 = 56;
        int wynik;

        wynik = nwd(liczba_1,liczba_2);
        System.out.println("NWD dla liczb: " + liczba_1 + ", " + liczba_2 + " = " + wynik);


        int liczba_3=42;
        int liczba_4=56;
        int wynik2;

        wynik2 = nww(liczba_1,liczba_2);
        System.out.println("NWW dla liczb: " + liczba_3 + ", " + liczba_4 + " = " + wynik2);
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1sza liczbe");
        int liczba5 = scanner.nextInt();
        System.out.println("Podaj 1sza liczbe");
        int liczba6 = scanner.nextInt();
        */
        int liczba5 = 20;
        int liczba6 = 40;

        int wynik3 = nwd(liczba5,liczba6);
        int wynik4 = nww(liczba5,liczba6);

        System.out.println("NWD dla liczb: " + liczba5 + ", " + liczba6 + " = " + wynik3);
        System.out.println("NWW dla liczb: " + liczba5 + ", " + liczba6 + " = " + wynik4);


        int[] tab = new int[3];
        tab[0] =2;
        tab[1] =4;
        tab[2] = 8;


        System.out.println("dl. tablicy" + tab.length);
      //  int wynik5 = nww(tab);

        System.out.println("NWW dla liczb: " + tab[0] + ", " + tab[1] + tab[2] + " = " + wynik4);






    }

    public static int nwd(int a, int b){
        int number_a = a;
        int number_b = b;
        int result  =0;

        if (number_b == 0) {
           result =  number_a;
        }
        else{
            result = nwd(number_b, number_a % number_b);
        }

            return result;
    }

    public static int nww(int a, int b){
        int result = 0;

        result = (a*b/(nwd(a,b)));


        return result;
    }


    public static int nww(int... numbers){
        int result = 0;
        int[] tablica = numbers;
        int[] tabPom = new int[tablica.length-1];


        result = nww(tabPom[0],nww(tabPom));
        for(int i=0; i<tabPom.length;i++){

           tabPom[i]=tablica[i+1];

        }
       // System.out.println("tabPom"+tabPom[0]);
       // result = nww(tabPom[0],nww(tabPom));






        return result;




    }

}
