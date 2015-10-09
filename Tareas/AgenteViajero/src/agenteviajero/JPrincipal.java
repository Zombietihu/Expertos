package agenteViajero;


import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;



public class JPrincipal extends JFrame {

    private JPanel jPanel1 = new JPanel();
    PanelDibujo p;
    PanelDibujo2 p2;
    private int [][] mat = new int[15][15];
    private JButton jButton1 = new JButton();
    private JRadioButton jRadioButton1 = new JRadioButton();
    private JLabel jLabel1 = new JLabel();

    public JPrincipal() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize(new Dimension(674, 772));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Random rdm = new Random();
        int [] pe1 = {(rdm.nextInt(80)+90),23,40,21,28,98,32,9,13,52};
        int [] pe2 = {3,70,7,5,9,39,23,82,90,110};
        int [] pe3 = {17,16,0,84,33,2,52,300,42,31};
        int [] pe4 = {8,74,82,0,2,7,9,8,10,19};
        int [] pe5 = {10,31,43,2,0,1,20,31,27,23};
        int [] pe6 = {17,19,20,7,1,0,5,11,13,15};
        int [] pe7 = {32,23,25,9,20,5,0,8,3,19};
        int [] pe8 = {5,18,30,8,31,11,78,0,29,23};
        int [] pe9 = {17,9,24,10,27,13,3,29,0,30};
        int [] pe10 = {0,0,0,0,0,0,0,0,0,0};
        
        Grafo a = new Grafo("1",pe1);
        Grafo a2 = new Grafo("2",pe2);
        Grafo a3= new Grafo("3",pe3);
        Grafo a4 = new Grafo("4",pe4);
        Grafo a5 = new Grafo("5",pe5);
        Grafo a6 = new Grafo("6",pe6);
        Grafo a7 = new Grafo("7",pe7);
        Grafo a8 = new Grafo("8",pe8);
        Grafo a9 = new Grafo("9",pe9);
        Grafo a10 = new Grafo("10",pe10);

        Vector<Grafo> vec = new Vector<Grafo>();
        vec.add(a);
        vec.add(a2);
        vec.add(a3);
        vec.add(a4);
        vec.add(a5);
        vec.add(a6);
        vec.add(a7);
        vec.add(a8);
        vec.add(a9);
        vec.add(a10);
        
        
        p= new PanelDibujo();
        p.setBackground(Color.WHITE);
        p.setVgrafos(vec);
        p.repaint();
        
        p2=new PanelDibujo2();
        p2.setBackground(Color.WHITE);
        
        p.setBounds(new Rectangle(25, 11, 420, 344));
        p2.setBounds(new Rectangle(25, 364, 420, 358));
        jButton1.setText("Iniciar");
        jButton1.setIcon(null);
        jButton1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
        jButton1.setBounds(new Rectangle(455, 45, 75, 30));

        jButton1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jButton1_mouseClicked(e);
                }
            });
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Minimizar");
        jRadioButton1.setBounds(new Rectangle(0, 0, 0, 0));

        jRadioButton1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    jRadioButton1_mouseClicked(e);
                }
            });
        jLabel1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
        
        jLabel1.setText("\u00BFCuanto Cuesta?:");
        jLabel1.setBounds(new Rectangle(455, 11, 210, 35));
        
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jRadioButton1, null);
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(p, null);
        this.getContentPane().add(p2,null);
    }

    private void jRadioButton1_mouseClicked(MouseEvent e) {
        jRadioButton1.setSelected(true);
        
    }
    
    private void cargarMat(){
       /* int [] pe1 = {0,8,10,20,13,17,32,5,17,27};
        int [] pe2 = {8,0,9,7,13,19,23,18,9,11};
        int [] pe3 = {10,9,0,18,13,20,25,30,31,29};
        int [] pe4 = {20,7,18,0,2,7,9,8,10,19};
        int [] pe5 = {13,13,13,2,0,1,20,31,27,23};
        int [] pe6 = {17,19,20,7,1,0,5,11,13,15};
        int [] pe7 = {32,23,25,9,20,5,0,8,3,19};
        int [] pe8 = {5,18,30,8,31,11,78,0,29,35};
        int [] pe9 = {17,9,31,10,27,13,3,29,0,30};
        int [] pe10 = {27,11,29,19,23,15,19,35,30,0};*/
        
       int [] pe1 = {0,8,10,20,13,17,32,5,17,27};
       int [] pe2 = {8,0,9,7,13,19,23,18,9,11};
       int [] pe3 = {10,9,0,18,13,20,25,30,24,29};
       int [] pe4 = {20,7,18,0,2,7,9,8,10,19};
       int [] pe5 = {13,13,13,2,0,1,20,31,27,23};
       int [] pe6 = {17,19,20,7,1,0,5,11,13,15};
       int [] pe7 = {32,23,25,9,20,5,0,8,3,19};
       int [] pe8 = {5,18,30,8,31,11,78,0,29,23};
       int [] pe9 = {17,9,24,10,27,13,3,29,0,30};
       int [] pe10 = {27,11,29,19,23,15,19,23,30,0};
        
        mat[0]=pe1;
        mat[1]=pe2;
        mat[2]=pe3;
        mat[3]=pe4;
        mat[4]=pe5;
        mat[5]=pe6;
        mat[6]=pe7;
        mat[7]=pe8;
        mat[8]=pe9;
        mat[9]=pe10;
    }

    private void jButton1_mouseClicked(MouseEvent e) {
        cargarMat();
        if(jRadioButton1.isSelected()==true){
            String nodo=JOptionPane.showInputDialog("Dame nodo candidato");
            int num=Integer.parseInt(nodo);
            if(num>10){
                
            }
            else{
                prueba1 h = new prueba1(mat,num);
                Vector<Grafo> vn = h.getVectorGrafos();
                p2.IND=true;
                
                p2.setVgrafos(vn);
                p2.repaint();
                jLabel1.setText("Costo "+h.getCosto());
            }
        }
        else{
            prueba2 h = new prueba2(mat);
            Vector<Grafo> vn = h.getVectorGrafos();
            p2.IND=true;
            p2.setVgrafos(vn);
            p2.repaint();
            jLabel1.setText("Costo "+h.getCosto());
        }
    }
}
