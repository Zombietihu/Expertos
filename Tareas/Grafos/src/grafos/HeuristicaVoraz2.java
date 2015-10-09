/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Tonatihu
 */
public class HeuristicaVoraz2 {
    FileWriter fichero = null;
    PrintWriter pw = null;
    ArrayList<Integer> inicio = new ArrayList<>();
    ArrayList<Integer> destino = new ArrayList<>();
    ArrayList<Integer> peso = new ArrayList<>();
    public  HeuristicaVoraz2(){
        int i = 1;
        int j = 1;
        int pesoRandom;
        try{ fichero = new FileWriter("archivo.txt");pw = new PrintWriter(fichero);}catch(Exception e){}
        Random rnd = new Random();
            while(i<11){      
                j=i+1;
                while(j<11){
                    pesoRandom = rnd.nextInt(80)+10;
                    System.out.println(pesoRandom);
                    inicio.add(i);
                    destino.add(j);
                    peso.add(pesoRandom);
                    j++;
                }
                i++;
                
            }
            System.out.println("... Guardados "+
                    +peso.size()+" caminos  ...");
            try{
                for(int k=0;k<inicio.size();k++){
                    pw.write(inicio.get(k) +"->"+ destino.get(k)+ "[label="+peso.get(k)+"];");
                    pw.write("\n");
                }
                pw.close();
            }catch(Exception e){
            }
             //System.out.println(inicio.get(40)+"-->"+destino.get(40)+" = "+peso.get(40));
            
           Busqueda b = new Busqueda(inicio,destino,peso);
    }
    
}
