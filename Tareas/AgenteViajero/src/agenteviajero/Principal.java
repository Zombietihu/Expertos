package agenteViajero;

 
import javax.swing.UIManager;

public class Principal {
    public Principal() {
        super();
    }

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        JPrincipal v = new JPrincipal();
        v.setVisible(true);
    }
}
