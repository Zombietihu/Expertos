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
public class IteratorTest {

  public static void main(String[] args) {

    Frame f = new ApplicationFrame("IteratorTest v1.0") {

      public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D)g;

        String s = "Tonatihu Fabian";

        Dimension d = getSize();

        

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

            RenderingHints.VALUE_ANTIALIAS_ON);

        Font serifFont = new Font("Quicksand", Font.PLAIN, 48);

        Font sansSerifFont = new Font("Algerian", Font.PLAIN, 48);

                

        AttributedString as = new AttributedString(s);

        as.addAttribute(TextAttribute.FONT, serifFont);

        as.addAttribute(TextAttribute.FONT, sansSerifFont, 8, 15);

        as.addAttribute(TextAttribute.FOREGROUND, Color.gray,8, 15);

        

        g2.drawString(as.getIterator(), 40, 80);

      }

    };

    f.setVisible(true);

  }

}
