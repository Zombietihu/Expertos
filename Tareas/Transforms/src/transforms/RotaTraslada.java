/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transforms;

import java.awt.Frame;
import java.awt.geom.AffineTransform;

/**
 *
 * @author Tonatihu
 */
public class RotaTraslada extends Transforms{
    
    public static void main(String[] args) {

    Transformers t = new TransformersRotation();
    
    Frame f = t.getFrame();

    f.setVisible(true);

  }

  

  public AffineTransform getTransform() {

   // return AffineTransform.getRotateInstance((­1)(Math.PI / 6)); //es el angulo que se aplica para la transformacion
      Double theta =(-Math.PI/6);
    return AffineTransform.getRotateInstance(theta);
  }
  
  public setRotation(){
  }
    
    
}
