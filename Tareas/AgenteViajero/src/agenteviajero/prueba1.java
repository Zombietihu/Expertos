package agenteViajero;

import java.util.ArrayList;
import java.util.Vector;


public class prueba1 {
	 int [][] ady;
	    ArrayList<String> aristas = new ArrayList<String>();
	    Vector<Grafo> grafo = new Vector<Grafo>();
	    int costo=0;
	    int cont=0;
	    
	    
	    public prueba1(int [][] mat, int inicial) {
	        ady=mat;
	        proceso(inicial);
	    }
	    
	    public void proceso(int inicial){
	        int men=100;//ady[inicial][inicial];
	        int r=inicial-1;
	        int ant=0;
	        while(cont<10){
	            
	            for(int c=0;c<10;c++){
	                    int val=ady[r][c];
	                if(val!=0 && val<men){
	                    men=ady[r][c];
	                    ant=c;
	                }
	            }
	            
	            if(comprobar(r,ant)==true){
	                aristas.add(""+r+","+ant+","+ady[r][ant]);
	                costo=costo+ady[r][ant];
	                for(int i=0;i<10;i++){
	                    if(ady[r][i]!=men){
	                        ady[r][i]=0;
	                    }
	                }
	                ady[ant][r]=0;
	                r=ant;
	                System.out.println("Cont "+cont+" dest "+(r+1));
	                cont++;
	                men=100;
	               // System.out.println(cont);
	            }
	            else{
	               ady[r][ant]=0;   
	               men=100;
	            }
	        }
	        
	        grafo.add(new Grafo("1",ady[0]));
	        grafo.add(new Grafo("2",ady[1]));
	        grafo.add(new Grafo("3",ady[2]));
	        grafo.add(new Grafo("4",ady[3]));
	        grafo.add(new Grafo("5",ady[4]));
	        grafo.add(new Grafo("6",ady[5]));
	        grafo.add(new Grafo("7",ady[6]));
	        grafo.add(new Grafo("8",ady[7]));
	        grafo.add(new Grafo("9",ady[8]));
	        grafo.add(new Grafo("10",ady[9]));
	    }
	    
	    
	    public boolean comprobar(int xn,int yn){
	        boolean ind=false;
	        
	        ArrayList<String> x = new ArrayList<String>();
	        ArrayList<String> y = new ArrayList<String>();
	        
	        for(int i=0;i<aristas.size();i++){
	            String nodo=aristas.get(i);
	            String [] elem = nodo.split(",");
	            x.add(elem[0]);
	            y.add(elem[1]);
	        }
	        
	        if(x.contains(""+xn)==false){
	            if(y.contains(""+yn)==false){
	               if(x.contains(""+yn)==true && cont<9){
	                   ind=false;
	               }
	               else{
	                   ind=true;
	               }
	            }
	            else{
	                ind=false;
	            }
	        }
	        else{
	            ind=false;
	        }
	        
	        return ind;
	    }
	    
	    public Vector<Grafo> getVectorGrafos(){
	        return grafo;
	    }
	    
	    public int getCosto(){
	        return costo;
	    }
	    
	}
