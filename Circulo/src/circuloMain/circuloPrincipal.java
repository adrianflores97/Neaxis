package circuloMain;


import circuloEntity.Circulo;
import circuloImplementacion.circuloImp;


public class circuloPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Circulo circulo1 = new Circulo(5.0);
        circuloImp imp = new circuloImp();
        
        // Calcular y mostrar el  rea y el per metro del circulo 1
        System.out.println("Circulo 1: " + circulo1);
        System.out.println("Area del circulo 1: " + imp.areaCirculo(circulo1.getRadio()));
        System.out.println("Perimetro del circulo 1: " + imp.perimetroCirculo(circulo1.getRadio())+"\n");

        // Crear otro c rculo para la comparaci n
        Circulo circulo2 = new Circulo(7.0);
        
        // Calcular y mostrar el  rea y el per metro del circulo 2
        System.out.println("Circulo 2: " + circulo2);
        System.out.println("Area del circulo 2: " + imp.areaCirculo(circulo2.getRadio()));
        System.out.println("Perimetro del circulo 2: " + imp.perimetroCirculo(circulo2.getRadio()) +"\n");
        
        // Comparar ambos c rculos
        Circulo mayor = imp.compararCirculos(circulo1, circulo2);
        
        if (mayor != null) {
            System.out.println("El circulo con mayor radio tiene un radio de: " + mayor.getRadio());
        } else {
            System.out.println("Ambos circulos tienen el mismo radio.");
        }
    }
}
