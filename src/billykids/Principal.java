/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package billykids;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        JdpPrincipal = new javax.swing.JDesktopPane();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BillyKids");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JdpPrincipal.setPreferredSize(new java.awt.Dimension(854, 480));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Sobre.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        JdpPrincipal.add(jButton5);
        jButton5.setBounds(30, 400, 60, 60);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Ajuda.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        JdpPrincipal.add(jButton6);
        jButton6.setBounds(770, 400, 60, 60);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Dependente.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        JdpPrincipal.add(jButton4);
        jButton4.setBounds(580, 20, 90, 90);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Contas.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        JdpPrincipal.add(jButton3);
        jButton3.setBounds(440, 20, 90, 90);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Cartao.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        JdpPrincipal.add(jButton2);
        jButton2.setBounds(300, 20, 90, 90);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Clientes.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JdpPrincipal.add(jButton1);
        jButton1.setBounds(160, 20, 90, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Principal.png"))); // NOI18N
        JdpPrincipal.add(jLabel1);
        jLabel1.setBounds(0, -10, 860, 500);

        getContentPane().add(JdpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaClientes carregar = new TelaClientes();
        JdpPrincipal.add(carregar);
        carregar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaCartao carregar = new TelaCartao();
        JdpPrincipal.add(carregar);
        carregar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaContas carregar = new TelaContas();
        JdpPrincipal.add(carregar);
        carregar.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TelaDependentes carregar = new TelaDependentes();
        JdpPrincipal.add(carregar);
        carregar.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ajudar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TelaSobre carregar = new TelaSobre();
        JdpPrincipal.add(carregar);
        carregar.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JdpPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void ajudar() {
    String chmfile = "cmd.exe /c billy_kids.chm"; 
    Runtime run = Runtime.getRuntime();
        try {
            run.exec(chmfile);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}