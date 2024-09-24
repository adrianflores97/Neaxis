package viajeEntity;

public class Trayecto {
	
	public String origen;
    public String destino;
    public double distancia;
    
    public Trayecto() {
		// TODO Auto-generated constructor stub
	}

	public Trayecto(String origen, String destino, double distancia) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
	}

	@Override
	public String toString() {
		return "Trayecto [origen=" + origen + ", destino=" + destino + ", distancia=" + distancia + "]";
	}
    
    

}
