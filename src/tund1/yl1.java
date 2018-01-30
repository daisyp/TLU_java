package tund1;
/* kuva kasurealt sisestatud arvude summa
kuva reana sisestatud arvud ykshaaval tsyklina ekraanile
loo yks alamprogramm, mis muudab kasurealt tulnud tekstid arvudeks
loo alamprogramm arvude summa leidmiseks
 */

import java.util.Arrays;

public class yl1 {
    public static int[] arvudeks(String[] tekstid) {
        int[] vastus=new int[tekstid.length];
        for(int i=0; i<tekstid.length; i++){
            vastus[i]=Integer.parseInt(tekstid[i]);
        } return vastus;

    }
    public static int arvudeSumma(int[] a){
        int summa=0;
        for(int arv:a){summa+=arv;}
        return summa;
    }
    public static void main(String[] arg) {
        try{
            int[] arvud=arvudeks(arg);
            System.out.println(arvudeSumma(arvud));

            int summa=0;
            for (int i = 0; i < arg.length; i++) {
                summa += Integer.parseInt(arg[i]);
            }
            System.out.println(summa);
            System.out.println(Arrays.stream(arg).mapToInt(Integer::parseInt).sum());
        } catch (Exception e){
            System.out.println("probleem"+e.getMessage());
        }
    }
    /* public static int summa(int[] massiiv) {
        int sum = 0;
        for (int i = 0; i < massiiv.length; i++) {
            sum += massiiv[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int summa = summa(new int[] {4, 3, 1, 7, -1});
        System.out.println(summa);


    } */

}
