/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author Terminal
 */
public class frmMenuPrincipalProfessor extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuPrincipal
     */
    public frmMenuPrincipalProfessor() {
        initComponents();
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
        lblNome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAvaliacaoAtividadesContinuos = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnPlanoAulaSemanal = new javax.swing.JButton();
        btnAvaliacaoMensal = new javax.swing.JButton();
        btnAvaliacaoBimestral = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário do Professor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Menu Principal  Professor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setText("Bem Vindo(a), Professor(a):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblNome.setText("Nome");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 60, -1, -1));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 700, 500));

        btnAvaliacaoAtividadesContinuos.setText("Avaliação de Atividades Contínuos");
        getContentPane().add(btnAvaliacaoAtividadesContinuos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        btnInicio.setText("Início");
        btnInicio.setPreferredSize(new java.awt.Dimension(197, 23));
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, -1));

        btnPlanoAulaSemanal.setText("Plano de Aula Semanal");
        getContentPane().add(btnPlanoAulaSemanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, -1));

        btnAvaliacaoMensal.setText("Avaliação Mensal");
        getContentPane().add(btnAvaliacaoMensal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, -1));

        btnAvaliacaoBimestral.setText("Avaliação Bimestral");
        getContentPane().add(btnAvaliacaoBimestral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 200, -1));
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
