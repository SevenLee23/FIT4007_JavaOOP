public class Main {
    public static void main(String[] args) {
        int sum= 0;
        for (int i = 0; i <= 100; i+= 7){
            sum += i;
        }
        System.out.println("Tổng các số là bội của 7 là: " + sum);
    }
}