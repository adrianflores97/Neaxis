package bombillasEntity;

public class Bombilla {
	    private boolean encendida;
	    private static boolean luzGeneral = true; 

	    public Bombilla() {
	        this.encendida = false; 
	    }

	    public boolean isEncendida() {
	        return encendida && luzGeneral; 
	    }

	    public void encender() {
	        if (luzGeneral) {
	            this.encendida = true; 
	        }
	    }

	    public void apagar() {
	        this.encendida = false; 
	    }

	    public static void activaLuzGeneral() {
	        luzGeneral = true; 
	    }

	    public static void desactivaLuzGeneral() {
	        luzGeneral = false; 
	    }
	}