package bytebank_heredado;

public class SistemaInterno {
	
	private String clave = "12345";
	
	boolean autentica(Autenticable gerente) {
		
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		
		if(puedeIniciarSesion) {
			System.out.println("Login Exitoso!");
			return true;
		} else {
			System.out.println("Error en login");
			return false;
		}
	}
}
