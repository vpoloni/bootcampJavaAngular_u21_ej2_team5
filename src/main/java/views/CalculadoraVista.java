package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;

public class CalculadoraVista extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public CalculadoraVista() {
		
		// el título de la ventana
		setTitle("Calculadora Moneda");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// botones
		JButton botonComa = new JButton(",");
		botonComa.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonComa.setBounds(509, 286, 56, 50);
		contentPane.add(botonComa);

		JButton boton0 = new JButton("0");
		boton0.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton0.setBounds(440, 286, 56, 50);
		contentPane.add(boton0);

		JButton boton1 = new JButton("1");
		boton1.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton1.setBounds(370, 227, 56, 50);
		contentPane.add(boton1);

		JButton boton2 = new JButton("2");
		boton2.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton2.setBounds(440, 227, 56, 50);
		contentPane.add(boton2);

		JButton boton3 = new JButton("3");
		boton3.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton3.setBounds(509, 227, 56, 50);
		contentPane.add(boton3);

		JButton boton4 = new JButton("4");
		boton4.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton4.setBounds(370, 167, 56, 50);
		contentPane.add(boton4);

		JButton boton5 = new JButton("5");
		boton5.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton5.setBounds(440, 167, 56, 50);
		contentPane.add(boton5);

		JButton boton6 = new JButton("6");
		boton6.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton6.setBounds(509, 167, 56, 50);
		contentPane.add(boton6);

		JButton boton7 = new JButton("7");
		boton7.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton7.setBounds(370, 107, 56, 50);
		contentPane.add(boton7);

		JButton boton8 = new JButton("8");
		boton8.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton8.setBounds(440, 107, 56, 50);
		contentPane.add(boton8);

		JButton boton9 = new JButton("9");
		boton9.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton9.setBounds(509, 107, 56, 50);
		contentPane.add(boton9);

		JButton botonX = new JButton("X");
		botonX.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonX.setBounds(509, 47, 56, 50);
		contentPane.add(botonX);

		JButton botonCE = new JButton("CE");
		botonCE.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonCE.setBounds(440, 47, 56, 50);
		contentPane.add(botonCE);

		// comboBoxes
		String[] monedasDisponibles = { "Dolar", "Euro" };
		
		JComboBox<Object> monedasComboBox1 = new JComboBox<Object>(monedasDisponibles);
		monedasComboBox1.setBounds(34, 107, 128, 21);
		contentPane.add(monedasComboBox1);

		JComboBox<Object> modedasComboBox2 = new JComboBox<Object>(monedasDisponibles);
		modedasComboBox2.setBounds(34, 244, 128, 21);
		contentPane.add(modedasComboBox2);

		// labels
		JLabel etiqueta1 = new JLabel("0");
		etiqueta1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiqueta1.setBounds(49, 63, 45, 41);
		contentPane.add(etiqueta1);

		JLabel etiqueta2 = new JLabel("0");
		etiqueta2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiqueta2.setBounds(49, 193, 45, 41);
		contentPane.add(etiqueta2);

	}

}
