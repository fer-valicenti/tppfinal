import org.json.JSONObject;

public class Circuit {

    private int circuit_key;
    private String circuit_short_name;
    private String country_code;
    private int country_key;
    private String country_name;
    private String date_start;
    private String gmt_offset;
    private String location;
    private int meeting_key;
    private String meeting_name;
    private String meeting_official_name;
    private int year;


    public Circuit(JSONObject json)
    {
        this.circuit_key = json.getInt("");
        this.circuit_short_name = json.getString("");
        this.country_code = json.getString("");
        this.country_key = json.getInt("");
        this.country_name = json.getString("");
        this.date_start = json.getString("");
        this.gmt_offset = json.getString("");
        this.location = json.getString("");
        this.meeting_key = json.getInt("");
        this.meeting_name = json.getString("");
        this.meeting_official_name = json.getString("");
        this.year = json.getInt("");
    }

    public int getCircuit_key() {
        return circuit_key;
    }

    public String getCircuit_short_name() {
        return circuit_short_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public int getCountry_key() {
        return country_key;
    }

    public String getCountry_name() {
        return country_name;
    }

    public String getDate_start() {
        return date_start;
    }

    public String getGmt_offset() {
        return gmt_offset;
    }

    public String getLocation() {
        return location;
    }

    public int getMeeting_key() {
        return meeting_key;
    }

    public String getMeeting_name() {
        return meeting_name;
    }

    public String getMeeting_official_name() {
        return meeting_official_name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return circuit_short_name;
    }
}
