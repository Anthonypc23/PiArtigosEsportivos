package com.mycompany.lojaesportiva.view;

import com.mycompany.lojaesportiva.controller.Clientecontroller;
import com.mycompany.lojaesportiva.controller.ProdutoController;
import com.mycompany.lojaesportiva.controller.VendaController;
import com.mycompany.lojaesportiva.model.Vendas;
import com.mycompany.lojaesportiva.utils.Check;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsável por fazer a venda do sistema
 * @author Wesley
 */
public class LojaView extends javax.swing.JFrame {
    
    float ValorTotal = 0;
    
    /**
     * Cria uma nova forma Loja
     */
    public LojaView() {
        initComponents();
        SpinnerNumberModel SpinQuantidade = new SpinnerNumberModel();
        SpinQuantidade.setMinimum(0);
        spnQuantidade.setModel(SpinQuantidade);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jtpLoja = new javax.swing.JTabbedPane();
        jpLoja = new javax.swing.JPanel();
        txtCodProd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spnQuantidade = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtTamanho = new javax.swing.JTextField();
        jpCarinho = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbCarrinho = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Finalizar Compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCodProd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Codigo do Produto:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Quantidade:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Valor :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nome:");

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lblValor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Adicionar no Carrinho");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Tamanho:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisar.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLojaLayout = new javax.swing.GroupLayout(jpLoja);
        jpLoja.setLayout(jpLojaLayout);
        jpLojaLayout.setHorizontalGroup(
            jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLojaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLojaLayout.createSequentialGroup()
                        .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpLojaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpLojaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpLojaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))))
                    .addGroup(jpLojaLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpLojaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCodProd, txtTamanho});

        jpLojaLayout.setVerticalGroup(
            jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLojaLayout.createSequentialGroup()
                .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLojaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLojaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jpLojaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCodProd, txtTamanho});

        jtpLoja.addTab("Loja", jpLoja);

        jtbCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Produto", "Nome", "Quantidade", "Tamanho", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtbCarrinho);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Adicionar mais Produtos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Valor Total:");

        txtCPF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCPF.setName("CPF"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("CPF:");

        lblValorTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("Excluir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCarinhoLayout = new javax.swing.GroupLayout(jpCarinho);
        jpCarinho.setLayout(jpCarinhoLayout);
        jpCarinhoLayout.setHorizontalGroup(
            jpCarinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCarinhoLayout.createSequentialGroup()
                .addGroup(jpCarinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCarinhoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCarinhoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpCarinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCarinhoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(jpCarinhoLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpCarinhoLayout.setVerticalGroup(
            jpCarinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCarinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpCarinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jpCarinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpLoja.addTab("Carinho", jpCarinho);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpLoja, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpLoja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
    }//GEN-LAST:event_txtCodProdActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Quantidade = spnQuantidade.getValue().toString();
        if(VerificaQTd(Integer.parseInt(Quantidade),Integer.parseInt(txtCodProd.getText()))){
        float Valor = (Float.parseFloat(lblValor.getText()))*(Integer.parseInt(Quantidade));
        ValorTotal += Valor;
        DefaultTableModel model = (DefaultTableModel) jtbCarrinho.getModel();
        model.addRow(new Object[]{txtCodProd.getText(),lblNome.getText(),Quantidade,txtTamanho.getText(),String.valueOf(Valor)});
        lblValorTotal.setText(String.valueOf(ValorTotal));
        jtpLoja.setSelectedIndex(1);
        }else{
            JOptionPane.showMessageDialog(this, "Quantidade insuficiente no Estoque");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        preencherFormulario(Integer.parseInt(txtCodProd.getText()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jtpLoja.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     DefaultTableModel modelo = (DefaultTableModel) jtbCarrinho.getModel();
            int indiceLinha = -1;
            float Valor = 0;
             indiceLinha = jtbCarrinho.getSelectedRow();
             if(indiceLinha>=0){
                 Valor = Float.parseFloat(jtbCarrinho.getValueAt(indiceLinha, 4).toString());
                 ValorTotal -= Valor;
                 lblValorTotal.setText(String.valueOf(ValorTotal));
                 modelo.removeRow(indiceLinha);
             }else{
                 JOptionPane.showMessageDialog(this, "Você nao selecionou uma linha!");
             }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Vendas vend = new Vendas();
    Check valid = new Check();
    valid.Validsize(txtCPF);
    valid.ValidVoid(txtCPF);
    if(valid.temErro()){
            JOptionPane.showMessageDialog(this, valid.getMsgErro(),"Aviso!",JOptionPane.ERROR_MESSAGE);
        }else{
         Date data = new Date();
          int idCliente = ConsultaCPF(txtCPF.getText());
          if(idCliente<=0){
              JOptionPane.showMessageDialog(this, "CPF Invalido");
          }else{
         
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) jtbCarrinho.getModel();
        
        ArrayList<String[]> itensVenda = new ArrayList<>();
        
        for (int i = 0; i < jtbCarrinho.getRowCount(); i++) {
            itensVenda.add(new String[]{
                jtbCarrinho.getValueAt(i, 0).toString(),
                jtbCarrinho.getValueAt(i, 1).toString(),
                jtbCarrinho.getValueAt(i, 2).toString(),
                jtbCarrinho.getValueAt(i, 3).toString(),
                jtbCarrinho.getValueAt(i, 4).toString(),
            });
        }
         
             try {
                 if(VendaController.CadastrarVenda(data, Float.parseFloat(lblValorTotal.getText()), idCliente,itensVenda)){
                     JOptionPane.showMessageDialog(this, "Venda realizada com Sucesso"+vend.getIdVenda());
                 }else{
                     JOptionPane.showMessageDialog(this, "Erro ao Realizar a Venda");
                 }    } catch (SQLException ex) {
                 Logger.getLogger(LojaView.class.getName()).log(Level.SEVERE, null, ex);
             }
      }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LojaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LojaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LojaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LojaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LojaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpCarinho;
    private javax.swing.JPanel jpLoja;
    private javax.swing.JTable jtbCarrinho;
    private javax.swing.JTabbedPane jtpLoja;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JSpinner spnQuantidade;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtTamanho;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Método resgata os dados e verifica a quantidade
     * @param Qtd int a ser verificado
     * @param IdProduto int a ser verificado
     * @return boolean true: quantidade válida | false: erro na verificação
     */
    public static boolean VerificaQTd(int Qtd, int IdProduto){
        boolean retorno = false;
        String[] prod = ProdutoController.ProdutoID(IdProduto);
        if(Qtd<= Integer.parseInt(prod[2])){
            retorno = true;
        }
        
        return retorno;
    }
    
    /**
     * Método resgata a string e faz consulta, retornando o id
     * @param CPF string a ser verificada
     * @return int retorna o id do cliente
     */
    private static int ConsultaCPF(String CPF) {
    int cli = Clientecontroller.ConsultaCPF(CPF);
    return cli;
    }
    
    /**
     * Método pega o id do produto, chama uma função para verificar os dados com base naquele id e preenche o formulário
     * @param IdProduto int a ser verificado
     */
    private void preencherFormulario(int IdProduto) {
        String[] prod = ProdutoController.ProdutoID(IdProduto);

        lblNome.setText(prod[1]);
        lblValor.setText(prod[4]);
    }
}
