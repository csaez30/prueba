
package tp4;

public class Personaje {
    protected Position ubicacion;
    protected String nick;
    protected int vidas;
    protected int energia;
    protected char orientacion;
    
    public Personaje(String nick, int x,int y){
        this.nick=nick;
        this.ubicacion= new Position(x,y);
        vidas=3;
        energia=100;
        orientacion='N';
    }
    public void disparar(){
        if(energia>=10){
            energia-=10;
        }
        else{
            System.out.println("No tiene energia suficiente para disparar");
        }
    }
    public void girar(){
        switch(orientacion){
            case 'N':  orientacion='E';
                       break;
            case 'E':  orientacion='S';
                       break;
            case 'S':  orientacion='O';
                       break;
            case 'O':  orientacion='N';
                       break;
        }
    }
    public void avanzar(){
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
    }

    public int getEnergia() {
        return energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public int getVidas() {
        return vidas;
    }
    
    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
     public void setUbicacion(Position ubicacion) {
        this.ubicacion = ubicacion;
    }
}
