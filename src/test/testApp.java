package test;

public class testApp {

    public static void main(String[] args){

        String[] table = new String[4];
        table[0] = "A";
        table[1] = "B";
        table[2] = "C";
        table[3] = "A";
        System.out.println(table[0]);
        for(int i =0; i<table.length;i++){
           // System.out.println(i);
           for(int n=table.length-1; n>=0;n--){
              // System.out.println(n);
               if(table[i]!=table[n]){
                   System.out.println(table[i] + "--" + table[n]) ;
               }
           }

        }


        System.out.println("test");
    }
}
