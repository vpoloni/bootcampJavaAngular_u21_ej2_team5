package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import models.CalculadoraModelo;
import views.CalculadoraVista;

public class CalculadoraController implements ActionListener {

	// atributos
	private CalculadoraModelo calculadoraModelo;
	private CalculadoraVista calculadoraVista;

	// constructor
	public CalculadoraController(CalculadoraModelo calculadoraModelo, CalculadoraVista calculadoraVista) {

		this.calculadoraModelo = calculadoraModelo;
		this.calculadoraVista = calculadoraVista;

		// añadimos listeners a cada botón
		this.calculadoraVista.boton0.addActionListener(this);
		this.calculadoraVista.boton1.addActionListener(this);
		this.calculadoraVista.boton2.addActionListener(this);
		this.calculadoraVista.boton3.addActionListener(this);
		this.calculadoraVista.boton4.addActionListener(this);
		this.calculadoraVista.boton5.addActionListener(this);
		this.calculadoraVista.boton6.addActionListener(this);
		this.calculadoraVista.boton7.addActionListener(this);
		this.calculadoraVista.boton8.addActionListener(this);
		this.calculadoraVista.boton9.addActionListener(this);

		this.calculadoraVista.botonCE.addActionListener(this);
		this.calculadoraVista.botonDEL.addActionListener(this);

		this.calculadoraVista.monedasComboBox1.addActionListener(this);
		this.calculadoraVista.monedasComboBox2.addActionListener(this);
	}

	// método que inicia la vista
	public void iniciarVista() {

		calculadoraVista.setTitle("Calculadora Moneda");
		calculadoraVista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculadoraVista.setVisible(true);
	}

	// método con la lógica implementada de los botones clickados
	@Override
	public void actionPerformed(ActionEvent e) {

		// llamamos al método que calcula la cantidad pasándole como parámetro el evento producido
		calcularCantidad(e);

		// seteamos el valor de la cantidad introducida a la etiqueta cantidadIntroducida
		calculadoraVista.cantidadIntroducida.setText(calculadoraModelo.getCantidad());

		// llamamos al método de conversación de moneda pasándole como parámetro el tipo de moneda elegida de cada comboBox
		calculadoraModelo.convertirMoneda(calculadoraVista.monedasComboBox1.getSelectedItem(),
				calculadoraVista.monedasComboBox2.getSelectedItem());

		// seteamos el valor convertido a la etiqueta cantidadConvertida
		calculadoraVista.cantidadConvertida.setText(calculadoraModelo.getResultado());
	}

	// el método que calcula la cantidad
	public void calcularCantidad(ActionEvent evento) {

		// diferenciamos entre dos tipos de eventos: JButton y JComboBox
		if (evento.getSource().getClass().getSimpleName().equals("JButton")) {
			
			// si hemos clickado el botón que limpia la cantidad introducida
			if (calculadoraVista.botonCE == evento.getSource()) {

				// reseteamos el valor de la cantidad a la cadena vacía
				calculadoraModelo.setCantidad("");

				return;

			// si hemos clickado el botón que elimina el último dígito de la cantidad
			} else if (calculadoraVista.botonDEL == evento.getSource()) {

				// guardamos el nuevo valor de la cantidad con el último dígito quitado
				String cantidad = calculadoraModelo.getCantidad().substring(0, calculadoraModelo.getCantidad().length() - 1);

				// seteamos la cantidad reducida a la variable cantidad del modelo
				calculadoraModelo.setCantidad(cantidad);

			// si hemos clickado los botones con los dígitos
			} else {
				
				// guardamos la cantidad inicial 
				String cantidad = calculadoraModelo.getCantidad();

				// guardamos el botón clickado
				JButton botonClickado = (JButton) evento.getSource();

				// obtenemos el valor del botón clickado
				String valorBoton = botonClickado.getText();

				// añadimos el valor del botón clickado a la cantidad inicial (concatenamos los strings)
				cantidad += valorBoton;

				// seteamos la cantidad obtenida a la variable cantidad del modelo
				calculadoraModelo.setCantidad(cantidad);
			}

		} else {
			// en el caso si el evento es de tipo JComboBox
			System.out.println("COMBO BOX TRIGGERED!");
		
		}

	}
}
