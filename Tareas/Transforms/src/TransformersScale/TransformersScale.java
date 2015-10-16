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
import javax.swing.JOptionPane;
import transforms.Transformers;

public class TransformersScale

    extends Transformers {
double theta;
 
  public static void main(String[] args) {

   pideDatos p=new pideDatos();
   p.Frame();

  }

  public void TransformersScale(double angulo){
    Transformers t = new TransformersScale();
    t.Transformesr(angulo);
    Frame f = t.getFrame();

    f.setVisible(true);
 
  }


  public AffineTransform getTransform() {
      
   
     return null;

  }
  
  

}
