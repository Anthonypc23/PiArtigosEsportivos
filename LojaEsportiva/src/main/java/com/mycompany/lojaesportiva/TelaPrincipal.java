/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojaesportiva;

/**
 *
 * @author rrmat
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jmiCRUDCliente = new javax.swing.JMenuItem();
        jmiCRUDProduto = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiCliente = new javax.swing.JMenuItem();
        jmiProduto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiVendas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmiRelatorio = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPORT");

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cog-icon.png"))); // NOI18N
        jMenu2.setMnemonic('m');
        jMenu2.setText("Manutenção");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jmiCRUDCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiCRUDCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/person-icon (1).png"))); // NOI18N
        jmiCRUDCliente.setText("Cliente");
        jmiCRUDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCRUDClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCRUDCliente);

        jmiCRUDProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiCRUDProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ecommerce-Product-icon2.png"))); // NOI18N
        jmiCRUDProduto.setText("Produto");
        jmiCRUDProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCRUDProdutoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCRUDProduto);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmiSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Door-icon.png"))); // NOI18N
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSair);

        jMenuBar1.add(jMenu2);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-icon.png"))); // NOI18N
        jMenu1.setMnemonic('u');
        jMenu1.setText("Cadastro");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jmiCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jmiCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/person-icon (1).png"))); // NOI18N
        jmiCliente.setText("Cliente");
        jmiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCliente);

        jmiProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jmiProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ecommerce-Product-icon2.png"))); // NOI18N
        jmiProduto.setText("Produto");
        jmiProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiProduto);

        jMenuBar1.add(jMenu1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cart-icon.png"))); // NOI18N
        jMenu4.setMnemonic('s');
        jMenu4.setText("Mercado");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jmiVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jmiVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/shopping-icon.png"))); // NOI18N
        jmiVendas.setText("Loja");
        jmiVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVendasActionPerformed(evt);
            }
        });
        jMenu4.add(jmiVendas);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Document-Blank-icon.png"))); // NOI18N
        jMenu5.setMnemonic('i');
        jMenu5.setText("Info");
        jMenu5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jmiRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jmiRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Document-Blank-icon.png"))); // NOI18N
        jmiRelatorio.setText("Relatorio");
        jmiRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRelatorioActionPerformed(evt);
            }
        });
        jMenu5.add(jmiRelatorio);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCRUDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCRUDClienteActionPerformed
      CRUDCliente crudc = new CRUDCliente();
      crudc.setVisible(true);
    }//GEN-LAST:event_jmiCRUDClienteActionPerformed

    private void jmiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutoActionPerformed
       CadastroProduto CadP = new CadastroProduto();
       CadP.setVisible(true);
    }//GEN-LAST:event_jmiProdutoActionPerformed

    private void jmiCRUDProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCRUDProdutoActionPerformed
        CRUDProduto crudp = new CRUDProduto();
        crudp.setVisible(true);
    }//GEN-LAST:event_jmiCRUDProdutoActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteActionPerformed
       CadastroCliente CadC = new CadastroCliente();
       CadC.setVisible(true);
    }//GEN-LAST:event_jmiClienteActionPerformed

    private void jmiVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVendasActionPerformed
       TeladeVendas telaV = new TeladeVendas();
       telaV.setVisible(true);
    }//GEN-LAST:event_jmiVendasActionPerformed

    private void jmiRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRelatorioActionPerformed
       TelaRelatorioSintetico TelaR = new TelaRelatorioSintetico();
       TelaR.setVisible(true);
    }//GEN-LAST:event_jmiRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmiCRUDCliente;
    private javax.swing.JMenuItem jmiCRUDProduto;
    private javax.swing.JMenuItem jmiCliente;
    private javax.swing.JMenuItem jmiProduto;
    private javax.swing.JMenuItem jmiRelatorio;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiVendas;
    // End of variables declaration//GEN-END:variables
}
