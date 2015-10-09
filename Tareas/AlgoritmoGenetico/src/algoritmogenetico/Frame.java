/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Tonatihu
 */
public class Frame extends JFrame{
    //Panel
    JPanel pane;
    //Texto de area para mostrar procedimiento
    JTextArea genX;
    JTextArea genY;
    //Botones para empezar y nuevo
    JButton empezar;
    JButton nuevo;
    //Mostrar nombres de procesos
    JLabel funcion;
    JLabel procesoX;
    JLabel procesoY;
    JLabel selecciona;
    //Seleccionar las generaciones
    JComboBox generaciones;
    
    public Frame(){
        init();
        setTitle("Algoritmo Genético");
        setSize(760,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(pane);
    }
    public void init(){
        pane = new JPanel();
        pane.setLayout(null);
        //se crea funcion
        funcion = new JLabel("f(x,y)=x^2+y^3  1<=x<=32 1<=y<=32");
        funcion.setBounds(300,20,300,20);
        //se agregan los JTextArea
        genX = new JTextArea();
        genX.setBounds(20,80,250,200);
        genX.setEnabled(false);
        genY = new JTextArea();
        genY.setBounds(400,80,250,200);
        genY.setEnabled(false);
        //Se agregan las etiquetas
        procesoX = new JLabel("Evolucion X");
        procesoX.setBounds(100,60,100,20);
        procesoY = new JLabel("Evolucion Y");
        procesoY.setBounds(460,60,100,20);
        selecciona = new JLabel("Selecciona Las generaciones");
        selecciona.setBounds(200,320,200,20);
        //se agraga combo
        generaciones = new JComboBox();
        generaciones.setBounds(400,320,100,20);
        for(int i=1;i<11;i++)
            generaciones.addItem(i);
        //se agregan los botones
        empezar = new JButton("Empezar");
        empezar.setBounds(550,320,100,20);
        empezar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              //Aqui iniciaremos los hilos
            }
        });
        nuevo = new JButton();
        //Se agragan al panel
        pane.add(empezar);
        pane.add(funcion);
        pane.add(generaciones);
        pane.add(genX);
        pane.add(genY);
        pane.add(nuevo);
        pane.add(procesoX);
        pane.add(procesoY);
        pane.add(selecciona);
    }
}
