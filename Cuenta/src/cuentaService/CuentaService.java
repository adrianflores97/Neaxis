package cuentaService;

public interface CuentaService {

	public double obtenerSaldo();
	public void depositar(double cantidad);
	public void retirar(double cantidad);
}
