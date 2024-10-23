import java.io.*;

public class FileExceptionHandling {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Read content from input file with exception handling
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            StringBuilder content = new StringBuilder();
            String line;

            System.out.println("Reading from " + inputFile + ":");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Display the content
                content.append(line).append("\n");
            }

            // Try to write content to output file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                writer.write(content.toString());
                System.out.println("Writing to " + outputFile + " complete.");
            } catch (IOException e) {
                System.err.println("An I/O error occurred while writing to " + outputFile + ": " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found - " + inputFile);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
