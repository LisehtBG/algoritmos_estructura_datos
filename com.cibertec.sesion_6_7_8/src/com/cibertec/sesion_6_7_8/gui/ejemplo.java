package com.cibertec.sesion_6_7_8.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cibertec.sesion_6_7_8.Arreglos;


import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class ejemplo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNum;
	private JTextArea textInfo;
	Arreglos arreglo = new Arreglos();
	private int posicion =0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejemplo frame = new ejemplo();
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
	public ejemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 97, 391, 343);
		contentPane.add(scrollPane);
		
		textInfo = new JTextArea();
		scrollPane.setViewportView(textInfo);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				posicion ++;
				arreglo.adicionar(Integer.parseInt(textNum.getText()));
				listadoGeneral(arreglo);
				
			}
		});
		btnProcesar.setBounds(314, 56, 85, 21);
		contentPane.add(btnProcesar);
		
		textNum = new JTextField();
		textNum.setBounds(168, 57, 96, 19);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Número");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(97, 43, 77, 44);
		contentPane.add(lblNewLabel);
	}
	public void imprimir (String text) {
		textInfo.append(text+"\n");
	}
	public void listadoGeneral(Arreglos arreglos) {
		int n[] = arreglos.getN();
		int pos = arreglos.getIndice()-1;
		imprimir("n["+pos+"]->"+n[pos]);
		imprimir("La cantidad de pulsaciones es:"+posicion);
		
	}
	
	
}
