import java.util.Scanner;
public class sumEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int aNumber = scanner.nextInt();
        if (aNumber == 0){
            System.out.println("Zero");
        } else if (aNumber % 2 == 0 && aNumber != 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}