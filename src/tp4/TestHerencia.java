
package tp4;


public class TestHerencia {

    public static void main(String[] args) {
        Guerrero g1 = new Guerrero("Thor",100,200);
        System.out.println("El guerrero esta mirando hacia el "+g1.getOrientacion());
        System.out.println("Energia inicial: "+g1.getEnergia());
        g1.girar();
        g1.girar();
        g1.girar();
        System.out.println("El guerrero esta mirando hacia el "+g1.getOrientacion());
        for(int i=0;i<5;i++){
            g1.avanzar();
        }
        for(int i=0;i<8;i++){
            g1.disparar();
        }
        System.out.println("Energia actual: "+g1.getEnergia());
        //MOSTRAR POSICION
        Position p = new Position(0,0);
        p= g1.getUbicacion();
        System.out.println(p.toString());
    }
    
}
