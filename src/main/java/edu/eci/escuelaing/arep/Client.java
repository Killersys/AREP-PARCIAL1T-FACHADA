package edu.eci.escuelaing.arep;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.escuelaing.arep.components.HttpRequest;

public class Client {
    public static void main(String[] args) {
        HttpResponse<String> response = null;
        try {
            response = Unirest.get("https://fachadacalculadora-arept1.herokuapp.com/API/calculator?operation=sin&number=0")
                    .asString();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        System.out.println(response.getBody());
    }
}
