
package com.mycompany.lojaesportiva.view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ingrid
 */
public class VendasView extends javax.swing.JFrame {

   
    public VendasView() {
        initComponents();
        
        SpinnerNumberModel num = new SpinnerNumberModel();
        num.setMinimum(0);
        num.setMaximum(10);
        spnTenis.setModel(num);
        
        num.setMinimum(0);
        num.setMaximum(10);
        spnShort.setModel(num);

        num.setMinimum(0);
        num.setMaximum(10);
        spnLuvas.setModel(num);
        
        num.setMinimum(0);
        num.setMaximum(10);
        spnGYM.setModel(num);
        
        num.setMinimum(0);
        num.setMaximum(10);
        spnBolas.setModel(num);
        
        this.setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        grupoTamanhoLuvas = new javax.swing.ButtonGroup();
        grupoPesosGYM = new javax.swing.ButtonGroup();
        grupoTamanhoTenis = new javax.swing.ButtonGroup();
        grupoTamanhoCalca = new javax.swing.ButtonGroup();
        grupoTamanhoShort = new javax.swing.ButtonGroup();
        grupoTamanhoCamiseta = new javax.swing.ButtonGroup();
        painelGuias = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        rboLP = new javax.swing.JRadioButton();
        rboLM = new javax.swing.JRadioButton();
        rboLG = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        chkNikeCalca6 = new javax.swing.JCheckBox();
        chkAdidasCalca6 = new javax.swing.JCheckBox();
        chkPumaCalca6 = new javax.swing.JCheckBox();
        jPanel34 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        spnCalca15 = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        spnCalca16 = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        spnCalca17 = new javax.swing.JSpinner();
        jPanel12 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        chkGarantia1 = new javax.swing.JCheckBox();
        chkGarantia2 = new javax.swing.JCheckBox();
        chkGarantia3 = new javax.swing.JCheckBox();
        chkGarantia4 = new javax.swing.JCheckBox();
        chkGarantia5 = new javax.swing.JCheckBox();
        chkGarantia6 = new javax.swing.JCheckBox();
        chkGarantia7 = new javax.swing.JCheckBox();
        chkGarantia8 = new javax.swing.JCheckBox();
        jPanel41 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        spnCalca33 = new javax.swing.JSpinner();
        jLabel49 = new javax.swing.JLabel();
        spnCalca34 = new javax.swing.JSpinner();
        jLabel50 = new javax.swing.JLabel();
        spnCalca35 = new javax.swing.JSpinner();
        jLabel51 = new javax.swing.JLabel();
        spnCalca36 = new javax.swing.JSpinner();
        jLabel52 = new javax.swing.JLabel();
        spnCalca37 = new javax.swing.JSpinner();
        jLabel53 = new javax.swing.JLabel();
        spnCalca38 = new javax.swing.JSpinner();
        jLabel54 = new javax.swing.JLabel();
        spnCalca39 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        rboT1 = new javax.swing.JRadioButton();
        rboT2 = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        chkNikeCalca5 = new javax.swing.JCheckBox();
        chkAdidasCalca5 = new javax.swing.JCheckBox();
        chkPumaCalca5 = new javax.swing.JCheckBox();
        jPanel42 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        spnCalca40 = new javax.swing.JSpinner();
        jLabel56 = new javax.swing.JLabel();
        spnCalca41 = new javax.swing.JSpinner();
        jLabel57 = new javax.swing.JLabel();
        spnCalca42 = new javax.swing.JSpinner();
        tblResumo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaResumo = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        rboC5 = new javax.swing.JRadioButton();
        rboC6 = new javax.swing.JRadioButton();
        rboC7 = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        rboC3 = new javax.swing.JRadioButton();
        rboC4 = new javax.swing.JRadioButton();
        jPanel43 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        spnCalca43 = new javax.swing.JSpinner();
        jLabel59 = new javax.swing.JLabel();
        spnCalca44 = new javax.swing.JSpinner();
        jLabel60 = new javax.swing.JLabel();
        spnCalca45 = new javax.swing.JSpinner();
        jPanel17 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        chkNikeCalca1 = new javax.swing.JCheckBox();
        chkAdidasCalca1 = new javax.swing.JCheckBox();
        chkPumaCalca1 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        rboC1 = new javax.swing.JRadioButton();
        rboC2 = new javax.swing.JRadioButton();
        jPanel44 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        spnCalca46 = new javax.swing.JSpinner();
        jLabel62 = new javax.swing.JLabel();
        spnCalca47 = new javax.swing.JSpinner();
        jLabel63 = new javax.swing.JLabel();
        spnCalca48 = new javax.swing.JSpinner();
        jPanel29 = new javax.swing.JPanel();
        chkNikeCalca3 = new javax.swing.JCheckBox();
        chkAdidasCalca3 = new javax.swing.JCheckBox();
        chkPumaCalca3 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        chkNikeCalca = new javax.swing.JCheckBox();
        chkAdidasCalca = new javax.swing.JCheckBox();
        chkPumaCalca = new javax.swing.JCheckBox();
        jPanel45 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        spnCalca49 = new javax.swing.JSpinner();
        jLabel65 = new javax.swing.JLabel();
        spnCalca50 = new javax.swing.JSpinner();
        jLabel66 = new javax.swing.JLabel();
        spnCalca51 = new javax.swing.JSpinner();
        jPanel13 = new javax.swing.JPanel();
        rboC8 = new javax.swing.JRadioButton();
        rboC9 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        chkFutebol = new javax.swing.JCheckBox();
        chkVolei = new javax.swing.JCheckBox();
        chkHandebol = new javax.swing.JCheckBox();
        chkBasquete = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        chkNikeCalca4 = new javax.swing.JCheckBox();
        chkAdidasCalca4 = new javax.swing.JCheckBox();
        chkPumaCalca4 = new javax.swing.JCheckBox();
        jPanel36 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        spnCalca18 = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        spnCalca19 = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        spnCalca20 = new javax.swing.JSpinner();
        JPanel = new javax.swing.JPanel();
        chkGarantia = new javax.swing.JCheckBox();
        chkDesconto = new javax.swing.JCheckBox();
        chkParcelamentos = new javax.swing.JCheckBox();
        cboTipoParce = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtCPFCompra = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelGuias.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamanhos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        grupoTamanhoLuvas.add(rboLP);
        rboLP.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboLP.setText("PP/P");

        grupoTamanhoLuvas.add(rboLM);
        rboLM.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboLM.setText("M");

        grupoTamanhoLuvas.add(rboLG);
        rboLG.setText("G/GG");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rboLP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(rboLM)
                .addGap(26, 26, 26))
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(rboLG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rboLP)
                    .addComponent(rboLM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addComponent(rboLG))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkNikeCalca6.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeCalca6.setText("Nike");
        chkNikeCalca6.setActionCommand("Garantia Estendida");
        chkNikeCalca6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeCalca6ActionPerformed(evt);
            }
        });

        chkAdidasCalca6.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasCalca6.setText("Adidas");
        chkAdidasCalca6.setActionCommand("Garantia Estendida");
        chkAdidasCalca6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasCalca6ActionPerformed(evt);
            }
        });

        chkPumaCalca6.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaCalca6.setText("Puma");
        chkPumaCalca6.setActionCommand("Garantia Estendida");
        chkPumaCalca6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaCalca6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeCalca6)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasCalca6)
                .addGap(18, 18, 18)
                .addComponent(chkPumaCalca6)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeCalca6)
                    .addComponent(chkAdidasCalca6)
                    .addComponent(chkPumaCalca6))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel30.setText(" Nike:");

        jLabel31.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel31.setText(" Adidas:");

        jLabel32.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel32.setText(" Puma:");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spnCalca15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnCalca16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnCalca17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)))
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        painelGuias.addTab("Luvas", jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        grupoPesosGYM.add(jRadioButton1);
        jRadioButton1.setText("1 à 5 kg");

        grupoPesosGYM.add(jRadioButton2);
        jRadioButton2.setText("6 à 12 Kg");

        grupoPesosGYM.add(jRadioButton3);
        jRadioButton3.setText("13 à 30 Kg");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acessórios ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkGarantia1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkGarantia1.setText("Kit 40 Kg De Anilhas De Ferro + Barras De Supino E Halteres.");
        chkGarantia1.setActionCommand("Garantia Estendida");
        chkGarantia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantia1ActionPerformed(evt);
            }
        });

        chkGarantia2.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkGarantia2.setText("Halter Sextavado Pintado 12 Kg Para Ginastica E Academia.");
        chkGarantia2.setActionCommand("Garantia Estendida");
        chkGarantia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantia2ActionPerformed(evt);
            }
        });

        chkGarantia3.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkGarantia3.setText("Elástico P/ Treino Crossfit Musculação Ginástica Exercício Físico.");
        chkGarantia3.setActionCommand("Garantia Estendida");
        chkGarantia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantia3ActionPerformed(evt);
            }
        });

        chkGarantia4.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkGarantia4.setText("Cinturão Fivela Musculação Crossfit Academia Cinto.");
        chkGarantia4.setActionCommand("Garantia Estendida");
        chkGarantia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantia4ActionPerformed(evt);
            }
        });

        chkGarantia5.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkGarantia5.setText("Esteira Ergométrica Kikos Kx9500 110v.");
        chkGarantia5.setActionCommand("Garantia Estendida");
        chkGarantia5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantia5ActionPerformed(evt);
            }
        });

        chkGarantia6.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkGarantia6.setText("Esteira Mecânica Emp-880 Com 5 Funções 0173 Polimet.");
        chkGarantia6.setActionCommand("Garantia Estendida");
        chkGarantia6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantia6ActionPerformed(evt);
            }
        });

        chkGarantia7.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkGarantia7.setText("Elíptico Magnético Polimet Light - Preto/Laranja.");
        chkGarantia7.setActionCommand("Garantia Estendida");
        chkGarantia7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantia7ActionPerformed(evt);
            }
        });

        chkGarantia8.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkGarantia8.setText("Simulador de Escada Matrix C3X.");
        chkGarantia8.setActionCommand("Garantia Estendida");
        chkGarantia8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantia8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkGarantia1)
                    .addComponent(chkGarantia2)
                    .addComponent(chkGarantia3)
                    .addComponent(chkGarantia4)
                    .addComponent(chkGarantia5)
                    .addComponent(chkGarantia6)
                    .addComponent(chkGarantia7)
                    .addComponent(chkGarantia8))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(chkGarantia1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkGarantia2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkGarantia3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkGarantia4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkGarantia5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkGarantia6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkGarantia7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkGarantia8))
        );

        jPanel41.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel48.setText("Kit:");

        jLabel49.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel49.setText("Halter :");

        jLabel50.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel50.setText("Elástico:");

        jLabel51.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel51.setText("Cinturão:");

        jLabel52.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel52.setText("Esteira Ergométrica:");

        jLabel53.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel53.setText("Elíptico Magnético:");

        jLabel54.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel54.setText("Simulador:");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel41Layout.createSequentialGroup()
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnCalca35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel41Layout.createSequentialGroup()
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnCalca34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel41Layout.createSequentialGroup()
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnCalca33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnCalca36, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnCalca37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel41Layout.createSequentialGroup()
                            .addComponent(jLabel54)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnCalca39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel41Layout.createSequentialGroup()
                            .addComponent(jLabel53)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(spnCalca38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        painelGuias.addTab("GYM", jPanel12);

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamanhos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        grupoTamanhoTenis.add(rboT1);
        rboT1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboT1.setText("34 à 37");

        grupoTamanhoTenis.add(rboT2);
        rboT2.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboT2.setText("38 à 45");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(rboT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(rboT2)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rboT1)
                    .addComponent(rboT2))
                .addGap(25, 25, 25))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkNikeCalca5.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeCalca5.setText("Nike");
        chkNikeCalca5.setActionCommand("Garantia Estendida");
        chkNikeCalca5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeCalca5ActionPerformed(evt);
            }
        });

        chkAdidasCalca5.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasCalca5.setText("Adidas");
        chkAdidasCalca5.setActionCommand("Garantia Estendida");
        chkAdidasCalca5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasCalca5ActionPerformed(evt);
            }
        });

        chkPumaCalca5.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaCalca5.setText("Puma");
        chkPumaCalca5.setActionCommand("Garantia Estendida");
        chkPumaCalca5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaCalca5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeCalca5)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasCalca5)
                .addGap(18, 18, 18)
                .addComponent(chkPumaCalca5)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeCalca5)
                    .addComponent(chkAdidasCalca5)
                    .addComponent(chkPumaCalca5))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        jLabel55.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel55.setText(" Nike:");

        jLabel56.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel56.setText(" Adidas:");

        jLabel57.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel57.setText(" Puma:");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spnCalca40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnCalca41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnCalca42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(110, 110, 110)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        painelGuias.addTab("Tênis", jPanel2);

        tabelaResumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Luvas", "GYM", "Tênis", "Bolas", "Roupas", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaResumo);

        javax.swing.GroupLayout tblResumoLayout = new javax.swing.GroupLayout(tblResumo);
        tblResumo.setLayout(tblResumoLayout);
        tblResumoLayout.setHorizontalGroup(
            tblResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        tblResumoLayout.setVerticalGroup(
            tblResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        painelGuias.addTab("Resumo", tblResumo);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Calças");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Shorts");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Camisetas");

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamanhos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        grupoTamanhoCamiseta.add(rboC5);
        rboC5.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboC5.setText("PP/P");

        grupoTamanhoCamiseta.add(rboC6);
        rboC6.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboC6.setText("M");

        grupoTamanhoCamiseta.add(rboC7);
        rboC7.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboC7.setText("GG/G");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rboC5)
                .addGap(26, 26, 26)
                .addComponent(rboC6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rboC7)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rboC5)
                .addComponent(rboC6)
                .addComponent(rboC7))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamanhos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        grupoTamanhoCalca.add(rboC3);
        rboC3.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboC3.setText("34 à 37");

        grupoTamanhoCalca.add(rboC4);
        rboC4.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboC4.setText("38 à 45");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rboC3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rboC4)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rboC3)
                    .addComponent(rboC4))
                .addGap(25, 25, 25))
        );

        jPanel43.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        jLabel58.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel58.setText(" Nike:");

        jLabel59.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel59.setText(" Adidas:");

        jLabel60.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel60.setText(" Puma:");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spnCalca43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnCalca44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnCalca45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkNikeCalca1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeCalca1.setText("Nike");
        chkNikeCalca1.setActionCommand("Garantia Estendida");
        chkNikeCalca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeCalca1ActionPerformed(evt);
            }
        });

        chkAdidasCalca1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasCalca1.setText("Adidas");
        chkAdidasCalca1.setActionCommand("Garantia Estendida");
        chkAdidasCalca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasCalca1ActionPerformed(evt);
            }
        });

        chkPumaCalca1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaCalca1.setText("Puma");
        chkPumaCalca1.setActionCommand("Garantia Estendida");
        chkPumaCalca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaCalca1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeCalca1)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasCalca1)
                .addGap(18, 18, 18)
                .addComponent(chkPumaCalca1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeCalca1)
                    .addComponent(chkAdidasCalca1)
                    .addComponent(chkPumaCalca1))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamanhos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        grupoTamanhoShort.add(rboC1);
        rboC1.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboC1.setText("34 à 37");

        grupoTamanhoShort.add(rboC2);
        rboC2.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboC2.setText("38 à 45");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rboC1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rboC2)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rboC1)
                    .addComponent(rboC2))
                .addGap(25, 25, 25))
        );

        jPanel44.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        jLabel61.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel61.setText(" Nike:");

        jLabel62.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel62.setText(" Adidas:");

        jLabel63.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel63.setText(" Puma:");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spnCalca46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnCalca47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnCalca48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkNikeCalca3.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeCalca3.setText("Nike");
        chkNikeCalca3.setActionCommand("Garantia Estendida");
        chkNikeCalca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeCalca3ActionPerformed(evt);
            }
        });

        chkAdidasCalca3.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasCalca3.setText("Adidas");
        chkAdidasCalca3.setActionCommand("Garantia Estendida");
        chkAdidasCalca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasCalca3ActionPerformed(evt);
            }
        });

        chkPumaCalca3.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaCalca3.setText("Puma");
        chkPumaCalca3.setActionCommand("Garantia Estendida");
        chkPumaCalca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaCalca3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeCalca3)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasCalca3)
                .addGap(18, 18, 18)
                .addComponent(chkPumaCalca3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeCalca3)
                    .addComponent(chkAdidasCalca3)
                    .addComponent(chkPumaCalca3))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkNikeCalca.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeCalca.setText("Nike");
        chkNikeCalca.setActionCommand("Garantia Estendida");
        chkNikeCalca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeCalcaActionPerformed(evt);
            }
        });

        chkAdidasCalca.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasCalca.setText("Adidas");
        chkAdidasCalca.setActionCommand("Garantia Estendida");
        chkAdidasCalca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasCalcaActionPerformed(evt);
            }
        });

        chkPumaCalca.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaCalca.setText("Puma");
        chkPumaCalca.setActionCommand("Garantia Estendida");
        chkPumaCalca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaCalcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeCalca)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasCalca)
                .addGap(18, 18, 18)
                .addComponent(chkPumaCalca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeCalca)
                    .addComponent(chkAdidasCalca)
                    .addComponent(chkPumaCalca))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel45.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        jLabel64.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel64.setText(" Nike:");

        jLabel65.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel65.setText(" Adidas:");

        jLabel66.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel66.setText(" Puma:");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spnCalca49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnCalca50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnCalca51, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tamanhos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        grupoTamanhoShort.add(rboC8);
        rboC8.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboC8.setText("34 à 37");

        grupoTamanhoShort.add(rboC9);
        rboC9.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        rboC9.setText("38 à 45");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rboC8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rboC9)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rboC8)
                    .addComponent(rboC9))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        painelGuias.addTab("Roupas", jPanel3);

        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modelos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkFutebol.setText("Futebol");

        chkVolei.setText("Vôlei");

        chkHandebol.setText("Handebol");

        chkBasquete.setText("Basquete");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkFutebol)
                    .addComponent(chkVolei)
                    .addComponent(chkHandebol)
                    .addComponent(chkBasquete))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(chkFutebol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkVolei)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkHandebol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                .addComponent(chkBasquete)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkNikeCalca4.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeCalca4.setText("Nike");
        chkNikeCalca4.setActionCommand("Garantia Estendida");
        chkNikeCalca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeCalca4ActionPerformed(evt);
            }
        });

        chkAdidasCalca4.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasCalca4.setText("Adidas");
        chkAdidasCalca4.setActionCommand("Garantia Estendida");
        chkAdidasCalca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasCalca4ActionPerformed(evt);
            }
        });

        chkPumaCalca4.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaCalca4.setText("Puma");
        chkPumaCalca4.setActionCommand("Garantia Estendida");
        chkPumaCalca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaCalca4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeCalca4)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasCalca4)
                .addGap(18, 18, 18)
                .addComponent(chkPumaCalca4)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeCalca4)
                    .addComponent(chkAdidasCalca4)
                    .addComponent(chkPumaCalca4))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantidades", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel33.setText(" Nike:");

        jLabel34.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel34.setText(" Adidas:");

        jLabel35.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jLabel35.setText(" Puma:");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(spnCalca18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnCalca19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnCalca20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCalca20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        painelGuias.addTab("Bolas", jPanel11);

        JPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serviços", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkGarantia.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkGarantia.setText("Garantia Estendida");
        chkGarantia.setActionCommand("Garantia Estendida");
        chkGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGarantiaActionPerformed(evt);
            }
        });

        chkDesconto.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkDesconto.setText("Cupom de Desconto");
        chkDesconto.setActionCommand("Cupom de Desconto");

        chkParcelamentos.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkParcelamentos.setText("Parcelamentos");
        chkParcelamentos.setActionCommand("Parcelamentos");

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkGarantia)
                    .addComponent(chkDesconto)
                    .addComponent(chkParcelamentos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addComponent(chkGarantia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkParcelamentos))
        );

        cboTipoParce.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        cboTipoParce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Parcelamento...", "Á vista ", "Dividido em 2x", "Dividido em 3x", "Dividido em 4x", "Dividido em 5x", "Dividido em 6x", "Dividido em 7x", "Dividido em 8x", "Dividido em 9x", "Dividido em 10x" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Digite o seu CPF: *");
        jLabel3.setToolTipText("");

        txtCPFCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCPFCompraKeyTyped(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close-icon.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/check-1-icon.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGuias)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCPFCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboTipoParce, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtCPFCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboTipoParce, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGarantiaActionPerformed

    private void txtCPFCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFCompraKeyTyped
        if(txtCPFCompra.getText().length()>=11){
            evt.consume();
            JOptionPane.showMessageDialog(this,"Máximo de 11 caracteres atingidos!");
                }
        char c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c !=KeyEvent.VK_BACK_SPACE)){
        evt.consume(); 
          JOptionPane.showMessageDialog(this,"Digite apenas números!");
        }
    }//GEN-LAST:event_txtCPFCompraKeyTyped

    private void chkPumaCalca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaCalca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaCalca1ActionPerformed

    private void chkAdidasCalca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasCalca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasCalca1ActionPerformed

    private void chkNikeCalca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeCalca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeCalca1ActionPerformed

    private void chkNikeCalca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeCalca3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeCalca3ActionPerformed

    private void chkAdidasCalca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasCalca3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasCalca3ActionPerformed

    private void chkPumaCalca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaCalca3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaCalca3ActionPerformed

    private void chkPumaCalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaCalcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaCalcaActionPerformed

    private void chkAdidasCalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasCalcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasCalcaActionPerformed

    private void chkNikeCalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeCalcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeCalcaActionPerformed

    private void chkNikeCalca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeCalca4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeCalca4ActionPerformed

    private void chkAdidasCalca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasCalca4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasCalca4ActionPerformed

    private void chkPumaCalca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaCalca4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaCalca4ActionPerformed

    private void chkNikeCalca5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeCalca5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeCalca5ActionPerformed

    private void chkAdidasCalca5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasCalca5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasCalca5ActionPerformed

    private void chkPumaCalca5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaCalca5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaCalca5ActionPerformed

    private void chkNikeCalca6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeCalca6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeCalca6ActionPerformed

    private void chkAdidasCalca6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasCalca6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasCalca6ActionPerformed

    private void chkPumaCalca6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaCalca6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaCalca6ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Check valid = new Check();
        valid.ValidVoid(txtLogin);
        valid.ValidVoid(txtSenha);
        ImageIcon icon = new ImageIcon("C:\\GitHub\\PiArtigosEsportivos\\LojaEsportiva\\src\\main\\resources\\imagens\\check.png");

        if(valid.temErro()){
            JOptionPane.showMessageDialog(this, valid.getMsgErro(),"Aviso!",JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Dados cadastrados com sucesso" ,"Aviso!",JOptionPane.INFORMATION_MESSAGE, icon);
        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void chkGarantia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGarantia1ActionPerformed

    private void chkGarantia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantia2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGarantia2ActionPerformed

    private void chkGarantia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantia3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGarantia3ActionPerformed

    private void chkGarantia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantia4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGarantia4ActionPerformed

    private void chkGarantia5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantia5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGarantia5ActionPerformed

    private void chkGarantia6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantia6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGarantia6ActionPerformed

    private void chkGarantia7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantia7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGarantia7ActionPerformed

    private void chkGarantia8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantia8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkGarantia8ActionPerformed

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
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> cboTipoParce;
    private javax.swing.JCheckBox chkAdidasCalca;
    private javax.swing.JCheckBox chkAdidasCalca1;
    private javax.swing.JCheckBox chkAdidasCalca2;
    private javax.swing.JCheckBox chkAdidasCalca3;
    private javax.swing.JCheckBox chkAdidasCalca4;
    private javax.swing.JCheckBox chkAdidasCalca5;
    private javax.swing.JCheckBox chkAdidasCalca6;
    private javax.swing.JCheckBox chkBasquete;
    private javax.swing.JCheckBox chkDesconto;
    private javax.swing.JCheckBox chkFutebol;
    private javax.swing.JCheckBox chkGarantia;
    private javax.swing.JCheckBox chkGarantia1;
    private javax.swing.JCheckBox chkGarantia2;
    private javax.swing.JCheckBox chkGarantia3;
    private javax.swing.JCheckBox chkGarantia4;
    private javax.swing.JCheckBox chkGarantia5;
    private javax.swing.JCheckBox chkGarantia6;
    private javax.swing.JCheckBox chkGarantia7;
    private javax.swing.JCheckBox chkGarantia8;
    private javax.swing.JCheckBox chkHandebol;
    private javax.swing.JCheckBox chkNikeCalca;
    private javax.swing.JCheckBox chkNikeCalca1;
    private javax.swing.JCheckBox chkNikeCalca2;
    private javax.swing.JCheckBox chkNikeCalca3;
    private javax.swing.JCheckBox chkNikeCalca4;
    private javax.swing.JCheckBox chkNikeCalca5;
    private javax.swing.JCheckBox chkNikeCalca6;
    private javax.swing.JCheckBox chkParcelamentos;
    private javax.swing.JCheckBox chkPumaCalca;
    private javax.swing.JCheckBox chkPumaCalca1;
    private javax.swing.JCheckBox chkPumaCalca2;
    private javax.swing.JCheckBox chkPumaCalca3;
    private javax.swing.JCheckBox chkPumaCalca4;
    private javax.swing.JCheckBox chkPumaCalca5;
    private javax.swing.JCheckBox chkPumaCalca6;
    private javax.swing.JCheckBox chkVolei;
    private javax.swing.ButtonGroup grupoPesosGYM;
    private javax.swing.ButtonGroup grupoTamanhoCalca;
    private javax.swing.ButtonGroup grupoTamanhoCamiseta;
    private javax.swing.ButtonGroup grupoTamanhoLuvas;
    private javax.swing.ButtonGroup grupoTamanhoShort;
    private javax.swing.ButtonGroup grupoTamanhoTenis;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane painelGuias;
    private javax.swing.JRadioButton rboC1;
    private javax.swing.JRadioButton rboC2;
    private javax.swing.JRadioButton rboC3;
    private javax.swing.JRadioButton rboC4;
    private javax.swing.JRadioButton rboC5;
    private javax.swing.JRadioButton rboC6;
    private javax.swing.JRadioButton rboC7;
    private javax.swing.JRadioButton rboC8;
    private javax.swing.JRadioButton rboC9;
    private javax.swing.JRadioButton rboLG;
    private javax.swing.JRadioButton rboLM;
    private javax.swing.JRadioButton rboLP;
    private javax.swing.JRadioButton rboT1;
    private javax.swing.JRadioButton rboT2;
    private javax.swing.JSpinner spnCalca15;
    private javax.swing.JSpinner spnCalca16;
    private javax.swing.JSpinner spnCalca17;
    private javax.swing.JSpinner spnCalca18;
    private javax.swing.JSpinner spnCalca19;
    private javax.swing.JSpinner spnCalca20;
    private javax.swing.JSpinner spnCalca33;
    private javax.swing.JSpinner spnCalca34;
    private javax.swing.JSpinner spnCalca35;
    private javax.swing.JSpinner spnCalca36;
    private javax.swing.JSpinner spnCalca37;
    private javax.swing.JSpinner spnCalca38;
    private javax.swing.JSpinner spnCalca39;
    private javax.swing.JSpinner spnCalca40;
    private javax.swing.JSpinner spnCalca41;
    private javax.swing.JSpinner spnCalca42;
    private javax.swing.JSpinner spnCalca43;
    private javax.swing.JSpinner spnCalca44;
    private javax.swing.JSpinner spnCalca45;
    private javax.swing.JSpinner spnCalca46;
    private javax.swing.JSpinner spnCalca47;
    private javax.swing.JSpinner spnCalca48;
    private javax.swing.JSpinner spnCalca49;
    private javax.swing.JSpinner spnCalca50;
    private javax.swing.JSpinner spnCalca51;
    private javax.swing.JTable tabelaResumo;
    private javax.swing.JPanel tblResumo;
    private javax.swing.JTextField txtCPFCompra;
    // End of variables declaration//GEN-END:variables
}
