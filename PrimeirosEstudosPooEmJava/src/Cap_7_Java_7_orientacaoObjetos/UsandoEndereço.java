package Cap_7_Java_7_orientacaoObjetos;

import javax.swing.JOptionPane;

public class UsandoEndereço {

	public static void main(String[] args) {

		Endereco local = new Endereco();

		local.setRua("Rua Viçosa");
		local.setNumero(000);
		local.setQuadra("109");
		local.setLote(3);
		local.setBairro("Leste Universitário");
		local.setPontoReferencia(JOptionPane.showInputDialog("Informe um ponto de referência"));
		local.setCep("74.615-290");
		local.setCidade("Goiânia");
		local.setEstado("Goiás");

		local.statusEndereco();

	}

}
