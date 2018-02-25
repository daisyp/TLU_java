package tund3;
import javax.imageio.ImageIO;
import java.awt.image.*;
import java.awt.*;
import java.net.*;
import java.io.*;

public class joonis2 {
    public static void main(String[] arg) throws Exception{
        BufferedImage bi= new BufferedImage(400,300,BufferedImage.TYPE_INT_RGB);
        Graphics g=bi.createGraphics();
        g.setColor(Color.white);
        g.fillRect(0,0,400,300);
        String aadress="http://www.tlu.ee/~jaagup/veeb1/loomad.txt";
        BufferedReader br=new BufferedReader(new InputStreamReader(new URL(aadress).openStream()));
        String rida=br.readLine();
        rida=br.readLine();
        while (rida!=null){
            String[] m=rida.split(",");
            if(m[0].equals("kass")){g.setColor(Color.gray);}
            else {g.setColor(Color.red);}
            g.fillRect(Integer.parseInt(m[1])/30, 300-Integer.parseInt(m[2])*2,5,5);
            rida=br.readLine();
        }

        String[] m=rida.split(" ");
        g.fillRect(Integer.parseInt(m[1]),Integer.parseInt(m[2]),5,5);
        rida=br.readLine();
        ImageIO.write(bi,"png",new File("loomad.png"));

    }
}
