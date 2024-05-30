package com.cibertec.sesion4.Ejemplo2;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cibertec.sesion4.*;
import com.cibertec.sesion4.ejemplo.Textos;
import com.cibertec.sesion4.librerias.Libreria;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCadena;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresar Texto");
		lblNewLabel.setBounds(52, 37, 107, 23);
		contentPane.add(lblNewLabel);
		
		textCadena = new JTextField();
		textCadena.setBounds(175, 39, 96, 19);
		contentPane.add(textCadena);
		textCadena.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(30, 98, 271, 337);
		contentPane.add(textArea);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Textos cadena = new Textos();
				cadena.setText(textCadena.getText());
				
				String cad1 = " Hola mundo";
				
				String cad = cadena.getText();
				int  cant = cad.length();
				char primer = cad.charAt(0);
				char ultimo = cad.charAt(cant-1);
				boolean es_igual = cad.equals(cad1);
				String contatenar = cad + cad1;
				Libreria lib = new Libreria();
				double x = lib.pi;
				double alea = lib.aletario(0, 10);

				imprimir("La cantidad de caracteres es: "+ cant);
				imprimir("primer caracter del texto: "+ primer); 
				imprimir("El ultimo caracter " + ultimo);
				imprimir("Las cadenas son iguales: "+ es_igual);
				imprimir( "Las cadenas concatenadas son: "+contatenar );
				
				for (int i = 0; i < cad.length(); i++) {
					char c = (cad).charAt(i);
					imprimir(String.valueOf(c));
				}
		
				imprimir(String.valueOf(x));
				imprimir(String.valueOf(alea));

				
			}
		});
		btnProcesar.setBounds(341, 38, 85, 21);
		contentPane.add(btnProcesar);
	}
	
	public void imprimir (String texto) {
		textArea.append(texto+"\n");
	}

	
}
