package Cap_7_Java_7_orientacaoObjetos;

public class UsandoVeiculo {

	public static void main(String[] args) {
		
		Veiculo moto = new Veiculo();
		
		moto.setMarca("Suzuki");
		moto.setModelo("V-Strom DL650");
		moto.setCor("Branca");
		moto.setCilindrada(650);
		moto.setProprietario("Rog�rio");
		moto.setIdadeProprietario(47);
		
		moto.mostrarDadosMoto();

	}

}
