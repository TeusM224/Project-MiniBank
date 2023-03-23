package bytebank_heredado;

public class testFuncionario {
	
	public static void main(String[] args) {
		Funcionario diego  = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("15151515");
		diego.setSalario(2000);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}

}
