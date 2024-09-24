package cuentaMain;

import java.util.Scanner;

import cuentaEntity.cuentaCorriente;
import cuentaImplements.cuentaImp;

public class cuentaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        
        cuentaCorriente cuenta = new cuentaCorriente();
        
        cuentaImp imp = new cuentaImp(cuenta);
        
        System.out.println("Cuenta corriente creada con saldo inicial de $" + imp.obtenerSaldo());
        
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Ver saldo");
            System.out.println("2. Hacer un depósito");
            System.out.println("3. Hacer un retiro");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar saldo
                    System.out.println("El saldo actual es: $" + imp.obtenerSaldo());
                    break;
                case 2:
                    // Realizar depósito
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    imp.depositar(deposito);
                    break;
                case 3:
                    // Realizar retiro
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    imp.retirar(retiro);
                    break;
                case 4:
                    // Salir del programa
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        scanner.close();
    }
}