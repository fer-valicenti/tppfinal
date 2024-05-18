import org.json.JSONObject;

import javax.swing.*;
import java.net.URL;

public class Driver {

    //atributos
    private String broadcast_name;
    private String country_code;
    private int driver_number;
    private String first_name;
    private String full_name;
    private String headshot_url;
    private String last_name;
    private int meeting_key;
    private String name_acronym;
    private int session_key;
    private String team_colour;
    private String team_name;


    public Driver(JSONObject json)
    {
        this.broadcast_name = json.getString("BroadcastName");
        this.country_code = json.getString("CountryCode");
        this.driver_number = json.getInt("DriverNumber");
        this.first_name = json.getString("FirstName");
        this.full_name = json.getString("FullName");
        this.headshot_url = json.getString("HeadshotURL");
        this.last_name = json.getString("LastName");
        this.meeting_key = json.getInt("MeetingKey");
        this.name_acronym = json.getString("NameAcronym");
        this.session_key = json.getInt("SessionKey");
        this.team_colour = json.getString("TeamColour");
        this.team_name = json.getString("TeamName");
    }

    public String getBroadcast_name() {
        return broadcast_name;
    }

    public String getCountry_code() {
        return country_code;
    }

    public int getDriver_number() {
        return driver_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getHeadshot_url() {
        return headshot_url;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getMeeting_key() {
        return meeting_key;
    }

    public String getName_acronym() {
        return name_acronym;
    }

    public int getSession_key() {
        return session_key;
    }

    public String getTeam_colour() {
        return team_colour;
    }

    public String getTeam_name() {
        return team_name;
    }

    public ImageIcon getImage(){

        try {
            URL url = new URL(headshot_url);
            return new ImageIcon(url);
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return full_name;
    }
}
