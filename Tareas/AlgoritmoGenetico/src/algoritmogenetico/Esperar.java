/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenetico;

import javax.swing.JTextArea;

/**
 *
 * @author Tonatihu
 */
public class Esperar {
    private boolean enposicion = false;
    JTextArea consola = new JTextArea();
    public synchronized void esperaY(JTextArea consola) {
        this.consola = consola;
        while (enposicion == false) {
            try {
                consola.append("\n");
                consola.append("Esperando a proceso Y...");
                wait();
            } catch (InterruptedException e) { }
        }
        enposicion = false;
        notifyAll();
    }
 
    public synchronized void esperax() {
        enposicion = true;
        while (enposicion == true) {
            try {
                // Esperar a X
                wait();
            } catch (InterruptedException e) { }
        }
        enposicion = true;
        notifyAll();
    }
}
