package bombillasImplements;

import bombillasEntity.Bombilla;
import bombillasEntity.Iluminacion;
import bombillasService.IluminacionServ;
import bombillasService.bombillaServ;

public class bombillaImp implements bombillaServ, IluminacionServ {
	private Bombilla[] bombillas; 
        private Iluminacion iluminacion;

    public bombillaImp(int numeroBombillas) {
        this.iluminacion = new Iluminacion(numeroBombillas);
        this.bombillas = iluminacion.getBombillas(); 
    }

    @Override
    public void encender() {
        for (Bombilla bombilla : bombillas) {
            bombilla.encender(); 
        }
    }

    @Override
    public void apagar() {
        for (Bombilla bombilla : bombillas) {
            bombilla.apagar(); 
        }
    }

    @Override
    public boolean isEncendida() {
        for (Bombilla bombilla : bombillas) {
            if (bombilla.isEncendida()) {
                return true; 
            }
        }
        return false; // Si no, retorna falso
    }

    @Override
    public void activaLuzGeneral() {
        Bombilla.activaLuzGeneral(); 
    }

    @Override
    public void desactivaLuzGeneral() {
        Bombilla.desactivaLuzGeneral(); 
    }

    @Override
    public void encenderBombilla(int indice) {
        if (indice >= 0 && indice < bombillas.length) {
            bombillas[indice].encender(); 
        }
    }

    @Override
    public void apagarBombilla(int indice) {
        if (indice >= 0 && indice < bombillas.length) {
            bombillas[indice].apagar();
        }
    }

    @Override
    public int numeroBombillasEncendidas() {
        int count = 0;
        for (Bombilla bombilla : bombillas) {
            if (bombilla.isEncendida()) {
                count++; 
            }
        }
        return count;
    }

    @Override
    public int numeroBombillasApagadas() {
        return bombillas.length - numeroBombillasEncendidas(); 
    }
}
