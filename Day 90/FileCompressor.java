package Day 90;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class FileCompressor {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "compressed.gz";

        try (FileInputStream fis = new FileInputStream(inputFile);
             GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream(outputFile))) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) {
                gzos.write(buffer, 0, length);
            }

            System.out.println("File compressed successfully: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
