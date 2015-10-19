/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author jonass
 */
public class PobInicial extends Thread{

    //Declaracion de las variables de instancia
    public int generaciones;
    JTextArea consola;
    Esperar wait;
    JLabel peso;
    public ArrayList<ArrayList>datos = new ArrayList();;
    public ArrayList<Integer> pesos = new ArrayList<>(); //pesos 
    public ArrayList<Integer> fy = new ArrayList<>(); //pesos 
    public ArrayList<Integer> fy2 = new ArrayList<>(); //pesos 
    public ArrayList<ArrayList> removidos = new ArrayList();
    //public ArrayList<Integer> a = new ArrayList<>();
    public ArrayList<ArrayList> hijos = new ArrayList<>();
    public ArrayList<Integer> pesosHijos = new ArrayList<>(); //pesos 
    //constructor por default
Total tot = new Total();
    public PobInicial(Esperar wait,int generaciones, JTextArea consola,JLabel peso) {
        this.peso=peso;
        this.generaciones=generaciones;        
        this.consola = consola;
        this.wait =  wait;
    }

    
    @Override
        public void run(){
        int z;
        IniciaValores();
       
       consola.append("Estoy en el proceso Y"); 
       consola.append("\n");
       consola.append("Poblacion Inicial: ");
                 consola.append("\n");
                 for(int q=0;q<6;q++){
                     consola.append(datos.get(q).toString());
                     consola.append("\n");
                 }
                 consola.append("\n");
                 for(int q=0;q<6;q++){
                     consola.append(pesos.get(q).toString());
                     consola.append("\t");
                     
                 }
                 consola.append("\n");
        for (int i = 0; i < generaciones; i++) {                            
                Pelear();            
                GenerarHijos();                 
                 
               // System.out.println("PAdres"+datos);
                nuevaGeneracion();  
                 wait.esperax();
               if(pesos.contains(31)){
                   break;
               }
               
               // Collections.sort(pesosHijos);                                                           
                //System.out.println(generaciones);
                //System.out.println(i);
        }//for                
        
        
        consola.append("Poblacion Final: ");
                 consola.append("\n");
                 for(int q=0;q<6;q++){
                     consola.append(datos.get(q).toString());
                     consola.append("\n");
                 }
                 consola.append("\n");
                 for(int q=0;q<6;q++){
                     consola.append(pesos.get(q).toString());
                     consola.append("\t");
                     
                 }
                 consola.append("\n");
                 
        System.out.println("Padres"+datos);
        System.out.println("PEsos:"+pesos);
        System.out.println("Hijos"+hijos);
        Collections.sort(pesos);
        int x =  pesos.get(pesos.size()-1);
        consola.append("\n");
        System.out.println("El hijo mas fuerte es "+x);
        consola.append("El hijo mas fuerte es: "+Integer.toString(x));
        peso.setText(Integer.toString(x));
        tot.setY(x);
        this.stop();
    }
        
        
        
    private ArrayList IniciaValores() {
    
        ArrayList<Integer> individuo = new ArrayList();
        //crearemos la poblacion inicial con 6 
        for (int i = 0; i < 6; i++) {
            //individuo sera igual a lo que regrese la funcion crear individuo 
            individuo = CrearIndividuo();
            //si es la primera vez que se corre el arraylist de datos estara vacio
            //y no habra necesidad de validar si se repite un individuo
            if (datos.isEmpty()) {
                //agregamos el primer individuo de la poblacion inicial
                calcularPeso(individuo);
                datos.add(individuo);
            } else {
                //otro caso tendremos que validar si no hay un individuo que se repita
                //si no se repite lo agregamos al array de datos
                datos.add(Validar(individuo));
            }
        }
        return datos;
    }

    private ArrayList CrearIndividuo() {
        //estas 3 variables solo viven en el metodo 
        //al terminar el metodo son destruidas
        ArrayList<Integer> o = new ArrayList<>();
        Random dado = new Random();
        int numero;
        //creamos valores aleatorios para el adn del primer individuo
        for (int i = 0; i < 5; i++) {
            numero = dado.nextInt(2);
            o.add(numero);
        }
        return o;
    }

