/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heuristica;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author caroPelayo
 */
public class Grafo extends JPanel{
    public ArrayList<Line2D>aristas=new ArrayList();
    public ArrayList<Line2D>indices=new ArrayList();
    public ArrayList<Integer>pesos=new ArrayList();
    public ArrayList<Integer>estados=new ArrayList();
    public ArrayList<Integer>subindices=new ArrayList();
    public int inicio=0;
    int x1=0;int x2=0;int x3=0;
    int y1=0;int y2=0;int y3=0;
    public int suma=0;
     public int destino=0;
    Grafo(){
        setSize(new java.awt.Dimension(1500,1500));
        pintarEtiquetas();
    }
     @Override
     public void paintComponent (Graphics g1) { 
        super.paintComponent(g1);
        aristas.clear();
        Graphics2D g2 = (Graphics2D) g1;
        g2.setColor(Color.DARK_GRAY);
        g2.setStroke(new BasicStroke(1));
        //contorno (decaedro)
        Line2D a1= new Line2D.Double(300, 100, 500, 100);
        Line2D a2=new Line2D.Double(500, 100, 650, 230);
        Line2D a3=new Line2D.Double(650, 230, 690, 400);
        Line2D a4=new Line2D.Double(690,400, 640, 550);
        Line2D a5=new Line2D.Double(640,550, 500, 670);
       
        Line2D a6=new Line2D.Double(500,670, 300, 670);
        Line2D a10=new Line2D.Double(150,230, 300, 100);
        Line2D a9=new Line2D.Double(100,400, 150, 230);
        Line2D a8=new Line2D.Double(150,550, 100, 400);
        Line2D a7=new Line2D.Double(300,670, 150, 550);
        //nodo 1 y sus aristas
        Line2D a11=new Line2D.Double(300,100, 650, 230);
        Line2D a12=new Line2D.Double(300,100, 690, 400);
        Line2D a13=new Line2D.Double(300,100, 640, 550);
        Line2D a14=new Line2D.Double(300,100, 500, 670);
        Line2D a15=new Line2D.Double(300,100, 300, 670);
        Line2D a16=new Line2D.Double(300,100, 150, 550);
        Line2D a17=new Line2D.Double(300,100, 100, 400);
        //nodo 2 y sus aristas
        Line2D a21=new Line2D.Double(500,100, 690, 400);
        Line2D a22=new Line2D.Double(500,100, 640, 550);
        Line2D a23=new Line2D.Double(500,100, 500, 670);
        Line2D a24=new Line2D.Double(500,100, 300, 670);
        Line2D a25=new Line2D.Double(500,100, 150, 550);
        Line2D a26=new Line2D.Double(500,100, 100, 400);
        Line2D a27=new Line2D.Double(500,100, 150, 230);
        //nodo 3 y sus aristas
        Line2D a31=new Line2D.Double(650,230, 640, 550);
        Line2D a32=new Line2D.Double(650,230, 500, 670);
        Line2D a33=new Line2D.Double(650,230, 300, 670);
        Line2D a34=new Line2D.Double(650,230, 150, 550);
        Line2D a35=new Line2D.Double(650,230, 100, 400);
        Line2D a36=new Line2D.Double(650,230, 150, 230);
        //nodo 4 y sus aristas
        Line2D a41=new Line2D.Double(690,400, 500, 670);
        Line2D a42=new Line2D.Double(690,400, 300, 670);
        Line2D a43=new Line2D.Double(690,400, 150, 550);
        Line2D a44=new Line2D.Double(690,400, 100, 400);
        Line2D a45=new Line2D.Double(690,400, 150, 230);
        //nodo 5 y sus aristas
        Line2D a51=new Line2D.Double(640,550, 300, 670);
        Line2D a52=new Line2D.Double(640,550, 150, 550);
        Line2D a53=new Line2D.Double(640,550, 100, 400);
        Line2D a54=new Line2D.Double(640,550, 150, 230);
        //nodo 6 y sus aristas
        //Line2D a61=new Line2D.Double(500,670, 300, 670);
        Line2D a61=new Line2D.Double(500,670, 150, 550);
        Line2D a62=new Line2D.Double(500,670, 100, 400);
        Line2D a63=new Line2D.Double(500,670, 150, 230);
        //nodo 7 y sus aristas
        Line2D a71=new Line2D.Double(300,670, 100, 400);
        Line2D a72=new Line2D.Double(300,670, 150, 230);
        //nodo 8 y sus aristas
        Line2D a81=new Line2D.Double(150,550, 150, 230);
        //agregar aristas al array
        aristas.add(a1); aristas.add(a2);aristas.add(a3);aristas.add(a4);aristas.add(a5);aristas.add(a6);aristas.add(a7);
        aristas.add(a8);aristas.add(a9);aristas.add(a10);aristas.add(a11);aristas.add(a12);aristas.add(a13);aristas.add(a14);
        aristas.add(a15);aristas.add(a16);aristas.add(a17);aristas.add(a21);aristas.add(a22);aristas.add(a23);aristas.add(a24);
        aristas.add(a25);aristas.add(a26);aristas.add(a27);aristas.add(a31);aristas.add(a32);aristas.add(a33);aristas.add(a34);
        aristas.add(a35);aristas.add(a36);aristas.add(a41);aristas.add(a42);aristas.add(a43);aristas.add(a44);aristas.add(a45);
        aristas.add(a51);aristas.add(a52);aristas.add(a53);aristas.add(a54);aristas.add(a61);aristas.add(a62);aristas.add(a63);
        aristas.add(a71);aristas.add(a72);aristas.add(a81);
        //aristas
        g2.draw(a1); g2.draw(a2); g2.draw(a3); g2.draw(a4); g2.draw(a5); g2.draw(a6); g2.draw(a7);
        g2.draw(a8); g2.draw(a9); g2.draw(a10);g2.draw(a11);g2.draw(a12);g2.draw(a13);g2.draw(a14);
        g2.draw(a15);g2.draw(a16);g2.draw(a17);g2.draw(a21);g2.draw(a22);g2.draw(a23);g2.draw(a24);
        g2.draw(a25);g2.draw(a26);g2.draw(a27);g2.draw(a31);g2.draw(a32);g2.draw(a33);g2.draw(a34);
        g2.draw(a35);g2.draw(a36);g2.draw(a41);g2.draw(a42);g2.draw(a43);g2.draw(a44);g2.draw(a45);
        g2.draw(a51);g2.draw(a52);g2.draw(a53);g2.draw(a54);g2.draw(a61);g2.draw(a62);g2.draw(a63);
        g2.draw(a71);g2.draw(a72);g2.draw(a81);
        //etiquetas nodos
        g2.setColor(Color.BLACK);
        g2.drawString("1",300,95);
        g2.drawString("2",500,95);
        g2.drawString("3",655,230);
        g2.drawString("4",695,400);
        g2.drawString("5",650,550);
        g2.drawString("6",505,685);
        g2.drawString("7",295,685);
        g2.drawString("8",135,550);
        g2.drawString("9",85,400);
        g2.drawString("10",130,230);
         for (int i =0;i<45;i++){
             float x=(float)(aristas.get(i).getX1()+aristas.get(i).getX2());
             float y=(float)(aristas.get(i).getY1()+aristas.get(i).getY2());
             x=x/2;
             y=y/2;
              g2.drawString(Integer.toString(pesos.get(i)),x,y);
         }
       
     }
    
