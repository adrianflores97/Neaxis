package cuentaImplements;

import cuentaEntity.cuentaCorriente;
import cuentaService.CuentaService;

public class cuentaImp implements CuentaService {
	
	private cuentaCorriente cuentaCorriente;
	
    public cuentaImp(cuentaCorriente cuenta) {
        this.cuentaCorriente = cuenta;
    }

	@Override
	public double obtenerSaldo() {
		// TODO Auto-generated method stub
		return cuentaCorriente.getSaldo();
	}

	@Override
	public void retirar(double cantidad) {
		// TODO Auto-generated method stub
		if (cantidad > 0) {
            cuentaCorriente.setSaldo(cuentaCorriente.getSaldo() - cantidad);
            System.out.println("Se han retirado $" + cantidad + " \nSaldo actual: $" + cuentaCorriente.getSaldo());
        } else {
            System.out.println("La cantidad a retirar debe ser mayor que 0.");
        }
    }

	@Override
	public void depositar(double cantidad) {
		// TODO Auto-generated method stub
	     if (cantidad > 0) {
	            cuentaCorriente.setSaldo(cuentaCorriente.getSaldo() + cantidad);
	            System.out.println("Se han depositado $" + cantidad + " \nSaldo actual: $" + cuentaCorriente.getSaldo());
	        } else {
	            System.out.println("La cantidad a depositar debe ser mayor que 0.");
	        }
	    }

}
