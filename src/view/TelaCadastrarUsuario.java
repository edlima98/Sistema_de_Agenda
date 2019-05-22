package view;

import util.Util;
import entidade.Usuario;
import javax.swing.JOptionPane;

public class TelaCadastrarUsuario extends javax.swing.JFrame {

    public TelaCadastrarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNovaSenha = new javax.swing.JTextField();
        txtNovoUsuario = new javax.swing.JTextField();
        txtConfirmarSenha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setLocation(new java.awt.Point(700, 300));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro_Usuario"));

        jLabel1.setText("Novo Usuario:");

        jLabel2.setText("Senha:");

        jLabel3.setText("Confirmar Senha:");

        txtNovaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNovaSenhaActionPerformed(evt);
            }
        });
        txtNovaSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNovaSenhaKeyPressed(evt);
            }
        });

        txtNovoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNovoUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNovoUsuarioKeyTyped(evt);
            }
        });

        txtConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarSenhaActionPerformed(evt);
            }
        });
        txtConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmarSenhaKeyPressed(evt);
            }
        });

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(txtConfirmarSenha)
                    .addComponent(txtNovaSenha)
                    .addComponent(txtNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaActionPerformed

    }//GEN-LAST:event_txtConfirmarSenhaActionPerformed

    private void txtNovaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNovaSenhaActionPerformed

    }//GEN-LAST:event_txtNovaSenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (verificar()) {
            if (checarSenha()) {
                String usuario = txtNovoUsuario.getText();
                String senha = txtNovaSenha.getText();
                Usuario c = new Usuario(usuario, senha);
                Util.listUsuario.add(c);
                txtNovoUsuario.setText("");
                txtNovaSenha.setText("");
                txtConfirmarSenha.setText("");
                JOptionPane.showMessageDialog(this, "Cadastrado com Sucesso");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preecha Todos os Campos!");
        }
        if (!checarSenha()) {
            JOptionPane.showMessageDialog(this, "Senhas não Coincidem");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaLogin l = new TelaLogin();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNovoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNovoUsuarioKeyTyped

    }//GEN-LAST:event_txtNovoUsuarioKeyTyped

    private void txtNovoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNovoUsuarioKeyPressed
        if (evt.getKeyCode() == 10) {
            if (verificar()) {
                if (checarSenha()) {
                    String usuario = txtNovoUsuario.getText();
                    String senha = txtNovaSenha.getText();
                    Usuario c = new Usuario(usuario, senha);
                    Util.listUsuario.add(c);
                    txtNovoUsuario.setText("");
                    txtNovaSenha.setText("");
                    txtConfirmarSenha.setText("");
                    JOptionPane.showMessageDialog(this, "Cadastrado com Sucesso");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preecha Todos os Campos!");
            }
            if (!checarSenha()) {
                JOptionPane.showMessageDialog(this, "Senhas não Coincidem");
            }

        }
    }//GEN-LAST:event_txtNovoUsuarioKeyPressed

    private void txtNovaSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNovaSenhaKeyPressed
        if (evt.getKeyCode() == 10) {
            if (verificar()) {
                if (checarSenha()) {
                    String usuario = txtNovoUsuario.getText();
                    String senha = txtNovaSenha.getText();
                    Usuario c = new Usuario(usuario, senha);
                    Util.listUsuario.add(c);
                    txtNovoUsuario.setText("");
                    txtNovaSenha.setText("");
                    txtConfirmarSenha.setText("");
                    JOptionPane.showMessageDialog(this, "Cadastrado com Sucesso");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preecha Todos os Campos!");
            }
            if (!checarSenha()) {
                JOptionPane.showMessageDialog(this, "Senhas não Coincidem");
            }

        }
    }//GEN-LAST:event_txtNovaSenhaKeyPressed

    private void txtConfirmarSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaKeyPressed
        if (evt.getKeyCode() == 10) {
            if (verificar()) {
                if (checarSenha()) {
                    String usuario = txtNovoUsuario.getText();
                    String senha = txtNovaSenha.getText();
                    Usuario c = new Usuario(usuario, senha);
                    Util.listUsuario.add(c);
                    txtNovoUsuario.setText("");
                    txtNovaSenha.setText("");
                    txtConfirmarSenha.setText("");
                    JOptionPane.showMessageDialog(this, "Cadastrado com Sucesso");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Preecha Todos os Campos!");
            }
            if (!checarSenha()) {
                JOptionPane.showMessageDialog(this, "Senhas não Coincidem");
            }

        }
    }//GEN-LAST:event_txtConfirmarSenhaKeyPressed
    private boolean verificar() {
        if (txtNovoUsuario.getText().equals("")) {
            return false;
        } else if (txtNovaSenha.getText().equals("")) {
            return false;
        } else if (txtConfirmarSenha.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    private boolean checarSenha() {
        if (txtConfirmarSenha.getText().equals(txtNovaSenha.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtConfirmarSenha;
    private javax.swing.JTextField txtNovaSenha;
    private javax.swing.JTextField txtNovoUsuario;
    // End of variables declaration//GEN-END:variables
}
