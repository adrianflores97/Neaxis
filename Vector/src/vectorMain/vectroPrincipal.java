package vectorMain;

import java.util.ArrayList;
import java.util.Scanner;

import vectorImplementacion.vectorImp;

public class vectroPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         Scanner scanner = new Scanner(System.in);
        
         vectorImp imp = new vectorImp();
     
        ArrayList<Integer> enteros = new ArrayList<>();
        ArrayList<Double> reales = new ArrayList<>();
        
      
        System.out.println("Ingrese n meros enteros (para detener ingrese un valor no entero):");
        while (scanner.hasNextInt()) {
            enteros.add(scanner.nextInt());
        }
        
      
        scanner.next(); 
        

        System.out.println("Ingrese n meros reales (para detener ingrese un valor no real):");
        while (scanner.hasNextDouble()) {
            reales.add(scanner.nextDouble());
        }
        
        scanner.next(); 
        
        System.out.print("Ingrese un valor real para comparar: ");
        double valorComparacion = scanner.nextDouble();
        
        
        if (enteros.isEmpty()) {
            System.out.println("No se ingresaron n meros enteros.");
        } else {
            int mayorEntero = imp.encontrarMayorEntero(enteros);
            System.out.println("El mayor n mero entero es: " + mayorEntero);
        }
        
 
        System.out.println("N meros reales menores que " + valorComparacion + ":");
        imp.mostrarRealesMenores(reales, valorComparacion);
        
        scanner.close();
    }

}
