/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasexpertos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author cuatito
 */
public class Principal extends JFrame {
    
    JLabel pregunta = new JLabel();
    
    JButton comenzar;
    JButton siguiente;
    JButton nuevo;
    
    JComboBox combo;
    
    JRadioButton si;
    JRadioButton no;
    
    JTextArea v;
    
    JPanel panel;
    
    int ban = 0;
    int cudrado=0;
    int fut = 0;
    int beis = 0;
    int playa = 0;
    public Principal(){
        iniciar();
        setSize(500, 300);
        setTitle("Hola");
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void iniciar(){
        panel = new JPanel();
        panel.setLayout(null);
        pregunta.setBounds(200, 50, 200, 20);
        pregunta.setText("Bienvenido");
        panel.add(pregunta);
        comenzar = new JButton("Comenzar");
        comenzar.setBounds(150 ,80, 200, 30);
        comenzar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               setPreguntas();
            }
        });
        panel.add(comenzar);
        siguiente = new JButton("Siguiente");
        siguiente.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               evalua();
               setPreguntas();
            }
        });
    }
    
    public void setPreguntas(){
        switch(ban){
            case 0:
                panel.removeAll();
                panel.repaint();
                siguiente.setBounds(280, 200, 200, 30);
                pregunta.setBounds(50, 50, 200, 20);
                pregunta.setText("¿Su forma es geometrica?");//Si o no
                combo = new JComboBox();
                combo.setBounds(300, 50, 100, 20);
                combo.addItem("Si");
                combo.addItem("No");
                panel.add(combo);
                panel.add(siguiente);
                panel.add(pregunta);
                break;
            case 1:
                panel.remove(combo);
                panel.repaint();
                pregunta.setText("Dame numero de Lados Iguales");//4 o 0
                v = new JTextArea();
                v.setBounds(300, 50, 50, 20);
                panel.add(v);
                break;
            case 2:
                v.setText("");
                pregunta.setText("¿cuantos angùlos de 90º tiene?: ");//igual a 4
                break;
            case 3:
                //decir que es un cuadrado
                 ImageIcon imageCuadrado = new ImageIcon(this.getClass().getResource("/imagen/ejemplo1.gif"));  
                JLabel labelC = new JLabel();  
                labelC.setIcon(imageCuadrado);  
                labelC.setBounds(20, 20, 300, 300);
                JLabel labelC2 = new JLabel("La figura que busca");
                labelC2.setBounds(340, 100, 200, 20);
                JLabel labelC3 = new JLabel("es un: CUADRADO.");
                labelC3.setBounds(350, 120, 200, 20);
                nuevo = new JButton("reintentar");
                nuevo.setBounds(350, 250, 150, 20);
                nuevo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ban =0;
                    panel.removeAll();
                    setPreguntas();
                    }
                });
                panel.removeAll();
                panel.add(labelC);
                panel.add(labelC2);
                panel.add(labelC3);
                panel.add(nuevo);
                panel.repaint();
                break;
            case 4:
                //preguntar circunferencia
                v.setText("");
                pregunta.setText("¿Cual es su circunferencia(cm)?");
                /*
                        baseball mayor a 22.5 pero menor a 24
                        soccer mayor a 68 menor a 70
                        playa es libre
                */
                break;
            case 5:
                System.out.println("Beis: "+ beis+"\n"+"Fut :"+fut+"\n"+"playa: "+playa);
                //preguntar peso
                v.setText("");
                pregunta.setText("¿Cual es su peso(g)?");
                break;
            case 6:
                System.out.println("Beis: "+ beis+"\n"+"Fut :"+fut+"\n"+"playa: "+playa);
                //preguntar peso
                panel.remove(v);
                panel.repaint();
                combo.removeAllItems();
                combo.addItem("El rey de los deportes");
                combo.addItem("Deporte mas popular en el Mundo");
                combo.addItem("Recreacion");
                combo.setBounds(240, 50, 270, 20);
                panel.add(combo);
                pregunta.setText("¿Es ocupado para?");
                
                break;
            case 7:
                System.out.println("Beis: "+ beis+"\n"+"Fut :"+fut+"\n"+"playa: "+playa);
                combo.removeAllItems();
                combo.addItem("Blanco");
                combo.addItem("Minimalista");
                combo.addItem("Multicolor");
                pregunta.setText("Su diseño de color es: ");
                break;
            case 8:
                System.out.println("Beis: "+ beis+"\n"+"Fut :"+fut+"\n"+"playa: "+playa);
                combo.removeAllItems();
                combo.addItem("Caucho");
                combo.addItem("Cuero");
                combo.addItem("Vinil");
                pregunta.setText("Su diseño de material es: ");
                break;
            case 9:
                if((beis>fut)&&(beis>playa)){
                    //decir que es un cuadrado
                 ImageIcon imageBeis = new ImageIcon(this.getClass().getResource("/imagen/beis.gif"));  
                JLabel labelB = new JLabel();  
                labelB.setIcon(imageBeis);  
                labelB.setBounds(20, 20, 300, 300);
                JLabel labelB2 = new JLabel("La figura que busca");
                labelB2.setBounds(340, 100, 200, 20);
                JLabel labelCB = new JLabel("es: Pelota de BaseBall.");
                labelCB.setBounds(350, 120, 200, 20);
                nuevo = new JButton("reintentar");
                nuevo.setBounds(350, 250, 150, 20);
                nuevo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ban =0;
                    panel.removeAll();
                    setPreguntas();
                    }
                });
                panel.removeAll();
                panel.add(labelB);
                panel.add(labelB2);
                panel.add(labelCB);
                panel.add(nuevo);
                panel.repaint();
                }else{
                    if((fut>beis)&&(fut>playa)){
                        //decir que es un cuadrado
                 ImageIcon imageFut = new ImageIcon(this.getClass().getResource("/imagen/fut.gif"));  
                JLabel labelF = new JLabel();  
                labelF.setIcon(imageFut);  
                labelF.setBounds(20, 20, 300, 300);
                JLabel labelF2 = new JLabel("La figura que busca");
                labelF2.setBounds(340, 100, 200, 20);
                JLabel labelF3 = new JLabel("es un Balon de fut.");
                labelF3.setBounds(350, 120, 200, 20);
                nuevo = new JButton("reintentar");
                nuevo.setBounds(350, 250, 150, 20);
                nuevo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ban =0;
                    panel.removeAll();
                    setPreguntas();
                    }
                });
                panel.removeAll();
                panel.add(labelF);
                panel.add(labelF2);
                panel.add(labelF3);
                panel.add(nuevo);
                panel.repaint();
                    }else{
                        if((playa>beis)&&(playa>fut)){
                            //decir que es un cuadrado
                 ImageIcon imagePlaya = new ImageIcon(this.getClass().getResource("/imagen/playa.gif"));  
                JLabel labelP = new JLabel();  
                labelP.setIcon(imagePlaya);  
                labelP.setBounds(20, 20, 300, 300);
                JLabel labelP2 = new JLabel("La figura que busca");
                labelP2.setBounds(340, 100, 200, 20);
                JLabel labelP3 = new JLabel("es una pelota Playa.");
                labelP3.setBounds(350, 120, 200, 20);
                nuevo = new JButton("reintentar");
                nuevo.setBounds(350, 250, 150, 20);
                nuevo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ban =0;
                    panel.removeAll();
                    setPreguntas();
                    }
                });
                panel.removeAll();
                panel.add(labelP);
                panel.add(labelP2);
                panel.add(labelP3);
                panel.add(nuevo);
                panel.repaint();
                        }
                    }
                }
                break;
            case 404:
                
                ImageIcon icon = new ImageIcon(this.getClass().getResource("/imagen/404.jpg"));  
                JLabel label = new JLabel();  
                label.setIcon(icon);  
                label.setBounds(20, 20, 300, 300);
                JLabel label2 = new JLabel("No tenemos la figura que");
                label2.setBounds(300, 100, 200, 20);
                JLabel label3 = new JLabel("Busca");
                label3.setBounds(350, 120, 200, 20);
                nuevo = new JButton("reintentar");
                nuevo.setBounds(300, 150, 200, 20);
                nuevo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ban =0;
                    panel.removeAll();
                    setPreguntas();
                    }
                });
                panel.removeAll();
                panel.add(label);
                panel.add(label2);
                panel.add(label3);
                panel.add(nuevo);
                panel.repaint();
        }  
    }
     public void evalua(){
         switch(ban){
             case 0:
                 if(combo.getSelectedIndex() == 0){
                     ban=1;
                 }else{
                     ban = 404;
                 }
                 break;
             case 1:
                    System.out.println(v.getText() + " la bandera esta en"+ ban);    
                     try{
                         if (Integer.parseInt(v.getText())== 4 ){
                             ban=2;
                         }else{
                             if(Integer.parseInt(v.getText())== 0){
                                 ban=4;
                             }else{
                                 ban = 404;
                             }
                         }
                     }catch(Exception e){
                          JOptionPane.showMessageDialog(null, "Solo acepta numeros");
                     }
                     break;
             case 2: 
                  System.out.println(v.getText() + " la bandera esta en"+ ban);    
                     try{
                         if (Integer.parseInt(v.getText())== 4 ){
                             ban=3;
                         }else{
                             ban=404;
                         }
                     }catch(Exception e){
                          JOptionPane.showMessageDialog(null, "Solo acepta numeros");
                     }
                  break;
             case 4:
                 System.out.println(v.getText() + " la bandera esta en"+ ban);    
                     try{
                         if (((float)Integer.parseInt(v.getText())>= 22.5) && ((float)Integer.parseInt(v.getText())<= 24) ){
                             ban=5;
                             beis++;
                         }else{
                             if(((float)Integer.parseInt(v.getText())>=68.0) && ((float)Integer.parseInt(v.getText())<=70.0)){
                                 ban=5;
                                 fut++;
                             }else{
                                 ban=5;
                                 playa++;
                             }
                         }
                     }catch(Exception e){
                          JOptionPane.showMessageDialog(null, "Solo acepta numeros");
                     }
                  break;
             case 5:   
                  System.out.println(v.getText() + " la bandera esta en"+ ban);    
                     try{
                         if (((float)Integer.parseInt(v.getText())>= 142) && ((float)Integer.parseInt(v.getText())<= 149) ){
                             ban=6;
                             beis++;
                         }else{
                             if(((float)Integer.parseInt(v.getText())>=410) && ((float)Integer.parseInt(v.getText())<=450)){
                                 ban=6;
                                 fut++;
                             }else{
                                 ban=6;
                                 playa++;
                             }
                         }
                     }catch(Exception e){
                          JOptionPane.showMessageDialog(null, "Solo acepta numeros");
                     }
                  break;
             case 6:
                 System.out.println(v.getText() + " la bandera esta en"+ ban); 
                 if(combo.getSelectedIndex()==0){
                     ban=7;
                     beis++;
                 }else{
                     if(combo.getSelectedIndex()==1){
                         ban=7;
                         fut++;
                     }else{
                         ban=7;
                         playa++;
                     }
                 }
                 break;
             case 7:
                 System.out.println(v.getText() + " la bandera esta en"+ ban); 
                  if(combo.getSelectedIndex()==0){
                     ban=8;
                     beis++;
                 }else{
                     if(combo.getSelectedIndex()==1){
                         ban=8;
                         fut++;
                     }else{
                         ban=8;
                         playa++;
                     }
                 }
                 break;
            case 8:
                 System.out.println(v.getText() + " la bandera esta en"+ ban); 
                  if(combo.getSelectedIndex()==0){
                     ban=9;
                     beis++;
                 }else{
                     if(combo.getSelectedIndex()==1){
                         ban=9;
                         fut++;
                     }else{
                         ban=9;
                         playa++;
                     }
                 }
                 break;
         }
     }
}
