package com.cibertec.sesion_5.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cibertec.sesion_5.arreglo.Arreglo;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio11 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio11 frame = new Ejercicio11();
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
	public Ejercicio11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(202, 29, 169, 174);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnArreglo = new JButton("Procesar");
		btnArreglo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arreglo arreglo = new Arreglo();
				int tamanio = arreglo.tamanio();
				int obtValor = arreglo.obtener(3);
				int suma = arreglo.sumaNumeros();
				int pos = arreglo.posPrimerNumeroMenorA25();
				arreglo.generar();
				
				imprimir("El tamaño es: "+ String.valueOf(tamanio));
				imprimir("El valor obtenido es: "+String.valueOf(obtValor));
				imprimir("La suma es: "+String.valueOf(suma));
				imprimir("El primer número menor a 25 es: "+String.valueOf(pos));
				int arreglo1[] = arreglo.getArray();
				for (int i = 0; i < arreglo1.length; i++) {
					imprimir("arreglo["+i+"]:->"+arreglo1[i]);
					
				}
				int numero = arreglo.aleatorio(10, 50);
				imprimir("El número aleatorio es: "+numero);;
			
			}
		});
		btnArreglo.setBounds(46, 99, 85, 21);
		contentPane.add(btnArreglo);
	}
	
	public void  imprimir(String texto) {
		textArea.append(texto+"\n");
	}
	
}
