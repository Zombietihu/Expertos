/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransformersScale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Tonatihu
 */
public class pideDatos extends JFrame{
    JPanel pane;
    JTextArea theta;
    JButton empezar;
      public void Frame(){
        init();
        setTitle("Escalacion");
        setSize(760,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(pane);
    }
       public void init(){
        pane = new JPanel();
        pane.setLayout(null);
        theta = new JTextArea();
        theta.setBounds(50,100,100,20);
        empezar = new JButton("Empezar");
        empezar.setBounds(200,100,100,20);
        empezar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              //Aqui iniciaremos los hilos
                TransformersScale tS = new TransformersScale();
                double t = Integer.parseInt(theta.getText());
                tS.TransformersScale(t);
            }
        });
        pane.add(theta);
        pane.add(empezar);
       }
       
       
}
