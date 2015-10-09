package agenteViajero;

import java.util.ArrayList;
import java.util.Vector;



public class prueba2 {
	  int [][] ady;
	    ArrayList<String> aristas = new ArrayList<String>();
	    ArrayList<String> pares = new ArrayList<String>();
	    Vector<Grafo> grafo = new Vector<Grafo>();
	    int cont=0;
	    int costo=0;
	    
	    public prueba2(int mat[][]) {
	        super();
	        ady=mat;
	        proceso();
	    }
	    
	    public void proceso(){
	               
	            int men=100;
	            int r2=0,c2=0;
	            for(int k=0;k<50;k++){
	                for(int r=0;r<10;r++){
	                    for(int c=0;c<10;c++){
	                        if(ady[r][c]<men && ady[r][c]!=0){
	                             men=ady[r][c];
	                             r2=r;
	                             c2=c;
	                        }
	                    }
	                }
	                if(men!=100){
	                    aristas.add(men+","+r2+","+c2);
	                    ady[r2][c2]=0;
	                    ady[c2][r2]=0;
	                    men=100;
	                }
	            }
	            
	           // while(cont<10){
	                
	                for(int i=0;i<aristas.size();i++){
	                    if(comprobar(aristas.get(i))==true){
	                        cont++;
	                        //System.out.println(cont);
	                    }
	                    else{
	                        aristas.set(i,"-");
	                    }
	                }
	                
	                for(int i=aristas.size()-1;i>=0;i--){
	                    if(aristas.get(i).equals("-")==true){
	                        aristas.remove(i);
	                    }
	                }
	            //}
	            
	               for(int i=0;i<aristas.size();i++){
	                  System.out.println(aristas.get(i));
	               }
	               
	               for(int i=0;i<aristas.size();i++){
	                   String [] elem=aristas.get(i).split(",");
	                   int r=Integer.parseInt(elem[1]);
	                   int c=Integer.parseInt(elem[2]);
	                   ady[r][c]=Integer.parseInt(elem[0]);
	                   ady[c][r]=Integer.parseInt(elem[0]);
	                   costo=costo+ady[r][c];
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
	    
	    public boolean comprobar(String ar){
	        boolean ind=false;
	        
	        String [] elem=ar.split(",");
	        //System.out.println(pares.size());
	        pares.add(elem[1]);
	        pares.add(elem[2]);
	        
	        int sum=0;
	        int par=0;
	        boolean valido=true;
	        for(int i=0;i<pares.size();i++){
	            for(int j=i;j<pares.size();j++){
	                if(pares.get(i).equals(pares.get(j))==true){
	                    sum++;
	                }
	            }
	            if(sum>2){
	                valido=false;
	                break;
	                
	            }
	            else{
	                if(sum==2){
	                    par++;
	                }
	            }
	            sum=0;
	        }
	        
	        if(valido==false){
	            pares.remove(pares.size()-1);
	            pares.remove(pares.size()-1);
	            ind=false;
	        }
	        else{
	            if(par<10){
	                ind=true;
	            }
	            else{
	                if(par==10){
	                    ind=true;
	                }
	                else{
	                    ind=false;
	                }
	            }
	        }
	        
	       // System.out.println(pares);
	        
	        return ind;
	    }
	    
	    public void elimparSol(){
	        for(int i=0;i<aristas.size();i++){
	            String [] elem=aristas.get(i).split(",");
	            
	        }
	    }
	    
	    public int getCosto(){
	        return costo;
	    }
	    
	    public Vector<Grafo> getVectorGrafos(){
	        return grafo;
	    }
	}
