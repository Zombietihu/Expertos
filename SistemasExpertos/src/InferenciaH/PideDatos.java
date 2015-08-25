/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InferenciaH;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author cuatito
 */
public class PideDatos extends JFrame{
    
    JPanel panel;
    JLabel obj;
    JLabel base;
    JComboBox objetivo;
    JTextArea conocimiento;
    JTextArea consola= new JTextArea();
    String escribe = null;
    JCheckBox c1;
    JCheckBox c2;
    JCheckBox c3;
    JCheckBox c4;
    JCheckBox c5;
    JCheckBox c6;
    JCheckBox c7;
    JCheckBox c8;
    JCheckBox c9;
    JButton adelante;
    JButton atras;
    
    boolean h1 = false, h2= false, h3=false, h4=false, h5=false, h6=false, h7=false, h8=false, h9=false;
    boolean [] bc = new boolean[10];
    ArrayList <String> bcc = new ArrayList();
    //String [] bcc = new String[10];
    int i;
    Adelante a;
    Atras at;
    
    public static void main(String arg[]){
       PideDatos e = new PideDatos();
       e.frame();
    }
    
    public void frame(){
        setTitle("Inferencia H");
        setSize(700, 600);
        init();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }
    public void init(){
        panel = new JPanel();
        panel.setLayout(null);
        obj = new JLabel("Cual es el bjetivo: ");
        obj.setBounds(40, 40, 200, 20);
        objetivo = new JComboBox();
        objetivo.setBounds(200, 40, 70, 20);
        objetivo.addItem("h1");objetivo.addItem("h2");objetivo.addItem("h3");
        objetivo.addItem("h4");objetivo.addItem("h5");objetivo.addItem("h6");
        objetivo.addItem("h7");objetivo.addItem("h8");objetivo.addItem("h9");
        base = new JLabel("Cual es la B.C: ");
        base.setBounds(40, 65, 200, 20);
        c1 = new JCheckBox("h1");
        c1.setBounds(200, 65, 50, 20);
        c2 = new JCheckBox("h2");
        c2.setBounds(250, 65, 50, 20);
        c3 = new JCheckBox("h3");
        c3.setBounds(300, 65, 50, 20);
        c4 = new JCheckBox("h4");
        c4.setBounds(350, 65, 50, 20);
        c5 = new JCheckBox("h5");
        c5.setBounds(400, 65, 50, 20);
        c6 = new JCheckBox("h6");
        c6.setBounds(450, 65, 50, 20);
        c7 = new JCheckBox("h7");
        c7.setBounds(500, 65, 50, 20);
        c8 = new JCheckBox("h8");
        c8.setBounds(550, 65, 50, 20);
        c9 = new JCheckBox("h9");
        c9.setBounds(600, 65, 50, 20);
        adelante = new JButton("Hacia Adelante");
        adelante.setBounds(40, 100, 150, 20);
        adelante.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               haciaAdelante();
            }
        });
        atras = new JButton("Hacia Atràs");
        atras.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               haciaAtras();
            }
        });
        atras.setBounds(200, 100, 150, 20);
        //consola.setBounds(20, 130, 600, 350);
        consola.setFont(new Font("Monospaced",Font.PLAIN,15));
        consola.setBackground(Color.BLACK);
        consola.setForeground(Color.LIGHT_GRAY);
        JScrollPane sc1 = new JScrollPane(consola); 
        sc1.setBounds(new Rectangle(20, 130, 600, 350));
        panel.add(obj);
        panel.add(base);
        panel.add(objetivo);
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(c4);
        panel.add(c5);
        panel.add(c6);
        panel.add(c7);
        panel.add(c8);
        panel.add(c9);
        panel.add(adelante);
        panel.add(atras);
        panel.add(sc1);
    }
    
    public void haciaAdelante(){
        i=0;
        String h= null;
        bcc.clear();
        //Se llena base de conocimiento y objetivo
        if (c1.isSelected() || c2.isSelected() || c3.isSelected() || c4.isSelected() || c5.isSelected()
               || c6.isSelected() || c7.isSelected() || c8.isSelected() || c9.isSelected()){
             if(c1.isSelected()){ h1 = true; bc[i] = h1; bcc.add("h1"); i++;}
             if(c2.isSelected()){ h2 = true; bc[i] = h2; bcc.add("h2"); i++;}
             if(c3.isSelected()){ h3 = true; bc[i] = h3; bcc.add("h3"); i++;}
             if(c4.isSelected()){ h4 = true; bc[i] = h4; bcc.add("h4"); i++;}
             if(c5.isSelected()){ h5 = true; bc[i] = h5; bcc.add("h5"); i++;}
             if(c6.isSelected()){ h6 = true; bc[i] = h6; bcc.add("h6"); i++;}
             if(c7.isSelected()){ h7 = true; bc[i] = h7; bcc.add("h7"); i++;}
             if(c8.isSelected()){ h8 = true; bc[i] = h8; bcc.add("h8"); i++;}
             if(c9.isSelected()){ h9 = true; bc[i] = h9; bcc.add("h9"); i++;}
             if(objetivo.getSelectedIndex() == 0){h = "h1";}
             if(objetivo.getSelectedIndex() == 1){h = "h2";}
             if(objetivo.getSelectedIndex() == 2){h = "h3";}
             if(objetivo.getSelectedIndex() == 3){h = "h4";}
             if(objetivo.getSelectedIndex() == 4){h = "h5";}
             if(objetivo.getSelectedIndex() == 5){h = "h6";}
             if(objetivo.getSelectedIndex() == 6){h = "h7";}
             if(objetivo.getSelectedIndex() == 7){h = "h8";}
             if(objetivo.getSelectedIndex() == 8){h = "h9";}
             consola.append("run:"+"\n");
             a = new Adelante(bcc, h);
             setConsola();
        }else{
            JOptionPane.showMessageDialog(null, "Favor de seleccionar la base de conocimiento");
        }
    }
    public void haciaAtras(){
         i=0;
        String h= null;
        bcc.clear();
        //Se llena base de conocimiento y objetivo
        if (c1.isSelected() || c2.isSelected() || c3.isSelected() || c4.isSelected() || c5.isSelected()
               || c6.isSelected() || c7.isSelected() || c8.isSelected() || c9.isSelected()){
             if(c1.isSelected()){ h1 = true; bc[i] = h1; bcc.add("h1"); i++;}
             if(c2.isSelected()){ h2 = true; bc[i] = h2; bcc.add("h2"); i++;}
             if(c3.isSelected()){ h3 = true; bc[i] = h3; bcc.add("h3"); i++;}
             if(c4.isSelected()){ h4 = true; bc[i] = h4; bcc.add("h4"); i++;}
             if(c5.isSelected()){ h5 = true; bc[i] = h5; bcc.add("h5"); i++;}
             if(c6.isSelected()){ h6 = true; bc[i] = h6; bcc.add("h6"); i++;}
             if(c7.isSelected()){ h7 = true; bc[i] = h7; bcc.add("h7"); i++;}
             if(c8.isSelected()){ h8 = true; bc[i] = h8; bcc.add("h8"); i++;}
             if(c9.isSelected()){ h9 = true; bc[i] = h9; bcc.add("h9"); i++;}
             if(objetivo.getSelectedIndex() == 0){h = "h1";}
             if(objetivo.getSelectedIndex() == 1){h = "h2";}
             if(objetivo.getSelectedIndex() == 2){h = "h3";}
             if(objetivo.getSelectedIndex() == 3){h = "h4";}
             if(objetivo.getSelectedIndex() == 4){h = "h5";}
             if(objetivo.getSelectedIndex() == 5){h = "h6";}
             if(objetivo.getSelectedIndex() == 6){h = "h7";}
             if(objetivo.getSelectedIndex() == 7){h = "h8";}
             if(objetivo.getSelectedIndex() == 8){h = "h9";}
             consola.append("run:"+"\n");
             at = new Atras(bcc, h);
             setConsola();
        }else{
            JOptionPane.showMessageDialog(null, "Favor de seleccionar la base de conocimiento");
        }
    }
    public void setConsola(){
        File archivo= new File("/home/cuatito//NetBeansProjects/SistemasExpertos/archivo.txt");
             try { 
          BufferedReader in = new BufferedReader (new FileReader(archivo)); 
          String linea = ""; 
          linea = in.readLine(); 

          while (linea != null) { 
               consola.append(linea + "\n"); 
               linea = in.readLine(); 
          } 
     } catch (Exception e) { 
          consola.append ("No se encontro el archivo..."); 
     } 

        
    }
    
}
