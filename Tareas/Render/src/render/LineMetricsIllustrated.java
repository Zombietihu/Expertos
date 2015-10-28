/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package render;

import java.awt.*;

import java.awt.font.FontRenderContext;

import java.awt.font.LineMetrics;

import java.awt.geom.Line2D;
/**
 *
 * @author Tonatihu
 */
public class LineMetricsIllustrated {

  public static void main(String[] args) {

    Frame frame = new ApplicationFrame("LineMetricsIllustrated v1.0") {

      public void paint(Graphics g) {

        Graphics2D g2 = (Graphics2D)g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,

            RenderingHints.VALUE_ANTIALIAS_ON);

        Font font = new Font("Algerian", Font.PLAIN, 72);

        g2.setFont(font);

        

        String s = "Tonatihu";

        float x = 50, y = 150;

        

        // Dibuja la  baseline.

        FontRenderContext frc = g2.getFontRenderContext();

        float width = (float)font.getStringBounds(s, frc).getWidth();

        Line2D baseline = new Line2D.Float(x, y, x + width, y);

        g2.setPaint(Color.lightGray);

        g2.draw(baseline);

        

        // Dibuja la ascent.

        LineMetrics lm = font.getLineMetrics(s, frc);

        Line2D ascent = new Line2D.Float(x, y - lm.getAscent(),

            x + width, y - lm.getAscent());

        g2.draw(ascent);

        

        // Dibuja descent

        Line2D descent = new Line2D.Float(x, y + lm.getDescent(),

            x + width, y + lm.getDescent());

        g2.draw(descent);

        

        // DDibuja  leading.

        Line2D leading = new Line2D.Float(

            x, y + lm.getDescent() + lm.getLeading(),

            x + width, y + lm.getDescent() + lm.getLeading());

        g2.draw(leading);

        

        // Renderizado del string

        g2.setPaint(Color.black);

        g2.drawString(s, x, y);

      }

    };

    frame.setVisible(true);

  }

}