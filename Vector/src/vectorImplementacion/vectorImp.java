package vectorImplementacion;

import java.util.ArrayList;

public class vectorImp {
	
	// Método para encontrar el mayor de los enteros
    public int encontrarMayorEntero(ArrayList<Integer> enteros) {
        int mayor = enteros.get(0);
        for (int num : enteros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }
    
    // Método para mostrar los números reales menores que el valor dado
    public void mostrarRealesMenores(ArrayList<Double> reales, double valor) {
        boolean hayMenores = false;
        for (double num : reales) {
            if (num < valor) {
                System.out.println(num);
                hayMenores = true;
            }
        }
        if (!hayMenores) {
            System.out.println("No hay números reales menores que " + valor);
        }
    }


}
