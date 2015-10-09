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
public class Grafo {
     private int a;
    private int b;
    private int w;
    
    Grafo(int x, int y, int z){
      a=x;
      b=y;
      w=z;
    }
    
    void print() {
     System.out.println("("+a+","+b+") = "+w);
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
