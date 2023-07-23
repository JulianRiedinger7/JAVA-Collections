package Services;

import Entities.Perro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerroServiceTest {

    PerroService ps = new PerroService();
    Perro p = new Perro("max", "maltes");

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @Test
    void listShouldHaveZeroElements() {
        assertEquals(0, ps.getPerrosList().size());
    }

    @Test
    void listShouldHaveAtLeastOneElement() {
        ps.getPerrosList().add(p);
        assertNotEquals(0, ps.getPerrosList().size());
    }

    @Test
    void listShouldReturnToZero() {
        ps.eliminarPerro(p);
        assertEquals(0, ps.getPerrosList().size());
    }
}