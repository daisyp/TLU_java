package tund2;

import java.util.Arrays;

public class Proov2 {
    public static void main(String[] arg){
        Plastiliin[] karp=new Plastiliin[4];
        karp[0]=new Plastiliin(5);
        karp[1]=new Plastiliin(5);
        karp[2]=new Plastiliin(5);
        karp[3]=karp[2].eralda(3);
        for(int i=0; i<karp.length; i++){
            System.out.println(karp[i]);
        }
        //kuva karbis olevate plastiliinide masside summa
        double summa = 0;
        for(int i=0; i<karp.length; i++){
            System.out.println(karp[i]);
            summa+=karp[i].mass(Massiyhik.GRAMM);
        }
        System.out.println(summa);
        summa = 0;
        for(Plastiliin tykk: karp){summa+=tykk.massgr;}
        //kuvab andmevooguna masside summa
        System.out.println(java.util.Arrays.stream(karp).mapToDouble((tykk)->tykk.mass(Massiyhik.GRAMM)).sum());
    }
}
