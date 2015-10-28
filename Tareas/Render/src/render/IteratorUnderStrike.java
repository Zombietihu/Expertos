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
public class IteratorUnderStrike {

  public static void main(String[] args) {

    Frame f = new ApplicationFrame("IteratorUnderStrike v1.0") {

      public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D)g;

        String s = "\"Click here,\" she said purred. Tonatihu Fabian Silverio";

        

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

            RenderingHints.VALUE_ANTIALIAS_ON);

        Font plainFont = new Font("Times New Roman", Font.PLAIN, 24);

                

        AttributedString as = new AttributedString(s);

        as.addAttribute(TextAttribute.FONT, plainFont);

        as.addAttribute(TextAttribute.INPUT_METHOD_UNDERLINE,
                TextAttribute.UNDERLINE_LOW_TWO_PIXEL, 1, 11);
        //lo que yo hago
        
        as.addAttribute(TextAttribute.POSTURE,TextAttribute.POSTURE_OBLIQUE, 18, 22);
        //termina lo que yo hago

        as.addAttribute(TextAttribute.STRIKETHROUGH,

            TextAttribute.STRIKETHROUGH_ON, 24, 32);
        
        as.addAttribute(TextAttribute.SWAP_COLORS,

            TextAttribute.SWAP_COLORS_ON, 33, 39);

        as.addAttribute(TextAttribute.INPUT_METHOD_UNDERLINE,TextAttribute.UNDERLINE_LOW_DASHED, 40, 45);
        
        g2.drawString(as.getIterator(), 24, 70);

      }

    };

    f.setVisible(true);

  }

}
