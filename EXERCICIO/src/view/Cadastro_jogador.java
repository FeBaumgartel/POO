/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.Jogador;
import domain.Pe;
import domain.Nacionalidade;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Cadastro_jogador extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_jogador
     */
    public Cadastro_jogador() {
        initComponents();
        setLocationRelativeTo(null);
        desabilitarComponentes();
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
        btNovo = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txCodigo = new javax.swing.JTextField();
        txCodTime = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        txNascimento = new javax.swing.JTextField();
        cbNacionalidade = new javax.swing.JComboBox();
        txAltura = new javax.swing.JTextField();
        cbPe = new javax.swing.JComboBox();
        cbNumero = new javax.swing.JComboBox();
        cbPosicao = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(212, 0, 0));

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btNovo);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(212, 0, 0));

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSair)
                .addGap(9, 9, 9))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btSalvar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Codigo:");

        jLabel2.setText("Codigo do time:");

        jLabel3.setText("Nome Completo:");

        jLabel4.setText("Data de nascimento:");

        jLabel5.setText("Nacionalidade:");

        jLabel6.setText("Altura:");

        jLabel7.setText("P??:");

        jLabel8.setText("N??mero:");

        jLabel9.setText("Posi????o:");

        txCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txCodigoKeyTyped(evt);
            }
        });

        txCodTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txCodTimeKeyTyped(evt);
            }
        });

        txNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNomeKeyTyped(evt);
            }
        });

        cbNacionalidade.setModel(new javax.swing.DefaultComboBoxModel(Nacionalidade.values()));

        txAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txAlturaKeyTyped(evt);
            }
        });

        cbPe.setModel(new javax.swing.DefaultComboBoxModel(Pe.values()));
        cbPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPeActionPerformed(evt);
            }
        });

        cbNumero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", " " }));

        cbPosicao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Goleiro", "Lateral", "Zagueiro", "Meia", "Atacante" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txCodigo)
                    .addComponent(txCodTime)
                    .addComponent(txNome)
                    .addComponent(txNascimento)
                    .addComponent(cbNacionalidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txAltura)
                    .addComponent(cbPe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNumero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbPosicao, 0, 190, Short.MAX_VALUE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txCodTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarComponentes();
        limparCampos();
        txCodigo.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        desabilitarComponentes();
        limparCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (txCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um codigo");
        } else if (txNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um nome");
        } else if (txCodTime.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um codigo de jogador");
        } else if (txNascimento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma data de nascimento");
        } else if (txAltura.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma altura");
        } else {
            jogador = criarJogador();
            JOptionPane.showMessageDialog(this, jogador);
            resgatarJogador(jogador);
            desabilitarComponentes();
            limparCampos();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void cbPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPeActionPerformed

    private void txAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txAlturaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txAlturaKeyTyped

    private void txCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txCodigoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txCodigoKeyTyped

    private void txCodTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txCodTimeKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txCodTimeKeyTyped

    private void txNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txNomeKeyTyped

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
            java.util.logging.Logger.getLogger(Cadastro_jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_jogador().setVisible(true);
            }
        });
    }

    private void desabilitarComponentes() {
        txCodigo.setEnabled(false);
        txNome.setEnabled(false);
        txCodTime.setEnabled(false);
        txNascimento.setEnabled(false);
        txAltura.setEnabled(false);
        cbNacionalidade.setEnabled(false);
        cbPe.setEnabled(false);
        cbNumero.setEnabled(false);
        cbPosicao.setEnabled(false);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);
    }

    private void habilitarComponentes() {
        txCodigo.setEnabled(true);
        txNome.setEnabled(true);
        txCodTime.setEnabled(true);
        txNascimento.setEnabled(true);
        txAltura.setEnabled(true);
        cbNacionalidade.setEnabled(true);
        cbPe.setEnabled(true);
        cbNumero.setEnabled(true);
        cbPosicao.setEnabled(true);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
    }

    private void limparCampos() {
        txCodigo.setText("");
        txNome.setText("");
        txCodTime.setText("");;
        txNascimento.setText("");
        txAltura.setText("");
        cbNacionalidade.removeAll();
        cbPe.removeAll();
        cbNumero.removeAll();
        cbPosicao.removeAll();
        btCancelar.removeAll();
        btSalvar.removeAll();
    }

    public Jogador criarJogador() {
        int codigo = Integer.parseInt(txCodigo.getText());
        String nome = txNome.getText();
        int codtime = Integer.parseInt(txCodTime.getText());
        double altura = Double.parseDouble(txAltura.getText());
        String Nascimento = txNascimento.getText();
        Pe pe = (Pe) cbPe.getSelectedItem();
        Nacionalidade nacionalidade = (Nacionalidade) cbNacionalidade.getSelectedItem();
        int numero = Integer.parseInt(String.valueOf(cbNumero.getSelectedItem()));
        String posicao = (String) cbPosicao.getSelectedItem();

        return new Jogador(codigo, codtime, nome, Nascimento, nacionalidade, altura, pe, numero, posicao);
    }

    public void resgatarJogador(Jogador a) {
        txCodigo.setText(String.valueOf(a.getId()));
        txNome.setText(a.getNome());
        txCodTime.setText(String.valueOf(a.getId_time()));
        txNascimento.setText(a.getNascimento());
        txAltura.setText(String.valueOf(a.getAltura()));
        cbNacionalidade.setSelectedItem(a.getNacionalidade());
        cbPe.setSelectedItem(a.getPe());
        cbNumero.setSelectedItem(a.getNumero());
        cbPosicao.setSelectedItem(a.getPosicao());

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbNacionalidade;
    private javax.swing.JComboBox cbNumero;
    private javax.swing.JComboBox cbPe;
    private javax.swing.JComboBox cbPosicao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txAltura;
    private javax.swing.JTextField txCodTime;
    private javax.swing.JTextField txCodigo;
    private javax.swing.JTextField txNascimento;
    private javax.swing.JTextField txNome;
    // End of variables declaration//GEN-END:variables
private Jogador jogador;
}
