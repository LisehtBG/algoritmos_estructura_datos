package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cibertec.sesion10.ejercicio1.ArregloAlumnos;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textReportar;
	private JTextArea textListar ;
	
	
	

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
		setBounds(100, 100, 477, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(186, 45, 239, 115);
		contentPane.add(scrollPane);
		
		textListar = new JTextArea();
		scrollPane.setViewportView(textListar);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(186, 284, 239, 125);
		contentPane.add(scrollPane_1);
		
		textReportar = new JTextArea();
		scrollPane_1.setViewportView(textReportar);
		
		ArregloAlumnos alumnos = new ArregloAlumnos();
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < alumnos.tamanio(); i++) {
					int cod = alumnos.obtener(i).getCodigo();
					String nombre = alumnos.obtener(i).getNombre();
					int n1 = alumnos.obtener(i).getNota1();
					int n2 = alumnos.obtener(i).getNota2();
					int n3 = alumnos.obtener(i).getNota3();
					double promedio = alumnos.obtener(i).promedio();
					imprimirLista(cod +"-"+nombre+"-"+n1+"-"+n2+"-"+n3 + " -"+promedio);
					
				}
				
							}
		});
		btnListar.setBounds(49, 103, 89, 23);
		contentPane.add(btnListar);
		
		JButton btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprimirGeneral("La cantidad de aprobados es:"+alumnos.cantAprobados());
				imprimirGeneral("Promedio mayor es: "+alumnos.mayPromedio());
				imprimirGeneral("El menor promedio es "+alumnos.menPromedio());
				imprimirGeneral("El primer alumnos desaprobado es: "+alumnos.primealumDesaprobado());

			}
		});
		btnReportar.setBounds(49, 338, 89, 23);
		contentPane.add(btnReportar);
	}
	
	public void imprimirLista(String text) {
		textListar.append(text+"\n");
	}
	public void imprimirGeneral(String text) {
		textReportar.append(text+"\n");
	}

}
