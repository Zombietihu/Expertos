/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package render;
import java.awt.*;

import java.awt.font.TextAttribute;

import java.text.*;
/**
 *
 * @author Tonatihu
 */
public class SimpleText {

  public static void main(String[] args) {

    Frame f = new ApplicationFrame("SimpleText v1.0") {

      public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.blue);

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, //Establecemos las propiedades de renderizado

            RenderingHints.VALUE_ANTIALIAS_OFF);

        Font font = new Font("Serif", Font.PLAIN, 96); //Preparamos el tipo de fuente que utilizaremos

        g2.setFont(font); //Actualizamos la fuente

        g2.drawString("Tonatihu", 120, 120); //Dibujamos el String en las coordenadas

      }

    };

    f.setVisible(true);

  }

}
