package vehiculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BicicletaTest {
    @Test
    void rodadoDeBicicleta() {
        Bicicleta bicicleta = new Bicicleta(29);
        assertEquals(29,bicicleta.getRodado());
    }
}
