package vehiculos;

public abstract class Vehiculo {
    private Boolean estaAlquilado;

    public Vehiculo(Boolean estaAlquilado){
        this.estaAlquilado = estaAlquilado; 
    }

    public void marcarComoAlquilado(){
        this.estaAlquilado = true;
    }

    public void marcarComoDisponible(){
        this.estaAlquilado = false;
    }

    public Boolean estaAlquilado(){
        return this.estaAlquilado;
    }
}


