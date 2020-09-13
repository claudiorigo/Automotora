
public class TestAutomovil {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil(17000, "LS3243", 3000000, 140000);
        Automovil auto2 = new Automovil(45000, "LY1212", 5500000, 150000);
        
        Cliente cliente1 = new Cliente("12111650", "Claudio Rigollet", "claudiorigo@gmail.com", 954225035, 'R', auto2);
        
        
        
        cliente1.imprimirCliente();
        
        
    }
}
