/*
 * Copyright (C) 2017 Andre Luis Zipf <andrezipf94 at bitbucket.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Andre Luis Zipf <andrezipf94 at gmail.com>
 */
public class ViewJanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincioak
     */
    public ViewJanelaPrincipal() {
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

        desktop = new javax.swing.JDesktopPane();
        panelNotificacao = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        itemMenuGerenciar = new javax.swing.JMenu();
        itemMenuGerenciarVagas = new javax.swing.JMenuItem();
        itemMenuGerenciarCandidatos = new javax.swing.JMenuItem();
        itemMenuGerenciarCurriculos = new javax.swing.JMenuItem();
        itemMenuGerenciarEntrevista = new javax.swing.JMenuItem();
        itemMenuApp = new javax.swing.JMenu();
        itemMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho-Eso-35PRO2");
        setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);

        panelNotificacao.setPreferredSize(new java.awt.Dimension(461, 30));

        javax.swing.GroupLayout panelNotificacaoLayout = new javax.swing.GroupLayout(panelNotificacao);
        panelNotificacao.setLayout(panelNotificacaoLayout);
        panelNotificacaoLayout.setHorizontalGroup(
            panelNotificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        panelNotificacaoLayout.setVerticalGroup(
            panelNotificacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(panelNotificacao, java.awt.BorderLayout.SOUTH);

        itemMenuGerenciar.setText("Gerenciar");

        itemMenuGerenciarVagas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        itemMenuGerenciarVagas.setText("Vagas");
        itemMenuGerenciar.add(itemMenuGerenciarVagas);

        itemMenuGerenciarCandidatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        itemMenuGerenciarCandidatos.setText("Candidatos");
        itemMenuGerenciar.add(itemMenuGerenciarCandidatos);

        itemMenuGerenciarCurriculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        itemMenuGerenciarCurriculos.setText("Curriculos");
        itemMenuGerenciarCurriculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuGerenciarCurriculosActionPerformed(evt);
            }
        });
        itemMenuGerenciar.add(itemMenuGerenciarCurriculos);

        itemMenuGerenciarEntrevista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        itemMenuGerenciarEntrevista.setText("Entrevistas");
        itemMenuGerenciar.add(itemMenuGerenciarEntrevista);

        barraMenu.add(itemMenuGerenciar);

        itemMenuApp.setText("App");

        itemMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        itemMenuSair.setText("Sair");
        itemMenuApp.add(itemMenuSair);

        barraMenu.add(itemMenuApp);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuGerenciarCurriculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuGerenciarCurriculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuGerenciarCurriculosActionPerformed

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
            java.util.logging.Logger.getLogger(ViewJanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewJanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewJanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewJanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewJanelaPrincipal().setVisible(true);
            }
        });
    }

    public void addActionListenerItemMenuGerenciarVagas(ActionListener listener) {
        itemMenuGerenciarVagas.addActionListener(listener);
    }

    public void addActionListenerItemMenuGerenciarCandidato(ActionListener listener) {
        itemMenuGerenciarCandidatos.addActionListener(listener);
    }

    public void addActionListenerItemMenuGerenciarCurriculo(ActionListener listener) {
        itemMenuGerenciarCurriculos.addActionListener(listener);
    }

    public void addActionListenerItemMenuGerenciarEntrevista(ActionListener listener) {
        itemMenuGerenciarEntrevista.addActionListener(listener);
    }

    public void addActionListenerItemMenuSair(ActionListener listener) {
        itemMenuSair.addActionListener(listener);
    }

    /**
     * GETTERS AND SETTERS
     */
    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar barraMenu) {
        this.barraMenu = barraMenu;
    }

    public JDesktopPane getDesktop() {
        return desktop;
    }

    public void setDesktop(JDesktopPane desktop) {
        this.desktop = desktop;
    }

    public JMenu getItemMenuApp() {
        return itemMenuApp;
    }

    public void setItemMenuApp(JMenu itemMenuApp) {
        this.itemMenuApp = itemMenuApp;
    }

    public JMenu getItemMenuGerenciar() {
        return itemMenuGerenciar;
    }

    public void setItemMenuGerenciar(JMenu itemMenuGerenciar) {
        this.itemMenuGerenciar = itemMenuGerenciar;
    }

    public JMenuItem getItemMenuGerenciarCandidatos() {
        return itemMenuGerenciarCandidatos;
    }

    public void setItemMenuGerenciarCandidatos(JMenuItem itemMenuGerenciarCandidatos) {
        this.itemMenuGerenciarCandidatos = itemMenuGerenciarCandidatos;
    }

    public JMenuItem getItemMenuGerenciarVagas() {
        return itemMenuGerenciarVagas;
    }

    public void setItemMenuGerenciarVagas(JMenuItem itemMenuGerenciarVagas) {
        this.itemMenuGerenciarVagas = itemMenuGerenciarVagas;
    }

    public JMenuItem getItemMenuSair() {
        return itemMenuSair;
    }

    public void setItemMenuSair(JMenuItem itemMenuSair) {
        this.itemMenuSair = itemMenuSair;
    }

    public JPanel getPanelNotificacao() {
        return panelNotificacao;
    }

    public void setPanelNotificacao(JPanel panelNotificacao) {
        this.panelNotificacao = panelNotificacao;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu itemMenuApp;
    private javax.swing.JMenu itemMenuGerenciar;
    private javax.swing.JMenuItem itemMenuGerenciarCandidatos;
    private javax.swing.JMenuItem itemMenuGerenciarCurriculos;
    private javax.swing.JMenuItem itemMenuGerenciarEntrevista;
    private javax.swing.JMenuItem itemMenuGerenciarVagas;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JPanel panelNotificacao;
    // End of variables declaration//GEN-END:variables
}