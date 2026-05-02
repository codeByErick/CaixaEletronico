package view;

import model.ICaixaEletronico;
import model.CaixaEletronico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Cursor;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.JTextField;

public class GUI extends JFrame {
	
	private ICaixaEletronico caixa;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ICaixaEletronico caixa = new CaixaEletronico();
					GUI frame = new GUI(caixa);
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI(ICaixaEletronico caixa) {
		this.caixa = caixa;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Efetuar Saque");
		btnNewButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ICaixaEletronico caixa = new CaixaEletronico();
					Sacar frame = new Sacar(caixa);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		JLabel lblNewLabel = new JLabel("Módulo do Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnRelatrioDeCdulas = new JButton("Relatório de Cédulas");
		btnRelatrioDeCdulas.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnRelatrioDeCdulas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(GUI.this, caixa.pegaRelatorioCedulas());
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Valor total disponível");
		
		JButton btnNewButton_1 = new JButton("Reposição de Cédulas");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_1, 248, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnRelatrioDeCdulas, -21, SpringLayout.NORTH, btnNewButton_1_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_1, 262, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_1, 0, SpringLayout.EAST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnRelatrioDeCdulas, 0, SpringLayout.WEST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRelatrioDeCdulas, -288, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 20, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 262, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -288, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 24, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 309, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 372, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -216, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -892, SpringLayout.EAST, contentPane);
		contentPane.setLayout(sl_contentPane);
		contentPane.add(lblNewLabel);
		contentPane.add(btnNewButton);
		contentPane.add(btnRelatrioDeCdulas);
		contentPane.add(btnNewButton_1_1);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_2_1 = new JButton("SAIR");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_1_2_1, 262, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_2_1, -107, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1_2_1, 0, SpringLayout.EAST, btnNewButton);
		btnNewButton_1_2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_2_1.setForeground(new Color(255, 0, 0));
		contentPane.add(btnNewButton_1_2_1);
		
		JLabel lblMduloDoAdministrador = new JLabel("Módulo do Administrador:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRelatrioDeCdulas, 11, SpringLayout.SOUTH, lblMduloDoAdministrador);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblMduloDoAdministrador, -469, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -32, SpringLayout.NORTH, lblMduloDoAdministrador);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblMduloDoAdministrador, 0, SpringLayout.EAST, btnNewButton);
		lblMduloDoAdministrador.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblMduloDoAdministrador);
		
		JButton btnReposioDeCdulas = new JButton("Reposição de Cédulas");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnReposioDeCdulas, 316, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1, -23, SpringLayout.NORTH, btnReposioDeCdulas);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnReposioDeCdulas, 262, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnReposioDeCdulas, 0, SpringLayout.EAST, btnNewButton);
		btnReposioDeCdulas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnReposioDeCdulas);
		
		JButton btnCotaMnima = new JButton("Cota Mínima");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnReposioDeCdulas, -18, SpringLayout.NORTH, btnCotaMnima);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCotaMnima, 379, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCotaMnima, 0, SpringLayout.WEST, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCotaMnima, 0, SpringLayout.SOUTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCotaMnima, -288, SpringLayout.EAST, contentPane);
		btnCotaMnima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCotaMnima.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnCotaMnima);
		
		JLabel lblMduloDeAmbos = new JLabel("Módulo de Ambos:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1_2_1, 13, SpringLayout.SOUTH, lblMduloDeAmbos);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblMduloDeAmbos, 31, SpringLayout.SOUTH, btnCotaMnima);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblMduloDeAmbos, 0, SpringLayout.EAST, lblNewLabel);
		lblMduloDeAmbos.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblMduloDeAmbos);

	}
}
