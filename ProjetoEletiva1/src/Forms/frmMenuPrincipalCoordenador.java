/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Beans.Avaliacao;
import Beans.Categoria;
import Beans.Planoaula;
import Beans.Usuario;
import Controller.AvaliacaoJpaController;
import Controller.CategoriaJpaController;
import Controller.PlanoaulaJpaController;
import Controller.UsuarioJpaController;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Terminal
 */
public class frmMenuPrincipalCoordenador extends javax.swing.JFrame {

     public Usuario user;
    public Usuario prof;
    public Planoaula plano;
    public Avaliacao avaliacao;
    private final AvaliacaoJpaController avaliacaoDAO;
    private final PlanoaulaJpaController planoDAO;
    private final UsuarioJpaController usuarioDAO;
    private final CategoriaJpaController categoriaDAO;

    public frmMenuPrincipalCoordenador(Usuario user2) {
        initComponents();
        this.user = user2;
        avaliacaoDAO = new AvaliacaoJpaController(Persistence.createEntityManagerFactory("ProjetoEletiva1PU"));
        planoDAO = new PlanoaulaJpaController(Persistence.createEntityManagerFactory("ProjetoEletiva1PU"));
        usuarioDAO = new UsuarioJpaController(Persistence.createEntityManagerFactory("ProjetoEletiva1PU"));
        categoriaDAO = new CategoriaJpaController(Persistence.createEntityManagerFactory("ProjetoEletiva1PU"));
        mudaLabel(user2.getNome());
        Categoria c = categoriaDAO.findCategoria(1);
        carregaTabelaProfessor(usuarioDAO.getProfessor(c));
        carregaTabelaProfessor1(usuarioDAO.getProfessor(c));
    }

    frmMenuPrincipalCoordenador() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     private void carregaTabelaProfessor(List<Usuario> lista) {
        if (lista.size() >= 0) {
            DefaultTableModel tabelaProfessor = (DefaultTableModel) tblProfessor.getModel();
            tabelaProfessor.setNumRows(0);

            for (Usuario u : lista) {
                Object[] obj = new Object[]{
                    u.getLogin(),
                    u
                };
                tabelaProfessor.addRow(obj);
            }
        }
    }
     
     private void carregaTabelaProfessor1(List<Usuario> lista) {
        if (lista.size() >= 0) {
            DefaultTableModel tabelaProfessor = (DefaultTableModel) tblProfessor1.getModel();
            tabelaProfessor.setNumRows(0);

            for (Usuario u : lista) {
                Object[] obj = new Object[]{
                    u.getLogin(),
                    u
                };
                tabelaProfessor.addRow(obj);
            }
        }
    }
    
    private void carregaTabelaPlanoAula(List<Planoaula> lista) {
        if (lista.size() >= 0) {
            DefaultTableModel tabelaPlanoAula = (DefaultTableModel) tblPlanoAula.getModel();
            tabelaPlanoAula.setNumRows(0);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            for (Planoaula p : lista) {
                if (p.getUsuarioLogin().getLogin().equals(prof.getLogin())) {
                    if (p.getStatus().equals("Em Aprovação")) {
                        Object[] obj = new Object[]{
                            p,
                            formato.format(p.getDatainicio()),
                            formato.format(p.getDatafim())
                        };
                        tabelaPlanoAula.addRow(obj);
                    }
                }
            }
        }
    }
    
    private void carregaTabelaAvaliacao(List<Avaliacao> lista) {
        if (lista.size() >= 0) {
            DefaultTableModel tabelaAvaliacao = (DefaultTableModel) tblAvaliacao.getModel();
            tabelaAvaliacao.setNumRows(0);
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            for (Avaliacao p : lista) {
                if (p.getUsuarioLogin().getLogin().equals(prof.getLogin())) {
                    if (p.getStatus().equals("Em Aprovação")) {
                        Object[] obj = new Object[]{
                            p,
                            p.getTipo(),
                            p.getAreaconhecimentoIdareaconhecimento().getAreaconhecimento()
                        };
                        tabelaAvaliacao.addRow(obj);
                    }
                }
            }
        }
    }
    
