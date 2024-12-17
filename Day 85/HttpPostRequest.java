package Day 85;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
public class HttpPostRequest {
    public static void main(String[] args) {
        try {
            // Specify the URL for the POST request
            String url = "https://jsonplaceholder.typicode.com/posts";
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

            // Set request method and headers
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            // JSON data to send
            String jsonInputString = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

            // Send request body
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Get response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read and display response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("Response: " + response.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

