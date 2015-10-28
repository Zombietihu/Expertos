/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package render;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Tonatihu
 */
public class Render {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Frame frame = new ApplicationFrame("HorizontallyCenteredText v1.0") {

      public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        //para 1
        Rectangle2D g1 = new Rectangle2D.Double(50, 50, 200, 50);
        Rectangle2D g3 = new Rectangle2D.Double(50, 150, 200, 50);
        //para2
        Rectangle2D g4 = new Rectangle2D.Double(300, 50, 200, 50);
        Rectangle2D g5 = new Rectangle2D.Double(300, 150, 200, 50);
        //pinta 1
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.red);
        g2.draw(g1);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);
        g2.draw(g3);
        //pinta 2
        g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING,RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2.setColor(Color.blue);
        g2.draw(g4);
        g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING,RenderingHints.VALUE_COLOR_RENDER_SPEED);
        g2.draw(g5);

      }

    };

    frame.setVisible(true);

  }
    
}
