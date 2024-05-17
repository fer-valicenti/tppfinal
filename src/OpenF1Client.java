import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpenF1Client {


    public static void main(String[] args){

        try {
            //solicitamos peticion
            URL url = new URL("https://openf1.org/api/drivers");
            HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();

            //comprobacion de peticion
            int respuesta = conexion.getResponseCode();
            if(respuesta != HttpURLConnection.HTTP_OK)
            {
                throw new RuntimeException("Error: " + respuesta);
            } else {

                //Abrir escaner para leer los datos
                StringBuilder informacion = new StringBuilder();
                Scanner entrada = new Scanner(conexion.getInputStream());

                while (entrada.hasNext())
                {
                    informacion.append(entrada.nextLine());
                }
                entrada.close();

                //Convertir la respuesta JSON en objetos

                JSONArray jsonArray = new JSONArray(informacion.toString());
                List<Driver> drivers = new ArrayList<>();

                for(int i = 0; i < jsonArray.length(); i++)
                {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    Driver driver = new Driver(jsonObject);
                    drivers.add(driver);
                }
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
