package rover;

public class Rover {
    private Coordinate position;

    public Rover(){
        this.position = new Coordinate();
        this.position.setX(0);
        this.position.setY(0);
    }

    public Coordinate getPosicao() {
        return this.position;
    }
}
