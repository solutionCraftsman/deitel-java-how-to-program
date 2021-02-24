package fifteen;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

    private static Formatter output;

    public static void main(String[] args) {
        openFile("/home/ayodele/Semicolon Africa/Pentax.txt");
        addRecords();
        closeFile();
    }

    public static void openFile(String filePath) {

        try {
            output = new Formatter(filePath);
        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }

    // add records to file
    public static void addRecords()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");

        while (input.hasNext()) {// loop until end-of-file indicator
            try {
                // output new record to file; assumes valid input
                output.format("%d %s %s %.2f%n", input.nextInt(),
                input.next(), input.next(), input.nextDouble());
            }
            catch (FormatterClosedException formatterClosedException)
            {
                System.err.println("Error writing to file. Terminating.");
                break;
            }
            catch (NoSuchElementException elementException)
            {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            }
                System.out.print("? ");
            } // end while
        } // end method addRecords

        // close file
        public static void closeFile() {
            if (output != null) {
                output.close();
            }
        }
} // end class CreateTextFile

