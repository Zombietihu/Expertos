/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico;

import javax.swing.JOptionPane;

/**
 *
 * @author Tonatihu
 */
public class Total {
    static int x;
    static int y;
    
    public void imprime(){
        JOptionPane.showMessageDialog(null, "Maximización Total: " +((Math.pow(getX(),2))+(Math.pow(getY(),3))));
    }
        
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
