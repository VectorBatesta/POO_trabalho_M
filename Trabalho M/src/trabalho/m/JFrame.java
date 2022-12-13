package trabalho.m;

import java.util.HashSet;
import java.util.Set;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class JFrame extends javax.swing.JFrame {
	Setor emergencia;
	Setor ortopedia;
	Setor pediatrico;

	public JFrame() {
		emergencia = new SetorEmergencia();
		ortopedia = new SetorOrtopedia();
		pediatrico = new SetorPediatrico();
		
		initComponents();
		label_CPF.setVisible(false);
		text_CPF.setVisible(false);
		label_CRM.setVisible(false);
		text_CRM.setVisible(false);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_botaoMouP = new javax.swing.ButtonGroup();
        botao_Fechar = new javax.swing.JButton();
        label_titulo = new javax.swing.JLabel();
        label_showSetor = new javax.swing.JLabel();
        slider_selecaoSetor = new javax.swing.JSlider();
        label_setorEmergencia = new javax.swing.JLabel();
        label_setorOrtopedia = new javax.swing.JLabel();
        label_setorPediatrico = new javax.swing.JLabel();
        label_showNome = new javax.swing.JLabel();
        label_showIdade = new javax.swing.JLabel();
        label_showLogradouro = new javax.swing.JLabel();
        label_showCidade = new javax.swing.JLabel();
        label_showTelefone = new javax.swing.JLabel();
        radio_paciente = new javax.swing.JRadioButton();
        radio_medico = new javax.swing.JRadioButton();
        label_MouP = new javax.swing.JLabel();
        text_nome = new javax.swing.JTextField();
        text_idade = new javax.swing.JTextField();
        text_logradouro = new javax.swing.JTextField();
        text_cidade = new javax.swing.JTextField();
        text_numero = new javax.swing.JTextField();
        botao_registrar = new javax.swing.JButton();
        label_CPF = new javax.swing.JLabel();
        label_CRM = new javax.swing.JLabel();
        text_CPF = new javax.swing.JTextField();
        text_CRM = new javax.swing.JTextField();
        botao_procurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botao_Fechar.setText("Fechar");
        botao_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_FecharActionPerformed(evt);
            }
        });

        label_titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        label_titulo.setText("Recepção");

        label_showSetor.setText("Setor:");

        slider_selecaoSetor.setMaximum(2);
        slider_selecaoSetor.setValue(0);

        label_setorEmergencia.setText("Emergência");

        label_setorOrtopedia.setText("Ortopedia");

        label_setorPediatrico.setText("Pediátrico");

        label_showNome.setText("Nome:");

        label_showIdade.setText("Idade:");

        label_showLogradouro.setText("Logradouro:");

        label_showCidade.setText("Cidade:");

        label_showTelefone.setText("Telefone:");

        group_botaoMouP.add(radio_paciente);
        radio_paciente.setText("Paciente");
        radio_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_pacienteActionPerformed(evt);
            }
        });

        group_botaoMouP.add(radio_medico);
        radio_medico.setText("Medico");
        radio_medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_medicoActionPerformed(evt);
            }
        });

        label_MouP.setText("Pessoa:");

        botao_registrar.setText("Registrar");
        botao_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_registrarActionPerformed(evt);
            }
        });

        label_CPF.setText("CPF:");

        label_CRM.setText("CRM:");

        botao_procurar.setText("Procurar pessoa por nome");
        botao_procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_procurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(label_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_showSetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(slider_selecaoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label_setorPediatrico)
                        .addGap(107, 107, 107)
                        .addComponent(label_setorOrtopedia)
                        .addGap(107, 107, 107)
                        .addComponent(label_setorEmergencia))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(botao_registrar)
                                .addGap(61, 61, 61)
                                .addComponent(botao_procurar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(botao_Fechar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_showIdade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_idade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_showCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_cidade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_showTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_numero))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_showLogradouro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(text_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label_showNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(text_nome)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(label_CPF)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(text_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(label_MouP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radio_paciente)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_medico)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_CRM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(text_CRM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(label_titulo)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slider_selecaoSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_showSetor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_setorPediatrico)
                    .addComponent(label_setorOrtopedia)
                    .addComponent(label_setorEmergencia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_paciente)
                    .addComponent(radio_medico)
                    .addComponent(label_MouP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_CPF)
                    .addComponent(label_CRM)
                    .addComponent(text_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_CRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_showNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_showIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_showLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_showCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_showTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_Fechar)
                    .addComponent(botao_registrar)
                    .addComponent(botao_procurar))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_FecharActionPerformed
        dispose();
    }//GEN-LAST:event_botao_FecharActionPerformed

    private void botao_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_registrarActionPerformed
		String nome = text_nome.getText();
		int idade = Integer.parseInt(text_idade.getText());
		String logradouro = text_logradouro.getText();
		String cidade = text_cidade.getText();
		String numero = text_numero.getText();
		
		Pessoa nova = null;
		
		if (radio_medico.isSelected()){
			String CRM = text_CRM.getText();
			nova = new Medico(nome, idade, logradouro, cidade, numero, CRM);
		}
		if (radio_paciente.isSelected()){
			int CPF = Integer.parseInt(text_CPF.getText());
			nova = new Paciente(nome, idade, logradouro, cidade, numero, CPF);
		}
		
		try{
			switch (slider_selecaoSetor.getValue()){
				case 0: //pediatrico
					pediatrico.registraPessoa(nova);
				break;
				case 1: //ortopedia
					ortopedia.registraPessoa(nova);
				break;
				case 2: //emergencia
					emergencia.registraPessoa(nova);
				break;
			}
			
			JOptionPane.showMessageDialog(null, "Pessoa registrada!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e){
			System.out.println("Erro de inicialização de objeto, procurar técnico imediatamente.\n");
			dispose();
		}
    }//GEN-LAST:event_botao_registrarActionPerformed

    private void radio_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_pacienteActionPerformed
        label_CPF.setVisible(true);
		text_CPF.setVisible(true);
		label_CRM.setVisible(false);
		text_CRM.setVisible(false);
		text_CRM.setText("");
    }//GEN-LAST:event_radio_pacienteActionPerformed

    private void radio_medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_medicoActionPerformed
        label_CPF.setVisible(false);
		text_CPF.setVisible(false);
		label_CRM.setVisible(true);
		text_CRM.setVisible(true);
		text_CPF.setText("");
    }//GEN-LAST:event_radio_medicoActionPerformed

    private void botao_procurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_procurarActionPerformed
		String nomeProcura = text_nome.getText();
		Pessoa pessoaAchada = null;
		switch(slider_selecaoSetor.getValue()){
			case 0: //pedia
				pessoaAchada = pediatrico.pesquisarPessoaNaLista(nomeProcura);
				break;
			case 1: //orto
				pessoaAchada = ortopedia.pesquisarPessoaNaLista(nomeProcura);
				break;
			case 2: //emer
				pessoaAchada = emergencia.pesquisarPessoaNaLista(nomeProcura);
				break;
		}
		
		if (pessoaAchada == null){
			JOptionPane.showMessageDialog(null, "Pessoa não achada!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		}
		
		desmarcaPouM();
		text_nome.setText(pessoaAchada.getNome());
		text_idade.setText(Integer.toString(pessoaAchada.getIdade()));
		text_logradouro.setText(pessoaAchada.getLogradouro());
		text_cidade.setText(pessoaAchada.getCidade());
		text_numero.setText(pessoaAchada.getNumero());
    }//GEN-LAST:event_botao_procurarActionPerformed

	private void desmarcaPouM(){
		radio_medico.setSelected(false);
		radio_paciente.setSelected(false);
	}
	
	public static void main() {
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
			java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JFrame().setVisible(true);
			}
		});
	}

	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_Fechar;
    private javax.swing.JButton botao_procurar;
    private javax.swing.JButton botao_registrar;
    private javax.swing.ButtonGroup group_botaoMouP;
    private javax.swing.JLabel label_CPF;
    private javax.swing.JLabel label_CRM;
    private javax.swing.JLabel label_MouP;
    private javax.swing.JLabel label_setorEmergencia;
    private javax.swing.JLabel label_setorOrtopedia;
    private javax.swing.JLabel label_setorPediatrico;
    private javax.swing.JLabel label_showCidade;
    private javax.swing.JLabel label_showIdade;
    private javax.swing.JLabel label_showLogradouro;
    private javax.swing.JLabel label_showNome;
    private javax.swing.JLabel label_showSetor;
    private javax.swing.JLabel label_showTelefone;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JRadioButton radio_medico;
    private javax.swing.JRadioButton radio_paciente;
    private javax.swing.JSlider slider_selecaoSetor;
    private javax.swing.JTextField text_CPF;
    private javax.swing.JTextField text_CRM;
    private javax.swing.JTextField text_cidade;
    private javax.swing.JTextField text_idade;
    private javax.swing.JTextField text_logradouro;
    private javax.swing.JTextField text_nome;
    private javax.swing.JTextField text_numero;
    // End of variables declaration//GEN-END:variables
}
