package bytebank_heredado;

public interface Autenticable {
	
	public void setClave(String clave);
	
	public String getClave();
	
	public boolean iniciarSesion(String clave);
	
	
	/*
	private String clave;
	
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave
	
	public abstract boolean iniciarSesion(String clave);
	//	return clave == "AluraCursos";
	//}

	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}
