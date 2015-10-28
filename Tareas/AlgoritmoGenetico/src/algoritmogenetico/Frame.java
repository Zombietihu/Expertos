/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Tonatihu
 */
public class Frame extends JFrame{
    //Panel
    JPanel pane;
    //Texto de area para mostrar procedimiento
    JTextArea  genX = new JTextArea();
    JTextArea genY = new JTextArea();;
    //Botones para empezar y nuevo
    JButton empezar;
    JButton nuevo;
    //Mostrar nombres de procesos
    JLabel funcion;
    JLabel procesoX;
    JLabel procesoY;
    JLabel selecciona;
    JLabel pesoX;
    JLabel PesoX;
    JLabel pesoY;
    JLabel PesoY;
    JLabel total;
    JLabel t;
    //Seleccionar las generaciones
    JComboBox generaciones;
    //Strings
    String cadena;
    Total tot = new Total();
    public void Frame(){
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
        funcion = new JLabel("f(x,y)=x^2+y^3  1<=x<=31 1<=y<=31");
        funcion.setBounds(300,20,300,20);
        //se agregan los JTextArea
       //de x
        //genX.setBounds(20,80,300,250);
        genX.setEnabled(false);
        genX.setFont(new Font("Monospaced",Font.PLAIN,15));
        genX.setBackground(Color.BLACK);
        genX.setForeground(Color.LIGHT_GRAY);
        JScrollPane sc1 = new JScrollPane(genX); 
        sc1.setBounds(new Rectangle(20, 80, 250, 200));
        //de y
        
//        genY.setBounds(400,80,250,200);
        genY.setEnabled(false);
        genY.setFont(new Font("Monospaced",Font.PLAIN,15));
        genY.setBackground(Color.BLACK);
        genY.setForeground(Color.LIGHT_GRAY);
        JScrollPane sc2 = new JScrollPane(genY); 
        sc2.setBounds(new Rectangle(400, 80, 250, 200));
        //Se agregan las etiquetas
        procesoX = new JLabel("Evolución X");
        procesoX.setBounds(100,60,100,20);
        procesoY = new JLabel("Evolución Y");
        procesoY.setBounds(460,60,100,20);
        selecciona = new JLabel("Selecciona Las generaciones");
        selecciona.setBounds(200,320,200,20);
        //se agraga combo
        generaciones = new JComboBox();
        generaciones.setBounds(400,320,100,20);
        for(int i=1;i<5;i++)
            generaciones.addItem(i);
        pesoX = new JLabel("El peso max de X: ");
        pesoX.setBounds(20,400,130,20);
        PesoX = new JLabel();
        PesoX.setBounds(150,400,100,20);
        //jojo
        pesoY = new JLabel("El peso max de Y: ");
        pesoY.setBounds(300,400,130,20);
        PesoY = new JLabel();
        PesoY.setBounds(450,400,100,20);
        //total
        total = new JLabel("Total:");
        total.setBounds(580, 400, 80, 20);
        t= new JLabel();
        t.setBounds(670, 400, 80, 20);
        //se agregan los botones
        empezar = new JButton("Empezar");
        empezar.setBounds(550,320,100,20);
        empezar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              //Aqui iniciaremos los hilos
                iniciarHilos();
                tot.imprime();
                tot.imprime();
            }
        });
        nuevo = new JButton();
        //Se agragan al panel
        pane.add(t);
        pane.add(total);
        pane.add(empezar);
        pane.add(funcion);
        pane.add(generaciones);
        pane.add(sc1);
        pane.add(sc2);
        pane.add(nuevo);
        pane.add(procesoX);
        pane.add(procesoY);
        pane.add(selecciona);
        pane.add(pesoX);
        pane.add(PesoX);
        pane.add(pesoY);
        pane.add(PesoY);
    }
    
    public void iniciarHilos(){
        Esperar wait = new Esperar();
        //Se obtienen las generaciones 
        int e = generaciones.getSelectedIndex()+1;
        //se hace la instancia de los procesos X y Y
        ProcesoX x = new ProcesoX(wait,e, genX, PesoX);
        PobInicial y = new PobInicial(wait,e, genY,PesoY);
        //Se inician los hilos
        x.start();
        y.start();
    }
    
    
}
