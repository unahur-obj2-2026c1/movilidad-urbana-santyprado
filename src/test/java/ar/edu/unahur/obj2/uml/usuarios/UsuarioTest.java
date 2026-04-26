package ar.edu.unahur.obj2.uml.usuarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UsuarioTest {
    @Test
    void nombreDelUsuario() {
        Usuario usuario = new Usuario("Santiago");
        assertEquals("Santiago", usuario.getNombre());
    }
}
