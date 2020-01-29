package Pacote_Exercicios_Java_7_Cap1aoCap4;

import javax.swing.JOptionPane;

public class RelogioFor {

	public static void main(String[] args) {

		int horas, minutos, segundos;

		for (horas = 0; horas < 24; horas++) {
			for (minutos = 0; minutos < 60; minutos++) {
				for (segundos = 0; segundos < 60; segundos++) {

					//JOptionPaneshouMessageDialog(null, horas + "h:" + minutos + "min:" + segundos + "s");
					 System.out.println(horas + "h:" + minutos + "min:" + segundos + "s");

					try {
						Thread.sleep(1000);
						if (segundos == 60)
							System.exit(0);
					} catch (InterruptedException erro) {
						erro.toString();
					}

				}

			}

		}
		System.exit(0);

	}

	private static void JOptionPaneshouMessageDialog(Object object, String string) {
		// TODO Auto-generated method stub

	}

}
