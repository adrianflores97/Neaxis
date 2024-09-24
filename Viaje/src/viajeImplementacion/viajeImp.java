package viajeImplementacion;

import viajeEntity.Trayecto;

public class viajeImp {

  
    public Trayecto uneViaje(Trayecto t1, Trayecto t2) {
        if (t1.destino.equals(t2.origen)) {
            return new Trayecto(t1.origen, t2.destino, t1.distancia + t2.distancia);
        } else {
            return null;
        }
    }
}
