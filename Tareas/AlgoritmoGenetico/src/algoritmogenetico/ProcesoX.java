/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Tonatihu
 */
public class ProcesoX extends Thread{
    //Para el archivo
    FileWriter fichero = null;
    PrintWriter pw = null;
    //Para lo que seran las generaciones
    int generaciones;
    //Arrays para lo que seran los Cromosomas
    ArrayList<Integer> cromosoma1;
    ArrayList<Integer> cromosoma2;
    ArrayList<Integer> cromosoma3;
    ArrayList<Integer> cromosoma4;
    ArrayList<Integer> cromosoma5;
    ArrayList<Integer> cromosoma6;
    //Arrays para los valores decimales
    ArrayList<Integer> valorDecimal;
    ArrayList<Integer> tmpDecimal;
    ArrayList<Integer> tmp1;
    ArrayList<Integer> tmp2;
    ArrayList<Integer> tmp3; 
    //Arrays Para los hijos
    ArrayList<Integer> hijo1;
    ArrayList<Integer> hijo2;
    ArrayList<Integer> hijo3;
    ArrayList<Integer> hijo4;
    ArrayList<Integer> hijo5;
    ArrayList<Integer> hijo6;
    ArrayList<Integer> hijo7;
    ArrayList<Integer> hijo8;
    ArrayList<Integer> hijo9;
    ArrayList<Integer> hijo10;
    ArrayList<Integer> hijo11;
    ArrayList<Integer> hijo12;
    //Para ya no se pero lo ocupo xD
    ArrayList<ArrayList> hijos;
    Frame f;
    public ProcesoX(int generaciones){
        this.generaciones = generaciones;
        cromosoma1 = new ArrayList<>();
        cromosoma2 = new ArrayList<>();
        cromosoma3 = new ArrayList<>();
        cromosoma4 = new ArrayList<>();
        cromosoma5 = new ArrayList<>();
        cromosoma6 = new ArrayList<>();
        valorDecimal = new ArrayList<>();
        tmpDecimal = new ArrayList<>();
        tmp1 = new ArrayList<>();
        tmp2 = new ArrayList<>();
        tmp3 = new ArrayList<>();
        hijo1 = new ArrayList<>();
        hijo2 = new ArrayList<>();
        hijo3 = new ArrayList<>();
        hijo4 = new ArrayList<>();
        hijo5 = new ArrayList<>();
        hijo6 = new ArrayList<>();
        hijo7 = new ArrayList<>();
        hijo8 = new ArrayList<>();
        hijo9 = new ArrayList<>();
        hijo10 = new ArrayList<>();
        hijo11 = new ArrayList<>();
        hijo12 = new ArrayList<>();
        hijos = new ArrayList<>();
        try{ fichero = new FileWriter("archivoX.txt");pw = new PrintWriter(fichero);}catch(Exception e){}
    }
    
