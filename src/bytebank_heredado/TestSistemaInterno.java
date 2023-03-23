package bytebank_heredado;

public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		gerenteHeredado gerente1 = new gerenteHeredado();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}

}
