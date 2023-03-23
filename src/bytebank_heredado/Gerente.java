package bytebank_heredado;

public class Gerente extends Funcionario{
	
	// cuando le pongo el extends pongo en gris todo lo demas porque el toma dichas caractericticas de la clase madre
	//private String nombre;
	//private String documento;
	//private double salario;
	/*
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}*/
	
	public double getBonificacion() {
		System.out.println("Ejecutando desde Gerente");
		return super.getSalario() + this.getSalario() *0.05;
		//return this.salario;
	}
}


