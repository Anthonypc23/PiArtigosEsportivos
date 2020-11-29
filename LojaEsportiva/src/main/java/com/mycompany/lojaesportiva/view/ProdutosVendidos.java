package com.mycompany.lojaesportiva.view;

import javax.swing.table.DefaultTableModel;

public class ProdutosVendidos extends javax.swing.JDialog {

    /**
     * Creates new form ProdutosVendidos
     */
    public ProdutosVendidos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public ProdutosVendidos(String CPF, String marcasLuvas, String acessoriosGYM, String marcasTenis, String marcasBolas, String marcasCalcas, String marcasShorts, String marcasCamisetas){
        DefaultTableModel model = (DefaultTableModel) tblBolas.getModel();
        model.addRow(new Object[]{marcasBolas});
        DefaultTableModel model2 = (DefaultTableModel) tblCalca.getModel();
        model2.addRow(new Object[]{marcasCalcas});
        DefaultTableModel model3 = (DefaultTableModel) tblCamiseta.getModel();
        model3.addRow(new Object[]{marcasCamisetas});
        DefaultTableModel model4 = (DefaultTableModel) tblGYM.getModel();
        model4.addRow(new Object[]{acessoriosGYM});
        DefaultTableModel model5 = (DefaultTableModel) tblLuvas.getModel();
        model5.addRow(new Object[]{marcasLuvas});
        DefaultTableModel model6 = (DefaultTableModel) tblShort.getModel();
        model6.addRow(new Object[]{marcasShorts});
        DefaultTableModel model7 = (DefaultTableModel) tblTenis.getModel();
        model7.addRow(new Object[]{marcasTenis});
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBolas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCalca = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblShort = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblLuvas = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTenis = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblCamiseta = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblGYM = new javax.swing.JTable();

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Luvas - Marcas", "Luvas - Quantidades", "Luvas - Tamanhos"
            }
        ));
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setHeaderValue("Luvas - Marcas");
            jTable6.getColumnModel().getColumn(1).setHeaderValue("Luvas - Quantidades");
            jTable6.getColumnModel().getColumn(2).setHeaderValue("Luvas - Tamanhos");
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblBolas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bolas - Marcas", "Bolas - Quantidade", "Bolas - Tamanhos"
            }
        ));
        jScrollPane1.setViewportView(tblBolas);

        tblCalca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Calça - Marcas", "Calça - Quantidades", "Calça - Tamanhos"
            }
        ));
        jScrollPane2.setViewportView(tblCalca);

        tblShort.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shorts - Marcas", "Shorts - Quantidades", "Shorts - Tamanhos"
            }
        ));
        jScrollPane3.setViewportView(tblShort);

        tblLuvas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Luvas - Marcas", "Luvas - Quantidades", "Luvas - Tamanhos"
            }
        ));
        jScrollPane7.setViewportView(tblLuvas);
        if (tblLuvas.getColumnModel().getColumnCount() > 0) {
            tblLuvas.getColumnModel().getColumn(0).setHeaderValue("Luvas - Marcas");
            tblLuvas.getColumnModel().getColumn(1).setHeaderValue("Luvas - Quantidades");
            tblLuvas.getColumnModel().getColumn(2).setHeaderValue("Luvas - Tamanhos");
        }

        tblTenis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tênis - Marcas", "Tênis - Quantidades", "Tênis - Tamanhos"
            }
        ));
        jScrollPane5.setViewportView(tblTenis);

        tblCamiseta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Camisetas - Marcas", "Camisetas - Quantidades", "Camisetas - Tamanhos"
            }
        ));
        jScrollPane8.setViewportView(tblCamiseta);

        tblGYM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GYM - Acessórios", "GYM - Quantidades", "GYM - Peso"
            }
        ));
        jScrollPane10.setViewportView(tblGYM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ProdutosVendidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutosVendidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutosVendidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutosVendidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProdutosVendidos dialog = new ProdutosVendidos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable tblBolas;
    private javax.swing.JTable tblCalca;
    private javax.swing.JTable tblCamiseta;
    private javax.swing.JTable tblGYM;
    private javax.swing.JTable tblLuvas;
    private javax.swing.JTable tblShort;
    private javax.swing.JTable tblTenis;
    // End of variables declaration//GEN-END:variables
}