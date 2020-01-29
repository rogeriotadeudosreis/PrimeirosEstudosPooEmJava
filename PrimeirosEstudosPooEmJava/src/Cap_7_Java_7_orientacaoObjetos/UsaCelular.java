package Cap_7_Java_7_orientacaoObjetos;

import javax.swing.JOptionPane;

public class UsaCelular {

	public static void main(String[] args) {

		Celular celular1 = new Celular();
		Celular celular2 = new Celular();
		Celular celular3 = new Celular();

		celular1.numero = "11 5431-2342";
		celular2.numero = "11 9123-5678";
		celular3.numero = "11 5765-3897";
		Celular.empresa = "Empresa Genérica do Brasil";
		Celular.empresa = Celular.mostrarDados();

	//	JOptionPane.showMessageDialog(null,
			//	celular1.numero + "\n" + celular2.numero + "\n" + celular3.numero + "\n" + Celular.empresa);
	}

}
