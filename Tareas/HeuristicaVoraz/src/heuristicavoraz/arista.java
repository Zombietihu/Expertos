/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heuristicavoraz;

/**
 *
 * @author Tonatihu
 */
import java.util.*;

class arista {
    private int a;
    private int b;
    private int w;
    
    arista(int x, int y, int z){
      a=x;
      b=y;
      w=z;
    }
    
    void print() {
     System.out.println("("+a+","+b+") = "+w);
    }
    
    int getInicial(){
        return a;
    }
    int getFinal(){
        return b;
    }
    public int i_arista() {
        return a;
    }
        
    public int f_arista() {
        return b;
    }    
        
    public int peso() {
        return w;
    }
}
