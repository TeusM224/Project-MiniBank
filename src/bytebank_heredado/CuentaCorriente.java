package bytebank_heredado;

public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente( int agencia, int numero) {
		super(agencia,numero); //accede a los parametros y el constructor de la clase cuentas 
	}
	
	@Override
	public boolean retirar(double valor) {
		// TODO Auto-generated method stub
		double comision = 0.2;
		return super.retirar(valor + comision);
	}
	/*
	@Override
	public boolean transferir(double valor, Cuenta cuenta) {
		// TODO Auto-generated method stub
		double comision = 0.2;
		return super.transferir(valor, cuenta);
	}
	*/

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo = this.saldo + valor;
	}
}
