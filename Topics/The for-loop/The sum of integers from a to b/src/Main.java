import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Sum of integers
        int inputStart = scanner.nextInt();
        int inputEnd = scanner.nextInt();
        int accumulator = 0;

        for (int i = inputStart; i <= inputEnd; i++) {
            accumulator += i;
        }
        System.out.println(accumulator);
    }
}