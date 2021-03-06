/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.Animal;
import domain.Sexo;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Cadastro_animal extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_animal
     */
    public Cadastro_animal() {
        initComponents();
        setTitle("Cadastro de Animal");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btCancelar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btResgatar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        txRaca = new javax.swing.JTextField();
        txCor = new javax.swing.JTextField();
        txPeso = new javax.swing.JTextField();
        txIdade = new javax.swing.JTextField();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        txAlimentacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btVoltar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel2.add(btNovo);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btSalvar);

        btResgatar.setText("Resgatar");
        btResgatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResgatarActionPerformed(evt);
            }
        });
        jPanel2.add(btResgatar);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jLabel1.setText("ID:");

        jLabel2.setText("Ra??a:");

        jLabel3.setText("Cor:");

        jLabel4.setText("Peso:");

        jLabel5.setText("Idade:");

        jLabel6.setText("Sexo:");

        jLabel7.setText("Alimenta????o:");

        txId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdKeyTyped(evt);
            }
        });

        txPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txPesoKeyTyped(evt);
            }
        });

        txIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdadeKeyTyped(evt);
            }
        });

        buttonGroup1.add(rbMasculino);
        rbMasculino.setText("Masculino");

        buttonGroup1.add(rbFeminino);
        rbFeminino.setText("Feminino");

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
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(rbFeminino))
                    .addComponent(txPeso)
                    .addComponent(txCor)
                    .addComponent(txRaca)
                    .addComponent(txAlimentacao)
                    .addComponent(txIdade)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txAlimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        habilitarComponentes();
        limparCampos();
        txId.requestFocus();
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        desabilitarComponentes();
        limparCampos();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (txId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um codigo");
        } else if (txRaca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma ra??a");
        } else if (txCor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma cor");
        } else if (txPeso.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um peso");
        } else if (txIdade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma idade");
        } else if (rbFeminino.isSelected() == false && rbMasculino.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um sexo");
        } else if (txAlimentacao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma alimenta????o");
        } else {
            animal = CriarEntidade();
            JOptionPane.showMessageDialog(this, animal);
            resgatarAnimal(animal);
            desabilitarComponentes();
            limparCampos();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btResgatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResgatarActionPerformed
        resgatarAnimal(animal);
    }//GEN-LAST:event_btResgatarActionPerformed

    private void txIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txIdKeyTyped

    private void txIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txIdadeKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txIdadeKeyTyped

    private void txPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPesoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || c == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txPesoKeyTyped

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
            java.util.logging.Logger.getLogger(Cadastro_animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_animal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_animal().setVisible(true);
            }
        });
    }

    private void habilitarComponentes() {
        txId.setEnabled(true);
        txRaca.setEnabled(true);
        txCor.setEnabled(true);
        txPeso.setEnabled(true);
        txIdade.setEnabled(true);
        txAlimentacao.setEnabled(true);
        rbMasculino.setEnabled(true);
        rbFeminino.setEnabled(true);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        btResgatar.setEnabled(true);
    }

    private void desabilitarComponentes() {
        txId.setEnabled(false);
        txRaca.setEnabled(false);
        txCor.setEnabled(false);
        txPeso.setEnabled(false);
        txIdade.setEnabled(false);
        txAlimentacao.setEnabled(false);
        rbMasculino.setEnabled(false);
        rbFeminino.setEnabled(false);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);
        btResgatar.setEnabled(false);
    }

    private Animal CriarEntidade() {
        int Id = Integer.parseInt(txId.getText());
        String Raca = txRaca.getText();
        String Cor = txCor.getText();
        double Peso = Double.parseDouble(txPeso.getText());
        int Idade = Integer.parseInt(txIdade.getText());
        Sexo sexo = rbFeminino.isSelected() ? Sexo.Feminino : Sexo.Masculino;
        String Alimentacao = txAlimentacao.getText();

        Animal animal = new Animal(Id, Raca, Cor, Peso, Idade, sexo, Alimentacao);

        return animal;
    }

    private void limparCampos() {
        txId.setText("");
        txRaca.setText("");
        txCor.setText("");;
        txPeso.setText("");
        txIdade.setText("");
        txAlimentacao.setText("");
        buttonGroup1.clearSelection();
        btResgatar.removeAll();
        btCancelar.removeAll();
        btSalvar.removeAll();
    }

    public void resgatarAnimal(Animal a) {
        txId.setText(String.valueOf(a.getId()));
        txRaca.setText(a.getRaca());
        txCor.setText(a.getCor());
        txPeso.setText(String.valueOf(a.getPeso()));
        txIdade.setText(String.valueOf(a.getIdade()));
        if (String.valueOf(a.getSexo()).equals("Feminino")) {
            rbFeminino.setSelected(true);
        } else {
            rbMasculino.setSelected(true);
        }
        txAlimentacao.setText(a.getAlimentacao());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btResgatar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txAlimentacao;
    private javax.swing.JTextField txCor;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txIdade;
    private javax.swing.JTextField txPeso;
    private javax.swing.JTextField txRaca;
    // End of variables declaration//GEN-END:variables
private Animal animal;
}
