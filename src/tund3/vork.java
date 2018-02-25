package tund3;
import java.net.*;
import java.io.*;

public class vork {
    public static void main(String[] arg)throws Exception{
        String aadress="http://www.tlu.ee/~jaagup/veeb1/pikkused.txt";
        BufferedReader br=new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
        String rida=br.readLine();
        int lineNumber = 0;
        int summa = 0;
        while(rida!=null){
            //trykkige arvude ette reanumbrid
            System.out.println(++lineNumber + ". " + rida);
            summa+=Integer.parseInt(rida);

            rida=br.readLine();
        }
        //kuvage arvude summa ja aritmeetiline keskmine
        System.out.println(summa+" "+summa*1.0/lineNumber);
        br.close();
    }

}
