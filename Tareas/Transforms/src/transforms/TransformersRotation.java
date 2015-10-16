package transforms;

import java.awt.*;

import java.awt.geom.AffineTransform;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TransformersRotation

    extends Transformers {

    double theta = 0;
    JPanel panel;
  public static void main(String[] args) {
    
    Transformers t = new TransformersRotation();
    Frame f = t.getFrame();
    f.setVisible(true);

  }
  
  public void init(){}

  

  public AffineTransform getTransform() {

   // return AffineTransform.getRotateInstance((­1)(Math.PI / 6)); //es el angulo que se aplica para la transformacion
      JOptionPane.showMessageDialog(null,"Hola");
      AffineTransform a = new AffineTransform() ;
      a.setToRotation(theta);
      a.scale(2, 2);
      return a;
  }

}