package uk.ac.bbk.dcs.pij.d18;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class PostcodeClient {

    private static final int HTTP_OK = 200;

    // Exercises 1.1 to 1.6
    public static void retrieveOnePostcode()
            throws URISyntaxException, IOException, InterruptedException {
        HttpRequest getRequest = HttpRequest.newBuilder()
//                .uri(new URI("https://api.postcodes.io/postcodes/WC1E 7HX"))
                .uri(new URI("https", "//api.postcodes.io/postcodes/WC1E 7HX", null))
//                .uri(new URI("https", "//api.postcodes.io/postcodes/notAPostcode", null))
                .GET()
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(getRequest, BodyHandlers.ofString());
        int statusCode = response.statusCode();
        if (statusCode != HTTP_OK) {
            System.out.println("Response: unsuccesful. Status code: " + statusCode);
            return;
        }
        System.out.println("Response: success!");
        System.out.println(response.body());

        Gson gson = new Gson();
        PostcodeResponse postcodeResponse = gson.fromJson(response.body(), PostcodeResponse.class);

        System.out.println(postcodeResponse);
    }

    // Exercise 1.7
    public static void retrieveManyPostcodes()
            throws URISyntaxException, IOException, InterruptedException {
        Gson gson = new Gson();
        String[] myPostcodes = { "SW1A 0AA", "EH99 1SP", "CF99 1SN", "BT4 3XX", "WC1E 7HX"};
        ManyPostcodesQueryData data = new ManyPostcodesQueryData(myPostcodes);
        String jsonData = gson.toJson(data);
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https", "//api.postcodes.io/postcodes/", null))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonData))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(getRequest, BodyHandlers.ofString());
        int statusCode = response.statusCode();
        if (statusCode != HTTP_OK) {
            System.out.println("Response: unsuccesful. Status code: " + statusCode);
            return;
        }
        System.out.println("Response: success!");
        System.out.println(response.body());

        // The following lines still need to be changed for the different result format
        // of this POST request, and suitable classes need to be created.
        //PostcodeResponse postcodeResponse = gson.fromJson(response.body(), PostcodeResponse.class);

        //System.out.println(postcodeResponse);
    }

    public static void main(String[] args)
            throws URISyntaxException, IOException, InterruptedException {
        retrieveOnePostcode();
        Thread.sleep(1000); // let some time pass between the two API calls
        retrieveManyPostcodes();
    }
}
