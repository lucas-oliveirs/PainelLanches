/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pedido;

import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class framePedido extends javax.swing.JFrame 
{
    int cont = 0;
    DefaultListModel modelNovo = new DefaultListModel();
    DefaultListModel modelPronto = new DefaultListModel();
    DefaultListModel modelRetirado = new DefaultListModel();
    
    public framePedido() 
    {
        initComponents();
        pnlNovo.setModel(modelNovo);
        pnlPronto.setModel(modelPronto);
        pnlRetirar.setModel(modelRetirado);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pnlPronto = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlNovo = new javax.swing.JList<>();
        txtaPreparing = new javax.swing.JTextArea();
        txtaReady = new javax.swing.JTextArea();
        panel = new javax.swing.JPanel();
        plbl1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        plbl2 = new javax.swing.JLabel();
        txtPronto = new javax.swing.JTextField();
        plbl3 = new javax.swing.JLabel();
        btnPronto = new javax.swing.JButton();
        txtRetirado = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlRetirar = new javax.swing.JList<>();
        txtaReady1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPronto.setBackground(new java.awt.Color(0, 0, 0));
        pnlPronto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pnlPronto.setForeground(new java.awt.Color(255, 255, 255));
        pnlPronto.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane1.setViewportView(pnlPronto);

        pnlNovo.setBackground(new java.awt.Color(0, 0, 0));
        pnlNovo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pnlNovo.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(pnlNovo);

        txtaPreparing.setEditable(false);
        txtaPreparing.setBackground(new java.awt.Color(51, 204, 0));
        txtaPreparing.setColumns(20);
        txtaPreparing.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtaPreparing.setForeground(new java.awt.Color(255, 255, 255));
        txtaPreparing.setRows(5);
        txtaPreparing.setText("                        PEDIDOS\n ");
        txtaPreparing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        txtaReady.setEditable(false);
        txtaReady.setBackground(new java.awt.Color(255, 153, 0));
        txtaReady.setColumns(20);
        txtaReady.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtaReady.setForeground(new java.awt.Color(255, 255, 255));
        txtaReady.setRows(5);
        txtaReady.setText("                        PRONTOS\nPRONTOS\n");
        txtaReady.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        panel.setBackground(new java.awt.Color(102, 0, 153));

        plbl1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        plbl1.setForeground(new java.awt.Color(255, 255, 255));
        plbl1.setText("REALIZAR NOVO PEDIDO:");
        plbl1.setToolTipText("");

        btnNovo.setBackground(new java.awt.Color(51, 102, 255));
        btnNovo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("PEDIDO");
        btnNovo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        plbl2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        plbl2.setForeground(new java.awt.Color(255, 255, 255));
        plbl2.setText("INFORME O PEDIDO PRONTO:");
        plbl2.setToolTipText("");

        txtPronto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPronto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProntoActionPerformed(evt);
            }
        });

        plbl3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        plbl3.setForeground(new java.awt.Color(255, 255, 255));
        plbl3.setText("INFORME O PEDIDO RETIRADO:");
        plbl3.setToolTipText("");

        btnPronto.setBackground(new java.awt.Color(51, 102, 255));
        btnPronto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPronto.setForeground(new java.awt.Color(255, 255, 255));
        btnPronto.setText("PRONTO");
        btnPronto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntoActionPerformed(evt);
            }
        });

        txtRetirado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRetirado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnRetirar.setBackground(new java.awt.Color(51, 102, 255));
        btnRetirar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("RETIRADO");
        btnRetirar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(plbl2)
                .addGap(18, 18, 18)
                .addComponent(plbl3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnNovo)
                .addGap(116, 116, 116)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPronto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPronto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRetirado)
                    .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plbl1)
                    .addComponent(plbl2)
                    .addComponent(plbl3))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnNovo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPronto)
                            .addComponent(txtRetirado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPronto)
                            .addComponent(btnRetirar))
                        .addGap(54, 54, 54))))
        );

        pnlRetirar.setBackground(new java.awt.Color(0, 0, 0));
        pnlRetirar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pnlRetirar.setForeground(new java.awt.Color(255, 255, 255));
        pnlRetirar.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane3.setViewportView(pnlRetirar);

        txtaReady1.setEditable(false);
        txtaReady1.setBackground(new java.awt.Color(255, 0, 0));
        txtaReady1.setColumns(20);
        txtaReady1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtaReady1.setForeground(new java.awt.Color(255, 255, 255));
        txtaReady1.setRows(5);
        txtaReady1.setText("                         RETIRADOS\n ");
        txtaReady1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtaPreparing, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtaReady, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtaReady1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(0, 7, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaPreparing, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaReady, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaReady1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        String numeroRetirado = txtRetirado.getText();

        if (modelPronto.contains(numeroRetirado))
        {
            modelPronto.removeElement(numeroRetirado);
            modelRetirado.addElement(numeroRetirado);
            pnlPronto.setModel(modelPronto);
            pnlRetirar.setModel(modelRetirado);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Erro! pedido não encontrado.");
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntoActionPerformed
        String numeroPronto;

        if (txtPronto.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Insira um pedido válido");
        }
        else
        {
            numeroPronto = txtPronto.getText();

            if (modelNovo.contains(numeroPronto))
            {
                modelNovo.removeElement(numeroPronto);
                modelPronto.addElement(numeroPronto);
                pnlPronto.setModel(modelPronto);
                pnlRetirar.setModel(modelRetirado);
                cont--;
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Erro! pedido não encontrado.");
            }
        }
    }//GEN-LAST:event_btnProntoActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        int num;

        if (cont >= 30)
        {
            JOptionPane.showMessageDialog(rootPane, "Quantidade limite de pedidos atingida", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Random value = new Random();
            num = value.nextInt(200, 400);
            cont++;
            if (modelNovo.contains(String.valueOf(num)))
            {
                JOptionPane.showMessageDialog(rootPane, "Esse pedido já existe", "ERRO", JOptionPane.ERROR_MESSAGE);
                cont--;
            }
            else
            { 
                modelNovo.addElement(String.valueOf(num));
                pnlPronto.setModel(modelPronto);
                pnlRetirar.setModel(modelRetirado);
            }
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtProntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProntoActionPerformed
        
    }//GEN-LAST:event_txtProntoActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
    {
            public void run() 
            {
                new framePedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPronto;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel plbl1;
    private javax.swing.JLabel plbl2;
    private javax.swing.JLabel plbl3;
    private javax.swing.JList<String> pnlNovo;
    private javax.swing.JList<String> pnlPronto;
    private javax.swing.JList<String> pnlRetirar;
    private javax.swing.JTextField txtPronto;
    private javax.swing.JTextField txtRetirado;
    private javax.swing.JTextArea txtaPreparing;
    private javax.swing.JTextArea txtaReady;
    private javax.swing.JTextArea txtaReady1;
    // End of variables declaration//GEN-END:variables
}
