package transforms;

import java.awt.*;

import java.awt.geom.AffineTransform;

public class TransformersRotation

    extends Transformers {

  public static void main(String[] args) {

    Transformers t = new TransformersRotation();
    
    Frame f = t.getFrame();

    f.setVisible(true);

  }

  

  public AffineTransform getTransform() {

   // return AffineTransform.getRotateInstance((­1)(Math.PI / 6)); //es el angulo que se aplica para la transformacion
      Double theta =(-Math.PI/6);
      AffineTransform a;
        a=AffineTransform.getRotateInstance(theta);
        a=AffineTransform.getTranslateInstance(150, 150);
      return a;
  }

}