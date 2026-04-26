package vehiculos;

public class Bicicleta extends Vehiculo {
    private Integer rodado;

    public Bicicleta(Integer rodado){
        super(false);
        this.rodado= rodado;
    }

    public Integer getRodado(){
        return rodado;
    }

    
}
