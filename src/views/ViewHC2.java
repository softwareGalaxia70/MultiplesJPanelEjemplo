
package views;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;

/**
* Clase perteneciente al paquete views, la cual contendra los elementos de la interfaz grafica pertenecientes al formulario de las historias clinicas. 
* @author Arca7 Technologies.
* @version 1.1
* @see javax.swing.JInternalFrame
*/
public class ViewHC2 extends javax.swing.JInternalFrame{

    //Aqui declaramos un objeto de tipo JscrollPane    
    private final JScrollPane barraDesplazamientoHC2;
    
    
    /**
     * Metodo constructor en el cual generamos los componentes de la interfaz grafica
     */
    public ViewHC2() {
        
        initComponents();

        barraDesplazamientoHC2=new JScrollPane(contenedorPrincipal);
        getContentPane().add(barraDesplazamientoHC2, BorderLayout.CENTER);       


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        contenedorPrincipal.setBackground(new java.awt.Color(0, 0, 204));
        contenedorPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        contenedorPrincipal.setMinimumSize(new java.awt.Dimension(187, 124));
        contenedorPrincipal.setPreferredSize(new java.awt.Dimension(1053, 600));
        contenedorPrincipal.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PANEL 2");
        contenedorPrincipal.add(jLabel5, new java.awt.GridBagConstraints());

        getContentPane().add(contenedorPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables


}
