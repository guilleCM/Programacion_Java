package org.foobarspam.interfaces.checkbox;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JTextField;

public class CheckboxTest{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxTest window = new CheckboxTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckboxTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 354, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//BOTON ACEPTAR
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Solicitante solicitante = new Solicitante(txtNumdni.getText(), getSelectedCheckBox(), comboBox.getSelectedItem().toString() );
				try(FileWriter fw = new FileWriter("src/org/foobarspam/interfaces/checkbox/EstatSolicitants.txt", true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter out = new PrintWriter(bw))
					{
					    out.println(solicitante.getDni()+" " + solicitante.getEstado()+" "+
					    		solicitante.getSexo());
					} catch (IOException error) {
					   System.out.println(error);
					}
				
			}
		});
		btnAceptar.setBounds(8, 164, 89, 42);
		frame.getContentPane().add(btnAceptar);
		
		//BOTON LIMPIAR
		btnLimpiar.setBounds(125, 164, 89, 42);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkTrabajando.setSelected(false);
				checkParo.setSelected(false);
				checkEstudiando.setSelected(false);
			}
		});
		frame.getContentPane().add(btnLimpiar);
		
		//BOTON SALIR
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(239, 164, 89, 42);
		frame.getContentPane().add(btnSalir);
		
		//CHECKBOX
		checkEstudiando.setBounds(8, 72, 116, 23);
		checkEstudiando.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkTrabajando.setSelected(false);
				checkParo.setSelected(false);
			}
		});
		
		frame.getContentPane().add(checkEstudiando);
		
		checkParo.setBounds(133, 72, 65, 23);
		checkParo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkEstudiando.setSelected(false);
				checkTrabajando.setSelected(false);
			}
		});
		frame.getContentPane().add(checkParo);
		
		checkTrabajando.setBounds(202, 72, 129, 23);
		checkTrabajando.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkParo.setSelected(false);
				checkEstudiando.setSelected(false);
			}
		});
		frame.getContentPane().add(checkTrabajando);
	
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		comboBox.setBounds(82, 126, 116, 24);
		frame.getContentPane().add(comboBox);
		
		lblSexo.setBounds(40, 131, 70, 15);
		frame.getContentPane().add(lblSexo);
		
		txtNumdni = new JTextField();
		txtNumdni.setText("Introduce DNI");
		txtNumdni.setBounds(84, 33, 114, 19);
		frame.getContentPane().add(txtNumdni);
		txtNumdni.setColumns(10);
		

		lblDni.setBounds(54, 35, 70, 15);
		frame.getContentPane().add(lblDni);
		
	}
	public String getSelectedCheckBox() {
		if (checkEstudiando.isSelected()) {
			return checkEstudiando.getText();
		}
		else if (checkParo.isSelected()) {
			return checkParo.getText();
		}
		else if (checkTrabajando.isSelected()){
			return checkTrabajando.getText();
		}
		else {
			return "Indefinido";
		}
	}
	
	JButton btnAceptar = new JButton("Aceptar");
	JButton btnLimpiar = new JButton("Limpiar");
	JButton btnSalir = new JButton("Salir");

	JCheckBox checkEstudiando = new JCheckBox("Estudiando");
	JCheckBox checkTrabajando = new JCheckBox("Trabajando");
	JCheckBox checkParo = new JCheckBox("Paro");
	
	JComboBox comboBox = new JComboBox();
	JLabel lblDni = new JLabel("DNI");
	JLabel lblSexo = new JLabel("Sexo");
	private JTextField txtNumdni;
}
