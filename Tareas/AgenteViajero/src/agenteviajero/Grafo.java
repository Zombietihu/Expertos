package agenteViajero;

public class Grafo {
    
    private String dato;
    private int [] pesos= new int[10];
    
    public Grafo(String dat, int [] peso) {
        super();
        dato=dat;
        pesos=peso;
    }
    
    public String getDato(){
        return dato;
    }
    
    public int [] getPesos(){
        return pesos;
    }
}
