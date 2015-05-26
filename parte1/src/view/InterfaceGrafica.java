package view;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import controller.Controlador;

/**
 * @author Emerson Demetrio
 * @author S�rgio Zarth
 * @version 2015.1
 */

public class InterfaceGrafica extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private Controlador c;

	public InterfaceGrafica() {
		initComponents();
		setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
		c = new Controlador();
	}

	private static void msg(String s) {
		JOptionPane.showMessageDialog(null, s);
	}

	private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuItemAbrirActionPerformed
		frameChooser.setVisible(true);
		int returnVal = fileChooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			try {
				textAreaCodigo.read(new FileReader(file.getAbsolutePath()),
						null);
			} catch (IOException ex) {
				System.out.println("Problem accessing file"
						+ file.getAbsolutePath());
			}
			// c.setCurrentFile(file.getAbsolutePath());
		} else {
			System.out.println("File access cancelled by user.");
		}
		frameChooser.setVisible(false);
	}

	private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {
		msg("menuItemSairActionPerformed");
		System.exit(0);
	}

	private void menuItemLexicoActionPerformed(java.awt.event.ActionEvent evt) {
		// c.loadCode(textAreaCodigo.getText());

		msg("menuItemLexicoActionPerformed");
	}

	private void menuItemSintaticoActionPerformed(java.awt.event.ActionEvent evt) {
		msg("menuItemSintaticoActionPerformed");
	}

	private void menuItemSalvarComoActionPerformed(
			java.awt.event.ActionEvent evt) {
		msg("menuItemSalvarComoActionPerformed");
		frameChooser.setVisible(true);

		frameChooser.setVisible(false);
	}

	private void menuItemSalvarActionPerformed(java.awt.event.ActionEvent evt) {
		msg("menuItemSalvarActionPerformed");
	}

	private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {
		msg("menuItemSobreActionPerformed");
	}

	private void menuItemDocumentacaoActionPerformed(
			java.awt.event.ActionEvent evt) {
		msg("Menu documentacao");
	}

	private void menuItemSemanticoActionPerformed(java.awt.event.ActionEvent evt) {
		msg("menuItemSemanticoActionPerformed");
	}

	private void initComponents() {

		frameChooser = new javax.swing.JFrame();
		fileChooser = new javax.swing.JFileChooser();
		scrollPaneCodigo = new javax.swing.JScrollPane();
		textAreaCodigo = new javax.swing.JTextArea();
		menuBar = new javax.swing.JMenuBar();
		menuPrograma = new javax.swing.JMenu();
		menuItemAbrir = new javax.swing.JMenuItem();
		menuItemSalvar = new javax.swing.JMenuItem();
		menuItemSalvarComo = new javax.swing.JMenuItem();
		menuSeparator1 = new javax.swing.JPopupMenu.Separator();
		menuItemSair = new javax.swing.JMenuItem();
		menuAnalisar = new javax.swing.JMenu();
		menuItemLexico = new javax.swing.JMenuItem();
		menuItemSintatico = new javax.swing.JMenuItem();
		menuItemSemantico = new javax.swing.JMenuItem();
		menuAjuda = new javax.swing.JMenu();
		menuItemSobre = new javax.swing.JMenuItem();
		menuItemDocumentacao = new javax.swing.JMenuItem();

		javax.swing.GroupLayout frameChooserLayout = new javax.swing.GroupLayout(
				frameChooser.getContentPane());
		frameChooser.getContentPane().setLayout(frameChooserLayout);
		frameChooserLayout.setHorizontalGroup(frameChooserLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						frameChooserLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(fileChooser,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		frameChooserLayout.setVerticalGroup(frameChooserLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						frameChooserLayout
								.createSequentialGroup()
								.addContainerGap()
								.addComponent(fileChooser,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Compilador 2015.1");

		textAreaCodigo.setColumns(20);
		textAreaCodigo.setRows(5);
		scrollPaneCodigo.setViewportView(textAreaCodigo);

		menuPrograma.setText("Programa");

		menuItemAbrir.setText("Abrir");
		menuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuItemAbrirActionPerformed(evt);
			}
		});
		menuPrograma.add(menuItemAbrir);

		menuItemSalvar.setText("Salvar");
		menuItemSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuItemSalvarActionPerformed(evt);
			}
		});
		menuPrograma.add(menuItemSalvar);

		menuItemSalvarComo.setText("Salvar como");
		menuItemSalvarComo
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						menuItemSalvarComoActionPerformed(evt);
					}
				});
		menuPrograma.add(menuItemSalvarComo);
		menuPrograma.add(menuSeparator1);

		menuItemSair.setText("Sair");
		menuItemSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuItemSairActionPerformed(evt);
			}
		});
		menuPrograma.add(menuItemSair);

		menuBar.add(menuPrograma);

		menuAnalisar.setText("Analisar");

		menuItemLexico.setText("Lexico");
		menuItemLexico.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuItemLexicoActionPerformed(evt);
			}
		});
		menuAnalisar.add(menuItemLexico);

		menuItemSintatico.setText("Sint�tico");
		menuItemSintatico
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						menuItemSintaticoActionPerformed(evt);
					}
				});
		menuAnalisar.add(menuItemSintatico);

		menuItemSemantico.setText("Sem�ntico");
		menuItemSemantico
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						menuItemSemanticoActionPerformed(evt);
					}
				});
		menuAnalisar.add(menuItemSemantico);

		menuBar.add(menuAnalisar);

		menuAjuda.setText("Ajuda");

		menuItemSobre.setText("Sobre");
		menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				menuItemSobreActionPerformed(evt);
			}
		});
		menuAjuda.add(menuItemSobre);

		menuItemDocumentacao.setText("Documenta��o");
		menuItemDocumentacao
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						menuItemDocumentacaoActionPerformed(evt);
					}
				});
		menuAjuda.add(menuItemDocumentacao);

		menuBar.add(menuAjuda);

		setJMenuBar(menuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPaneCodigo,
								javax.swing.GroupLayout.DEFAULT_SIZE, 380,
								Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPaneCodigo,
								javax.swing.GroupLayout.DEFAULT_SIZE, 257,
								Short.MAX_VALUE).addContainerGap()));

		pack();
	}

	private javax.swing.JFileChooser fileChooser;
	private javax.swing.JFrame frameChooser;
	private javax.swing.JMenu menuAjuda;
	private javax.swing.JMenu menuAnalisar;
	private javax.swing.JMenuBar menuBar;
	private javax.swing.JMenuItem menuItemAbrir;
	private javax.swing.JMenuItem menuItemDocumentacao;
	private javax.swing.JMenuItem menuItemLexico;
	private javax.swing.JMenuItem menuItemSair;
	private javax.swing.JMenuItem menuItemSalvar;
	private javax.swing.JMenuItem menuItemSalvarComo;
	private javax.swing.JMenuItem menuItemSemantico;
	private javax.swing.JMenuItem menuItemSintatico;
	private javax.swing.JMenuItem menuItemSobre;
	private javax.swing.JMenu menuPrograma;
	private javax.swing.JPopupMenu.Separator menuSeparator1;
	private javax.swing.JScrollPane scrollPaneCodigo;
	private javax.swing.JTextArea textAreaCodigo;
}
