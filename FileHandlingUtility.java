import java.io.*;
import java.util.Scanner;

/**
 * FileHandlingUtility - A simple Java program to handle file operations.
 * Allows users to write, read, and append content to a file using a menu-driven system.
 */
public class FileHandlingUtility {

    // Default filename where data will be stored
    private static final String FILE_NAME = "file_data.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to keep showing the menu until the user exits
        while (true) {
            System.out.println("\n=== FILE HANDLING UTILITY ===");
            System.out.println("1. Write to File (Overwrite)");
            System.out.println("2. Read from File");
            System.out.println("3. Modify (Append to) File");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Taking user input and checking for invalid cases
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1-4.");
                continue;
            }

            // Switch case to handle different operations
            switch (choice) {
                case 1:
                    System.out.print("Enter text to write (this will overwrite existing content): ");
                    String writeText = scanner.nextLine();
                    writeToFile(FILE_NAME, writeText);
                    break;

                case 2:
                    readFromFile(FILE_NAME);
                    break;

                case 3:
                    System.out.print("Enter text to append: ");
                    String appendText = scanner.nextLine();
                    modifyFile(FILE_NAME, appendText);
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return; // Exit the program

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }

    /* Writes content to a file. If the file exists, it overwrites the existing content. */

    public static void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content); // Overwrites existing file content
            System.out.println("✅ File written successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    /* Reads and displays the content of a file. */
    public static void readFromFile(String filename) {
        File file = new File(filename);

        // Check if the file exists before attempting to read
        if (!file.exists()) {
            System.out.println("⚠ File not found! Write something to the file first.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\n=== File Content ===");
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line from the file
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }

    /*Appends content to an existing file without deleting previous content.*/
    public static void modifyFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.newLine(); // Move to the next line before writing new content
            writer.write(content);
            System.out.println("✅ Text appended successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error modifying file: " + e.getMessage());
        }
    }
}