    @Override
    public void run(){
        f= new Frame();
        poblacionInicial();
        setTextArea();
        seleccionaVs();
        crearHijos();
        llenaArchivo();
        seleccionaHijosGrandes();  
        laNuevaGeneracion();
    }
    private void crearHijos(){
        //Hijos Padre1 y Padre6
        hijo1.add(cromosoma1.get(0));hijo1.add(cromosoma1.get(1));hijo1.add(cromosoma1.get(2));
        hijo1.add(cromosoma6.get(3));hijo1.add(cromosoma6.get(4));
        
        hijo2.add(cromosoma6.get(0));hijo2.add(cromosoma6.get(1));hijo2.add(cromosoma6.get(2));
        hijo2.add(cromosoma1.get(3));hijo2.add(cromosoma1.get(4));
        
        hijo3.add(cromosoma6.get(3));hijo3.add(cromosoma6.get(4));
        hijo3.add(cromosoma1.get(0));hijo3.add(cromosoma1.get(1));hijo3.add(cromosoma1.get(2));
        
        hijo4.add(cromosoma1.get(3));hijo4.add(cromosoma1.get(4));
        hijo4.add(cromosoma6.get(0));hijo4.add(cromosoma6.get(1));hijo4.add(cromosoma6.get(2));
        
        //Hijos Padre2 y Padre3
        hijo5.add(cromosoma2.get(0));hijo5.add(cromosoma2.get(1));hijo5.add(cromosoma2.get(2));
        hijo5.add(cromosoma3.get(3));hijo5.add(cromosoma3.get(4));
        
        hijo6.add(cromosoma3.get(3));hijo6.add(cromosoma3.get(4));
        hijo6.add(cromosoma2.get(0));hijo6.add(cromosoma2.get(1));hijo6.add(cromosoma2.get(2));
        
        hijo7.add(cromosoma3.get(0));hijo7.add(cromosoma3.get(1));hijo7.add(cromosoma3.get(2));
        hijo7.add(cromosoma2.get(3));hijo7.add(cromosoma2.get(4));
        
        hijo8.add(cromosoma2.get(3));hijo8.add(cromosoma2.get(4));
        hijo8.add(cromosoma3.get(0));hijo8.add(cromosoma3.get(1));hijo8.add(cromosoma3.get(2));
        
        //Hujos Padre4 y Padre5
        hijo9.add(cromosoma5.get(0));hijo9.add(cromosoma5.get(1));hijo9.add(cromosoma5.get(2));
        hijo9.add(cromosoma4.get(3));hijo9.add(cromosoma4.get(4));
        
        hijo10.add(cromosoma4.get(3));hijo10.add(cromosoma4.get(4));
        hijo10.add(cromosoma5.get(0));hijo10.add(cromosoma5.get(1));hijo10.add(cromosoma5.get(2));
        
        hijo11.add(cromosoma4.get(0));hijo11.add(cromosoma4.get(1));hijo11.add(cromosoma4.get(2));
        hijo11.add(cromosoma5.get(3));hijo11.add(cromosoma5.get(4));
        
        hijo12.add(cromosoma5.get(3));hijo12.add(cromosoma5.get(4));
        hijo12.add(cromosoma4.get(0));hijo12.add(cromosoma4.get(1));hijo12.add(cromosoma4.get(2));
        
        hijos.add(hijo1);
        hijos.add(hijo2);
        hijos.add(hijo3);
        hijos.add(hijo4);
        hijos.add(hijo5);
        hijos.add(hijo6);
        hijos.add(hijo7);
        hijos.add(hijo8);
        hijos.add(hijo9);
        hijos.add(hijo10);
        hijos.add(hijo11);
        hijos.add(hijo12);
    }
    private void laNuevaGeneracion(){
        //Se limpian los cromosomas
        cromosoma1.clear();cromosoma2.clear();cromosoma3.clear();cromosoma4.clear();
        cromosoma5.clear();cromosoma6.clear();
        //mutamos cromosomas
        cromosoma1 = (ArrayList<Integer>)hijos.get(tmpDecimal.indexOf(tmp2.get(tmp2.size()-6))).clone();
        cromosoma2 = (ArrayList<Integer>)hijos.get(tmpDecimal.indexOf(tmp2.get(tmp2.size()-5))).clone();
        cromosoma3 = (ArrayList<Integer>)hijos.get(tmpDecimal.indexOf(tmp2.get(tmp2.size()-4))).clone();
        cromosoma4 = (ArrayList<Integer>)hijos.get(tmpDecimal.indexOf(tmp2.get(tmp2.size()-3))).clone();
        cromosoma5 = (ArrayList<Integer>)hijos.get(tmpDecimal.indexOf(tmp2.get(tmp2.size()-2))).clone();
        cromosoma6 = (ArrayList<Integer>)hijos.get(tmpDecimal.indexOf(tmp2.get(tmp2.size()-1))).clone();
        System.out.print("\n"+"Los cromosomas mutados son: "+"\n");
        llenaArchivo();
        //limpiar todos los temporales
        /*
        ** Tengo que limpiar todos los temporales 
        ** y hay que regresar los valors
        ** ademas hay que hacer la sinconización
        ** y creo que eso ya es todo :P
        ** NOTA: 5 generaciones max --- probar ya con seleccion
        ** NOTA2: agregar for :P
        */
        
    }
    private void poblacionInicial(){
        //se inicia el random
        Random rnd = new Random();
        //Se comienza el llenado de los cromosomas
        cromosoma1.add(rnd.nextInt(2));cromosoma1.add(rnd.nextInt(2));
        cromosoma1.add(rnd.nextInt(2));cromosoma1.add(rnd.nextInt(2));cromosoma1.add(rnd.nextInt(2));
        cromosoma2.add(rnd.nextInt(2));cromosoma2.add(rnd.nextInt(2));
        cromosoma2.add(rnd.nextInt(2));cromosoma2.add(rnd.nextInt(2));cromosoma2.add(rnd.nextInt(2));
        cromosoma3.add(rnd.nextInt(2));cromosoma3.add(rnd.nextInt(2));
        cromosoma3.add(rnd.nextInt(2));cromosoma3.add(rnd.nextInt(2));cromosoma3.add(rnd.nextInt(2));
        cromosoma4.add(rnd.nextInt(2));cromosoma4.add(rnd.nextInt(2));
        cromosoma4.add(rnd.nextInt(2));cromosoma4.add(rnd.nextInt(2));cromosoma4.add(rnd.nextInt(2));
        cromosoma5.add(rnd.nextInt(2));cromosoma5.add(rnd.nextInt(2));
        cromosoma5.add(rnd.nextInt(2));cromosoma5.add(rnd.nextInt(2));cromosoma5.add(rnd.nextInt(2));
        cromosoma6.add(rnd.nextInt(2));cromosoma6.add(rnd.nextInt(2));
        cromosoma6.add(rnd.nextInt(2));cromosoma6.add(rnd.nextInt(2));cromosoma6.add(rnd.nextInt(2));
    }
    private void setTextArea(){
        valorDecimal.add(valorDecimal(cromosoma1));
        valorDecimal.add(valorDecimal(cromosoma2));
        valorDecimal.add(valorDecimal(cromosoma3));
        valorDecimal.add(valorDecimal(cromosoma4));
        valorDecimal.add(valorDecimal(cromosoma5));
        valorDecimal.add(valorDecimal(cromosoma6));
        System.out.println("La poblacion inicial es: ");
        llenaArchivo();
        System.out.print("\n");
        int i=0;
         while(i<6){
            System.out.print(valorDecimal.get(i)+"\t");
            i++;
        }
       
    }
    private void seleccionaVs(){
        //se echan a pelear 1 y 2 xD
        if((int)valorDecimal.get(0)<(int)valorDecimal.get(1)){
            cromosoma1.clear();
            cromosoma1 = (ArrayList<Integer>) cromosoma2.clone();
        }
        else if((int)valorDecimal.get(0)>(int)valorDecimal.get(1)){
            cromosoma2.clear();
            cromosoma2 = (ArrayList<Integer>) cromosoma1.clone();
        }
        else if((int)valorDecimal.get(0)==(int)valorDecimal.get(1)){
            cromosoma2.clear();
            cromosoma2 = (ArrayList<Integer>) cromosoma1.clone();
        }
        //se echan a pelear 3 y 4 xD
        if((int)valorDecimal.get(2)<(int)valorDecimal.get(3)){
            cromosoma3.clear();
            cromosoma3 = (ArrayList<Integer>) cromosoma4.clone();
        }
        else if((int)valorDecimal.get(2)>(int)valorDecimal.get(3)){
            cromosoma4.clear();
            cromosoma4 = (ArrayList<Integer>) cromosoma3.clone();
        }
        else if((int)valorDecimal.get(2)==(int)valorDecimal.get(3)){
            cromosoma3.clear();
            cromosoma3 = (ArrayList<Integer>) cromosoma4.clone();
        }
        //se echan a pelear 5 y 6 xD
        if((int)valorDecimal.get(4)<(int)valorDecimal.get(5)){
            cromosoma5.clear();
            cromosoma5 = (ArrayList<Integer>) cromosoma6.clone();
        }
        else if((int)valorDecimal.get(4)>(int)valorDecimal.get(5)){
            cromosoma6.clear();
            cromosoma6 = (ArrayList<Integer>) cromosoma5.clone();
        }
        else if((int)valorDecimal.get(6)==(int)valorDecimal.get(5)){
            cromosoma6.clear();
            cromosoma6 = (ArrayList<Integer>) cromosoma5.clone();
        } 
        System.out.println("\n"+"La poblacion mas fuerte es: ");
    }
    
