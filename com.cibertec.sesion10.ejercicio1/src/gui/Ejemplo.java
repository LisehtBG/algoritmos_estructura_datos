package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglo.ArregloAlumnos;
import clase.Alumno;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejemplo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtCodigo;
	private JTextArea textInfo;
	
	ArregloAlumnos listaAlu = new ArregloAlumnos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(100, 48, 96, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(100, 90, 96, 19);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(100, 130, 96, 19);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(100, 10, 96, 19);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(21, 13, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(21, 51, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota1");
		lblNewLabel_2.setBounds(21, 93, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota2");
		lblNewLabel_3.setBounds(21, 133, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
				int codigo = Integer.parseInt(txtCodigo.getText());
				String nombre = txtNombre.getText();
				int n1 = Integer.parseInt(txtNota1.getText());
				int n2 = Integer.parseInt(txtNota2.getText());
				if (listaAlu.buscar(codigo) != null) {
					JOptionPane.showMessageDialog(null, "Código ya registrado");
				}else {
					listaAlu.Adicionar(new Alumno(codigo, n1, n2, nombre));
					listar();
				}
				
			}
		});
		btnAdicionar.setBounds(284, 13, 85, 21);
		contentPane.add(btnAdicionar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
				Alumno alumno_mostrar = listaAlu.buscar(Integer.parseInt(txtCodigo.getText()));
				if (alumno_mostrar != null) {
					imprimir("El código es: "+alumno_mostrar.getCodigo());
					imprimir("El nombre es: "+alumno_mostrar.getNombre());
					imprimir("La nota 1 es: "+alumno_mostrar.getNota1());
					imprimir("La nota 2 es: "+alumno_mostrar.getNota2());
					
				}
				
				
			}
		});
		btnConsultar.setBounds(284, 47, 85, 21);
		contentPane.add(btnConsultar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
				Alumno alumno_editar = listaAlu.buscar(Integer.parseInt(txtCodigo.getText()));
				
				if (alumno_editar!= null) {
					alumno_editar.setNombre(txtNombre.getText());
					alumno_editar.setNota1(Integer.parseInt(txtNota1.getText()));
				}else {
					JOptionPane.showMessageDialog(null, "Código no existe");
				}
				
				listar();
			}
		});
		btnModificar.setBounds(284, 89, 85, 21);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
				Alumno alumno =listaAlu.buscar(Integer.parseInt(txtCodigo.getText()));
				if (alumno != null) {
					listaAlu.eliminar(alumno);
				}else {
					JOptionPane.showMessageDialog(null,"No se encontró el alumno");
				}
				
				listar();
				
			}
		});
		btnEliminar.setBounds(284, 129, 85, 21);
		contentPane.add(btnEliminar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 231, 333, 195);
		contentPane.add(scrollPane);
		
		textInfo = new JTextArea();
		scrollPane.setViewportView(textInfo);
	}
	
	public void limpiar() {
		textInfo.setText(" ");
	}
	
	public void listar() {
		textInfo.append("Código  -  Nombre  -  Nota1  -  Nota2  -  Promedio"+"\n");
		for (int i = 0; i < listaAlu.tamanio(); i++) {
			int codigo = listaAlu.obtener(i).getCodigo();
			String nombre = listaAlu.obtener(i).getNombre();
			int nota1 = listaAlu.obtener(i).getNota1();
			int nota2 = listaAlu.obtener(i).getNota2();
			double promedio = listaAlu.obtener(i).promedio();
			textInfo.append(codigo+"                "+nombre+"           "+nota1+"             "+ nota2+"            "+ promedio+ "\n");
		}
		

	}
	
	public void imprimir(String text) {
		textInfo.append(text+"\n");
	}
}
