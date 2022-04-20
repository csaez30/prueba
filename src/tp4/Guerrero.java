
package tp4;


public class Guerrero extends Personaje{
    
    private boolean caballo;
    
    public Guerrero(String nick, int x, int y) {
        super(nick, x, y);
        caballo=true;
    }
   
    @Override
    public void disparar(){
        if(getEnergia()<30){
            caballo=false;
            System.out.println("El guerrero perdió el caballo");
        }
        if(energia>=10){
            energia-=10;
        }
        else{
            System.out.println("No tiene energia suficiente para disparar");
        }
    }
    
    @Override
    public void avanzar(){
        if(caballo){
            switch(orientacion){
            case 'N':  ubicacion.modificarY(10);
                       break;
            case 'E':  ubicacion.modificarX(10);
                       break;
            case 'S':  ubicacion.modificarY(-10);
                       break;
            case 'O':  ubicacion.modificarX(-10);
                       break;
            }
        }
        else{
            switch(orientacion){
            case 'N':  ubicacion.modificarY(1);
                       break;
            case 'E':  ubicacion.modificarX(1);
                       break;
            case 'S':  ubicacion.modificarY(-1);
                       break;
            case 'O':  ubicacion.modificarX(-1);
                       break;
            }
            
            System.out.println("hola");
        }
    }
}
