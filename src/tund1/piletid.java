package tund1;

import java.util.Arrays;

public class piletid {
    public static String piletityyp(int vanus) {
        if(vanus<7){return "TASUTA";}
        if(vanus<9 || vanus>65) {return "sooduspilet";}
        // lisada sooduspilet
        return "osta pilet";
    }
    public static String[] piletityybid(int[] vanused){
        String[] vastused=new String[vanused.length];
        for(int i=0; i<vanused.length; i++) {
            vastused[i]=piletityyp(vanused[i]);
        }
        return vastused;
    }
    public static void main(String[] args) {
        System.out.println(piletityyp(8));
        int[] vanused= new int[3];
        vanused[0]=75;
        vanused[1]=5;
        vanused[2]=40;
        System.out.println(vanused[2]);
        System.out.println(Arrays.toString(vanused));
    }
}
