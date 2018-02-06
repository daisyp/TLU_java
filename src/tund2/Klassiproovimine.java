package tund2;

public class Klassiproovimine {
    public static void main(String[] args){
        Plastiliin tykk1=new Plastiliin(10);
        Plastiliin tykk2=new Plastiliin(15);
        Plastiliin tykk3=tykk2.eralda(4);
        System.out.println(tykk1);
        System.out.println(tykk2);
        System.out.println("esimese tyki mass "+tykk1.masskg()+" kilogrammi");
        System.out.println("kahe tyki massi summa kg "+(tykk1.masskg()+tykk2.masskg()));
        System.out.println(tykk1.mass(Massiyhik.KILOGRAMM));
        System.out.println(tykk1.mass(null));
        tykk1.yhenda(tykk2);
        System.out.println("Tykkide massid: "+tykk1.mass(Massiyhik.GRAMM)+ " ja "+tykk2.mass(Massiyhik.GRAMM)+ " grammi.");
        System.out.println(tykk1+" "+tykk2+" "+tykk3+" .");
    }


}
