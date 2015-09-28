/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelostas;

import javax.swing.ImageIcon;

/**
 *
 * @author Tonatihu
 */
public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Buscar
     */
    public Buscar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        forma = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lados = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        lineasContinuas = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        material = new javax.swing.JComboBox();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("BIENVENIDO");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        forma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "cuadrada", "esferica" }));

        jLabel2.setText("Su fotma geometrica");

        jLabel3.setText("Numero de lados");

        lados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "mas de 3" }));

        jLabel4.setText("lineas continuas");

        lineasContinuas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "si", "no" }));

        jLabel5.setText("Material");

        material.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "sin material", "vinil", "cuero", "caucho" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buscar)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(forma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lineasContinuas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(material, 0, 115, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lineasContinuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(material, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(buscar)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        //Casos donde no exista el objeto
        if((forma.getSelectedIndex()==0)&&(lados.getSelectedIndex()==4)&&(lineasContinuas.getSelectedIndex()==0)&&(material.getSelectedIndex()!=0)){
                 img.setIcon(new ImageIcon(getClass().getResource("404.jpg")));
              
        }
        else if((forma.getSelectedIndex()==0)&&(lados.getSelectedIndex()!=4)){
             img.setIcon(new ImageIcon(getClass().getResource("404.jpg")));
        }
        else if((forma.getSelectedIndex()==0)&&(lados.getSelectedIndex()==4)&&(lineasContinuas.getSelectedIndex()!=0)){
             img.setIcon(new ImageIcon(getClass().getResource("404.jpg")));
        }
        else if((forma.getSelectedIndex()==0)&&(lados.getSelectedIndex()==4)&&(lineasContinuas.getSelectedIndex()==0)&&(material.getSelectedIndex()==0)){
            img.setIcon(new ImageIcon(getClass().getResource("ejemplo1.gif")));
        }
        else if((forma.getSelectedIndex()==1)&&(lados.getSelectedIndex()!=0)){
            img.setIcon(new ImageIcon(getClass().getResource("404.jpg")));
        }
        else if((forma.getSelectedIndex()==1)&&(lados.getSelectedIndex()==0)&&(lineasContinuas.getSelectedIndex()!=0)){
            img.setIcon(new ImageIcon(getClass().getResource("404.jpg")));
        }
        else if((forma.getSelectedIndex()==1)&&(lados.getSelectedIndex()==0)&&(lineasContinuas.getSelectedIndex()==0)&&(material.getSelectedIndex()==0)){
            img.setIcon(new ImageIcon(getClass().getResource("404.jpg")));
        }
        else if((forma.getSelectedIndex()==1)&&(lados.getSelectedIndex()==0)&&(lineasContinuas.getSelectedIndex()==0)&&(material.getSelectedIndex()==1)){
            img.setIcon(new ImageIcon(getClass().getResource("playa.gif")));
        }
        else if((forma.getSelectedIndex()==1)&&(lados.getSelectedIndex()==0)&&(lineasContinuas.getSelectedIndex()==0)&&(material.getSelectedIndex()==2)){
            img.setIcon(new ImageIcon(getClass().getResource("fut.gif")));
        }
        else if((forma.getSelectedIndex()==1)&&(lados.getSelectedIndex()==0)&&(lineasContinuas.getSelectedIndex()==0)&&(material.getSelectedIndex()==3)){
            img.setIcon(new ImageIcon(getClass().getResource("beis")));
        }
    }//GEN-LAST:event_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox forma;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox lados;
    private javax.swing.JComboBox lineasContinuas;
    private javax.swing.JComboBox material;
    // End of variables declaration//GEN-END:variables
}
