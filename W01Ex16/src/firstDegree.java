import java.util.Scanner;
public class firstDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        float numBerA = scanner.nextFloat();
        System.out.println("Enter the number b: ");
        float numBerB = scanner.nextFloat();
        float x;
        if (numBerA == 0){
            System.out.println("Infinity");
        }
        else {
            x = - numBerB / numBerA;
            System.out.println("X = " + x);
        }

    }
}