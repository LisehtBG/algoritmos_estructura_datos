package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.cibertec.sesion_9_10.ListaAlumnos;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class Ejemplo1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextArea textGeneral;
	private JTextArea textLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo1 frame = new Ejemplo1();
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
	public Ejemplo1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 24, 208, 77);
		contentPane.add(scrollPane);
		
		textLista = new JTextArea();
		scrollPane.setViewportView(textLista);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(141, 148, 207, 77);
		contentPane.add(scrollPane_1);
		
		textGeneral = new JTextArea();
		scrollPane_1.setViewportView(textGeneral);
		
		ListaAlumnos alum = new ListaAlumnos();
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < alum.tamanio(); i++) {
					imprimir(alum.Obtener(i).getCodigo()+"-"+alum.Obtener(i).getNombre()+"-"+alum.Obtener(i).getNota1()+"-"+alum.Obtener(i).getNota2()+"-"+alum.Obtener(i).promedio());
				}
				
			}
		});
		btnListar.setBounds(28, 78, 89, 23);
		contentPane.add(btnListar);
		
		JButton btnNewButton_1 = new JButton("Procesar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				imprimirGeneral("El promedio general es: "+alum.promedioGeneral());
				imprimirGeneral(" El promedio mayor es: " + alum.promedioMayor().getNombre() + "Cuyo promedio es: "+alum.promedioMayor().promedio());
			}
		});
		btnNewButton_1.setBounds(28, 127, 89, 23);
		contentPane.add(btnNewButton_1);
	}
	
	public void imprimir(String text) {
		textLista.append(text+"\n");
	}
	
	public void imprimirGeneral(String text) {
		textGeneral.append(text+"\n");
	}

	
}
