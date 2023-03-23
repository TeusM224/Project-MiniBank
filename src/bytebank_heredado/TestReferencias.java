package bytebank_heredado;

public class TestReferencias {
 public static void main(String[] args) {
	Funcionario funcionario = new Contador();
	funcionario.setNombre("Camilo");
	
	Gerente gerente = new Gerente();
	gerente.setNombre("Camila");
	
	funcionario.setSalario(2000);
	gerente.setSalario(10000);
}
}
