/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heuristicavoraz;

/**
 *
 * @author Tonatihu
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;

public class voraz implements Comparator {

  // Numero de nodos del Grafo
  static int n_nodos;
  static int row;
  // Contiene las aristas del grafo y sus longitudes    
  private static ArrayList grafo;
  // Controla el numero de veces que un nodo 
  // determinado forma parte de una arista
  private static Vector visitas;
  // Contiene las aristas seleccionadas
  private static Vector recorrido;
  // Distancia total del recorrido seleccionado
  private static int distancia= 0;
  // lista de nodos que componen el recorrido solucion  
  private static Vector ciclo;   
            
  // Metodo para ordenar las aristas del grafo en orden creciente
  public int compare(Object obj1, Object obj2) {
        int w_arista1 = ((arista)obj1).peso();
        int w_arista2 = ((arista)obj2).peso();
        if (w_arista1 == w_arista2)
          return (0);
        if (w_arista1 < w_arista2)
          return (-1);
        return (1);                  
  } 
  
  // Metodo para imprimir las aristas seleccionadas y
  // calcular la distancia total del recorrido                
  public static void print(Collection c){
      for (Iterator x=c.iterator(); x.hasNext();) {    
          arista a =(arista)x.next();
          ((arista)a).print();
          distancia += ((arista)a).peso();
      }    
  }  
  
  private static String printCiclo() {    
   String resultado;
   resultado = "Ciclo: ";
   resultado = resultado + "(";
   for (Iterator x=ciclo.iterator(); x.hasNext();) 
       resultado = resultado + x.next()+" ";       

   resultado = resultado +")\n";
   resultado = resultado + "Distancia recorrida = "+distancia;          
   JOptionPane.showMessageDialog(null,"La distancia recorrida es:"+distancia);
   return resultado;
  } 
             
  private static void Heuristica_voraz() {
      distancia = 0;
      // Se añade la primera arista al vector Recorrido         
      ListIterator  lit = grafo.listIterator();
      arista a = (arista)lit.next();                
      recorrido.addElement((arista)a);
      distancia += ((arista)a).peso();      
      // Actualiza el numero de visitas de los nodos de la arista elegida
      int nodo_salida = ((arista)a).i_arista();
      int nodo_llegada = ((arista)a).f_arista();
      
      visitas.setElementAt("1",nodo_salida-1);
      visitas.setElementAt("1",nodo_llegada-1); 

      // Repetir hasta que se vean todas las aristas
      while (lit.hasNext()) {
        a = (arista)lit.next();

        int u = ((arista)a).i_arista();
        int v = ((arista)a).f_arista();
   
        if  ((recorrido.size() < (n_nodos-1)) && 
             (u != nodo_salida) && 
             (v != nodo_salida))  {     
         // Comprobar que  no es la tercera arista 
         // que incide en el mismo vertice
            if ((Integer.parseInt((String)visitas.elementAt(u-1)) < 2)
               && (Integer.parseInt((String)visitas.elementAt(v-1))<2)) {
           // Icrementar el numero de visitas para 
           // cada nodo de la arista
               int obj = Integer.parseInt((String)visitas.elementAt(u-1))+1;
               visitas.setElementAt(""+obj,u-1);
               obj = Integer.parseInt((String)visitas.elementAt(v-1))+1;
               visitas.setElementAt(""+obj,v-1);
                // Añadir la arista al recorrido
               recorrido.addElement((arista)a);
               distancia += ((arista)a).peso();                           
            }
        }    
       } // del while
        // es la ultima iteracion que completa el viaje y
        // es una arista que conecta con el nodo de salida ...
       lit = grafo.listIterator();
    // Repetir hasta que no se encuentre la arista que cierra el ciclo
    // Empieza en la segunda arista del grafo ordenado
       lit.next();
       while (lit.hasNext()) {
         a = (arista)lit.next();
         int u = ((arista)a).i_arista();
         int v = ((arista)a).f_arista();       
         if ((u == nodo_salida) || (v == nodo_salida)){
         // Comprobar que  no es la tercera arista 
         // que incide en el mismo vertice
            if ((Integer.parseInt((String)visitas.elementAt(u-1)) < 2)
               && (Integer.parseInt((String)visitas.elementAt(v-1))<2)) {
          
                // Añadir la arista al recorrido
               recorrido.addElement((arista)a);
               distancia += ((arista)a).peso(); 
               break;           
            }
         } // del if
       } // del while 
  }
  
  private static void makeCiclo() {
   int i=0;
   int u = ((arista)recorrido.elementAt(0)).i_arista();
   int v = ((arista)recorrido.elementAt(0)).f_arista();
   int nodo_inic = u;
   // Se añade al ciclo el primer nodo del recorrido
   ciclo.setElementAt(""+u,i++);
   ciclo.setElementAt(""+v,i++); 
   
   while (i < recorrido.size()+1) {  
       int sig = buscar_siguiente(u,v);       
       // si ha encontrado el siguiente nodo
       if (sig > 0) {
         ciclo.setElementAt(""+sig,i++);
         u = v;
         v = sig;
       } else {
           System.out.println("Error : no he podido encontrar el siguiente de "+v);         
           System.exit( 0 );
       }    
   } // del while
  }
  
  private static int buscar_siguiente(int a1, int a2) {
      for (int i=0; i<recorrido.size();i++) {
          int u = ((arista)recorrido.elementAt(i)).i_arista();
          int v = ((arista)recorrido.elementAt(i)).f_arista();
     // hay que buscar una arista (u,v) que no sea la arista a=(a1,a2)
     // y donde a2 este en (u,v)
          if ((a1 != u) && (a1 != v)) {
              if (a2 == u) return v;
              if (a2 == v) return u;
          };         
      }
      return (-1);
  }

  // Constructores
  voraz(){}
  public void voraz(ArrayList p){
    voraz(p,10);
   String resultado = procesar();
 //  print(grafo);
   System.out.println("Recorrido: ");    
   for (Iterator x=recorrido.iterator(); x.hasNext();) 
       ((arista)x.next()).print();   
   //System.out.println(resultado);  
  }
  
  public void voraz(ArrayList g, int n) {
      n_nodos = n;
      visitas = new Vector(n_nodos);   
      for (int i=0;i<n_nodos;i++)
       visitas.addElement(""+0);     
      
      ciclo = new Vector(n_nodos);   
      for (int i=0;i<n_nodos+1;i++)
       ciclo.addElement(""+0);

      recorrido = new Vector();
            
      grafo = new ArrayList();  
      for (Iterator x=g.iterator(); x.hasNext();)
       grafo.add(x.next());
  }
  
  public static String procesar(){              
      voraz ac = new voraz();         
      Collections.sort(grafo,ac);     
    // Aplica el algoritmo voraz de Kruskal
      Heuristica_voraz();      
      makeCiclo();        
      return(printCiclo());        
  }
  
  public Vector getCilcos(){
	        return recorrido;
	    }
}