    void pintarEtiquetas(){
        pesos.clear();
        estados.clear();
        for (int i =0;i<45;i++){
            int random=((int)(Math.random()*50 + 1));
            pesos.add(random);
            estados.add(0);
       }        
    }
    int[] coordenada(int num, int x,int y){
      int[] v=new int[2];
      switch(num){
        
        case 1:
              x=300;
              y=100;
        break;
        case 2:
              x=500;
              y=100;
        break; 
        case 3:
              x=650;
              y=230;
        break;
        case 4:
              x=690;
              y=400;
        break;
        case 5:
              x=640;
              y=550;
        break;
        case 6:
              x=500;
              y=670;
        break; 
        case 7:
              x=300;
              y=670;
        break; 
        case 8:
              x=150;
              y=550;
        break; 
        case 9:
              x=100;
              y=400;
        break; 
        case 10:
              x=150;
              y=230;
        break; 
       default: x=0;
                y=0;
       break; 
                       
      }
      v[0]=x;
      v[1]=y;
      return(v);
  }
    void Obtenercamino(){
      int nodo =0;
      while(nodo != destino){
        int menor=0;
        int indice=0;
        subindices.clear();
        for (int i =0;i<45;i++){
            if((x1==aristas.get(i).getX1()&& y1==aristas.get(i).getY1())||(x1==aristas.get(i).getX2()&& y1==aristas.get(i).getY2())){
                if(estados.get(i)==0){
                    subindices.add(i);
                }
                
            }
        }
        for (int i=0;i<subindices.size();i++){
            if(menor==0){
               menor=pesos.get(subindices.get(i));
              
               indice=subindices.get(i);
           }else{
                if(pesos.get(subindices.get(i))<menor){
                    menor=pesos.get(subindices.get(i));
                     //System.out.println(menor);
                    indice=subindices.get(i);
                 }
           }   
          
       }
       System.out.println(menor);
       suma=suma+menor;
       estados.set(indice, 1);
       int n=obtenNodo((int)aristas.get(indice).getX1(),(int)aristas.get(indice).getY1());
       int n2=obtenNodo((int)aristas.get(indice).getX2(),(int)aristas.get(indice).getY2());
         
       if(n== inicio){
            x1=(int) aristas.get(indice).getX2();
            y1=(int) aristas.get(indice).getY2();
            inicio=n2;
       }else{
           
            x1=(int) aristas.get(indice).getX1();
            y1=(int) aristas.get(indice).getY1();
             inicio=n;
            
       }
        Graphics2D g2 = (Graphics2D)this.getGraphics();
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke(2));
        g2.draw(aristas.get(indice));
        nodo =obtenNodo(x1,y1);
        subindices.clear();
    }
    }
    int obtenNodo(int x,int y){
         int nodo=0;
         if(x==300 && y==100){
             nodo=1;
         }
         if(x==500 && y==100){
             nodo=2;
         }
         if(x==650 && y==230){
             nodo=3;
         }
        if(x==690 && y==400){
             nodo=4;
         }
        if(x==640 && y==550){
             nodo=5;
         }
       if(x==500 && y==670){
             nodo=6;
         }
       if(x==300 && y==670){
             nodo=7;
         } 
        if(x==150 && y==550){
             nodo=8;
         }
        if(x==100 && y==400){
             nodo=9;
         }
        if(x==150 && y==230){
             nodo=10;
         }
        
     return nodo; 
    }  
    public int getSuma(){
        return suma;
    }
    }

