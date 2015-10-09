/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Tonatihu
 */
public class ProcesoX extends Thread{
    //Para lo que seran las generaciones
    int generaciones;
    //Arrays para lo que seran los Cromosomas
    ArrayList<Integer> cromosoma1;
    ArrayList<Integer> cromosoma2;
    ArrayList<Integer> cromosoma3;
    ArrayList<Integer> cromosoma4;
    ArrayList<Integer> cromosoma5;
    ArrayList<Integer> cromosoma6;
    ArrayList<Integer> valorDecimal;
    Frame f;
    public ProcesoX(int generaciones){
        this.generaciones = generaciones;
        cromosoma1 = new ArrayList<>();
        cromosoma2 = new ArrayList<>();
        cromosoma3 = new ArrayList<>();
        cromosoma4 = new ArrayList<>();
        cromosoma5 = new ArrayList<>();
        cromosoma6 = new ArrayList<>();
    }
    
    @Override
    public void run(){
        f= new Frame();
        poblacionInicial();
        valorDecimal();
        setTextArea();
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
        int i=0;
        while(i<5){
            //f.setTextX(Integer.toString(cromosoma1.get(i)));
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
        System.out.print("\n");
    }
    private void valorDecimal(){
    }
}
