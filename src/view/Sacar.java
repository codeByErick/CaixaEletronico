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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;

public class Sacar extends JFrame {
	
	private ICaixaEletronico caixa;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;


	/**
	 * Create the frame.
	 */
	public Sacar(ICaixaEletronico caixa) {
		this.caixa = caixa;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 12, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 12, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 189, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 511, SpringLayout.WEST, contentPane);
		panel.setBackground(new Color(193, 230, 203));
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("Saque");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 37, SpringLayout.WEST, panel);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel = new JLabel("Valor do saque:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 42, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, panel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 75, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, textField, 23, SpringLayout.EAST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField, 117, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField, -68, SpringLayout.EAST, panel);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Sacar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 0));
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton, 8, SpringLayout.SOUTH, textField);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, textField);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNewButton, -139, SpringLayout.EAST, panel);
		panel.add(btnNewButton);
		
		JButton btnNewButtonExit = new JButton("SAIR");
		btnNewButtonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButtonExit, 40, SpringLayout.SOUTH, panel);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButtonExit, 181, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButtonExit, -21, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButtonExit, -179, SpringLayout.EAST, contentPane);
		btnNewButtonExit.setBackground(new Color(255, 0, 0));
		btnNewButtonExit.setForeground(new Color(255, 255, 255));
		btnNewButtonExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnNewButtonExit);

	}
}
