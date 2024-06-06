package com.cibertec.sesion_5.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cibertec.sesion_5.arreglo.Arreglo;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio12 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio12 frame = new Ejercicio12();
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
	public Ejercicio12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(65, 88, 280, 133);
		contentPane.add(scrollPane);
		
		textInfo = new JTextArea();
		scrollPane.setViewportView(textInfo);
		
		
		JButton btnArray = new JButton("Ver Arreglo");
		btnArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
				Arreglo array = new Arreglo();
				int arreglo[] = array.getArray();
				for (int i = 0; i < arreglo.length; i++) {
					imprimir("n["+i+"]->"+arreglo[i]);	
				}
			}
		});
		btnArray.setBounds(39, 34, 85, 21);
		contentPane.add(btnArray);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
				Arreglo arreglo = new Arreglo();
				int tamanio =arreglo.tamanio();
				int sum =arreglo.sumaNumeros();
				int promedio = sum/tamanio;
				
				imprimir("El tamaño es: "+tamanio);
				imprimir("La suma es: "+sum);
				imprimir("El promedio es: "+promedio);
			}
		});
		btnCalcular.setBounds(154, 34, 85, 21);
		contentPane.add(btnCalcular);
		
		JButton btnReemplazar = new JButton("Reemplazar");
		btnReemplazar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
				Arreglo arreglo = new Arreglo();
				arreglo.generar();
				int array[] = arreglo.getArray();
				for (int i = 0; i < array.length; i++) {
					imprimir("n["+i+"]->"+array[i]);
					
				}
			}
		});
		btnReemplazar.setBounds(294, 34, 85, 21);
		contentPane.add(btnReemplazar);
	}
	
	public void imprimir(String texto) {
		textInfo.append(texto+"\n");
		
	}
	
	public void limpiar() {
		textInfo.setText("");
	}
	
}
