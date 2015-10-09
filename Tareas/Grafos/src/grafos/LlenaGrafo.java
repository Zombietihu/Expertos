/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Tonatihu
 */
public class LlenaGrafo {
    private int nodoInicio;
    private int nodoDestino;
    private int pesoArista;
   
    
    public  LlenaGrafo(){
        
    }
    /**
     * @return the nodoInicio
     */
    public int getNodoInicio() {
        return nodoInicio;
    }

    /**
     * @param nodoInicio the nodoInicio to set
     */
    public void setNodoInicio(int nodoInicio) {
        this.nodoInicio = nodoInicio;
    }

    /**
     * @return the nodoDestino
     */
    public int getNodoDestino() {
        return nodoDestino;
    }

    /**
     * @param nodoDestino the nodoDestino to set
     */
    public void setNodoDestino(int nodoDestino) {
        this.nodoDestino = nodoDestino;
    }

    /**
     * @return the pesoArista
     */
    public int getPesoArista() {
        return pesoArista;
    }

    /**
     * @param pesoArista the pesoArista to set
     */
    public void setPesoArista(int pesoArista) {
        this.pesoArista = pesoArista;
    }
    
}
