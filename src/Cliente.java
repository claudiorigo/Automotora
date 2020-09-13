
public class Cliente {
    private String rut,nombre,correo;
    private int telefono;
    private char preferencial;
    private Automovil automovil;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String correo, int telefono, char preferencial, Automovil automovil) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        //this.preferencial = preferencial;
        this.setPreferencial(preferencial);
        this.automovil = automovil;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getPreferencial() {
        return preferencial;
    }

    public void setPreferencial(char preferencial) {
        if (preferencial == 'P' || preferencial == 'N') {
            this.preferencial = preferencial;
        } else {            
            System.out.println("Debe ingresar P o N");
        }
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

   
    public void imprimirCliente(){
        System.out.println("Nombre Cliente: " + this.nombre);
        System.out.println("Rut: " + this.rut);
        System.out.println("Correo: " + this.correo);
        System.out.println("Telefono " + this.telefono);
        System.out.println("Cliente Tipo: " + this.getPreferencial());
        System.out.println("Numero Chasis: " + this.automovil.getNumeroChasis());
        System.out.println("Kilometro " + this.automovil.getKilometro());
        System.out.println("Valor Vehiculo " + Math.round(this.automovil.getValor()));
        System.out.println("Cargo Fijo " + Math.round(this.automovil.getCargoFijo()));
        
    }
    
}
