package bytebank_heredado;

//public class Administrador extends Autenticable {

public class Administrador extends Funcionario implements Autenticable {
	
	//private String clave;
	
	private AutenticacionUtil util;
	
	public Administrador(){
		this.util = new AutenticacionUtil();
	}
	/*
	private String clave;
	
	 * Elimino el codigo para aplicar herencia multiple
	 * 
	 * 
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "Aluralatam";
	}
	*/
	public double getBonificacion() {
		return 0;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		//return clave == "Aluralatam";
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

	@Override
	public String getClave() {
		// TODO Auto-generated method stub
		return util.getClave();
	}
}
