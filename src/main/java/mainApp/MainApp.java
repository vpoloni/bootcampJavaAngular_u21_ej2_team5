package mainApp;

import controllers.CalculadoraController;
import models.CalculadoraModelo;
import views.CalculadoraVista;

public class MainApp {
	public static void main(String[] args) {
		
		// instanciamos la vista y el modelo
		CalculadoraModelo calculadoraModelo = new CalculadoraModelo();
		CalculadoraVista calculadoraVista = new CalculadoraVista();

		// llamamos al constructor del controller pasándole como parámetros el modelo y la vista
		CalculadoraController calculadoraController = new CalculadoraController(calculadoraModelo, calculadoraVista);
		
		// llamamos al método que inicie la vista
		calculadoraController.iniciarVista();
		
	}
}
