package Pacote_Exercicios_Java_7_Cap1aoCap4;

import java.text.DecimalFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class ConfiguracoesRegionaisComClasseLocale {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat();
		Locale local = Locale.getDefault();
		double valor = 1370.25;

		if (local.getCountry().equals("BR")) {
			df.applyPattern("R$ #,##0.00");
		}

		JOptionPane.showMessageDialog(null,
				"Configura��es do Sistema Operacional:" + 
		"\nSigla: " + local.getCountry() + 
		"\nPa�s: "	+ local.getDisplayCountry() + 
		"\nIdioma: " + local.getDisplayLanguage() + 
		"\nTeclado: "+ local.getDisplayName() + 
		"\nValor: " + df.format(valor));

		System.exit(0);
	}

}
