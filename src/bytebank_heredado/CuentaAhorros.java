package bytebank_heredado;

public class CuentaAhorros extends Cuenta {
	
	public CuentaAhorros (int agencia, int numero) {
		super(agencia, numero);
	}
	/*
	public boolean retirar(double valor) {
		// TODO Auto-generated method stub
		double comision = 0.2;
		return super.retirar(valor + comision);
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		// TODO Auto-generated method stub
		double comision = 0.2;
		return super.transferir((valor + comision), cuenta);
	}*/

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo = this.saldo + valor;
	}

}
