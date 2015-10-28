/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package render;

import java.awt.*;

import java.awt.geom.Line2D;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 *
 * @author Tonatihu
 */
public class TexturedText {

  public static void main(String[] args) {

    Frame f = new ApplicationFrame("TexturedText v1.0") {

      public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D)g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

            RenderingHints.VALUE_ANTIALIAS_ON);

        Font font = new Font("Times New Roman", Font.PLAIN, 72);

        g2.setFont(font);

        

        String s = "Tonatihu is a Star";

        Dimension d = getSize();

        float x = 20, y = 100; //coordenadas donde se ubucara nuestro texto

        

        BufferedImage bi = null;  
          try {
              bi = getTextureImage(); //convertimos nuestra textura a una imagen del buffer para poder manipularla
          } catch (IOException ex) {
              Logger.getLogger(TexturedText.class.getName()).log(Level.SEVERE, null, ex);
          }

        Rectangle r = new Rectangle(0, 0, bi.getWidth(), bi.getHeight());

        TexturePaint tp = new TexturePaint(bi, r);  //preparamos la textura

        g2.setPaint(tp);

        

        g2.drawString(s, x, y); //dibujamos nuestro texto en las coordenadas que decidimos

      }

      

      private BufferedImage getTextureImage() throws IOException {

        // creamos la imagen test.
          
        int size = 8;
        BufferedImage b12 = ImageIO.read(new File("C:\\Users\\Tonatihu\\Pictures\\star.png"));/*
        BufferedImage bi = new BufferedImage(size, size,

            BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2 = bi.createGraphics();

        g2.setPaint(Color.red);

        g2.fillRect(0, 0, size / 2, size / 2);

        g2.setPaint(Color.yellow);

        g2.fillRect(size / 2, 0, size, size / 2);

        g2.setPaint(Color.green);

        g2.fillRect(0, size / 2, size / 2, size);

        g2.setPaint(Color.blue);

        g2.fillRect(size / 2, size / 2, size, size);*/

        return b12;

      }

    };

    f.setVisible(true);
    f.setBackground(Color.yellow);

  }

}
