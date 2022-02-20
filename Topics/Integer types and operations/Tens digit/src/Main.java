import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int base = 10;
        int number = scanner.nextInt();
        int result = ((number - number % base) / base) % base;

        System.out.println(result);
    }
}