package bytebank_heredado;

//una clase es una entidad
public abstract class Cuenta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	//Cliente titular;
	private Cliente titular = new Cliente();
	
	
	//String documento; estos elementos deben aislarse porque aunque pertenecen a la cuenta no necesariamente son de ella sino del cliente
	//String telefono;
	//String sexo;
	
	
	//this agencia hace referencia a la variable global
	//los constructores se utilizan para inicializar los atributos
	
	private static int total = 0; // static significa que la variabel nosera alterad por la instancia sino por el objeto donde este definido
	
	public Cuenta( int agencia, int numero ) {
		
		this.agencia = agencia;
		this.setNumero(numero);
		
		//int total = 0;
		
		if(agencia <= 0) {
			System.out.println("No se permite darle un valor negativo o nulo");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		
		total++;
		System.out.println("Se van creando " + total + " cuentas");
	}
	
	
	
	
	//no retorna valor
	/*public void depositar(double saldo) {
		//esta cuenta
		//saldo = saldo + saldo;
		//this saldo no es para valores de afuera, this es solo para lo que haya en cuenta
		
		//this.saldo = this.saldo + saldo;
		this.saldo += saldo;
	}*/
	
	//volvemos depositar abstracto, no deb e tener cuerpo
	
	public abstract void depositar (double valor);
	
	
	
	
	//retorna valor
	//el boolean se refiere a exito fallo etc
	public boolean retirar(double valor) {
		if(this.saldo >= valor){
			//this.saldo = this.saldo - valor; // this es para el saldo actual
			this.saldo -= valor;
			return true;
		} else {
			return false; //podemos ahorrarnos el else y utilizar solamente el retunr false
		}	
	}
	
	public boolean transferir (double valor,
								Cuenta cuenta){
		double comision = 0.2;
		if(this.saldo >= valor) {
			this.saldo = this.saldo - (valor+comision);
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	//public void setAgencia(int agencia) {
		//if(agencia > 0) {
			//this.agencia = agencia;
		//}
		//this se refiere al valor general, el agencia solo es refiriendose al prazmetro
	//}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() { //no usar this porque hace referencia al nivel de instancia y en este caso lo necesito a nivel de clase
		return Cuenta.total;
	}




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
		this.numero = numero;
	}
}
