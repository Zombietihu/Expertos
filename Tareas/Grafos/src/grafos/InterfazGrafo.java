/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.netbeans.api.visual.graph.GraphScene;

/**
 *
 * @author Tonatihu
 */
public class InterfazGrafo extends JFrame {
   JPanel pane;
    public InterfazGrafo(){
        init();
        setSize(500,600);
        setVisible(true);
        add(pane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void init(){
        pane  = new JPanel();
        pane.setLayout(null);
    }
    
    public void paint(Graphics g){
        Graphics2D nodo = (Graphics2D)g;
        //nodo1
        nodo.fillOval(50, 100, 20, 20);
        //nodo2
        nodo.fillOval(100, 50, 20, 20);
        //nodo3
        nodo.fillOval(150, 50, 20, 20);
        //nodo4
        nodo.fillOval(200, 80, 20, 20);
        //nodo5
        nodo.fillOval(230, 130, 20, 20);
        //nodp6
        nodo.fillOval(250, 200, 20, 20);
        //nodo7
        nodo.fillOval(250, 250, 20, 20);
        //nodo8
        nodo.fillOval(200, 250, 20, 20);
        //nodo9
        nodo.fillOval(100, 200, 20, 20);
        //nodo10
        nodo.fillOval(50, 150, 20, 20);
    }
}
