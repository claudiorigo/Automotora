import java.util.Scanner;

public class Cliente {
    private String rut,nombre,correo;
    private int telefono, edad;
    private char preferencial;
    private Automovil automovil;
    private Scanner leer = new Scanner(System.in);
    
    //Constructor sin parametros
    public Cliente() {
    }
    //Constructor con parametros
    public Cliente(String rut, String nombre, String correo, int telefono, int edad, char preferencial, Automovil automovil) {
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
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
        
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
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
        System.out.println("Nombre Cliente: " + this.getNombre());
        System.out.println("Rut: " + this.getRut());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Correo: " + this.getCorreo());
        System.out.println("Telefono " + this.getTelefono());
        System.out.println("Cliente Tipo: " + this.getPreferencial());
        System.out.println("Numero Chasis: " + this.automovil.getNumeroChasis());
        System.out.println("Kilometro " + this.automovil.getKilometro());
        System.out.println("Valor Vehiculo " + Math.round(this.automovil.getValor()));
        System.out.println("Cargo Fijo " + Math.round(this.automovil.getCargoFijo()));
        System.out.println("-----------------------------------------------------------");
    }
    //Usar condiciones, los IF  ElSE
    public void revisarEdad(){
        //if + tab  ó  ifelse + tab
        if (this.edad >18 ) {
            System.out.println("Es mayor de edad - Usando el IF/ELSE");
            
        } else {
            System.out.println("No es mayor de edad - Usando el IF/ELSE");
        }
    }
    //Usando condiciones, IF  ELSE anidados Switch
    public void segunEdadEres(){
        if (this.edad >= 18) {
            System.out.println("Es mayor de edad - usando switch");
        }else{
            if (this.getEdad() > 0 && this.edad <= 4) {
                System.out.println("Eres un bebe - usando switch");
            }else{
                if (this.getEdad() >= 5 && this.edad <= 13) {
                    System.out.println("Eres un niño - usando switch");
                }else{
                    System.out.println("Eres Adolecente - usando switch");
                }
            }
        }
    }
    //CICLOS WHILE - DO WHILE - FOR
    //While
    public void mientras(){
        //wh + tab
        while (edad >= 18) {
            System.out.println("Es mayor de edad");
            System.out.println("Ingrese su edad → ");
            edad = leer.nextInt();
        }        
        System.out.println("Gracias Saliste del While");
        System.out.println("------------------------------");
    }
    //for
    public void para(){
        //for + tab
        int hasta;
        System.out.println("Ingresa el fin del for: → ");
        hasta = leer.nextInt();
        for (int i = 0; i < hasta; i++) {
            System.out.println("→ " + i);
        }
        System.out.println("Gracias fin del for");
        System.out.println("------------------------------");
    }
    //Do While
    public void repetir(){
        //dowhile + tab
        int opcion;
        do {            
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.println("Ingrese Opción: → ");
            opcion = leer.nextInt();
            
        } while (opcion != 3);
    } 
    
}
