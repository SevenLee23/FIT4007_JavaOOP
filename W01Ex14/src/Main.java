import java.util.Scanner; // Import the Scanner class
public class sumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner instance
        System.out.println("Enter the number: ");
        int aNumber = scanner.nextInt();
        int sum;
        int count;
        if (aNumber % 2 == 0){
            count = (aNumber - 2)/2 +1;
            sum = (aNumber +2) * count / 2;
            System.out.println("Even sum: " + sum);
        }
        else {
            count = (aNumber - 1)/2 +1;
            sum = (aNumber +1) * count / 2;
            System.out.println("Odd sum: " + sum);
        }
    }
}