    private int calcularPeso(ArrayList o) {
        int peso = 0;
        int x = 0;

        for (int i = 0; i < o.size(); i++) {
            x = (int) o.get(i);
            if (i == 0 && x == 1) {
                peso = peso + 16;
            } else if (i == 1 && x == 1) {
                peso = peso + 8;
            } else if (i == 2 && x == 1) {
                peso = peso + 4;
            } else if (i == 3 && x == 1) {
                peso = peso + 2;
            } else if (i == 4 && x == 1) {
                peso = peso + 1;
            }

        }
        int cubo = (int) Math.pow(peso, 3);
        pesos.add(peso);
        return peso;
    }

    public ArrayList<Integer> getPesos() {
        return pesos;
    }

    private ArrayList Validar(ArrayList individuo) {
        while (datos.contains(individuo)) {
            individuo = CrearIndividuo();
        }

        calcularPeso(individuo);
        return individuo;
    }

    public ArrayList getDatos() {
        return datos;
    }

    private void Pelear() {
        int b = 5;
        for (int i = 0; i < 3 && b <= 5; i++) {
            if ((int)pesos.get(i) < (int)pesos.get(b)) {
                removidos.add(datos.get(i));
                pesos.set(i, pesos.get(b));
                datos.set(i, datos.get(b));
                fy2.add(pesos.get(b));
            } else {
                removidos.add(datos.get(b));
                pesos.set(b, pesos.get(i));
                datos.set(b, datos.get(i));
                fy2.add(pesos.get(i));
            }
            b--;
        }
       // System.out.println("Pesos modificados: " + pesos);
    }

