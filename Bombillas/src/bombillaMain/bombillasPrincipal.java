package bombillaMain;

import bombillasImplements.bombillaImp;

public class bombillasPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       bombillaImp controlarIluminacion = new bombillaImp(5); 
        
       controlarIluminacion.activaLuzGeneral();
       controlarIluminacion.encenderBombilla(0);
       controlarIluminacion.encenderBombilla(1); 

        System.out.println("Bombillas encendidas: " + controlarIluminacion.numeroBombillasEncendidas());
        System.out.println("Bombillas apagadas: " + controlarIluminacion.numeroBombillasApagadas());

        controlarIluminacion.desactivaLuzGeneral(); 
        controlarIluminacion.apagarBombilla(1); 

        System.out.println("Bombillas encendidas despu s de desactivar la luz general: " + controlarIluminacion.numeroBombillasEncendidas());
    }
}