/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aewvs
 */
import static java.lang.Math.pow;
import java.math.*;
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        SpnCalc = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblRest = new javax.swing.JLabel();
        lblCubo = new javax.swing.JLabel();
        lblRaiz = new javax.swing.JLabel();
        lblRaizCub = new javax.swing.JLabel();
        lblAbsoluto = new javax.swing.JLabel();
        lblRespRaiz = new javax.swing.JLabel();
        lblRespRaizCub = new javax.swing.JLabel();
        lblRespAbsoluto = new javax.swing.JLabel();
        lblRespResto = new javax.swing.JLabel();
        lblRespCubo = new javax.swing.JLabel();
        btnCalculadora = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        SpnCalc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Informe um valor");

        lblRest.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRest.setText("Resto da divisão por 2");

        lblCubo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCubo.setText("Elevado ao cubo");

        lblRaiz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRaiz.setText("Raiz quadrada");

        lblRaizCub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRaizCub.setText("Raíz cúbica");

        lblAbsoluto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAbsoluto.setText("Valor absoluto");

        lblRespRaiz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRespRaiz.setText("0");

        lblRespRaizCub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRespRaizCub.setText("0");

        lblRespAbsoluto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRespAbsoluto.setText("0");

        lblRespResto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRespResto.setText("0");
        lblRespResto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblRespRestoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblRespCubo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRespCubo.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRaiz)
                    .addComponent(lblCubo)
                    .addComponent(lblRaizCub)
                    .addComponent(lblAbsoluto)
                    .addComponent(lblRest))
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRespCubo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRespResto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRespRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRespRaizCub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRespAbsoluto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRest)
                    .addComponent(lblRespResto))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCubo)
                    .addComponent(lblRespCubo))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespRaiz)
                    .addComponent(lblRaiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRaizCub)
                    .addComponent(lblRespRaizCub))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbsoluto)
                    .addComponent(lblRespAbsoluto))
                .addGap(48, 48, 48))
        );

        btnCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/calculadora.png"))); // NOI18N
        btnCalculadora.setBorder(null);
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/calculator-5-512.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SpnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addContainerGap(446, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addComponent(btnCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed
        int n1 = Integer.parseInt(SpnCalc.getValue().toString());
        
        //RESTO DA DIVISAO POR 2
        int resto = n1 % 2;
        lblRespResto.setText(Integer.toString(resto));
        
        //ELEVADO AO CUBO
        double cubo = (double) Math.pow(n1,3);
        lblRespCubo.setText(Double.toString(cubo));
        
        //RAIZ QUADRADA
        double rquad = (double) Math.sqrt(n1);
        lblRespRaiz.setText(String.format("%.3f", rquad));
        
        //RAIZ CUBICA
        double rcub = (double) Math.cbrt(n1);
        lblRespRaizCub.setText(Double.toString(rcub));
        
        //VALOR ABSOLUTO
        int abs = Math.abs(n1);
        lblRespAbsoluto.setText(Integer.toString(n1));
    
    }//GEN-LAST:event_btnCalculadoraActionPerformed

    private void lblRespRestoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblRespRestoAncestorAdded

    }//GEN-LAST:event_lblRespRestoAncestorAdded

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpnCalc;
    private javax.swing.JButton btnCalculadora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbsoluto;
    private javax.swing.JLabel lblCubo;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JLabel lblRaizCub;
    private javax.swing.JLabel lblRespAbsoluto;
    private javax.swing.JLabel lblRespCubo;
    private javax.swing.JLabel lblRespRaiz;
    private javax.swing.JLabel lblRespRaizCub;
    private javax.swing.JLabel lblRespResto;
    private javax.swing.JLabel lblRest;
    // End of variables declaration//GEN-END:variables
}
