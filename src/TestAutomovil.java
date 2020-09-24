
public class TestAutomovil {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil(17000, "LS3243", 3000000, 140000);
        Automovil auto2 = new Automovil(45000, "LY1212", 5500000, 150000);
        Cliente cliente0 = new Cliente();
        Cliente cliente1 = new Cliente("12111650", "Claudio Rigollet", "claudiorigo@gmail.com", 954225035, 25, 'P', auto2);
        cliente0.setEdad(13); //Cambiar edad - 0 a 4 bebe - 5 a 13 niño - 14 a 17 adolecente - 18 mayor de edad 
        System.out.println("_________________________________________");
        System.out.println("Edad cliente 0 es: " + cliente0.getEdad() + " años");
        System.out.println("_________________________________________");
        cliente0.segunEdadEres();
        System.out.println("_________________________________________");
        cliente1.imprimirCliente();
        cliente1.revisarEdad();
        System.out.println("------------------------------");
        System.out.println("Ciclos While, Do While, for");
        cliente1.mientras();
        cliente1.para();
        cliente1.repetir();
        cliente1.revisarEdad();
        
    }
}
