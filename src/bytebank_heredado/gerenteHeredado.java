package bytebank_heredado;

//public class gerenteHeredado extends Autenticable {

public class gerenteHeredado extends Funcionario implements Autenticable {
	
	private String clave;

	//No necesito ponerle nada
	/*
	 * Elimino el codigo para aplicar la herenciamultiple
	 * 
	private String clave;
	
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "Aluralatam";
	}*/
	
	public double getBonificacion() {
		return super.getSalario() + (super.getSalario()*0.1);
		//return 2000;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return clave == "Aluralatam";
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getClave() {
		// TODO Auto-generated method stub
		return clave;
	}
}
