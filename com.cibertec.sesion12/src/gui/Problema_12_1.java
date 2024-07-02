package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import hijos.Auto;
import hijos.Camioneta;
import padre.Vehiculo;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_12_1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_12_1 frame = new Problema_12_1();
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
	public Problema_12_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textDatos = new JTextArea();
		textDatos.setBounds(42, 111, 354, 328);
		contentPane.add(textDatos);
		
		JButton btnDatos = new JButton("Procesar");
		btnDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Vehiculo Vehiculo = new Auto("Mercedes", "deportivo", "PLS678", 60000);
				listar(Vehiculo);
				Camioneta c = new Camioneta("Mazda", "sub", "LIS678", 50000);
				listar(c);

			}
		});
		btnDatos.setBounds(169, 50, 89, 23);
		contentPane.add(btnDatos);
	}
	
	public void imprimir() {
		textDatos.append("");
	}
	public void imprimir(String texto) {
		textDatos.append(texto+"\n");
	}
	
	public void listar(Vehiculo v) {
		imprimir(">> V E H I C U L O");
		imprimir(v.datosCompletos());
	}
	
	public void listar(Auto a) {
		imprimir(">> A U T O");
		imprimir(a.datosCompletos());
	}
	
	public void listar(Camioneta c) {
		imprimir(">> C A M I O N E T A");
		imprimir(c.datosCompletos());
	}
	
}
