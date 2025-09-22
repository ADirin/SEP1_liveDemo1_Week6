

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalTest {
Cal cal= new Cal();

   @Test
    public void addMe() {
        assertEquals(15,cal.addMe(12,3));
    }

    @Test
   public void mulMe() {
        assertEquals(36,cal.mulMe(12,3));
    }

    @Test
    public void divMe() {
        assertEquals(4,cal.divMe(12,3));
    }

    @Test
   public void powMe() {

    assertEquals(1728.0,cal.powMe(12,3));    }

    @Test
    public void subMe() {
        assertEquals(9,cal.subMe(12,3));
    }
}