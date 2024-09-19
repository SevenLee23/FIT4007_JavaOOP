import java.util.Scanner; // Import the Scanner class
public class SampleClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner instance
        System.out.println("Enter a number: ");
        int aNumber = scanner.nextInt(); // Read user input
        int sum = (aNumber+1)*aNumber/2;
        System.out.println("Sum=  " + sum);
    }
}