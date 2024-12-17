package Day 91;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class FileDecompressor {
    public static void main(String[] args) {
        String compressedFile = "compressed.gz";
        String outputFile = "output.txt";

        try (GZIPInputStream gzis = new GZIPInputStream(new FileInputStream(compressedFile));
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = gzis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("File decompressed successfully: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
