import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Driver> drivers= OpenF1Client.obtenerDriversDesdeAPI();
        List<Circuit> circuits= OpenF1Client.obtenerCircuitosDesdeAPI();
        F1JuegoGUI juegoGUI = new F1JuegoGUI(drivers, circuits);


    }
}