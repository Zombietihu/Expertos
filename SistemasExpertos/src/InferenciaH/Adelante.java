/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InferenciaH;

import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author cuatito
 */
public class Adelante extends PideDatos{
    ArrayList<String> baseConocimiento = new ArrayList();
    int totalBC, ban=0;
    String objetivo;
    FileWriter fichero = null;
    PrintWriter pw = null;
    ArrayList<String> r1 = new ArrayList();
    ArrayList<String> r2 = new ArrayList();
    ArrayList<String> r3 = new ArrayList();
    ArrayList<String> r4 = new ArrayList();
    ArrayList<String> r5 = new ArrayList();
    ArrayList<String> r6 = new ArrayList();
    ArrayList<String> r7 = new ArrayList();
    ArrayList<String> r8 = new ArrayList();
    ArrayList<String> r9 = new ArrayList();
 
    
    public Adelante(ArrayList<String> baseConocimiento, String objetivo ){
        //se asigna base de conocimiento y objetivo
        this.baseConocimiento = baseConocimiento;
        this.objetivo = objetivo;
        totalBC = baseConocimiento.size();
        //se dan las reglas
        r1.add("h8");r1.add("h6");r1.add("h5");//r1.add("h4");
        r2.add("h6");r2.add("h3");//r2.add("h9");
        r3.add("h7");r3.add("h4");//r3.add("h9");
        r4.add("h8");//r4.add("h1");
        r5.add("h6");//r5.add("h5");
        r6.add("h9");r6.add("h1");//r6.add("h2");
        r7.add("h7");//r7.add("h6");
        r8.add("h1");r8.add("h7");//r8.add("h9");
        r9.add("h1");r9.add("h8");//r9.add("h6");
        //se inicia consola
        comenzar();
    }
    public void comenzar(){
        //se buscan los elementos conocidos 
        //sistema.consola.setText("sifunciono: ");
        try{ fichero = new FileWriter("archivo.txt");pw = new PrintWriter(fichero);}catch(Exception e){}
        buscarCondicion();
    }
    public void buscarCondicion(){
        muestraBase();
        //busca en R1
        //Si r1 contine la primer variable de la BC y el objetivo es alcanzable
        if(r1.contains(baseConocimiento.get(ban))&& comparaVariables("r1")){try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}}
        //Lo mismo pero para R2
        else{
             if(r2.contains(baseConocimiento.get(ban))&& comparaVariables("r2")){try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}}
             else{
                  if(r3.contains(baseConocimiento.get(ban))&& comparaVariables("r3")){try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}}
                  else{
                       if(r4.contains(baseConocimiento.get(ban))&& comparaVariables("r4")){try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}}
                       else{
                            if(r5.contains(baseConocimiento.get(ban))&& comparaVariables("r5")){try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}}
                            else{
                                 if(r6.contains(baseConocimiento.get(ban))&& comparaVariables("r6")){try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}}
                                 else{
                                      if(r7.contains(baseConocimiento.get(ban))&& comparaVariables("r7")){try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}}
                                      else{
                                           if(r8.contains(baseConocimiento.get(ban))&& comparaVariables("r8")){try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}}
                                           else{
                                                if(r9.contains(baseConocimiento.get(ban))&& comparaVariables("r9")){try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}}
                                                else{
                                                    ban++;
                                                    if(ban==baseConocimiento.size()){
                                                        ;try{pw.write("No se pueden evaluar mas Reglas"+"\n");pw.write("Objetivo no alcanzable"+"\n");fichero.close();}catch(Exception e){}
                                                    }else{
                                                        buscarCondicion();
                                                    }
                                                }
                                           }                                           
                                      }
                                 }
                            }
                       }
                  }
             }
        }
    }
    public boolean comparaVariables(String r){
        switch(r){
            case "r1":
                try{pw.write("Evaluando R1..."+"\n");}catch(Exception e){}
                //Se compara que se contengan todas las variables en la BC.
                if(baseConocimiento.contains(r1.get(0))&&baseConocimiento.contains(r1.get(1))&&baseConocimiento.contains(r1.get(2))){
                    //Si si las tiene se compara el objetivo con la deduccion verdadera
                    if(objetivo.equals("h4")){return true;}//Si es verdadero regresa true
                    //Sie verifica si se conoce la variable, en caso falso se agrega a la BC
                    else{if(!baseConocimiento.contains("h4")){baseConocimiento.add("h4");return false;}return false;}//Si es falso regresa false
                }else{return false;}
            case "r2":
                try{pw.write("Evaluando R2..."+"\n");}catch(Exception e){}
                if(baseConocimiento.contains(r2.get(0))&&baseConocimiento.contains(r2.get(1))){
                    if(objetivo.equals("h9")){return true;}
                    else{if(!baseConocimiento.contains("h9")){baseConocimiento.add("h9");return false;}return false;}
                }else{return false;}
            case "r3":    
                try{pw.write("Evaluando R3..."+"\n");}catch(Exception e){}
                if(baseConocimiento.contains(r3.get(0))&&baseConocimiento.contains(r3.get(1))){
                    if(objetivo.equals("h9")){return true;}
                    else{if(!baseConocimiento.contains("h9")){baseConocimiento.add("h9");return false;}return false;}
                }else{return false;}
            case "r4":
                try{pw.write("Evaluando R4..."+"\n");}catch(Exception e){}
                if(baseConocimiento.contains(r4.get(0))){
                    if(objetivo.equals("h1")){return true;}
                    else{if(!baseConocimiento.contains("h1")){baseConocimiento.add("h1");return false;}return false;}
                }else{return false;}
            case "r5":
                try{pw.write("Evaluando R5..."+"\n");}catch(Exception e){}
                if(baseConocimiento.contains(r5.get(0))){
                    if(objetivo.equals("h5")){return true;}
                    else{if(!baseConocimiento.contains("h5")){baseConocimiento.add("h5");return false;}return false;}
                }else{return false;}
            case "r6":
                try{pw.write("Evaluando R6..."+"\n");}catch(Exception e){}
                if(baseConocimiento.contains(r6.get(0))&&baseConocimiento.contains(r6.get(1))){
                    if(objetivo.equals("h2")){return true;}
                    else{if(!baseConocimiento.contains("h2")){baseConocimiento.add("h2");return false;}return false;}
                }else{return false;}
            case "r7":
                try{pw.write("Evaluando R7..."+"\n");}catch(Exception e){}
                if(baseConocimiento.contains(r7.get(0))){
                    if(objetivo.equals("h6")){return true;}
                    else{if(!baseConocimiento.contains("h6")){baseConocimiento.add("h6");return false;}return false;}
                }else{return false;}
            case "r8":
                try{pw.write("Evaluando R8..."+"\n");}catch(Exception e){}
                if(baseConocimiento.contains(r8.get(0))&&baseConocimiento.contains(r8.get(1))){
                    if(objetivo.equals("h9")){return true;}
                    else{if(!baseConocimiento.contains("h9")){baseConocimiento.add("h9");return false;}return false;}
                }else{return false;}
            case "r9":    
                try{pw.write("Evaluando R9..."+"\n");}catch(Exception e){}
                if(baseConocimiento.contains(r9.get(0))&&baseConocimiento.contains(r9.get(1))){
                    if(objetivo.equals("h6")){return true;}
                    else{if(!baseConocimiento.contains("h6")){baseConocimiento.add("h6");return false;}return false;}
                }else{return false;}
            default:                
                return false;
        }
    }
    public void muestraBase(){
        try{
            pw.write("La BC es: {");
            for(int i=0; i<baseConocimiento.size();i++){
                pw.write(baseConocimiento.get(i));
                System.out.println(baseConocimiento.get(i));
            }
            pw.write("}"+"\n");
        }catch(Exception e){}    
    }
    
   
}