    private void seleccionaHijosGrandes(){
        for(int i=0; i<9;i=i+4){
            tmpDecimal.add(valorDecimal(hijos.get(i)));
            tmpDecimal.add(valorDecimal(hijos.get(i+1)));
            tmpDecimal.add(valorDecimal(hijos.get(i+2)));
            tmpDecimal.add(valorDecimal(hijos.get(i+3)));
        }
        System.out.print("\n"+"Los hijos resultantes son: "+"\n");
        int i=0;
         while(i<12){
            System.out.print(tmpDecimal.get(i)+"\t");
            i++;
        }
        //obtenemos los 6 mayores 
        tmp1 = (ArrayList<Integer>)tmpDecimal.clone();
        Collections.sort(tmp1);
        tmp2 = (ArrayList<Integer>)tmp1.clone();
        //comparamos que ninguno exista en con los padres 
        for(int j=0;j<5;j++){
            if(tmp1.contains(valorDecimal.get(j))){
                while(tmp2.remove(valorDecimal.get(j))){
                    if(tmp2.size()==6)
                        break;
                }
            }
        }
        System.out.print("\n"+"Los hijos no repetidos son: "+"\n");
        i=0;
         while(i<tmp2.size()){
            System.out.print(tmp2.get(i)+"\t");
            i++;
        } 
        
    }
    
    private int valorDecimal(ArrayList<Integer> binario){
        int decimal=0;
        decimal=(int)binario.get(0)*(int)Math.pow(2,4)+
                (int)binario.get(1)*(int)Math.pow(2,3)+
                (int)binario.get(2)*(int)Math.pow(2,2)+
                (int)binario.get(3)*(int)Math.pow(2,1)+
                (int)binario.get(4)*(int)Math.pow(2,0);            
        //Se agregan los decimales;
        return decimal;
        
        
    }
    public void llenaArchivo(){
        System.out.print("\n");
        int i=0;
         while(i<5){
            System.out.print(cromosoma1.get(i));
            i++;
        }
        System.out.print("\n");
        i=0;
         while(i<5){
            System.out.print(cromosoma2.get(i));
            i++;
        }
        System.out.print("\n");
        i=0;
         while(i<5){
            System.out.print(cromosoma3.get(i));
            i++;
        } 
        System.out.print("\n");
        i=0;
         while(i<5){
            System.out.print(cromosoma4.get(i));
            i++;
        } 
        System.out.print("\n");
        i=0;
         while(i<5){
            System.out.print(cromosoma5.get(i));
            i++;
        } 
        System.out.print("\n");
        i=0;
         while(i<5){
            System.out.print(cromosoma6.get(i));
            i++;
        } 
    }
}
