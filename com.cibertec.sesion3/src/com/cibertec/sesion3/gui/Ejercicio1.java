package com.cibertec.sesion3.gui;

import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cibertec.sesion3.Ejercicio1.Alumno;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNombre;
	private JTextField textNota1;
	private JTextField textNota2;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(125, 52, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(125, 11, 86, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		textNota1 = new JTextField();
		textNota1.setBounds(125, 93, 86, 20);
		contentPane.add(textNota1);
		textNota1.setColumns(10);
		
		textNota2 = new JTextField();
		textNota2.setBounds(125, 135, 86, 20);
		contentPane.add(textNota2);
		textNota2.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(52, 193, 235, 186);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(34, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(34, 55, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valid_cod = Alumno.es_numero(textCodigo.getText());
				
				if (valid_cod == false) {
					JOptionPane.showMessageDialog(null, "El cel es incorrecto"); 
					return;
				}
				
				Alumno Alumno1 = new Alumno();
				Alumno1.setCodigo(Integer.parseInt(textCodigo.getText()));
				Alumno1.setNombre((textNombre.getText()));
				Alumno1.setNota1(Integer.parseInt(textNota1.getText()));
				Alumno1.setNota2(Integer.parseInt(textNota2.getText()));
				double pro = Alumno1.promedio(Alumno1.getNota1(), Alumno1.getNota2());
				
				imprimir("El código es: "+ Alumno1.getCodigo());
				imprimir("El noombre es: "+ Alumno1.getNombre());
				imprimir("El nota es: "+ Alumno1.getNota1());
				imprimir("El nota es: "+ Alumno1.getNota2());
				imprimir("El promedio es: "+ pro);
			}
		});
		
		
		
		btnProcesar.setBounds(234, 73, 89, 23);
		contentPane.add(btnProcesar);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Nota1");
		lblNewLabel_2.setBounds(34, 96, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota2");
		lblNewLabel_3.setBounds(34, 138, 46, 14);
		contentPane.add(lblNewLabel_3);
	}
	
	public void imprimir(String text) {
		textArea.append(text+"\n");
	}
}
