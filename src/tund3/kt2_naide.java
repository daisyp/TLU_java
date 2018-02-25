package tund3;
/* Kuva sisestatud arvude suurim, v2him ja aritm.keskmine.
arvud tulevad veebis olevast failist ntks http://www.tlu.ee/~jaagup/veeb1/pikkused.txt
koosta alamprogramm, mis v2ljastaks etteantud aadressilt loetud arvude standardh2lbe
https://et.wikipedia.org/wiki/Standardh%C3%A4lve
kuva arvud kriipsudena joonisel. naita joonisel samuti v2lja aritmeetiise keskmise asukoht ning sealt yhe ja kahe standardh2lbe kaugusel olevad vahemikud
 */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class kt2_naide {
        public static void main(String[] arg)throws Exception{
            drawStuff();
        }
        public static double calculateStuff () throws IOException {
            String aadress="http://www.tlu.ee/~jaagup/veeb1/pikkused.txt";
            BufferedReader br=new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
            String rida=br.readLine();
            int lineNumber = 0;
            int summa = 0;
            int suurim = 0;
            int v2him = 999999;
            while(rida!=null){
                System.out.println(++lineNumber + ". " + rida);
                summa+=Integer.parseInt(rida);
                int number = Integer.parseInt(rida);
                if (number<v2him) {
                    v2him = number;
                } else if (number>suurim){
                    suurim = number;
                }
                rida=br.readLine();
            }
            double keskmine = summa*1.0/lineNumber;
            System.out.println(summa+" "+summa*1.0/lineNumber);
            System.out.println("suurim " + suurim);
            System.out.println("vähim " + v2him);
            br.close();
            System.out.println("esimene programm lõppeb");
            calculateH2lve(keskmine);
            return keskmine;
        }

        public static double calculateH2lve (double keskmine) throws IOException{
            String aadress="http://www.tlu.ee/~jaagup/veeb1/pikkused.txt";
            BufferedReader br=new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
            String rida=br.readLine();
            double vastus1 = 0;
            int lineNumber = 0;
            while(rida!=null){
                int number = Integer.parseInt(rida);
                vastus1 += (number - keskmine)*(number - keskmine);
                rida=br.readLine();
                ++lineNumber;
            }
            System.out.println(vastus1);
            double vastus3 = Math.sqrt(vastus1/=lineNumber);
            System.out.println(vastus3);
            return vastus3;
        }

        public static double drawStuff () throws IOException {
            BufferedImage bi=new BufferedImage(400,300, BufferedImage.TYPE_INT_RGB);
            Graphics g = bi.createGraphics();

            g.setColor(Color.WHITE);
            g.fillRect(0,0,400,300);

            String aadress="http://www.tlu.ee/~jaagup/veeb1/pikkused.txt";
            BufferedReader br=new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
            String rida=br.readLine();
            int number1 = 10;
            int number3 = 40;
            int EsimeneNumber = Integer.parseInt(rida);

            while(rida!=null){
                g.setColor(Color.BLACK);
                rida=br.readLine();
                int number2 = Integer.parseInt(rida);
                g.drawLine(number1,EsimeneNumber,number3,number2);
                number1 += 30;
                number3 += 30;
                EsimeneNumber = number2;
                rida=br.readLine();
            }

            g.fillRect();

            ImageIO.write(bi,"jpg",new File("pilt21.jpg"));

            return 0;
        }
}
