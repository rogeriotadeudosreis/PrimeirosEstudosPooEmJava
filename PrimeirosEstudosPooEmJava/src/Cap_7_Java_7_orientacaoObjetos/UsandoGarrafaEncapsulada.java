package Cap_7_Java_7_orientacaoObjetos;

public class UsandoGarrafaEncapsulada {

	public static void main(String[] args) {
		
		Garrafa_usandoGetSet garrafa1 = new Garrafa_usandoGetSet();
		
		garrafa1.setCapacidade(1000);
		garrafa1.setTipoMaterial("vidro");
		garrafa1.mostrarConteudo();
		
		System.out.println("Capacidade de armazenamento " + garrafa1.getCapacidade());
		System.out.println("Tipo do material: " + garrafa1.getTipoMaterial());

	}

}
