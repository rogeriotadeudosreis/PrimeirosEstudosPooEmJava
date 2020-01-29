package Cap_7_Java_7_orientacaoObjetos;

public class CopoConstrutor {

	private String tipoMaterial;
	private int capacidade;

	public CopoConstrutor(String tipoMaterial, int capacidade) {
		super();
		this.tipoMaterial = tipoMaterial;
		this.capacidade = capacidade;

	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void mostrarConteudo() {
		System.out.println("Tipo do Material: " + tipoMaterial + "	\nCapacidade: " + capacidade);
	}
}
