package bytebank_heredado;

public class TestControlBonificaciones {
	
	public static void main(String[] args) {
		
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setSalario(2000);
		
		gerenteHeredado jimena = new gerenteHeredado();
		jimena.setNombre("Jimena");
		jimena.setSalario(10000);
		
		Contador alezis = new Contador();
		alezis.setNombre("Alezis");
		alezis.setSalario(500);
		
		ControlBonificaciones controlBonificacion = new ControlBonificaciones();
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alezis);
		
		
		
	}
	
}
