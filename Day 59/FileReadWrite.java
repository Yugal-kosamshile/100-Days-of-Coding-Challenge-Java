
import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Read content from input file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            StringBuilder content = new StringBuilder();
            String line;

            System.out.println("Reading from " + inputFile + ":");
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Display the content
                content.append(line).append("\n");
            }

            // Write content to output file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                writer.write(content.toString());
                System.out.println("\nWriting to " + outputFile + " complete.");
            }

        } catch (IOException e) {
            System.err.println("An error occurred while reading or writing files: " + e.getMessage());
        }
    }
}
