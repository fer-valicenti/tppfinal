import org.json.JSONObject;

public class Driver {

    //atributos
    private int driverID;
    private String code;
    private String nombre;
    private String pais;
    private String dob;
    private String equipo;
    private int numero;
    private int puntos;

    public Driver(JSONObject json)
    {
        this.driverID = json.getInt("DriverId");
        this.code = json.getString("Code");
        this.nombre = json.getString("nombre");
        this.pais = json.getString("pais");
        this.dob = json.getString("dob");
        this.equipo = json.getString("equipo");
        this.numero = json.getInt("numero");
        this.puntos = json.getInt("puntos");
    }

    public int getDriverID() {
        return driverID;
    }

    public String getCode() {
        return code;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getDob() {
        return dob;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getNumero() {
        return numero;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverID=" + driverID +
                ", code='" + code + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", dob='" + dob + '\'' +
                ", equipo='" + equipo + '\'' +
                ", numero=" + numero +
                ", puntos=" + puntos +
                '}';
    }

}
