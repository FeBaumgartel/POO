/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.Cliente;
import domain.Sexo;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe_baumgartel
 */
public class Cadastro_cliente extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public Cadastro_cliente() {
        initComponents();
        setTitle("Cadastro de Cliente");
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

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btResgatar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btCancelar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        txId = new javax.swing.JTextField();
        txNome = new javax.swing.JTextField();
        txIdade = new javax.swing.JTextField();
        txCpf = new javax.swing.JTextField();
        txRg = new javax.swing.JTextField();
        txSalario = new javax.swing.JTextField();
        txRua = new javax.swing.JTextField();
        txBairro = new javax.swing.JTextField();
        txCep = new javax.swing.JTextField();
        txCidade = new javax.swing.JTextField();
        txNumero = new javax.swing.JTextField();
        txComplemento = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btNovo);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar);

        btResgatar.setText("Resgatar");
        btResgatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResgatarActionPerformed(evt);
            }
        });
        jPanel1.add(btResgatar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btCancelar);

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        jPanel3.add(btVoltar);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Idade:");

        jLabel4.setText("CPF:");

        jLabel5.setText("RG:");

        jLabel6.setText("Sal??rio:");

        jLabel7.setText("Sexo:");

        jLabel8.setText("Rua:");

        jLabel9.setText("Bairro:");

        jLabel10.setText("CEP:");

        jLabel11.setText("Cidade:");

        jLabel12.setText("N??mero:");

        jLabel13.setText("Complemento:");

        buttonGroup1.add(rbMasculino);
        rbMasculino.setText("Masculino");

        buttonGroup1.add(rbFeminino);
        rbFeminino.setText("Feminino");

        txId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdKeyTyped(evt);
            }
        });

        txIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txIdadeKeyTyped(evt);
            }
        });

        txSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txSalarioKeyTyped(evt);
            }
        });

        txNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNumeroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rbMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(rbFeminino)
                        .addGap(0, 275, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txRg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txIdade)
                            .addComponent(txNome)
                            .addComponent(txId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txCpf))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txNumero)
                            .addComponent(txComplemento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txCep)
                            .addComponent(txCidade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txRua)
                            .addComponent(txBairro, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(txIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13)
                    .addComponent(txSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

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
        } else if (txNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um nome");
        } else if (txIdade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma idade");
        } else if (txCpf.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um CPF");
        } else if (txRg.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um RG");
        } else if (txSalario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um Sal??rio");
        } else if (rbFeminino.isSelected() == false && rbMasculino.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um sexo");
        } else if (txRua.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma rua");
        } else if (txBairro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um bairro");
        } else if (txCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem uma cidade");
        } else if (txNumero.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um n??mero");
        } else if (txComplemento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um complemento");
        } else if (txCep.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Voc?? n??o pode gravar sem um CEP");
        } else {
            cliente = CriarEntidade();
            JOptionPane.showMessageDialog(this, cliente);
            resgatarCliente(cliente);
            desabilitarComponentes();
            limparCampos();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btResgatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResgatarActionPerformed
        resgatarCliente(cliente);
    }//GEN-LAST:event_btResgatarActionPerformed

    private void txSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txSalarioKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || c == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txSalarioKeyTyped

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

    private void txNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNumeroKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txNumeroKeyTyped

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
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_cliente().setVisible(true);
            }
        });
    }

    private void habilitarComponentes() {
        txId.setEnabled(true);
        txNome.setEnabled(true);
        txCpf.setEnabled(true);
        txRg.setEnabled(true);
        txIdade.setEnabled(true);
        txSalario.setEnabled(true);
        txRua.setEnabled(true);
        txBairro.setEnabled(true);
        txCep.setEnabled(true);
        txCidade.setEnabled(true);
        txNumero.setEnabled(true);
        txComplemento.setEnabled(true);
        rbMasculino.setEnabled(true);
        rbFeminino.setEnabled(true);
        btCancelar.setEnabled(true);
        btSalvar.setEnabled(true);
        btResgatar.setEnabled(true);
    }

    private void desabilitarComponentes() {
        txId.setEnabled(false);
        txNome.setEnabled(false);
        txCpf.setEnabled(false);
        txRg.setEnabled(false);
        txIdade.setEnabled(false);
        txSalario.setEnabled(false);
        txRua.setEnabled(false);
        txBairro.setEnabled(false);
        txCep.setEnabled(false);
        txCidade.setEnabled(false);
        txNumero.setEnabled(false);
        txComplemento.setEnabled(false);
        rbMasculino.setEnabled(false);
        rbFeminino.setEnabled(false);
        btCancelar.setEnabled(false);
        btSalvar.setEnabled(false);
        btResgatar.setEnabled(false);
    }

    private Cliente CriarEntidade() {
        int Id = Integer.parseInt(txId.getText());
        String Nome = txNome.getText();
        int Idade = Integer.parseInt(txIdade.getText());
        String Cpf = txCpf.getText();
        String Rg = txRg.getText();
        double Salario = Double.parseDouble(txSalario.getText());
        Sexo sexo = rbFeminino.isSelected() ? Sexo.Feminino : Sexo.Masculino;
        String Rua = txRua.getText();
        String Bairro = txBairro.getText();
        String Cep = txCep.getText();
        String Cidade = txCidade.getText();
        int Numero = Integer.parseInt(txNumero.getText());
        String Complemento = txComplemento.getText();

        Cliente cliente = new Cliente(Id, Nome, Idade, Cpf, Rg, Salario, sexo, Rua, Bairro, Cep, Cidade, Numero, Complemento);

        return cliente;
    }

    private void limparCampos() {
        txId.setText("");
        txNome.setText("");
        txIdade.setText("");;
        txCpf.setText("");
        txRg.setText("");
        txSalario.setText("");
        buttonGroup1.clearSelection();
        txRua.setText("");
        txBairro.setText("");
        txCep.setText("");
        txCidade.setText("");
        txNumero.setText("");
        txComplemento.setText("");
        btResgatar.removeAll();
        btCancelar.removeAll();
        btSalvar.removeAll();
    }

    public void resgatarCliente(Cliente a) {
        txId.setText(String.valueOf(a.getId()));
        txNome.setText(a.getNome());
        txIdade.setText(String.valueOf(a.getIdade()));
        txCpf.setText(a.getCpf());
        txRg.setText(a.getRg());
        txSalario.setText(String.valueOf(a.getSalario()));
        if (String.valueOf(a.getSexo()).equals("Feminino")) {
            rbFeminino.setSelected(true);
        } else {
            rbMasculino.setSelected(true);
        }
        txRua.setText(a.getRua());
        txBairro.setText(a.getBairro());
        txCep.setText(a.getCep());
        txCidade.setText(a.getCidade());
        txNumero.setText(String.valueOf(a.getNumero()));
        txComplemento.setText(a.getComplemento());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btResgatar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txBairro;
    private javax.swing.JTextField txCep;
    private javax.swing.JTextField txCidade;
    private javax.swing.JTextField txComplemento;
    private javax.swing.JTextField txCpf;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txIdade;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txNumero;
    private javax.swing.JTextField txRg;
    private javax.swing.JTextField txRua;
    private javax.swing.JTextField txSalario;
    // End of variables declaration//GEN-END:variables
private Cliente cliente;
}
