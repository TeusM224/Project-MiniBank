package bytebank_heredado;

public class TestGerenteH {
	
	public static void main(String[] args) {
		gerenteHeredado mateo = new gerenteHeredado();
		mateo.setNombre("Mateo");
		mateo.setSalario(2000);
		mateo.setDocumento("1193117781");
		mateo.setClave("Aluralatam");
		
		System.out.println(mateo.getClave());
		System.out.println(mateo.getSalario());
		System.out.println(mateo.getBonificacion());
		//System.out.println(mateo.iniciarSesion(mateo.getClave()));
	}
}
