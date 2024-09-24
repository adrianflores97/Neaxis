package bombillasEntity;

public class Iluminacion {
	private Bombilla[] bombillas; 
        private int numeroBombillas;

    public Iluminacion(int numeroBombillas) {
        this.numeroBombillas = numeroBombillas;
        this.bombillas = new Bombilla[numeroBombillas];
        for (int i = 0; i < numeroBombillas; i++) {
            bombillas[i] = new Bombilla(); 
        }
    }

    public Bombilla[] getBombillas() {
        return bombillas;
    }

    public int numeroBombillasEncendidas() {
        int count = 0;
        for (Bombilla bombilla : bombillas) {
            if (bombilla.isEncendida()) {
                count++;
            }
        }
        return count;
    }

    public int numeroBombillasApagadas() {
        return numeroBombillas - numeroBombillasEncendidas();
    }
}