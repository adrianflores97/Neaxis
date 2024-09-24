package viajeMain;

import viajeEntity.Trayecto;
import viajeImplementacion.viajeImp;

public class viajePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		viajeImp imp = new viajeImp();
		
		
	     // Crear dos trayectos
        Trayecto t1 = new Trayecto("Ciudad A", "Ciudad B", 100);
        Trayecto t2 = new Trayecto("Ciudad B", "Ciudad C", 80);
        
        Trayecto viajeUnido = imp.uneViaje(t1, t2);

        if (viajeUnido != null) {
            System.out.println("El viaje unido es: " + viajeUnido);
        } else {
            System.out.println("Los trayectos no se pueden unir.");
        }
    }
}