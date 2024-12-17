import java.net.HttpURLConnection;
import java.net.URL;

public class HttpResponseCodes {
    public static void main(String[] args) {
        try {
            // Specify the URL
            String url = "https://jsonplaceholder.typicode.com/posts/9999"; // Non-existing resource
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

            // Set request method
            connection.setRequestMethod("GET");

            // Get response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Handle response
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("Success: The request was successful.");
            } else if (responseCode == HttpURLConnection.HTTP_NOT_FOUND) {
                System.out.println("Error: Resource not found.");
            } else {
                System.out.println("Error: HTTP response code " + responseCode);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
