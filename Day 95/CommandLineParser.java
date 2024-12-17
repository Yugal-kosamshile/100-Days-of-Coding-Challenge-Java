package Day 95;

public class CommandLineParser {
    public static void main(String[] args) {
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("Usage: java CommandLineParser <key>=<value> ...");
            return;
        }

        System.out.println("Parsed Command-Line Arguments:");

        for (String arg : args) {
            // Split key and value
            if (arg.contains("=")) {
                String[] parts = arg.split("=", 2);
                System.out.println("Key: " + parts[0] + ", Value: " + parts[1]);
            } else {
                System.out.println("Invalid argument format: " + arg);
            }
        }
    }
}
