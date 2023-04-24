import java.util.Scanner; // Import the Scanner class
class InputScanner {
        public static void main(String[] args) {
            Scanner data = new Scanner(System.in); // Create a Scanner object
            System.out.print("Enter username :");
            String userName = data.nextLine(); //Red user input
            System.out.println("Username adalah: " + userName); // Output user input
         }
     }
