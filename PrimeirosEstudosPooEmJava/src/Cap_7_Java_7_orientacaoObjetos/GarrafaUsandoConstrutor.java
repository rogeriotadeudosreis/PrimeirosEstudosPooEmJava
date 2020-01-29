package Cap_7_Java_7_orientacaoObjetos;

public class GarrafaUsandoConstrutor {

	private String tipoMaterial;
	private int capacidade;

	

	public GarrafaUsandoConstrutor(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public GarrafaUsandoConstrutor(int capacidade) {

		this.capacidade = capacidade;
	}

	public GarrafaUsandoConstrutor(String tipoMaterial, int capacidade) {
		super();
		this.tipoMaterial = tipoMaterial;
		this.capacidade = capacidade;
	}

	public void mostrarConteudo() {
		System.out.println("Tipo do Material: " + tipoMaterial + "	\nCapacidade: " + capacidade);
	}

}
