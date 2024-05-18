import org.json.JSONObject;

public class Circuit {

    private int CircuitID;
    private String name;
    private String country;
    private String location;

    public Circuit(JSONObject json)
    {
        this.CircuitID= json.getInt("circuitID");
        this.name= json.getString("name");
        this.country= json.getString("country");
        this.location= json.getString("location");
    }

    public int getCircuitID() {
        return CircuitID;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Circuit{" +
                "CircuitID=" + CircuitID +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
