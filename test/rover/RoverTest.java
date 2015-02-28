package rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {
    @Test
    public void retornaPosicaoRover(){
        Rover rover = new Rover();
        assertEquals(0, rover.getPosicao().getX());
    }

//    @Test
//    public void recebeComando(){
//        Rover rover = new Rover();
//        assertEquals("M", rover.executaComando("M"));
//    }
}