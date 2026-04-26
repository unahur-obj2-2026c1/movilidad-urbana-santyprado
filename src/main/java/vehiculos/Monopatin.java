package vehiculos;

public class Monopatin extends Vehiculo{
    private String marca;

    public Monopatin(String marca){
        super(false);
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }
}
