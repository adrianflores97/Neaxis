package circuloImplementacion;

import circuloEntity.Circulo;
import circuloService.OperacionesCirculo;


public class circuloImp  implements OperacionesCirculo{

	@Override
	public double areaCirculo(double radio) {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double perimetroCirculo(double radio) {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radio;
	}
	
	public Circulo compararCirculos(Circulo c1, Circulo c2) {
        if (c1.getRadio() > c2.getRadio()) {
            return c1;
        } else if (c2.getRadio() > c1.getRadio()) {
            return c2;
        } else {
            return null; // Si tienen el mismo radio
        }
    }
	
}
