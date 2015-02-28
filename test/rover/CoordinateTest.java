package rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateTest {
    @Test
    public void returnCoordinateX(){
        Coordinate coordinate = new Coordinate();
        assertEquals(0, coordinate.getX());
    }

    @Test
    public void returnCoordinateY(){
        Coordinate coordinate = new Coordinate();
        assertEquals(0, coordinate.getY());
    }

    @Test
    public void setCoordinateX(){
        Coordinate coordinate = new Coordinate();
        coordinate.setX(1);
        assertEquals(1, coordinate.getX());
    }

    @Test
    public void setCoordinateY(){
        Coordinate coordinate = new Coordinate();
        coordinate.setY(1);
        assertEquals(1, coordinate.getY());
    }
}