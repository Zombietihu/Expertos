/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Tonatihu
 */
public class Busqueda {
    ArrayList<Integer> inicio = new ArrayList<>();
    ArrayList<Integer> destino = new ArrayList<>();
    ArrayList<Integer> peso = new ArrayList<>();
    ArrayList<Integer> inicioFinal = new ArrayList<>();
    ArrayList<Integer> destinoFinal = new ArrayList<>();
    ArrayList<Integer> pesoFinal = new ArrayList<>();
    FileWriter fichero = null;
    PrintWriter pw = null;
    public Busqueda(ArrayList<Integer> i ,ArrayList<Integer> d,ArrayList<Integer> p){  
        try{ fichero = new FileWriter("archivo2.txt");pw = new PrintWriter(fichero);}catch(Exception e){}
        this.inicio=i;
        this.destino=d;
        this.peso=p;
        empiezaBusqueda();
        llenaArchivo();
    }
    public void empiezaBusqueda(){
        //Empezamos la busqueda de la menor arista
        while(inicio.size()!=0){
            AristaMenorPeso();
        }
    }
    public void AristaMenorPeso(){
        int pos;
        int menor=peso.get(0);
        pos=0;
        for(int f=1;f<peso.size();f++) {
            if (peso.get(f)<menor) {
                menor=peso.get(f);
                pos=f;
            }
        }
        pesoFinal.add(peso.get(pos));
        inicioFinal.add(inicio.get(pos));
        destinoFinal.add(destino.get(pos));
        
        if(GradoNodo(inicio.get(pos),destino.get(pos))|| NoCiclos()){
            //No lo integramos a la solucion
            inicioFinal.remove(inicioFinal.size()-1);
            destinoFinal.remove(destinoFinal.size()-1);
            pesoFinal.remove(pesoFinal.size()-1);
            //Se borra de la seleccion
            inicio.remove(pos);
            destino.remove(pos);
            peso.remove(pos);
        }else{
            //Solo se borra de la seleccion
            inicio.remove(pos);
            destino.remove(pos);
            peso.remove(pos);
        }
    }
    public boolean GradoNodo(int nuevoInicio, int nuevoDestino){
        int i=0;
        int cont=0, cont2=0,cont3=0,cont4=0;
        while(i < inicioFinal.size()){
            if(inicioFinal.get(i) == nuevoInicio){cont++;}
            if(destinoFinal.get(i) == nuevoInicio){cont2++;}
            if(inicioFinal.get(i) == nuevoDestino){cont3++;}
            if(destinoFinal.get(i) == nuevoDestino){cont4++;}
                        
            if((cont+cont2)==3 || (cont3+cont4)==3){
                return true;
            }
            i++;
        }
        return false;
        
    }
    public boolean NoCiclos(){
        int j=0;
        int parejas=0;
        int i, cont,cont2,cont3,cont4,nuevoInicio,nuevoDestino;
        while(j<inicioFinal.size()){
            i=0;
            cont=0;cont2=0;cont3=0;cont4=0;
            nuevoInicio=inicioFinal.get(j);
            nuevoDestino=destinoFinal.get(j);
            while(i < inicioFinal.size()){
                if(inicioFinal.get(i) == nuevoInicio){cont++;}
                if(destinoFinal.get(i) == nuevoInicio){cont2++;}
                if(inicioFinal.get(i) == nuevoDestino){cont3++;}
                if(destinoFinal.get(i) == nuevoDestino){cont4++;}
                if((cont+cont2)==2){
                    parejas++;
                }else{
                    return false;
                }
                 if((cont3+cont4)==2){
                    parejas++;
                }else{
                    return false;
                }
                
                i++;
            }   
            j++;
        }
        if (parejas==10){
            return false;
        }else{
            return true;
        }
    }
    public void llenaArchivo(){
         try{
                for(int k=0;k<inicioFinal.size();k++){
                    pw.write(inicioFinal.get(k) +"->"+ destinoFinal.get(k)+ "[label="+pesoFinal.get(k)+"];");
                    pw.write("\n");
                }
                pw.close();
            }catch(Exception e){
            }
    }
    
}
