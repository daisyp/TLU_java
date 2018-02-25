package tund3;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

public class joonis1 {
    public static void main(String[] arg) throws Exception{
        /*pildi joonistamiseks m2lukohad*/
        BufferedImage bi= new BufferedImage(400,300,BufferedImage.TYPE_INT_RGB);
        Graphics g=bi.createGraphics();
        g.setColor(Color.yellow);
        g.fillRect(0,0,400,300);
        g.setColor(Color.blue);
        g.fillRect(10,20,30,40);
        g.drawLine(50, 20, 50, 280);
        g.drawOval(100, 50, 60, 40);
        g.drawString("hello",110,70);
        ImageIO.write(bi, "png",new File("pilt1.png"));

    }
}
