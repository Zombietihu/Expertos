/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransformersScale;

/**
 *
 * @author Tonatihu
 */
import java.awt.*;

import java.awt.geom.AffineTransform;



public class TransformersScale extends Transformers {

  /*public static void main(String[] args) {

    Transformers t = new TransformersScale();

    Frame f = t.getFrame();

    f.setVisible(true);

  }*/
    static String x;
    static String y;
    static String theta;

  public void TransformersScale(String x, String y, String theta){
      this.x = x;
      this.y = y;
      this.theta = theta;
    Transformers t = new TransformersScale();

    Frame f = t.getFrame();

    f.setVisible(true);
  }

  public AffineTransform getTransform() {
    AffineTransform p = new AffineTransform();
    p.rotate(Integer.parseInt(theta));
    p.scale(Integer.parseInt(x),Integer.parseInt(y));
    return p;

  }

}