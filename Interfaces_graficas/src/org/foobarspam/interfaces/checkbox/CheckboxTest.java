package org.foobarspam.interfaces.checkbox;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class CheckboxTest implements ItemListener{

	private JFrame frame;
	private final Action action = new SwingAction();

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
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAceptar.setBounds(8, 164, 89, 42);
		frame.getContentPane().add(btnAceptar);
		
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(125, 164, 89, 42);
		frame.getContentPane().add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(239, 164, 89, 42);
		frame.getContentPane().add(btnSalir);
		
		JCheckBox checkEstudiando = new JCheckBox("Estudiando");
		checkEstudiando.setBounds(8, 34, 116, 23);
		checkEstudiando.addItemListener(this);
		frame.getContentPane().add(checkEstudiando);
		
		JCheckBox checkParo = new JCheckBox("Paro");
		checkParo.setBounds(138, 34, 65, 23);
		checkParo.addItemListener(this);
		frame.getContentPane().add(checkParo);
		
		JCheckBox checkTrabajando = new JCheckBox("Trabajando");
		checkTrabajando.setBounds(223, 34, 129, 23);
		checkTrabajando.addItemListener(this);
		frame.getContentPane().add(checkTrabajando);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		comboBox.setBounds(113, 94, 116, 24);
		frame.getContentPane().add(comboBox);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(69, 99, 70, 15);
		frame.getContentPane().add(lblSexo);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
