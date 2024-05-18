import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Random;

public class F1JuegoGUI extends JFrame {

    private JComboBox<Driver> driverComboBox;
    private JComboBox<Circuit> circuitComboBox;
    private JButton startButton;
    private List<Driver> driverList;
    private List<Circuit> circuitList;

    public F1JuegoGUI(List<Driver> driverList, List<Circuit> circuitList)
    {
        this.driverList=driverList;
        this.circuitList=circuitList;

        setTitle("F1 GAME");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel driverLabel = new JLabel("Seleccione su piloto: ");
        driverLabel.setBounds(20, 20, 100, 25);
        add(driverLabel);

        driverComboBox = new JComboBox<>(driverList.toArray(new Driver[0]));
        driverComboBox.setBounds(120, 20, 200, 25);

        JLabel circuitLabel = new JLabel("Seleccione el circuito: ");
        circuitLabel.setBounds(20, 60, 100, 25);
        add(circuitLabel);

        circuitComboBox = new JComboBox<>(circuitList.toArray(new Circuit[0]));
        circuitComboBox.setBounds(120, 60, 200, 25);
        add(circuitComboBox);

        startButton = new JButton("Empezar la Carrera");
        startButton.setBounds(120, 100, 150, 30);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Driver seleccionarDriver = (Driver) driverComboBox.getSelectedItem();
                Circuit seleccionarCircuit = (Circuit) circuitComboBox.getSelectedItem();
                empezarCarrera(seleccionarDriver, seleccionarCircuit);
            }
        });
        add(startButton);
        setVisible(true);
    }

    private String empezarCarrera(Driver driver, Circuit circuit)
    {
        Random random = new Random();

        int totalLaps = 60; //numero total de vueltas en la carrera
        int[] posiciones = new int[driverList.size()]; // almacena las posisiones de los pilotos
        int[] tiemposDeVuelta = new int[driverList.size()]; //almacena los tiempos de vuelta d los pilotos

        for(int vuelta = 1; vuelta <= totalLaps; vuelta++)
        {
            for(int i=0; i < driverList.size(); i++)
            {
                if(random.nextDouble() < calcularOvertake(driverList.get(i))) //si el piloto tiene exito en superar a otro
                {
                    int nuevaPosicion = Math.max(0, posiciones[i] - 1); //mover hacia adelante en la pista
                    posiciones[i] = nuevaPosicion;
                }

                tiemposDeVuelta[i] += calcularTiempoDeVuelta(driverList.get(i), circuit);
            }
        }
        return "Empezaste la carrera con el piloto: " + driver.getNombre() + "En el circuito: " + circuit.getName();
    }

    private double calcularOvertake(Driver driver)
    {
        return 0.5;
    }

    private int calcularTiempoDeVuelta(Driver driver, Circuit circuit)
    {
        Random random = new Random();
        int tiempoMinimo=60;
        int tiempoMaximo=120;
        return tiempoMinimo + random.nextInt(tiempoMaximo - tiempoMinimo +1);
    }

}
