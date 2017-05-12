/*
 * Copyright (C) 2017 Andre Luis Zipf <andrezipf94 at gmail.com>
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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Andre Luis Zipf <andrezipf94 at gmail.com>
 */
public class ViewManutencaoEntrevista extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewManutencaoEntrevista
     */
    public ViewManutencaoEntrevista() {
        initComponents();
    }

    /* Action Listeners */
    public void addActionListenerBotaoSalvar(ActionListener listener) {
        botaoSalvar.addActionListener(listener);
    }

    public void addActionListenerBotaoLimpar(ActionListener listener) {
        botaoLimpar.addActionListener(listener);
    }

    public void addActionListenerBotaoSelecionarCandidato(ActionListener listener) {
        botaoSelecionarCandidato.addActionListener(listener);
    }

    /* GETTERS */
    public JTextField getCampoCandidato() {
        return campoCandidato;
    }

    public JFormattedTextField getCampoDataInicio() {
        return campoDataInicio;
    }

    public JFormattedTextField getCampoDataTermino() {
        return campoDataTermino;
    }

    public JComboBox<String> getCampoEstado() {
        return campoEstado;
    }

    public JTextField getCampoId() {
        return campoId;
    }

    public JTextField getCampoIdCandidato() {
        return campoIdCandidato;
    }

    public JTextArea getCampoNotas() {
        return campoNotas;
    }

    public JButton getBotaoLimpar() {
        return botaoLimpar;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelCampos = new javax.swing.JPanel();
        labelId = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        labelCandidato = new javax.swing.JLabel();
        panelCandidato = new javax.swing.JPanel();
        campoIdCandidato = new javax.swing.JTextField();
        campoCandidato = new javax.swing.JTextField();
        botaoSelecionarCandidato = new javax.swing.JButton();
        labelNotas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoNotas = new javax.swing.JTextArea();
        labelEstado = new javax.swing.JLabel();
        campoEstado = new javax.swing.JComboBox<>();
        labelDataInicio = new javax.swing.JLabel();
        labelDataTermino = new javax.swing.JLabel();
        campoDataInicio = new javax.swing.JFormattedTextField();
        campoDataTermino = new javax.swing.JFormattedTextField();
        panelAcoes = new javax.swing.JPanel();
        botaoLimpar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setMaximizable(true);
        setResizable(true);
        setTitle("Manutenção de Entrevista");

        panelCampos.setLayout(new java.awt.GridBagLayout());

        labelId.setText("Identificacao");
        panelCampos.add(labelId, new java.awt.GridBagConstraints());

        campoId.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelCampos.add(campoId, gridBagConstraints);

        labelCandidato.setText("Candidato");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelCampos.add(labelCandidato, gridBagConstraints);

        panelCandidato.setLayout(new java.awt.GridBagLayout());

        campoIdCandidato.setEditable(false);
        campoIdCandidato.setOpaque(false);
        campoIdCandidato.setPreferredSize(new java.awt.Dimension(50, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelCandidato.add(campoIdCandidato, gridBagConstraints);

        campoCandidato.setEditable(false);
        campoCandidato.setPreferredSize(new java.awt.Dimension(180, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelCandidato.add(campoCandidato, gridBagConstraints);

        botaoSelecionarCandidato.setText("+");
        panelCandidato.add(botaoSelecionarCandidato, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelCampos.add(panelCandidato, gridBagConstraints);

        labelNotas.setText("Notas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        panelCampos.add(labelNotas, gridBagConstraints);

        campoNotas.setColumns(20);
        campoNotas.setRows(5);
        jScrollPane1.setViewportView(campoNotas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelCampos.add(jScrollPane1, gridBagConstraints);

        labelEstado.setText("Estado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        panelCampos.add(labelEstado, gridBagConstraints);

        campoEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberto", "Concluído" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelCampos.add(campoEstado, gridBagConstraints);

        labelDataInicio.setText("Data de Início");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panelCampos.add(labelDataInicio, gridBagConstraints);

        labelDataTermino.setText("Data de Término");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        panelCampos.add(labelDataTermino, gridBagConstraints);

        campoDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/MM/yyyy"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelCampos.add(campoDataInicio, gridBagConstraints);

        campoDataTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/MM/yyyy"))));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelCampos.add(campoDataTermino, gridBagConstraints);

        getContentPane().add(panelCampos, java.awt.BorderLayout.PAGE_START);

        botaoLimpar.setText("Limpar");

        botaoSalvar.setText("Salvar");

        javax.swing.GroupLayout panelAcoesLayout = new javax.swing.GroupLayout(panelAcoes);
        panelAcoes.setLayout(panelAcoesLayout);
        panelAcoesLayout.setHorizontalGroup(
            panelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvar)
                .addContainerGap())
        );
        panelAcoesLayout.setVerticalGroup(
            panelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoSalvar))
                .addContainerGap())
        );

        getContentPane().add(panelAcoes, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoSelecionarCandidato;
    private javax.swing.JTextField campoCandidato;
    private javax.swing.JFormattedTextField campoDataInicio;
    private javax.swing.JFormattedTextField campoDataTermino;
    private javax.swing.JComboBox<String> campoEstado;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoIdCandidato;
    private javax.swing.JTextArea campoNotas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCandidato;
    private javax.swing.JLabel labelDataInicio;
    private javax.swing.JLabel labelDataTermino;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNotas;
    private javax.swing.JPanel panelAcoes;
    private javax.swing.JPanel panelCampos;
    private javax.swing.JPanel panelCandidato;
    // End of variables declaration//GEN-END:variables

}
