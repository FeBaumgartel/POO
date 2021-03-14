/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dataservices.Persistencia;
import java.util.List;
import javax.swing.table.TableModel;
import model.Aluno;
import resources.AlunoTableModel;

/**
 *
 * @author felipe_baumgartel
 */
public class TabelaAluno extends javax.swing.JFrame {

    /**
     * Creates new form E
     */
    public TabelaAluno() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btVoltar.setBackground(new java.awt.Color(0, 204, 204));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btVoltar)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(0, 204, 204));

        jTable1.setModel(carregarTabela());
        jTable1.setForeground(new java.awt.Color(0, 204, 204));
        jScrollPane3.setViewportView(jTable1);

        jPanel2.add(jScrollPane3);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private AlunoTableModel atm;
    
    private TableModel carregarTabela() {
        List<Aluno> lista = Persistencia.list();
        atm = new AlunoTableModel(lista);
        return atm;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}