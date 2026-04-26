package ar.edu.unahur.obj2.uml.alquileres;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.uml.usuarios.Usuario;
import vehiculos.Bicicleta;

public class AlquilerTest {
    Usuario usuario;
    Bicicleta bicicleta;
    @BeforeEach
    void setUp(){
        usuario= new Usuario("Santiago");
        bicicleta = new Bicicleta(29);
    }
    @Test
    void queUnVehiculoNoEsteAlquiladoAlCrearse() {
        assertFalse(bicicleta.estaAlquilado());
    }

    @Test
    void registrarAlquilerMarcaComoAlquiladoUnvehiculo() {
        Alquiler alquiler = new Alquiler(usuario, bicicleta);
        alquiler.registrarAlquiler();
        assertTrue(bicicleta.estaAlquilado());
        assertNotNull(alquiler.getFechaInicio());

    }
    
    @Test
    void finalizarAlquilerMarcaVehiculoComoDisponible() {
        Alquiler alquiler = new Alquiler(usuario, bicicleta);
        alquiler.finalizarAlquier();
        assertFalse(bicicleta.estaAlquilado());
        assertNotNull(alquiler.getFechaFinalizacion());
    }
    
    @Test
    void noSePuedeAlquilarUnVehiculoYaAlquilado() {
        Alquiler alquiler1 = new Alquiler(usuario, bicicleta);
        alquiler1.registrarAlquiler();
        Alquiler alquiler2= new Alquiler(usuario, bicicleta);
        assertThrows(RuntimeException.class, alquiler2::registrarAlquiler);
    }

    @Test
     void getUsuarioYGetVehiculo() {
        Alquiler alquiler = new Alquiler(usuario, bicicleta);
        assertEquals(usuario, alquiler.getUsuario());
        assertEquals(bicicleta, alquiler.getVehiculo());
    }

    
}
