package vehiculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MonopatinTest {
    @Test
    void testGetMarca() {
        Monopatin monopatin = new Monopatin("Venzo");
        assertEquals("Venzo", monopatin.getMarca());
    }
}
