package com.cibertec.semena_6.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cibertec.semena_6.ejercicio1.ArregloEdades;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_01 frame = new Ejercicio_01();
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
	public Ejercicio_01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 116, 242, 119);
		contentPane.add(scrollPane);
		
		textData = new JTextArea();
		scrollPane.setViewportView(textData);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArregloEdades edades = new ArregloEdades();
				int tamanio = edades.tamanio();
				int valor = edades.obtener(2);
				edades.adiciona(38);
				edades.reemplazar(40);
				edades.incrementar();
				int listaEdades[]= edades.getEdad();
				
				//adicionar valor
				
				imprimir(String.valueOf(tamanio));
				imprimir(String.valueOf(valor));
				
				for (int i = 0; i < listaEdades.length; i++) {
					imprimir("lista Edad["+i+"]->"+listaEdades[i]);
				}
				edades.adiciona(48);
				int primeraedadAdul = edades.primeraEdadAdulta();
				int mayorEdad = edades.edadMayor();
				imprimir("La primera edad adulta es: "+primeraedadAdul);
				imprimir("La mayor edad es: "+mayorEdad);
			}
		});
		btnProcesar.setBounds(130, 40, 89, 23);
		contentPane.add(btnProcesar);
	}
	
	public void imprimir (String text) {
		textData.append(text+"\n");
	}
}