    private void GenerarHijos() {
        
        ArrayList<Integer> aux = new ArrayList<>();
        ArrayList<Integer> aux2 = new ArrayList<>();
        ArrayList<Integer> hijo1 = new ArrayList<>();
        ArrayList<Integer> hijo2 = new ArrayList<>();
        ArrayList<Integer> hijo3 = new ArrayList<>();
        ArrayList<Integer> hijo4 = new ArrayList<>();
        ArrayList<Integer> hijo5 = new ArrayList<>();
        ArrayList<Integer> hijo6 = new ArrayList<>();
        ArrayList<Integer> hijo7 = new ArrayList<>();
        ArrayList<Integer> hijo8 = new ArrayList<>();
        ArrayList<Integer> hijo9 = new ArrayList<>();
        ArrayList<Integer> hijo10 = new ArrayList<>();
        ArrayList<Integer> hijo11 = new ArrayList<>();
        ArrayList<Integer> hijo12 = new ArrayList<>();
        boolean verifica = false;
        

        //padre 0 y 4
        aux = datos.get(0);
        aux2 = datos.get(4);
        hijo1.add(aux2.get(3));
        hijo1.add(aux2.get(4));
        hijo1.add(aux.get(0));
        hijo1.add(aux.get(1));
        hijo1.add(aux.get(2));
        hijo2.add(aux2.get(0));
        hijo2.add(aux2.get(1));
        hijo2.add(aux2.get(2));
        hijo2.add(aux.get(3));
        hijo2.add(aux.get(4));
        hijo3.add(aux2.get(3));
        hijo3.add(aux2.get(4));
        hijo3.add(aux.get(0));
        hijo3.add(aux.get(1));
        hijo3.add(aux.get(2));
        hijo4.add(aux.get(3));
        hijo4.add(aux.get(4));
        hijo4.add(aux2.get(0));
        hijo4.add(aux2.get(1));
        hijo4.add(aux2.get(2));

        verifica = ValidarHijosRepetidos(hijo1);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo1);
            calcularPesoHijos(hijo1);
        }
        verifica = ValidarHijosRepetidos(hijo2);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo2);
            calcularPesoHijos(hijo2);
        }
        verifica = ValidarHijosRepetidos(hijo3);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo3);
            calcularPesoHijos(hijo3);
        }
        verifica = ValidarHijosRepetidos(hijo4);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo4);
            calcularPesoHijos(hijo4);
        }

        //padre 1 y 3
        aux = datos.get(1);
        aux2 = datos.get(3);
        hijo5.add(aux2.get(3));
        hijo5.add(aux2.get(4));
        hijo5.add(aux.get(0));
        hijo5.add(aux.get(1));
        hijo5.add(aux.get(2));
        hijo6.add(aux2.get(0));
        hijo6.add(aux2.get(1));
        hijo6.add(aux2.get(2));
        hijo6.add(aux.get(3));
        hijo6.add(aux.get(4));
        hijo7.add(aux2.get(3));
        hijo7.add(aux2.get(4));
        hijo7.add(aux.get(0));
        hijo7.add(aux.get(1));
        hijo7.add(aux.get(2));
        hijo8.add(aux.get(3));
        hijo8.add(aux.get(4));
        hijo8.add(aux2.get(0));
        hijo8.add(aux2.get(1));
        hijo8.add(aux2.get(2));

        verifica = ValidarHijosRepetidos(hijo5);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo5);
            calcularPesoHijos(hijo5);
        }
        verifica = ValidarHijosRepetidos(hijo6);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo6);
            calcularPesoHijos(hijo6);
        }
        verifica = ValidarHijosRepetidos(hijo7);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo7);
            calcularPesoHijos(hijo7);
        }
        verifica = ValidarHijosRepetidos(hijo8);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo8);
            calcularPesoHijos(hijo8);
        }

        //padre 2 y 5
        aux = datos.get(2);
        aux2 = datos.get(5);
        hijo9.add(aux2.get(3));
        hijo9.add(aux2.get(4));
        hijo9.add(aux.get(0));
        hijo9.add(aux.get(1));
        hijo9.add(aux.get(2));
        hijo10.add(aux2.get(0));
        hijo10.add(aux2.get(1));
        hijo10.add(aux2.get(2));
        hijo10.add(aux.get(3));
        hijo10.add(aux.get(4));
        hijo11.add(aux2.get(3));
        hijo11.add(aux2.get(4));
        hijo11.add(aux.get(0));
        hijo11.add(aux.get(1));
        hijo11.add(aux.get(2));
        hijo12.add(aux.get(3));
        hijo12.add(aux.get(4));
        hijo12.add(aux2.get(0));
        hijo12.add(aux2.get(1));
        hijo12.add(aux2.get(2));
        verifica = ValidarHijosRepetidos(hijo9);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo9);
            calcularPesoHijos(hijo9);
        }
        verifica = ValidarHijosRepetidos(hijo10);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo10);
            calcularPesoHijos(hijo10);
        }
        verifica = ValidarHijosRepetidos(hijo11);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo11);
            calcularPesoHijos(hijo11);
        }
        verifica = ValidarHijosRepetidos(hijo12);
        if (verifica == false && hijos.size() < 6) {
            hijos.add(hijo12);
            calcularPesoHijos(hijo12);
        }
    }

    private boolean ValidarHijosRepetidos(ArrayList<Integer> hijo) {

        if (removidos.contains(hijo) || hijos.contains(hijo)) {
            System.out.println("El hijo" + hijo + "ya existe");
            return true;

        }

        //calcularPesoHijos(hijo);
        return false;
    }

    private int calcularPesoHijos(ArrayList o) {
        int peso = 0;
        int x = 0;

        for (int i = 0; i < o.size(); i++) {
            x = (int) o.get(i);
            if (i == 0 && x == 1) {
                peso = peso + 16;
            } else if (i == 1 && x == 1) {
                peso = peso + 8;
            } else if (i == 2 && x == 1) {
                peso = peso + 4;
            } else if (i == 3 && x == 1) {
                peso = peso + 2;
            } else if (i == 4 && x == 1) {
                peso = peso + 1;
            }

        }
        int cubo = (int) Math.pow(peso, 3);
        pesosHijos.add(peso);
        return peso;
    }

    
    private void nuevaGeneracion(){
        datos.clear();
        datos.addAll(hijos);
//        datos.set(0,hijos.get(0));
  //      datos.set(1,hijos.get(1));
    //    datos.set(2,hijos.get(2));
      //  datos.set(3,hijos.get(3));
     //   datos.set(4,hijos.get(4));
       // datos.set(5,hijos.get(5));        
    }
    
}
