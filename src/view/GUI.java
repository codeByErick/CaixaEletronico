package view;

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

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Efetuar Saque");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel = new JLabel("Módulo do Cliente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnRelatrioDeCdulas = new JButton("Relatório de Cédulas");
		
		JButton btnNewButton_1_1 = new JButton("Valor total disponível");
		
		JButton btnNewButton_1 = new JButton("Reposição de Cédulas");
		
		JButton btnNewButton_1_2 = new JButton("Cota mínima");
		
		JButton btnNewButton_1_2_1 = new JButton("SAIR");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_2_1.setForeground(new Color(255, 0, 0));
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		contentPane.add(lblNewLabel);
		contentPane.add(btnNewButton);
		
		JLabel lblMduloDoAdministrador = new JLabel("Módulo do Administrador");
		lblMduloDoAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblMduloDoAdministrador);
		contentPane.add(btnRelatrioDeCdulas);
		contentPane.add(btnNewButton_1_1);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblMduloDeAmbos = new JLabel("Módulo de ambos");
		lblMduloDeAmbos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblMduloDeAmbos);
		contentPane.add(btnNewButton_1_2_1);

	}
}
