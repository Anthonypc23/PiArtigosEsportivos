
package com.mycompany.lojaesportiva.view;

import java.awt.Color;
import java.awt.event.KeyEvent;
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
        SpinnerNumberModel nikeLuva = new SpinnerNumberModel();
        nikeLuva.setMinimum(0);
        nikeLuva.setMaximum(10);
        spnNikeLuvas.setModel(nikeLuva);
        SpinnerNumberModel adidasLuva = new SpinnerNumberModel();
        adidasLuva.setMinimum(0);
        adidasLuva.setMaximum(10);
        spnAdidasLuvas.setModel(adidasLuva);
        SpinnerNumberModel pumaLuva = new SpinnerNumberModel();
        pumaLuva.setMinimum(0);
        pumaLuva.setMaximum(10);
        spnPumaLuvas.setModel(pumaLuva);
        
        SpinnerNumberModel kitGYM = new SpinnerNumberModel();
        kitGYM.setMinimum(0);
        kitGYM.setMaximum(10);
        spnKitGYM.setModel(kitGYM);
        SpinnerNumberModel halterGYM = new SpinnerNumberModel();
        halterGYM.setMinimum(0);
        halterGYM.setMaximum(10);
        spnHalterGYM.setModel(halterGYM);
        SpinnerNumberModel elasticoGYM = new SpinnerNumberModel();
        elasticoGYM.setMinimum(0);
        elasticoGYM.setMaximum(10);
        spnElasticoGYM.setModel(elasticoGYM);
        SpinnerNumberModel cinturaoGYM = new SpinnerNumberModel();
        cinturaoGYM.setMinimum(0);
        cinturaoGYM.setMaximum(10);
        spnCinturaoGYM.setModel(cinturaoGYM);
        SpinnerNumberModel ergoGYM = new SpinnerNumberModel();
        ergoGYM.setMinimum(0);
        ergoGYM.setMaximum(10);
        spnErgoGYM.setModel(ergoGYM);
        SpinnerNumberModel magGYM = new SpinnerNumberModel();
        magGYM.setMinimum(0);
        magGYM.setMaximum(10);
        spnMagGYM.setModel(magGYM);
        SpinnerNumberModel simuladorGYM = new SpinnerNumberModel();
        simuladorGYM.setMinimum(0);
        simuladorGYM.setMaximum(10);
        spnSimuladorGYM.setModel(simuladorGYM);
        
        SpinnerNumberModel nikeTenis = new SpinnerNumberModel();
        nikeTenis.setMinimum(0);
        nikeTenis.setMaximum(10);
        spnNikeTenis.setModel(nikeTenis);
        SpinnerNumberModel adidasTenis = new SpinnerNumberModel();
        adidasTenis.setMinimum(0);
        adidasTenis.setMaximum(10);
        spnAdidasTenis.setModel(adidasTenis);
        SpinnerNumberModel pumaTenis = new SpinnerNumberModel();
        pumaTenis.setMinimum(0);
        pumaTenis.setMaximum(10);
        spnPumaTenis.setModel(pumaTenis);
        
        SpinnerNumberModel nikeBolas = new SpinnerNumberModel();
        nikeBolas.setMinimum(0);
        nikeBolas.setMaximum(10);
        spnNikeBolas.setModel(nikeBolas);
        SpinnerNumberModel adidasBolas = new SpinnerNumberModel();
        adidasBolas.setMinimum(0);
        adidasBolas.setMaximum(10);
        spnAdidasBolas.setModel(adidasBolas);
        SpinnerNumberModel pumaBolas = new SpinnerNumberModel();
        pumaBolas.setMinimum(0);
        pumaBolas.setMaximum(10);
        spnPumaBolas.setModel(pumaBolas);
        
        SpinnerNumberModel nikeCalca = new SpinnerNumberModel();
        nikeCalca.setMinimum(0);
        nikeCalca.setMaximum(10);
        spnNikeCalca.setModel(nikeCalca);
        SpinnerNumberModel adidasCalca = new SpinnerNumberModel();
        adidasCalca.setMinimum(0);
        adidasCalca.setMaximum(10);
        spnAdidasCalca.setModel(adidasCalca);
        SpinnerNumberModel pumaCalca = new SpinnerNumberModel();
        pumaCalca.setMinimum(0);
        pumaCalca.setMaximum(10);
        spnPumaCalca.setModel(pumaCalca);
        
        SpinnerNumberModel nikeShorts = new SpinnerNumberModel();
        nikeShorts.setMinimum(0);
        nikeShorts.setMaximum(10);
        spnNikeShort.setModel(nikeShorts);
        SpinnerNumberModel adidasShorts = new SpinnerNumberModel();
        adidasShorts.setMinimum(0);
        adidasShorts.setMaximum(10);
        spnAdidasShort.setModel(adidasShorts);
        SpinnerNumberModel pumaShorts = new SpinnerNumberModel();
        pumaShorts.setMinimum(0);
        pumaShorts.setMaximum(10);
        spnPumaShort.setModel(pumaShorts);
        
        SpinnerNumberModel nikeCamisetas = new SpinnerNumberModel();
        nikeCamisetas.setMinimum(0);
        nikeCamisetas.setMaximum(10);
        spnNikeCamiseta.setModel(nikeCamisetas);
        SpinnerNumberModel adidasCamisetas = new SpinnerNumberModel();
        adidasCamisetas.setMinimum(0);
        adidasCamisetas.setMaximum(10);
        spnAdidasCamiseta.setModel(adidasCamisetas);
        SpinnerNumberModel pumaCamisetas = new SpinnerNumberModel();
        pumaCamisetas.setMinimum(0);
        pumaCamisetas.setMaximum(10);
        spnPumaCamiseta.setModel(pumaCamisetas);
        
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        rboLP = new javax.swing.JRadioButton();
        rboLM = new javax.swing.JRadioButton();
        rboLG = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        chkNikeLuvas = new javax.swing.JCheckBox();
        chkAdidasLuvas = new javax.swing.JCheckBox();
        chkPumaLuvas = new javax.swing.JCheckBox();
        jPanel34 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        spnNikeLuvas = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        spnAdidasLuvas = new javax.swing.JSpinner();
        jLabel32 = new javax.swing.JLabel();
        spnPumaLuvas = new javax.swing.JSpinner();
        jPanel12 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        chkKitGYM = new javax.swing.JCheckBox();
        chkHalterGYM = new javax.swing.JCheckBox();
        chkElasticoGYM = new javax.swing.JCheckBox();
        chkCinturaoGYM = new javax.swing.JCheckBox();
        chkErgoGYM = new javax.swing.JCheckBox();
        chkMagGYM = new javax.swing.JCheckBox();
        chkElipticoGYM = new javax.swing.JCheckBox();
        chkSimuladorGYM = new javax.swing.JCheckBox();
        jPanel41 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        spnKitGYM = new javax.swing.JSpinner();
        jLabel49 = new javax.swing.JLabel();
        spnHalterGYM = new javax.swing.JSpinner();
        jLabel50 = new javax.swing.JLabel();
        spnElasticoGYM = new javax.swing.JSpinner();
        jLabel51 = new javax.swing.JLabel();
        spnCinturaoGYM = new javax.swing.JSpinner();
        jLabel52 = new javax.swing.JLabel();
        spnErgoGYM = new javax.swing.JSpinner();
        jLabel53 = new javax.swing.JLabel();
        spnMagGYM = new javax.swing.JSpinner();
        jLabel54 = new javax.swing.JLabel();
        spnSimuladorGYM = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        rboT1 = new javax.swing.JRadioButton();
        rboT2 = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        chkNikeTenis = new javax.swing.JCheckBox();
        chkAdidasTenis = new javax.swing.JCheckBox();
        chkPumaTenis = new javax.swing.JCheckBox();
        jPanel42 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        spnNikeTenis = new javax.swing.JSpinner();
        jLabel56 = new javax.swing.JLabel();
        spnAdidasTenis = new javax.swing.JSpinner();
        jLabel57 = new javax.swing.JLabel();
        spnPumaTenis = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        rboC5 = new javax.swing.JRadioButton();
        rboC6 = new javax.swing.JRadioButton();
        rboC7 = new javax.swing.JRadioButton();
        jPanel29 = new javax.swing.JPanel();
        chkNikeCamiseta = new javax.swing.JCheckBox();
        chkAdidasCamiseta = new javax.swing.JCheckBox();
        chkPumaCamiseta = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        chkNikeCalca = new javax.swing.JCheckBox();
        chkAdidasCalca = new javax.swing.JCheckBox();
        chkPumaCalca = new javax.swing.JCheckBox();
        jPanel45 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        spnNikeCamiseta = new javax.swing.JSpinner();
        jLabel65 = new javax.swing.JLabel();
        spnAdidasCamiseta = new javax.swing.JSpinner();
        jLabel66 = new javax.swing.JLabel();
        spnPumaCamiseta = new javax.swing.JSpinner();
        jPanel13 = new javax.swing.JPanel();
        rboC8 = new javax.swing.JRadioButton();
        rboC9 = new javax.swing.JRadioButton();
        jPanel43 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        spnNikeCalca = new javax.swing.JSpinner();
        jLabel59 = new javax.swing.JLabel();
        spnAdidasCalca = new javax.swing.JSpinner();
        jLabel60 = new javax.swing.JLabel();
        spnPumaCalca = new javax.swing.JSpinner();
        jPanel24 = new javax.swing.JPanel();
        chkNikeShort = new javax.swing.JCheckBox();
        chkAdidasShort = new javax.swing.JCheckBox();
        chkPumaShort = new javax.swing.JCheckBox();
        jPanel44 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        spnNikeShort = new javax.swing.JSpinner();
        jLabel62 = new javax.swing.JLabel();
        spnAdidasShort = new javax.swing.JSpinner();
        jLabel63 = new javax.swing.JLabel();
        spnPumaShort = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        rboC1 = new javax.swing.JRadioButton();
        rboC2 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        chkFutebolBolas = new javax.swing.JCheckBox();
        chkVoleiBolas = new javax.swing.JCheckBox();
        chkHandebolBolas = new javax.swing.JCheckBox();
        chkBasqueteBolas = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        chkNikeBolas = new javax.swing.JCheckBox();
        chkAdidasBolas = new javax.swing.JCheckBox();
        chkPumaBolas = new javax.swing.JCheckBox();
        jPanel36 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        spnNikeBolas = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        spnAdidasBolas = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        spnPumaBolas = new javax.swing.JSpinner();
        tblResumo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaResumo = new javax.swing.JTable();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Luvas", "R$ 9,99", "R$ 8,99", "R$ 7,99"},
                {"GYM", "R$ 50,00", "R$ 40,00", "R$ 35,00"},
                {"Tênis", "R$ 300,00", "R$ 250,00", "R$ 200,00"},
                {"Calças", "R$ 100,00", "R$ 90,00", "R$ 80,00"},
                {"Shorts", "R$ 60,00", "R$ 50,00", "R$ 35,00"},
                {"Camisetas", "R$ 40,00", "R$ 35,00", "R$ 30,00"},
                {"Bolas", "R$ 30,00", "R$ 30,00", "R$ 26,00"}
            },
            new String [] {
                "Produto", "Valor Nike", "Valor Adidas", "Valor Puma"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
        );

        painelGuias.addTab("Valores", jPanel6);

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

        chkNikeLuvas.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeLuvas.setText("Nike");
        chkNikeLuvas.setActionCommand("Garantia Estendida");
        chkNikeLuvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeLuvasActionPerformed(evt);
            }
        });

        chkAdidasLuvas.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasLuvas.setText("Adidas");
        chkAdidasLuvas.setActionCommand("Garantia Estendida");
        chkAdidasLuvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasLuvasActionPerformed(evt);
            }
        });

        chkPumaLuvas.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaLuvas.setText("Puma");
        chkPumaLuvas.setActionCommand("Garantia Estendida");
        chkPumaLuvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaLuvasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeLuvas)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasLuvas)
                .addGap(18, 18, 18)
                .addComponent(chkPumaLuvas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeLuvas)
                    .addComponent(chkAdidasLuvas)
                    .addComponent(chkPumaLuvas))
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
                        .addComponent(spnNikeLuvas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnAdidasLuvas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnPumaLuvas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNikeLuvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAdidasLuvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnPumaLuvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(119, 119, 119)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(437, 437, 437))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
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

        chkKitGYM.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkKitGYM.setText("Kit 40 Kg De Anilhas De Ferro + Barras De Supino E Halteres.");
        chkKitGYM.setActionCommand("Garantia Estendida");
        chkKitGYM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKitGYMActionPerformed(evt);
            }
        });

        chkHalterGYM.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkHalterGYM.setText("Halter Sextavado Pintado 12 Kg Para Ginastica E Academia.");
        chkHalterGYM.setActionCommand("Garantia Estendida");
        chkHalterGYM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHalterGYMActionPerformed(evt);
            }
        });

        chkElasticoGYM.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkElasticoGYM.setText("Elástico P/ Treino Crossfit Musculação Ginástica Exercício Físico.");
        chkElasticoGYM.setActionCommand("Garantia Estendida");
        chkElasticoGYM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkElasticoGYMActionPerformed(evt);
            }
        });

        chkCinturaoGYM.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkCinturaoGYM.setText("Cinturão Fivela Musculação Crossfit Academia Cinto.");
        chkCinturaoGYM.setActionCommand("Garantia Estendida");
        chkCinturaoGYM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCinturaoGYMActionPerformed(evt);
            }
        });

        chkErgoGYM.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkErgoGYM.setText("Esteira Ergométrica Kikos Kx9500 110v.");
        chkErgoGYM.setActionCommand("Garantia Estendida");
        chkErgoGYM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkErgoGYMActionPerformed(evt);
            }
        });

        chkMagGYM.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkMagGYM.setText("Esteira Mecânica Emp-880 Com 5 Funções 0173 Polimet.");
        chkMagGYM.setActionCommand("Garantia Estendida");
        chkMagGYM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMagGYMActionPerformed(evt);
            }
        });

        chkElipticoGYM.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkElipticoGYM.setText("Elíptico Magnético Polimet Light - Preto/Laranja.");
        chkElipticoGYM.setActionCommand("Garantia Estendida");
        chkElipticoGYM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkElipticoGYMActionPerformed(evt);
            }
        });

        chkSimuladorGYM.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkSimuladorGYM.setText("Simulador de Escada Matrix C3X.");
        chkSimuladorGYM.setActionCommand("Garantia Estendida");
        chkSimuladorGYM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSimuladorGYMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkKitGYM)
                    .addComponent(chkHalterGYM)
                    .addComponent(chkElasticoGYM)
                    .addComponent(chkCinturaoGYM)
                    .addComponent(chkErgoGYM)
                    .addComponent(chkMagGYM)
                    .addComponent(chkElipticoGYM)
                    .addComponent(chkSimuladorGYM))
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(chkKitGYM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkHalterGYM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkElasticoGYM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkCinturaoGYM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkErgoGYM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkMagGYM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkElipticoGYM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSimuladorGYM))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel50)
                        .addGap(69, 69, 69)
                        .addComponent(spnElasticoGYM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnHalterGYM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnKitGYM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel41Layout.createSequentialGroup()
                                    .addComponent(jLabel54)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spnSimuladorGYM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel41Layout.createSequentialGroup()
                                    .addComponent(jLabel53)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(spnMagGYM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel41Layout.createSequentialGroup()
                                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnCinturaoGYM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnErgoGYM, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnKitGYM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnHalterGYM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnElasticoGYM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCinturaoGYM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnErgoGYM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnMagGYM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnSimuladorGYM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(62, Short.MAX_VALUE))
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

        chkNikeTenis.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeTenis.setText("Nike");
        chkNikeTenis.setActionCommand("Garantia Estendida");
        chkNikeTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeTenisActionPerformed(evt);
            }
        });

        chkAdidasTenis.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasTenis.setText("Adidas");
        chkAdidasTenis.setActionCommand("Garantia Estendida");
        chkAdidasTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasTenisActionPerformed(evt);
            }
        });

        chkPumaTenis.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaTenis.setText("Puma");
        chkPumaTenis.setActionCommand("Garantia Estendida");
        chkPumaTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaTenisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeTenis)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasTenis)
                .addGap(18, 18, 18)
                .addComponent(chkPumaTenis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeTenis)
                    .addComponent(chkAdidasTenis)
                    .addComponent(chkPumaTenis))
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
                        .addComponent(spnNikeTenis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnAdidasTenis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnPumaTenis, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNikeTenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAdidasTenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnPumaTenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(116, 116, 116)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        painelGuias.addTab("Tênis", jPanel2);

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

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Camisetas - Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkNikeCamiseta.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeCamiseta.setText("Nike");
        chkNikeCamiseta.setActionCommand("Garantia Estendida");
        chkNikeCamiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeCamisetaActionPerformed(evt);
            }
        });

        chkAdidasCamiseta.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasCamiseta.setText("Adidas");
        chkAdidasCamiseta.setActionCommand("Garantia Estendida");
        chkAdidasCamiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasCamisetaActionPerformed(evt);
            }
        });

        chkPumaCamiseta.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaCamiseta.setText("Puma");
        chkPumaCamiseta.setActionCommand("Garantia Estendida");
        chkPumaCamiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaCamisetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeCamiseta)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasCamiseta)
                .addGap(18, 18, 18)
                .addComponent(chkPumaCamiseta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeCamiseta)
                    .addComponent(chkAdidasCamiseta)
                    .addComponent(chkPumaCamiseta))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calça - Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

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
                .addGap(0, 4, Short.MAX_VALUE))
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
                        .addComponent(spnNikeCamiseta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnAdidasCamiseta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnPumaCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNikeCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAdidasCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnPumaCamiseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(spnNikeCalca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnAdidasCalca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnPumaCalca, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNikeCalca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAdidasCalca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnPumaCalca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Shorts - Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkNikeShort.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeShort.setText("Nike");
        chkNikeShort.setActionCommand("Garantia Estendida");
        chkNikeShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeShortActionPerformed(evt);
            }
        });

        chkAdidasShort.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasShort.setText("Adidas");
        chkAdidasShort.setActionCommand("Garantia Estendida");
        chkAdidasShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasShortActionPerformed(evt);
            }
        });

        chkPumaShort.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaShort.setText("Puma");
        chkPumaShort.setActionCommand("Garantia Estendida");
        chkPumaShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaShortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeShort)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasShort)
                .addGap(18, 18, 18)
                .addComponent(chkPumaShort)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeShort)
                    .addComponent(chkAdidasShort)
                    .addComponent(chkPumaShort))
                .addGap(0, 9, Short.MAX_VALUE))
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
                        .addComponent(spnNikeShort, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnAdidasShort, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnPumaShort, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNikeShort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAdidasShort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnPumaShort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        painelGuias.addTab("Roupas", jPanel3);

        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modelos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkFutebolBolas.setText("Futebol");

        chkVoleiBolas.setText("Vôlei");

        chkHandebolBolas.setText("Handebol");

        chkBasqueteBolas.setText("Basquete");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkFutebolBolas)
                    .addComponent(chkVoleiBolas)
                    .addComponent(chkHandebolBolas)
                    .addComponent(chkBasqueteBolas))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(chkFutebolBolas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkVoleiBolas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkHandebolBolas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                .addComponent(chkBasqueteBolas)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Text", 1, 14))); // NOI18N

        chkNikeBolas.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkNikeBolas.setText("Nike");
        chkNikeBolas.setActionCommand("Garantia Estendida");
        chkNikeBolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNikeBolasActionPerformed(evt);
            }
        });

        chkAdidasBolas.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkAdidasBolas.setText("Adidas");
        chkAdidasBolas.setActionCommand("Garantia Estendida");
        chkAdidasBolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAdidasBolasActionPerformed(evt);
            }
        });

        chkPumaBolas.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        chkPumaBolas.setText("Puma");
        chkPumaBolas.setActionCommand("Garantia Estendida");
        chkPumaBolas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPumaBolasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkNikeBolas)
                .addGap(18, 18, 18)
                .addComponent(chkAdidasBolas)
                .addGap(18, 18, 18)
                .addComponent(chkPumaBolas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkNikeBolas)
                    .addComponent(chkAdidasBolas)
                    .addComponent(chkPumaBolas))
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
                        .addComponent(spnNikeBolas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnAdidasBolas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnPumaBolas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNikeBolas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAdidasBolas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnPumaBolas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(127, 127, 127))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        painelGuias.addTab("Bolas", jPanel11);

        tabelaResumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Luvas", "GYM", "Tênis", "Bolas", "Calças", "Shorts", "Camisetas", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, true
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        tblResumoLayout.setVerticalGroup(
            tblResumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        painelGuias.addTab("Resumo", tblResumo);

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(chkGarantia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkParcelamentos)
                .addGap(19, 19, 19))
        );

        cboTipoParce.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        cboTipoParce.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Forma de pagamento...", "À vista ", "Parcelado em 2x", "Parcelado em 3x", "Parcelado em 4x", "Parcelado em 5x", "Parcelado em 6x", "Parcelado em 7x", "Parcelado em 8x", "Parcelado em 9x", "Parcelado em 10x" }));

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboTipoParce, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtCPFCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 184, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtCPFCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTipoParce, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void chkPumaShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaShortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaShortActionPerformed

    private void chkAdidasShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasShortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasShortActionPerformed

    private void chkNikeShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeShortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeShortActionPerformed

    private void chkNikeCamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeCamisetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeCamisetaActionPerformed

    private void chkAdidasCamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasCamisetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasCamisetaActionPerformed

    private void chkPumaCamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaCamisetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaCamisetaActionPerformed

    private void chkPumaCalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaCalcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaCalcaActionPerformed

    private void chkAdidasCalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasCalcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasCalcaActionPerformed

    private void chkNikeCalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeCalcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeCalcaActionPerformed

    private void chkNikeBolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeBolasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeBolasActionPerformed

    private void chkAdidasBolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasBolasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasBolasActionPerformed

    private void chkPumaBolasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaBolasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaBolasActionPerformed

    private void chkNikeTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeTenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeTenisActionPerformed

    private void chkAdidasTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasTenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasTenisActionPerformed

    private void chkPumaTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaTenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaTenisActionPerformed

    private void chkNikeLuvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNikeLuvasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNikeLuvasActionPerformed

    private void chkAdidasLuvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAdidasLuvasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAdidasLuvasActionPerformed

    private void chkPumaLuvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPumaLuvasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPumaLuvasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // MARCAS
        String marcasLuvas = "";
        if (chkNikeLuvas.isSelected()) {
            marcasLuvas += chkNikeLuvas.getText() + ", ";
        }
        if (chkAdidasLuvas.isSelected()) {
            marcasLuvas += chkAdidasLuvas.getText() + ", ";
        }
        if (chkPumaLuvas.isSelected()) {
            marcasLuvas += chkPumaLuvas.getText() + " ";
        }
        String marcasTenis = "";
        if (chkNikeTenis.isSelected()) {
            marcasTenis += chkNikeLuvas.getText() + ", ";
        }
        if (chkAdidasLuvas.isSelected()) {
            marcasTenis += chkAdidasLuvas.getText() + ", ";
        }
        if (chkPumaLuvas.isSelected()) {
            marcasTenis += chkPumaLuvas.getText() + " ";
        }
        String marcasBolas = "";
        if (chkNikeBolas.isSelected()) {
            marcasBolas += chkNikeBolas.getText() + ", ";
        }
        if (chkAdidasBolas.isSelected()) {
            marcasBolas += chkAdidasBolas.getText() + ", ";
        }
        if (chkPumaBolas.isSelected()) {
            marcasBolas += chkPumaBolas.getText() + " ";
        }
        String acessoriosGYM = "";
        if (chkKitGYM.isSelected()) {
            acessoriosGYM += chkKitGYM.getText() + ", ";
        }
        if (chkHalterGYM.isSelected()) {
            acessoriosGYM += chkHalterGYM.getText() + ", ";
        }
        if (chkElasticoGYM.isSelected()) {
            acessoriosGYM += chkElasticoGYM.getText() + ", ";
        }
        if (chkCinturaoGYM.isSelected()) {
            acessoriosGYM += chkCinturaoGYM.getText() + ", ";
        }
        if (chkErgoGYM.isSelected()) {
            acessoriosGYM += chkErgoGYM.getText() + ", ";
        }
        if (chkMagGYM.isSelected()) {
            acessoriosGYM += chkMagGYM.getText() + ", ";
        }
        if (chkElasticoGYM.isSelected()) {
            acessoriosGYM += chkElasticoGYM.getText() + ", ";
        }
        if (chkSimuladorGYM.isSelected()) {
            acessoriosGYM += chkSimuladorGYM.getText() + " ";
        }
        String marcasCalcas = "";
        if (chkNikeCalca.isSelected()) {
            marcasCalcas += chkNikeCalca.getText() + ", ";
        }
        if (chkAdidasCalca.isSelected()) {
            marcasCalcas += chkAdidasCalca.getText() + ", ";
        }
        if (chkPumaCalca.isSelected()) {
            marcasCalcas += chkPumaCalca.getText() + " ";
        }
        String marcasShorts = "";
        if (chkNikeShort.isSelected()) {
            marcasShorts += chkNikeShort.getText() + ", ";
        }
        if (chkAdidasShort.isSelected()) {
            marcasShorts += chkAdidasShort.getText() + ", ";
        }
        if (chkPumaShort.isSelected()) {
            marcasShorts += chkPumaShort.getText() + " ";
        }
        String marcasCamisetas = "";
        if (chkNikeShort.isSelected()) {
            marcasCamisetas += chkNikeShort.getText() + ", ";
        }
        if (chkAdidasShort.isSelected()) {
            marcasCamisetas += chkAdidasShort.getText() + ", ";
        }
        if (chkPumaShort.isSelected()) {
            marcasCamisetas += chkPumaShort.getText() + " ";
        }
        
        // QUANTIDADES
        String LuvasNike = spnNikeLuvas.getValue().toString();
        String LuvasAdidas = spnAdidasLuvas.getValue().toString();
        String LuvasPuma = spnPumaLuvas.getValue().toString();
        String GYMKit = spnKitGYM.getValue().toString();
        String GYMHalter = spnHalterGYM.getValue().toString();
        String GYMElastico = spnElasticoGYM.getValue().toString();
        String GYMCinturao = spnCinturaoGYM.getValue().toString();
        String GYMErgo = spnErgoGYM.getValue().toString();
        String GYMMag = spnMagGYM.getValue().toString();
        String GYMSimulador = spnSimuladorGYM.getValue().toString();
        String TenisNike = spnNikeTenis.getValue().toString();
        String TenisAdidas = spnAdidasTenis.getValue().toString();
        String TenisPuma = spnPumaTenis.getValue().toString();
        String BolasNike = spnNikeBolas.getValue().toString();
        String BolasAdidas = spnAdidasBolas.getValue().toString();
        String BolasPuma = spnPumaBolas.getValue().toString();
        String CalcaNike = spnNikeCalca.getValue().toString();
        String CalcaAdidas = spnAdidasCalca.getValue().toString();
        String CalcaPuma = spnPumaCalca.getValue().toString();
        String ShortNike = spnNikeShort.getValue().toString();
        String ShortAdidas = spnAdidasShort.getValue().toString();
        String ShortPuma = spnPumaShort.getValue().toString();
        String CamisetaNike = spnNikeCamiseta.getValue().toString();
        String CamisetaAdidas = spnAdidasCamiseta.getValue().toString();
        String CamisetaPuma = spnPumaLuvas.getValue().toString();
        
        // Serviços
        String servicos = "";
        if (chkGarantia.isSelected()) {
            servicos += chkGarantia.getText() + ", ";
        }
        if (chkDesconto.isSelected()) {
            servicos += chkDesconto.getText() + ", ";
        }
        if (chkParcelamentos.isSelected()) {
            servicos += chkParcelamentos.getText() + " ";
        }
        
        // Parcelamentos
        String tipoParcela = (cboTipoParce.getSelectedItem().toString());
        
        // Inserindo na tabela
        if (txtCPFCompra.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o CPF!");
            txtCPFCompra.setBackground(Color.yellow);
            return;
        }
        txtCPFCompra.setBackground(Color.white);
        painelGuias.setSelectedIndex(6);
        DefaultTableModel model = (DefaultTableModel) tabelaResumo.getModel();
        model.addRow(new Object[]{txtCPFCompra.getText(), marcasLuvas, acessoriosGYM, marcasTenis, marcasBolas, marcasCalcas, marcasShorts, marcasCamisetas});
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void chkKitGYMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKitGYMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkKitGYMActionPerformed

    private void chkHalterGYMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHalterGYMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkHalterGYMActionPerformed

    private void chkElasticoGYMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkElasticoGYMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkElasticoGYMActionPerformed

    private void chkCinturaoGYMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCinturaoGYMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCinturaoGYMActionPerformed

    private void chkErgoGYMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkErgoGYMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkErgoGYMActionPerformed

    private void chkMagGYMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMagGYMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMagGYMActionPerformed

    private void chkElipticoGYMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkElipticoGYMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkElipticoGYMActionPerformed

    private void chkSimuladorGYMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSimuladorGYMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSimuladorGYMActionPerformed

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
    private javax.swing.JCheckBox chkAdidasBolas;
    private javax.swing.JCheckBox chkAdidasCalca;
    private javax.swing.JCheckBox chkAdidasCamiseta;
    private javax.swing.JCheckBox chkAdidasLuvas;
    private javax.swing.JCheckBox chkAdidasShort;
    private javax.swing.JCheckBox chkAdidasTenis;
    private javax.swing.JCheckBox chkBasqueteBolas;
    private javax.swing.JCheckBox chkCinturaoGYM;
    private javax.swing.JCheckBox chkDesconto;
    private javax.swing.JCheckBox chkElasticoGYM;
    private javax.swing.JCheckBox chkElipticoGYM;
    private javax.swing.JCheckBox chkErgoGYM;
    private javax.swing.JCheckBox chkFutebolBolas;
    private javax.swing.JCheckBox chkGarantia;
    private javax.swing.JCheckBox chkHalterGYM;
    private javax.swing.JCheckBox chkHandebolBolas;
    private javax.swing.JCheckBox chkKitGYM;
    private javax.swing.JCheckBox chkMagGYM;
    private javax.swing.JCheckBox chkNikeBolas;
    private javax.swing.JCheckBox chkNikeCalca;
    private javax.swing.JCheckBox chkNikeCamiseta;
    private javax.swing.JCheckBox chkNikeLuvas;
    private javax.swing.JCheckBox chkNikeShort;
    private javax.swing.JCheckBox chkNikeTenis;
    private javax.swing.JCheckBox chkParcelamentos;
    private javax.swing.JCheckBox chkPumaBolas;
    private javax.swing.JCheckBox chkPumaCalca;
    private javax.swing.JCheckBox chkPumaCamiseta;
    private javax.swing.JCheckBox chkPumaLuvas;
    private javax.swing.JCheckBox chkPumaShort;
    private javax.swing.JCheckBox chkPumaTenis;
    private javax.swing.JCheckBox chkSimuladorGYM;
    private javax.swing.JCheckBox chkVoleiBolas;
    private javax.swing.ButtonGroup grupoPesosGYM;
    private javax.swing.ButtonGroup grupoTamanhoCalca;
    private javax.swing.ButtonGroup grupoTamanhoCamiseta;
    private javax.swing.ButtonGroup grupoTamanhoLuvas;
    private javax.swing.ButtonGroup grupoTamanhoShort;
    private javax.swing.ButtonGroup grupoTamanhoTenis;
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
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel27;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTabbedPane painelGuias;
    private javax.swing.JRadioButton rboC1;
    private javax.swing.JRadioButton rboC2;
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
    private javax.swing.JSpinner spnAdidasBolas;
    private javax.swing.JSpinner spnAdidasCalca;
    private javax.swing.JSpinner spnAdidasCamiseta;
    private javax.swing.JSpinner spnAdidasLuvas;
    private javax.swing.JSpinner spnAdidasShort;
    private javax.swing.JSpinner spnAdidasTenis;
    private javax.swing.JSpinner spnCinturaoGYM;
    private javax.swing.JSpinner spnElasticoGYM;
    private javax.swing.JSpinner spnErgoGYM;
    private javax.swing.JSpinner spnHalterGYM;
    private javax.swing.JSpinner spnKitGYM;
    private javax.swing.JSpinner spnMagGYM;
    private javax.swing.JSpinner spnNikeBolas;
    private javax.swing.JSpinner spnNikeCalca;
    private javax.swing.JSpinner spnNikeCamiseta;
    private javax.swing.JSpinner spnNikeLuvas;
    private javax.swing.JSpinner spnNikeShort;
    private javax.swing.JSpinner spnNikeTenis;
    private javax.swing.JSpinner spnPumaBolas;
    private javax.swing.JSpinner spnPumaCalca;
    private javax.swing.JSpinner spnPumaCamiseta;
    private javax.swing.JSpinner spnPumaLuvas;
    private javax.swing.JSpinner spnPumaShort;
    private javax.swing.JSpinner spnPumaTenis;
    private javax.swing.JSpinner spnSimuladorGYM;
    private javax.swing.JTable tabelaResumo;
    private javax.swing.JPanel tblResumo;
    private javax.swing.JTextField txtCPFCompra;
    // End of variables declaration//GEN-END:variables

}
