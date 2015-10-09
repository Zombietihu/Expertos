package agenteViajero;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Vector;

import javax.swing.JPanel;



public class PanelDibujo extends JPanel {
	 private int x=170;
	    private int y=150;
	    private int ancho=40;
	    private int alto=40;
	    public Vector<Integer> xvs;
	    public Vector<Integer> yvs;
	    public Vector<Grafo> vgrafos;
	    private int indice=0;
	    
	    public PanelDibujo() {
	        try {
	            vgrafos=new Vector<Grafo>();
	            xvs=new Vector<Integer>();
	            yvs=new Vector<Integer>();
	            setDoubleBuffered(true);
	            jbInit();
	} catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public void paintComponent(Graphics g){
	        super.paintComponent(g);
	        Graphics2D g2 = (Graphics2D)g;
	        g2.setColor(Color.red);
	        g2.setColor(Color.BLUE);
	        int radio=150;
	        float angulo=360/10;
	        angulo=(float)Math.toRadians(angulo);
	        for(int i=0;i<vgrafos.size();i++){
	            int xv=(int)(x+radio*Math.cos(i*angulo));
	            int yv=(int)(y+radio*Math.sin(i*angulo));
	            xvs.add(xv);
	            yvs.add(yv);
	            indice++;
	        }
	        
	        for(int i=0;i<vgrafos.size();i++){
	            for(int j=0;j<vgrafos.size();j++){
	                   g2.setStroke(new BasicStroke(2));
	                   g2.setColor(Color.BLACK);
	                   g2.drawLine(xvs.get(i)+15,yvs.get(i)+15,xvs.get(j)+15,yvs.get(j)+15);
	                
	                   int xm=((xvs.get(i)+15)+(xvs.get(j)+15))/2;
	                   int ym=((yvs.get(i)+15)+(yvs.get(j)+15))/2;
	                
	                   int can=vgrafos.get(i).getPesos()[j];
	                   String pes="";
	                   if(can==0){
	                      pes="";
	                   }
	                   else{
	                       pes=""+can;
	                   }
	                   g2.drawString(pes,xm+3,ym+6);
	                
	                   g2.setColor(Color.LIGHT_GRAY);
	                   g2.fillOval(xvs.get(i), yvs.get(i), ancho, alto);
	                
	                   g2.setColor(Color.DARK_GRAY);
	                   g2.drawOval(xvs.get(i),yvs.get(i), ancho, alto);
	                   g2.drawString(""+vgrafos.get(i).getDato(), xvs.get(i)+((ancho/2)-3), yvs.get(i)+((alto/2)+3));
	                
	                   g2.setColor(Color.red);
	                   g2.fillOval(xvs.get(j), yvs.get(j), ancho, alto);
	                
	                   g2.setColor(Color.BLACK);
	                   g2.drawOval(xvs.get(j),yvs.get(j), ancho, alto);
	                   g2.drawString(""+vgrafos.get(j).getDato(), xvs.get(j)+((ancho/2)-3), yvs.get(j)+((alto/2)+3));
	            }
	        }
	        
	    }
	    
	    public Vector<Grafo> getVgrafos(){
	        return vgrafos;
	    }
	    
	    public void setVgrafos(Vector<Grafo> g){
	        vgrafos=g;
	    }
	    
	    

	    private void jbInit() throws Exception {
	        this.setLayout( null );
	        this.setBackground(Color.white);
	        this.setOpaque(true);
	    }
	}
