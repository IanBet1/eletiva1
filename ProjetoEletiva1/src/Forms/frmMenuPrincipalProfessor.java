/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Beans.Usuario;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Terminal
 */
public class frmMenuPrincipalProfessor extends javax.swing.JFrame {

    public Usuario user;

    public frmMenuPrincipalProfessor(Usuario user2) {
        initComponents();
        this.user = user2;
        mudaLabel(user2.getNome());
    }

    frmMenuPrincipalProfessor() {
    }

    public void mudaLabel(String nome) {
        jLabel2.setText("Bem Vindo(a), Professor(a) " + nome + ".");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAvaliacaoAtividadesContinuos = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnPlanoAulaSemanal = new javax.swing.JButton();
        btnAvaliacaoMensal = new javax.swing.JButton();
        btnAvaliacaoBimestral = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jCalendar2 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Formulário do Professor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Menu Principal  Professor");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 289, 31);

        jLabel2.setText("Bem Vindo(a), Professor(a):");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 60, 390, 20);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(400, 10, 780, 620);

        btnAvaliacaoAtividadesContinuos.setText("Avaliação de Atividades Contínuos");
        getContentPane().add(btnAvaliacaoAtividadesContinuos);
        btnAvaliacaoAtividadesContinuos.setBounds(190, 320, 211, 23);

        btnInicio.setText("Início");
        btnInicio.setPreferredSize(new java.awt.Dimension(197, 23));
        getContentPane().add(btnInicio);
        btnInicio.setBounds(190, 200, 211, 23);

        btnPlanoAulaSemanal.setText("Plano de Aula Semanal");
        btnPlanoAulaSemanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanoAulaSemanalActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlanoAulaSemanal);
        btnPlanoAulaSemanal.setBounds(190, 230, 211, 23);

        btnAvaliacaoMensal.setText("Avaliação Mensal");
        getContentPane().add(btnAvaliacaoMensal);
        btnAvaliacaoMensal.setBounds(190, 260, 211, 23);

        btnAvaliacaoBimestral.setText("Avaliação Bimestral");
        getContentPane().add(btnAvaliacaoBimestral);
        btnAvaliacaoBimestral.setBounds(190, 290, 211, 23);

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 610, 53, 25);

        jCalendar2.setWeekOfYearVisible(false);
        getContentPane().add(jCalendar2);
        jCalendar2.setBounds(10, 350, 380, 190);

        setSize(new java.awt.Dimension(1205, 672));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int dialogResult;
        dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja sair?", "Aviso!", 1);
        if (dialogResult == JOptionPane.YES_OPTION) {
            FrmLogin login = new FrmLogin();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int dialogResult;
        dialogResult = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja sair?", "Aviso!", 1);
        if (dialogResult == JOptionPane.YES_OPTION) {
            FrmLogin login = new FrmLogin();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPlanoAulaSemanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanoAulaSemanalActionPerformed
        // TODO add your handling code here:
        FrmPlanoAulaSemanal fpas = null;
        try {
            fpas = new FrmPlanoAulaSemanal(user, null);
        } catch (ParseException ex) {
            Logger.getLogger(frmMenuPrincipalProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        fpas.setVisible(true);
    }//GEN-LAST:event_btnPlanoAulaSemanalActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipalProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipalProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipalProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipalProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipalProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvaliacaoAtividadesContinuos;
    private javax.swing.JButton btnAvaliacaoBimestral;
    private javax.swing.JButton btnAvaliacaoMensal;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPlanoAulaSemanal;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
