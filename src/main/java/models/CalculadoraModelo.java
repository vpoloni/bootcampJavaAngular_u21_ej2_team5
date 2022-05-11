package models;

public class CalculadoraModelo {

	// constantes
	private final double tasaDolarAEuro = 0.95;
	private final double tasaEuroADolar = 1.05;

	// atributos
	private String cantidad = "";
	private String resultado;

	// getters y setters
	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	// método que convirte la cantidad clickada recibiendo como parámetro el tipo de moneda
	public void convertirMoneda(Object monedaSeleccionadaCombo1, Object monedaSeleccionadaCombo2) {

		double resultadoParseado;

		if (monedaSeleccionadaCombo1 == "Dolar" && monedaSeleccionadaCombo2 == "Euro" && cantidad != "") {

			// si la cantidad no tiene el valor inicial, la parseamos a double (recibida de controller en el formato String)
			resultadoParseado = Double.parseDouble(cantidad) * tasaDolarAEuro;

			resultado =String.format("%.2f", resultadoParseado);

		} else if (monedaSeleccionadaCombo1 == "Euro" && monedaSeleccionadaCombo2 == "Dolar" && cantidad != "") {
			resultadoParseado = Double.parseDouble(cantidad) * tasaEuroADolar;

			resultado = String.format("%.2f", resultadoParseado);

		} else {
			// si la cantidad tiene el valor inicial, la asignamos al resultado
			resultado = cantidad;
		}
	}

}
