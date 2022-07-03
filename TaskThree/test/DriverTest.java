import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {

    Driver driver = new Driver();

    @Test
    public void loadProcess() {
        driver.loadVoiceNumbersHashMap();
        assertEquals(28,Driver.voiceNumbersHashMap.size());

        driver.loadPlaceValueVoicesHashMap();
        assertEquals(5,Driver.voicePlacesHashMap.size());

        long input = 34543;
        Driver.inputCharArray = String.valueOf(input).toCharArray();
        assertEquals(5,Driver.inputCharArray.length);

//        driver.loadInputToStack(Driver.inputCharArray);

        driver.loadPlaceGroupStack();

        assertEquals("Thirty four thousand, five hundred and forty three.",driver.voiceNumber());
    }

    @Test
    public void validateInput() {
        assertTrue(driver.validateInput(100));
        assertFalse(driver.validateInput(-32));
    }
}