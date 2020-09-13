
public class Automovil {
    private int kilometro;
    private String numeroChasis;
    private double  valor, cargoFijo;

    public Automovil() {
    }

    public Automovil(int kilometro, String numeroChasis, double valor, double cargoFijo) {
        this.kilometro = kilometro;
        this.numeroChasis = numeroChasis;
        this.valor = valor;
        this.cargoFijo = cargoFijo;
    }

    public int getKilometro() {
        return kilometro;
    }

    public void setKilometro(int kilometro) {
        this.kilometro = kilometro;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCargoFijo() {
        return cargoFijo;
    }

    public void setCargoFijo(double cargoFijo) {
        this.cargoFijo = cargoFijo;
    }
    
    public void imprimirAuto(){
        System.out.println("Kilometros " + this.kilometro);
        System.out.println("Nro Chasis " + this.numeroChasis);
        System.out.println("Cargo Fijo " + Math.round(this.cargoFijo));
        System.out.println("Valor " + Math.round(this.valor));
    }
    
    
}
