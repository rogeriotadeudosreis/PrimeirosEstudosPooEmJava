package Cap_7_Java_7_orientacaoObjetos;

public class CopoTestaConstrutor {

	public static void main(String[] args) {
		
		CopoConstrutor copo = new CopoConstrutor("Plástico", 200);
		CopoConstrutor copo2 = new CopoConstrutor("Vidro", 100);
		copo.mostrarConteudo();
		copo2.mostrarConteudo();

		
	}

}