    public void mudaLabel(String nome) {
        jLabel2.setText("Bem Vindo(a), Coordenador(a) " + nome+".");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfessor = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPlanoAula = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProfessor1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAvaliacao = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnCadastroAluno = new javax.swing.JButton();
        btnCadastroClasse = new javax.swing.JButton();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário Principal Coordenador");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plano Aula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Sans Serif", 1, 10))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1104, 620));

        tblProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Professor"
            }
        ));
        tblProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfessorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProfessor);

        tblPlanoAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data Início", "Data Fim"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPlanoAula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlanoAulaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPlanoAula);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avaliações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft Sans Serif", 1, 10))); // NOI18N

        tblProfessor1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Professor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProfessor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfessor1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProfessor1);

        tblAvaliacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Área Conhecimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAvaliacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAvaliacaoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblAvaliacao);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(16, 37, 63));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu Principal Coordenador");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Menu Principal \nCoordenador");

        jPanel4.setBackground(new java.awt.Color(232, 244, 248));

        jLabel2.setText("Bem Vindo(a), Coordenador(a):");

        btnInicio.setText("Início");
        btnInicio.setPreferredSize(new java.awt.Dimension(197, 23));

        btnCadastroAluno.setText("Cadastro de Aluno");
        btnCadastroAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroAlunoActionPerformed(evt);
            }
        });

        btnCadastroClasse.setText("Cadastro de Classe");
        btnCadastroClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroClasseActionPerformed(evt);
            }
        });

        jCalendar2.setWeekOfYearVisible(false);

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastroAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastroClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(327, 327, 327))
                    .addComponent(jCalendar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnCadastroAluno))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnCadastroClasse))
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1202, 681));
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

    private void btnCadastroClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroClasseActionPerformed
        // TODO add your handling code here:
        FrmCadastroClasse classe = new FrmCadastroClasse();
        classe.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnCadastroClasseActionPerformed

    private void btnCadastroAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroAlunoActionPerformed
        // TODO add your handling code here:
        FrmCadastroAluno aluno = new FrmCadastroAluno();
        aluno.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btnCadastroAlunoActionPerformed

    private void tblProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfessorMouseClicked
        // TODO add your handling code here:
        carregaTabelaPlanoAula(planoDAO.findPlanoaulaEntities());
        int linhaselecionada = tblProfessor.getSelectedRow();
        if(linhaselecionada != -1 )
        {
            prof = (Usuario)tblProfessor.getValueAt(linhaselecionada, 1);
        }
    }//GEN-LAST:event_tblProfessorMouseClicked

    private void tblPlanoAulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlanoAulaMouseClicked
        // TODO add your handling code here:
        int linhaselecionada = tblPlanoAula.getSelectedRow();
        if(linhaselecionada != -1 )
        {
            plano = (Planoaula)tblPlanoAula.getValueAt(linhaselecionada, 0);
        }
        if(evt.getClickCount() > 1){
            int row = this.tblPlanoAula.rowAtPoint(evt.getPoint());
            // Abre um diálogo pra editar os dados
            FrmAprovarPlanoAula fapa = new FrmAprovarPlanoAula(user, plano);
            fapa.setVisible(true);
        }
    }//GEN-LAST:event_tblPlanoAulaMouseClicked

    private void tblProfessor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfessor1MouseClicked
        // TODO add your handling code here:
        int linhaselecionada = tblProfessor1.getSelectedRow();
        if (linhaselecionada != -1) {
            prof = (Usuario) tblProfessor1.getValueAt(linhaselecionada, 1);
        }
        carregaTabelaAvaliacao(avaliacaoDAO.findAvaliacaoEntities());
    }//GEN-LAST:event_tblProfessor1MouseClicked

    private void tblAvaliacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAvaliacaoMouseClicked
        // TODO add your handling code here:
        int linhaselecionada = tblAvaliacao.getSelectedRow();
        if (linhaselecionada != -1) {
            avaliacao = (Avaliacao) tblAvaliacao.getValueAt(linhaselecionada, 0);
        }
        if (evt.getClickCount() > 1) {
            int row = this.tblAvaliacao.rowAtPoint(evt.getPoint());
            // Abre um diálogo pra editar os dados
            FrmAprovarAvaliacao faa = new FrmAprovarAvaliacao(user, avaliacao);
            faa.setVisible(true);
        }
    }//GEN-LAST:event_tblAvaliacaoMouseClicked

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
            java.util.logging.Logger.getLogger(frmMenuPrincipalCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipalCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipalCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipalCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frmMenuPrincipalCoordenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroAluno;
    private javax.swing.JButton btnCadastroClasse;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblAvaliacao;
    private javax.swing.JTable tblPlanoAula;
    private javax.swing.JTable tblProfessor;
    private javax.swing.JTable tblProfessor1;
    // End of variables declaration//GEN-END:variables
}
