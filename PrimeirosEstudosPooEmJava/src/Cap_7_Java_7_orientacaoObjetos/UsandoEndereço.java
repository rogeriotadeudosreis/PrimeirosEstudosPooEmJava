package Cap_7_Java_7_orientacaoObjetos;

import javax.swing.JOptionPane;

public class UsandoEndere�o {

	public static void main(String[] args) {

		Endereco local = new Endereco();

		local.setRua("Rua Vi�osa");
		local.setNumero(000);
		local.setQuadra("109");
		local.setLote(3);
		local.setBairro("Leste Universit�rio");
		local.setPontoReferencia(JOptionPane.showInputDialog("Informe um ponto de refer�ncia"));
		local.setCep("74.615-290");
		local.setCidade("Goi�nia");
		local.setEstado("Goi�s");

		local.statusEndereco();

	}

}
