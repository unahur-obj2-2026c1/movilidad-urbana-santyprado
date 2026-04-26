package ar.edu.unahur.obj2.uml.alquileres;
import java.time.LocalDateTime;
import ar.edu.unahur.obj2.uml.usuarios.*;
import vehiculos.*;
public class Alquiler {
    private Usuario usuario;
    private Vehiculo vehiculo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinalizacion;

    public Alquiler(Usuario usuario, Vehiculo vehiculo){
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        
    }
    public void registrarAlquiler(){
        if (vehiculo.estaAlquilado()) {
            throw new RuntimeException("El vehiculo no esta disponible para alquiler");
        }else{
            vehiculo.marcarComoAlquilado();
            this.fechaInicio=LocalDateTime.now();
        }
    }
    public void finalizarAlquier() {
        this.fechaFinalizacion = LocalDateTime.now();
        vehiculo.marcarComoDisponible();
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }
    public LocalDateTime getFechaFinalizacion() {
        return fechaFinalizacion;
    }


}
