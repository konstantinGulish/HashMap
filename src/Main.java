import java.util. HashMap;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	// Create a hashmap to store integers and string
        HashMap<Integer, String> myMap = new HashMap<>();

    // Create a scanner object
        Scanner in = new Scanner(System.in);

    // Create a variable to store user's input
        int userInput;

    // Create a variable for storing the file
        try {
            File file = new File("src//hashmap.txt");
            Scanner scannerInput = new Scanner(file);
            while (scannerInput.hasNextLine()) {
                int key = scannerInput.nextInt ();
                String value = scannerInput.nextLine();
                myMap.put(key,value);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Enter a number: ");
        userInput = in.nextInt();
        if (myMap.containsKey(userInput)) {
            System.out.println(myMap.get(userInput).trim());
        }
        else {
            System.out.println("The following number is not in the list.");
            System.out.println("Please enter the name of the number to add it" +
                               "to the list. Name: ");
            int key = userInput;
            in.nextLine();
            String value = in.nextLine();
            myMap.put(key, value);

        }
    }
}
