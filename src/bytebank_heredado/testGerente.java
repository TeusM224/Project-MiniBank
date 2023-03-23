package bytebank_heredado;

public class testGerente {
	
	public static void main(String[] args) {
		Gerente mateo = new Gerente();
		mateo.setNombre("Mateo");
		mateo.setDocumento("1193117781");
		mateo.setSalario(3000000);
		
		System.out.println(mateo.getSalario());
		System.out.println(mateo.getBonificacion());
		
	}

}