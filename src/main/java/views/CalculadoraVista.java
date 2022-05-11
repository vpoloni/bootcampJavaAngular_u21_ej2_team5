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

	// atributos
	private JPanel contentPane;
	public JButton botonComa, botonCE, botonDEL;
	public JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;
	public JComboBox<Object> monedasComboBox1, monedasComboBox2;
	public JLabel cantidadIntroducida, cantidadConvertida;

	
	// constructor
	public CalculadoraVista() {

		contentPane = new JPanel();
		setBounds(100, 100, 600, 400);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// botones
		boton0 = new JButton("0");
		boton0.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton0.setBounds(509, 287, 56, 50);
		contentPane.add(boton0);

		boton1 = new JButton("1");
		boton1.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton1.setBounds(370, 227, 56, 50);
		contentPane.add(boton1);

		boton2 = new JButton("2");
		boton2.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton2.setBounds(440, 227, 56, 50);
		contentPane.add(boton2);

		boton3 = new JButton("3");
		boton3.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton3.setBounds(509, 227, 56, 50);
		contentPane.add(boton3);

		boton4 = new JButton("4");
		boton4.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton4.setBounds(370, 167, 56, 50);
		contentPane.add(boton4);

		boton5 = new JButton("5");
		boton5.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton5.setBounds(440, 167, 56, 50);
		contentPane.add(boton5);

		boton6 = new JButton("6");
		boton6.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton6.setBounds(509, 167, 56, 50);
		contentPane.add(boton6);

		boton7 = new JButton("7");
		boton7.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton7.setBounds(370, 107, 56, 50);
		contentPane.add(boton7);

		boton8 = new JButton("8");
		boton8.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton8.setBounds(440, 107, 56, 50);
		contentPane.add(boton8);

		boton9 = new JButton("9");
		boton9.setFont(new Font("Tahoma", Font.BOLD, 14));
		boton9.setBounds(509, 107, 56, 50);
		contentPane.add(boton9);

		botonDEL = new JButton("DEL");
		botonDEL.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonDEL.setBounds(440, 47, 125, 50);
		contentPane.add(botonDEL);

		botonCE = new JButton("CE");
		botonCE.setFont(new Font("Tahoma", Font.BOLD, 14));
		botonCE.setBounds(370, 47, 56, 50);
		contentPane.add(botonCE);

		// comboBoxes
		String[] monedasDisponibles = { "Dolar", "Euro" };

		monedasComboBox1 = new JComboBox<Object>(monedasDisponibles);
		monedasComboBox1.setBounds(34, 107, 128, 21);
		contentPane.add(monedasComboBox1);

		monedasComboBox2 = new JComboBox<Object>(monedasDisponibles);
		monedasComboBox2.setBounds(34, 244, 128, 21);
		contentPane.add(monedasComboBox2);

		// labels
		cantidadIntroducida = new JLabel("0");
		cantidadIntroducida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cantidadIntroducida.setBounds(49, 63, 113, 41);
		contentPane.add(cantidadIntroducida);

		cantidadConvertida = new JLabel("0");
		cantidadConvertida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cantidadConvertida.setBounds(49, 193, 113, 41);
		contentPane.add(cantidadConvertida);

	}

}
