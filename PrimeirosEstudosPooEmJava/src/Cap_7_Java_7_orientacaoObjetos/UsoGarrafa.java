package Cap_7_Java_7_orientacaoObjetos;

public class UsoGarrafa {

	public static void main(String[] args) {
		
		Garrafa garrafa1 = new Garrafa();
		
		garrafa1.tipoLiquido = Garrafa.leString();
		garrafa1.capacidade = 1000;
		garrafa1.tipoMaterial = "vidro";
		garrafa1.mostrarConteudo();
		garrafa1.encher();
		garrafa1.esvaziar();
		
	}

}
