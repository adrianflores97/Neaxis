package bombillasService;

public interface IluminacionServ {

	public void activaLuzGeneral(); 
	public void desactivaLuzGeneral(); 
	public void encenderBombilla(int indice); 
	public void apagarBombilla(int indice); 
	public int numeroBombillasEncendidas(); 
	public int numeroBombillasApagadas(); 
}
