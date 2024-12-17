public class HttpRequestResponse {
    public static void main(String[] args) {
        String httpRequest = 
            "GET /index.html HTTP/1.1\r\n" +
            "Host: localhost\r\n" +
            "User-Agent: Java-Client\r\n\r\n";

        System.out.println("--- HTTP Request ---");
        System.out.println(httpRequest);

        String[] requestLines = httpRequest.split("\r\n");
        String[] requestLine = requestLines[0].split(" ");
        String method = requestLine[0];
        String path = requestLine[1];

        String host = "";
        for (String line : requestLines) {
            if (line.startsWith("Host:")) {
                host = line.split(": ")[1];
            }
        }

        System.out.println("\n--- Parsed Request ---");
        System.out.println("Method: " + method);
        System.out.println("Path: " + path);
        System.out.println("Host: " + host);

        String httpResponse = 
            "HTTP/1.1 200 OK\r\n" +
            "Content-Type: text/html\r\n\r\n" +
            "Response Body: <h1>Hello, HTTP!</h1>";

        System.out.println("\n--- HTTP Response ---");
        System.out.println(httpResponse);
    }
}
