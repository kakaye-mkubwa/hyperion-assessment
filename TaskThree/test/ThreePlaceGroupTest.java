import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreePlaceGroupTest {

    ThreePlaceGroup threePlaceGroup = new ThreePlaceGroup(1,2);

    @Test
    public void addPlaceDigit() {
        threePlaceGroup.addPlaceDigit(5);
        assertEquals(5,threePlaceGroup.getThird());
    }

    @Test
    public void isEmpty() {
        threePlaceGroup = new ThreePlaceGroup();
        assertTrue(threePlaceGroup.isEmpty());

        threePlaceGroup = new ThreePlaceGroup(1,2);
        assertFalse(threePlaceGroup.isEmpty());
    }

    @Test
    public void getFirst() {
        threePlaceGroup = new ThreePlaceGroup(1);
        assertEquals(1,threePlaceGroup.getFirst());
    }

    @Test
    public void setFirst() {
        threePlaceGroup.setFirst(9);
        assertEquals(9,threePlaceGroup.getFirst());
    }

    @Test
    public void getSecond() {
        threePlaceGroup = new ThreePlaceGroup(0,9);
        assertEquals(9,threePlaceGroup.getSecond());
    }

    @Test
    public void setSecond() {
        threePlaceGroup.setSecond(6);
        assertEquals(6,threePlaceGroup.getSecond());
    }

    @Test
    public void getThird() {
        threePlaceGroup=new ThreePlaceGroup(1,2,3);
        assertEquals(3,threePlaceGroup.getThird());
    }

    @Test
    public void setThird() {
        threePlaceGroup.setThird(4);
        assertEquals(4,threePlaceGroup.getThird());
    }
}