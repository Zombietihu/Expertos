/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heuristicavoraz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Tonatihu
 */

public class Interface extends JFrame{
     private JButton jButton1 = new JButton();
    NodosPrincipal n ;
    //lo que voy agregando
    ArrayList grafo = new ArrayList();
    voraz v = new voraz();
    
    public Interface(){
         try {
            init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void init(){
        grafo = inicializar();
        System.out.println("El peso es: "+grafo.size());
        n = new NodosPrincipal();
        n.setArrayList(grafo);
        n.pintarEtiquetas();
        n.repaint();
        getContentPane().setLayout( null );
        setSize(new Dimension(1024, 772));
        setVisible(true);
        this.repaint();
        n.setVisible(true);
        this.add(n);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Logica Voraz 2");
        v.voraz(grafo);
        n.Obtenercamino(v.getCilcos());
       // n.repaint();//agrege esto
        jButton1.setText("Iniciar");
        jButton1.setIcon(null);
        jButton1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
        jButton1.setBounds(new Rectangle(455, 45, 75, 30));
        getContentPane().add(jButton1, null);
    }
    
    private static ArrayList inicializar(){
     System.out.print("Si inicializo");
    Random rnd = new Random();
    ArrayList g = new ArrayList();
    g.add(new arista(1,2,rnd.nextInt(80)+10));
    g.add(new arista(1,3,rnd.nextInt(80)+10));
    g.add(new arista(1,4,rnd.nextInt(80)+10));
    g.add(new arista(1,5,rnd.nextInt(80)+10));
    g.add(new arista(1,6,rnd.nextInt(80)+10));
    g.add(new arista(1,7,rnd.nextInt(80)+10));
    g.add(new arista(1,8,rnd.nextInt(80)+10));
    g.add(new arista(1,9,rnd.nextInt(80)+10));
    g.add(new arista(1,10,rnd.nextInt(80)+10));
    g.add(new arista(2,3,rnd.nextInt(80)+10));
    g.add(new arista(2,4,rnd.nextInt(80)+10));
    g.add(new arista(2,5,rnd.nextInt(80)+10));
    g.add(new arista(2,6,rnd.nextInt(80)+10));
    g.add(new arista(2,7,rnd.nextInt(80)+10));
    g.add(new arista(2,8,rnd.nextInt(80)+10));
    g.add(new arista(2,9,rnd.nextInt(80)+10));
    g.add(new arista(2,10,rnd.nextInt(80)+10));
    g.add(new arista(3,4,rnd.nextInt(80)+10));
    g.add(new arista(3,5,rnd.nextInt(80)+10));
    g.add(new arista(3,6,rnd.nextInt(80)+10)); 
    g.add(new arista(3,7,rnd.nextInt(80)+10)); 
    g.add(new arista(3,8,rnd.nextInt(80)+10)); 
    g.add(new arista(3,9,rnd.nextInt(80)+10)); 
    g.add(new arista(3,10,rnd.nextInt(80)+10));  
    g.add(new arista(4,5,rnd.nextInt(80)+10));
    g.add(new arista(4,6,rnd.nextInt(80)+10));
    g.add(new arista(4,7,rnd.nextInt(80)+10));
    g.add(new arista(4,8,rnd.nextInt(80)+10));
    g.add(new arista(4,9,rnd.nextInt(80)+10));
    g.add(new arista(4,10,rnd.nextInt(80)+10));
    g.add(new arista(5,6,rnd.nextInt(80)+10));
    g.add(new arista(5,7,rnd.nextInt(80)+10));
    g.add(new arista(5,8,rnd.nextInt(80)+10));
    g.add(new arista(5,9,rnd.nextInt(80)+10));
    g.add(new arista(5,10,rnd.nextInt(80)+10));
    g.add(new arista(6,7,rnd.nextInt(80)+10));
    g.add(new arista(6,8,rnd.nextInt(80)+10));
    g.add(new arista(6,9,rnd.nextInt(80)+10));
    g.add(new arista(6,10,rnd.nextInt(80)+10));
    g.add(new arista(7,8,rnd.nextInt(80)+10));
    g.add(new arista(7,9,rnd.nextInt(80)+10));
    g.add(new arista(7,10,rnd.nextInt(80)+10));
    g.add(new arista(8,9,rnd.nextInt(80)+10));
    g.add(new arista(8,10,rnd.nextInt(80)+10));
    g.add(new arista(9,10,rnd.nextInt(80)+10));
    return(g);      
  } 
}
