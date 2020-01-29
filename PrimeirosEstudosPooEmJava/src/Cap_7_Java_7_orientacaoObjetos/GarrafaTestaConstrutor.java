package Cap_7_Java_7_orientacaoObjetos;

public class GarrafaTestaConstrutor {

	public static void main(String[] args) {
		GarrafaUsandoConstrutor garrafa1 = new GarrafaUsandoConstrutor();
		GarrafaUsandoConstrutor garrafa2 = new GarrafaUsandoConstrutor("Vidro");
		GarrafaUsandoConstrutor garrafa3 = new GarrafaUsandoConstrutor(1000);
		GarrafaUsandoConstrutor garrafa4 = new GarrafaUsandoConstrutor("Plástico", 2500);
		
		garrafa1.mostrarConteudo();
		garrafa2.mostrarConteudo();
		garrafa3.mostrarConteudo();
		garrafa4.mostrarConteudo();
		
		

	}

}
