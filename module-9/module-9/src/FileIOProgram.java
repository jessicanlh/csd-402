/**Jessica Long-Heinicke
 * Module 9
 * 2.16.25
 */

import java.io.*;
import java.util.*;

public class FileIOProgram {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        // Write or append random numbers
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
            for (int i = 0; i < 10; i++) {
                bw.write(random.nextInt(100) + " ");
            }
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read and display file contents
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("File contents: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}