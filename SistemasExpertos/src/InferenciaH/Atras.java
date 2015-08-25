/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InferenciaH;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author cuatito
 */
public class Atras {
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
    ArrayList<String> subObjetivo = new ArrayList();
    public Atras(ArrayList<String> baseConocimiento, String objetivo ){
        //se asigna base de conocimiento y objetivo
        this.baseConocimiento = baseConocimiento;
        this.objetivo = objetivo;
        totalBC = baseConocimiento.size();
        subObjetivo.clear();
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
        try{ fichero = new FileWriter("archivo.txt");pw = new PrintWriter(fichero);}catch(Exception e){}
        buscarObjetivo();
    }
    public void buscarObjetivo(){
        if(objetivo.equals("h4")&&evaluaReglas("r1")){
            try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}
        }else{
            if(objetivo.equals("h9")&&evaluaReglas("r2")){
                try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}
            }else{
                if(objetivo.equals("h9")&&evaluaReglas("r3")){
                    try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}
                }else{
                    if(objetivo.equals("h1")&&evaluaReglas("r4")){
                        try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}
                    }else{
                        if(objetivo.equals("h5")&&evaluaReglas("r5")){
                            try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}
                        }else{
                            if(objetivo.equals("h2")&&evaluaReglas("r6")){
                                try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}
                            }else{
                                if(objetivo.endsWith("h6")&&evaluaReglas("r7")){
                                    try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}
                                }else{
                                    if(objetivo.equals("h9")&&evaluaReglas("r8")){
                                        try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}
                                    }else{
                                        if(objetivo.equals("h6")&&evaluaReglas("r9")){
                                            try{pw.write("Objetivo Alcanzable"+"\n");fichero.close();}catch(Exception e){}
                                        }else{
                                            try{pw.write("Objetivo No Alcanzable"+"\n");fichero.close();}catch(Exception e){}
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
    public boolean evaluaReglas(String r){
        switch(r){
            case "r1":
                if(evalua("h8")&&evalua("h6")&&evalua("h5")){
                    return true;
                }else{
                    return false;
                }
            case "r2": 
                if(evalua(r2.get(0))&&evalua(r2.get(1))){
                    return true;
                }else{
                    return false;
                }
            case "r3":
                 if(evalua(r3.get(0))&&evalua(r3.get(1))){
                    return true;
                }else{
                    return false;
                }
            case "r4":      
                 if(evalua(r4.get(0))){
                    return true;
                }else{
                    return false;
                }
            case "r5":
                 if(evalua(r5.get(0))){
                    return true;
                }else{
                    return false;
                }
            case "r6":  
                 if(evalua(r6.get(0))&&evalua(r6.get(1))){
                    return true;
                }else{
                    return false;
                }
            case "r7":
                 if(evalua(r7.get(0))){
                    return true;
                }else{
                    return false;
                }
            case "r8":  
                 if(evalua(r8.get(0))&&evalua(r8.get(1))){
                    return true;
                }else{
                    return false;
                }
            case "r9":
                 if(evalua(r9.get(0))&&evalua(r9.get(1))){
                    return true;
                }else{
                    return false;
                }
            default: return false;     
        }
    }
    public boolean evalua(String h){
        if(baseConocimiento.contains(h)){
            return true;
        }else{
            if(subObjetivo(h)){
                return true;
            }else{
                return false;
            }
        }
    }
    public boolean subObjetivo(String subobjetivo){
       if(subobjetivo.equals("h4")&&evaluaReglas("r1")){
           return true;
            //try{pw.write("Evaluando SubObjetivo"+subobjetivo+"\n");}catch(Exception e){}
        }else{
            if(subobjetivo.equals("h9")&&evaluaReglas("r2")){
                return true;
              //  try{pw.write("Objetivo Alcanzable"+"\n");}catch(Exception e){}
            }else{
                if(subobjetivo.equals("h9")&&evaluaReglas("r3")){
                    return true;
                //    try{pw.write("Objetivo Alcanzable"+"\n");}catch(Exception e){}
                }else{
                    if(subobjetivo.equals("h1")&&evaluaReglas("r4")){
                        return true;
                  //      try{pw.write("Objetivo Alcanzable"+"\n");}catch(Exception e){}
                    }else{
                        if(subobjetivo.equals("h5")&&evaluaReglas("r5")){
                            return true;
                    //        try{pw.write("Objetivo Alcanzable"+"\n");}catch(Exception e){}
                        }else{
                            if(subobjetivo.equals("h2")&&evaluaReglas("r6")){
                                return true;
                      //          try{pw.write("Objetivo Alcanzable"+"\n");}catch(Exception e){}
                            }else{
                                if(subobjetivo.endsWith("h6")&&evaluaReglas("r7")){
                                    return true;
                        //            try{pw.write("Objetivo Alcanzable"+"\n");}catch(Exception e){}
                                }else{
                                    if(subobjetivo.equals("h9")&&evaluaReglas("r8")){
                                        return true;
                          //              try{pw.write("Objetivo Alcanzable"+"\n");}catch(Exception e){}
                                    }else{
                                        if(subobjetivo.equals("h6")&&evaluaReglas("r9")){
                                            return true;
                            //                try{pw.write("Objetivo Alcanzable"+"\n");}catch(Exception e){}
                                        }else{
                                            return false;
                              //              try{pw.write("Objetivo No Alcanzable"+"\n");}catch(Exception e){}
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
