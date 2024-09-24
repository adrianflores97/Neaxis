package circuloEntity;

public class Circulo {
	
  public double radio;

public Circulo(double radio) {
	super();
	this.radio = radio;
}

public double getRadio() {
	return radio;
}

@Override
public String toString() {
	return "radio del circulo: " + radio + " \n";
}  

}
