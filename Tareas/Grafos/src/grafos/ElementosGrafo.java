/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author Tonatihu
 */
import java.awt.Point;
import org.netbeans.api.visual.graph.GraphScene; 
import org.netbeans.api.visual.widget.LayerWidget;
import org.netbeans.api.visual.widget.Widget;
import org.netbeans.api.visual.widget.general.IconNodeWidget;
import org.openide.util.ImageUtilities;

public class ElementosGrafo extends GraphScene<String,String>{

    private LayerWidget mainLayer; 
    private LayerWidget connectionLayer; 
    private LayerWidget interactionLayer; 
    
    public ElementosGrafo(){
        mainLayer = new LayerWidget(this); 
        connectionLayer = new LayerWidget(this); 
        interactionLayer = new LayerWidget(this); 
        addChild(mainLayer); 
        addChild(connectionLayer); 
        addChild(interactionLayer);
        Widget w1 = addNode("1"); 
        w1.setPreferredLocation(new Point(50, 100)); 
        Widget w2 = addNode("2"); 
        w2.setPreferredLocation(new Point(100, 100));
        Widget w3 = addNode("3"); 
        w3.setPreferredLocation(new Point(150, 150)); 
        Widget w4 = addNode("4"); 
        w4.setPreferredLocation(new Point(200, 200)); 
        Widget w5 = addNode("5"); 
        w5.setPreferredLocation(new Point(250, 250)); 
        Widget w6 = addNode("6"); 
        w6.setPreferredLocation(new Point(200, 380)); 
        Widget w7 = addNode("7"); 
        w7.setPreferredLocation(new Point(150, 380)); 
        Widget w8 = addNode("8"); 
        w8.setPreferredLocation(new Point(100, 350)); 
        Widget w9 = addNode("9"); 
        w9.setPreferredLocation(new Point(50, 300)); 
        Widget w10 = addNode("10"); 
        w10.setPreferredLocation(new Point(10, 250)); 
        
    }
    
    @Override
    protected Widget attachNodeWidget(String n) {
       IconNodeWidget widget = new IconNodeWidget(this); 
       if (n.startsWith("1")){
           widget.setImage(ImageUtilities.loadImage("C:\\Users\\Tonatihu\\Documents\\9noSemestre\\Sistemas Expertos\\Expertos\\Tareas\\Grafos\\src\\grafos\\beis.gif")); 
       } else if (n.startsWith("2")) { 
           widget.setImage(ImageUtilities.loadImage("uno.gif")); 
       } else { 
           widget.setImage(ImageUtilities.loadImage("uno.gif")); 
       } 
       widget.setLabel(n); 
       mainLayer.addChild(widget); 
       return widget; 
    }

    @Override
    protected Widget attachEdgeWidget(String e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void attachEdgeSourceAnchor(String e, String n, String n1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void attachEdgeTargetAnchor(String e, String n, String n1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
