package mainApp;

import java.awt.EventQueue;

import views.CalculadoraVista;

public class MainApp 
{
    public static void main( String[] args )
    {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraVista frame = new CalculadoraVista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
