package com.mycompany.lojaesportiva.view;

import com.mycompany.lojaesportiva.controller.ProdutoController;
import com.mycompany.lojaesportiva.utils.Check;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Classe para cadastrar os produtos em interface
 * @author Wesley
 */
public class CadastroProdutoView extends javax.swing.JFrame {

    int IdProduto = 0;
    String modo = "Criar";
    
    /**
     * Cria uma nova forma de CadastroCliente
     */
    public CadastroProdutoView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    /**
     * Verifica qual modo está sendo executado, se é o modo de criar um cadatro ou de alterar um cadastro
     * @param IdProduto para cadastrar o produto
     */
    public CadastroProdutoView(int IdProduto) {
        modo = "Alterar";
        initComponents();
        this.setLocationRelativeTo(null);
        preencherFormulario(IdProduto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        lblNome2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNome2.setText("Nome:");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Ecommerce-Product-icon.png"))); // NOI18N

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/check-1-icon.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close-icon.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblNome.setText("Nome do produto:");

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.setToolTipText("Digite o nome do produto");
        txtNome.setName("Produto"); // NOI18N
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNomeMouseEntered(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        lblDescricao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblDescricao.setText(" Descrição:");

        txtQuantidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtQuantidade.setToolTipText("Digite a quantidade de produto");
        txtQuantidade.setName("Quantidade"); // NOI18N
        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusLost(evt);
            }
        });
        txtQuantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtQuantidadeMouseEntered(evt);
            }
        });
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyReleased(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTipo.setText("Quantidade do produto:");

        txtDescricao.setToolTipText("Digite a descrição do produto");
        txtDescricao.setName("Descrição"); // NOI18N
        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusLost(evt);
            }
        });
        txtDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDescricaoMouseEntered(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyReleased(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblValor.setText("Valor:");

        txtValor.setToolTipText("Digite o valor do produto");
        txtValor.setName("Valor"); // NOI18N
        txtValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorFocusLost(evt);
            }
        });
        txtValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtValorMouseEntered(evt);
            }
        });
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(txtNome)
                    .addComponent(txtQuantidade)
                    .addComponent(txtValor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDescricao, txtNome, txtQuantidade, txtValor});

        lblID.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addGap(37, 37, 37)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        txtNome.setBackground(Color.lightGray);
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        txtNome.setBackground(Color.white);
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseEntered
        lblStatus.setText("Digite o nome do produto");
    }//GEN-LAST:event_txtNomeMouseEntered

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        lblStatus.setText(txtNome.getText().toUpperCase());
    }//GEN-LAST:event_txtNomeKeyReleased

    private void txtQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusGained
        txtQuantidade.setBackground(Color.lightGray);
    }//GEN-LAST:event_txtQuantidadeFocusGained

    private void txtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusLost
        txtQuantidade.setBackground(Color.white);
    }//GEN-LAST:event_txtQuantidadeFocusLost

    private void txtQuantidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuantidadeMouseEntered
        lblStatus.setText("Digite o tipo do produto!");
    }//GEN-LAST:event_txtQuantidadeMouseEntered

    private void txtQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyReleased
        lblStatus.setText(txtQuantidade.getText().toUpperCase());
    }//GEN-LAST:event_txtQuantidadeKeyReleased

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if(modo.equals("Criar")){        
        ImageIcon icon = new ImageIcon("C:\\GitHub\\PiArtigosEsportivos\\LojaEsportiva\\src\\main\\resources\\imagens\\check.png");
        String nome, descricao;
        int quantidade;
        double valor;
        
        Check valid = new Check();
        valid.ValidVoid(txtNome);
        valid.ValidVoid(txtQuantidade);
        valid.ValidVoid(txtDescricao);
        valid.ValidNumber(txtValor);

        if(valid.temErro()){
            JOptionPane.showMessageDialog(this, valid.getMsgErro(),"Aviso!", JOptionPane.ERROR_MESSAGE);
        }else{
            nome = txtNome.getText();
            quantidade = Integer.parseInt(txtQuantidade.getText());
            descricao = txtDescricao.getText();
            valor = Double.parseDouble(txtValor.getText());
            int confirm = JOptionPane.showConfirmDialog(this, "Confirme os seus dados: " + "\n"
                + "Nome do produto: " + nome +  "\n"
                + "Quantidade do produto: " + quantidade + "\n"
                + "Descrição do produto: " + descricao +  "\n"
                + "Valor do produto: " + valor +  "\n", "Atenção",JOptionPane.OK_CANCEL_OPTION);
            if(confirm == 0){
                try {
                if(ProdutoController.Cadastrar(nome, quantidade, descricao, valor)){
                    JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!","Aviso!",JOptionPane.INFORMATION_MESSAGE,icon);
                    CRUDProdutoView tela = new  CRUDProdutoView();
                    tela.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao finalizar o cadastro!", "Aviso!", JOptionPane.ERROR_MESSAGE);
                }  
                } catch (SQLException ex) {
                Logger.getLogger(CadastroProdutoView.class.getName()).log(Level.SEVERE, null, ex);
                }           
            }
        }
        }else{
            ImageIcon icon = new ImageIcon("C:\\GitHub\\PiArtigosEsportivos\\LojaEsportiva\\src\\main\\resources\\imagens\\check.png");
            String nome, descricao;
            int quantidade, Id;
            double valor;
        
            Check valid = new Check();
            valid.ValidVoid(txtNome);
            valid.ValidVoid(txtQuantidade);
            valid.ValidVoid(txtDescricao);
            valid.ValidNumber(txtValor);
        
        if(valid.temErro()){
            JOptionPane.showMessageDialog(this, valid.getMsgErro(),"Aviso!",JOptionPane.ERROR_MESSAGE);
        }else{
            Id = Integer.parseInt(lblID.getText());
            nome = txtNome.getText();    
            quantidade = Integer.parseInt(txtQuantidade.getText());
            descricao = txtDescricao.getText();
            valor = Double.parseDouble(txtValor.getText());
         
        int confirm = JOptionPane.showConfirmDialog(this, "Confirme os seus dados: " +"\n"
                +"ID: " + Id + "\n"
                + "Nome do produto: " + nome +  "\n"
                + "Quantidade do produto: " + quantidade + "\n"
                + "Descrição do produto: " + descricao +  "\n"
                + "Valor do produto: " + valor +  "\n", "Atenção",JOptionPane.OK_CANCEL_OPTION);
        if(confirm == 0){
                try {
                if(ProdutoController.Alterar(Id, nome, quantidade, descricao, valor)){
                    JOptionPane.showMessageDialog(this, "Alterado com sucesso!","Aviso!",JOptionPane.INFORMATION_MESSAGE,icon);
                    this.dispose();
                }else{
                     JOptionPane.showMessageDialog(this, "Erro ao finalizar a alteração!", "Aviso!", JOptionPane.ERROR_MESSAGE);
                }  
                } catch (SQLException ex) {
                Logger.getLogger(CadastroProdutoView.class.getName()).log(Level.SEVERE, null, ex);
                }           
            }
        }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusGained
        txtDescricao.setBackground(Color.lightGray);
    }//GEN-LAST:event_txtDescricaoFocusGained

    private void txtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusLost
        txtDescricao.setBackground(Color.white);
    }//GEN-LAST:event_txtDescricaoFocusLost

    private void txtDescricaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescricaoMouseEntered
        lblStatus.setText("Digite a descrição do produto!");
    }//GEN-LAST:event_txtDescricaoMouseEntered

    private void txtDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyReleased
        lblStatus.setText(txtDescricao.getText().toUpperCase());
    }//GEN-LAST:event_txtDescricaoKeyReleased

    private void txtValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusGained
        txtValor.setBackground(Color.lightGray);
    }//GEN-LAST:event_txtValorFocusGained

    private void txtValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorFocusLost
        txtValor.setBackground(Color.white);
    }//GEN-LAST:event_txtValorFocusLost

    private void txtValorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorMouseEntered
        lblStatus.setText("Digite o valor do produto!");
    }//GEN-LAST:event_txtValorMouseEntered

    private void txtValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyReleased
        lblStatus.setText(txtValor.getText().toUpperCase());
    }//GEN-LAST:event_txtValorKeyReleased

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
    }//GEN-LAST:event_txtValorActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    
    /**
     * Método pega o id do produto, chama uma função para verificar os dados com base naquele id e preenche o formulário
     * @param IdProduto int a ser verificado 
     */
    private void preencherFormulario(int IdProduto) {
        String[] prod = ProdutoController.ProdutoID(IdProduto);
  
        lblID.setText(prod[0]);
        txtNome.setText(prod[1]);
        txtQuantidade.setText(prod[2]);
        txtDescricao.setText(prod[3]);
        txtValor.setText(prod[4]);
    }
}
