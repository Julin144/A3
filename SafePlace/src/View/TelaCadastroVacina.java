/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Dto.Request.CadastroVacinaRequestDto;

/**
 *
 * @author Ingrid
 */
public class TelaCadastroVacina extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroVacina
     */
    
    
    public TelaCadastroVacina() 
    {
        super("SafePlace");
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

        jSpinner1 = new javax.swing.JSpinner();
        cboxNomeInquilino = new javax.swing.JComboBox<>();
        cboxTipoVacina = new javax.swing.JComboBox<>();
        btnCadastrarVacina = new javax.swing.JButton();
        btnApagarCadastroVacina = new javax.swing.JButton();
        btnVoltarCadastroVacina = new javax.swing.JButton();
        spnNumeroDosesVacina = new javax.swing.JSpinner();
        btnEditarCadastroVacina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboxNomeInquilino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxNomeInquilino.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do Inquilino:"));
        cboxNomeInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxNomeInquilinoActionPerformed(evt);
            }
        });

        cboxTipoVacina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CoronaVac", "AstraZeneca", "Pfizer", "Janssen" }));
        cboxTipoVacina.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Vacina:"));
        cboxTipoVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTipoVacinaActionPerformed(evt);
            }
        });

        btnCadastrarVacina.setText("Cadastrar");
        btnCadastrarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVacinaActionPerformed(evt);
            }
        });

        btnApagarCadastroVacina.setText("Apagar");
        btnApagarCadastroVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarCadastroVacinaActionPerformed(evt);
            }
        });

        btnVoltarCadastroVacina.setText("Voltar");
        btnVoltarCadastroVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastroVacinaActionPerformed(evt);
            }
        });

        spnNumeroDosesVacina.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de doses:"));

        btnEditarCadastroVacina.setText("Editar");
        btnEditarCadastroVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCadastroVacinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cboxNomeInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboxTipoVacina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnNumeroDosesVacina)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrarVacina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnApagarCadastroVacina))
                    .addComponent(btnVoltarCadastroVacina)
                    .addComponent(btnEditarCadastroVacina))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnApagarCadastroVacina, btnCadastrarVacina, btnEditarCadastroVacina});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(cboxNomeInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(cboxTipoVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(spnNumeroDosesVacina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApagarCadastroVacina)
                    .addComponent(btnCadastrarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCadastroVacina))
                .addGap(50, 50, 50)
                .addComponent(btnVoltarCadastroVacina)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnApagarCadastroVacina, btnCadastrarVacina, btnEditarCadastroVacina, btnVoltarCadastroVacina});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboxTipoVacina, spnNumeroDosesVacina});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxNomeInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxNomeInquilinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxNomeInquilinoActionPerformed

    private void cboxTipoVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTipoVacinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxTipoVacinaActionPerformed

    private void btnEditarCadastroVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCadastroVacinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCadastroVacinaActionPerformed

    private void btnApagarCadastroVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarCadastroVacinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApagarCadastroVacinaActionPerformed

    private void btnVoltarCadastroVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastroVacinaActionPerformed
        // TODO add your handling code here:
        TelaCadastroInquilino tCadInquilino = new TelaCadastroInquilino();
        tCadInquilino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarCadastroVacinaActionPerformed

    private void btnCadastrarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVacinaActionPerformed
        // TODO add your handling code here:
        CadastroVacinaRequestDto request = new CadastroVacinaRequestDto();
        
        request.setTipoVacina((String) cboxTipoVacina.getSelectedItem());
        
    }//GEN-LAST:event_btnCadastrarVacinaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarCadastroVacina;
    private javax.swing.JButton btnCadastrarVacina;
    private javax.swing.JButton btnEditarCadastroVacina;
    private javax.swing.JButton btnVoltarCadastroVacina;
    private javax.swing.JComboBox<String> cboxNomeInquilino;
    private javax.swing.JComboBox<String> cboxTipoVacina;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner spnNumeroDosesVacina;
    // End of variables declaration//GEN-END:variables
}
