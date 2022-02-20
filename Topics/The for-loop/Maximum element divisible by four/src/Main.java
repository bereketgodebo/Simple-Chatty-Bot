import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberOfElements = scanner.nextInt();
        final int divisibleBy = 4;
        int max = 0;

        for (int i = 0; i < numberOfElements; i++) {
            int currentElement = scanner.nextInt();
            if (currentElement % divisibleBy == 0 && currentElement > max) {
                max = currentElement;
            }
        }
        System.out.println(max);
    }
}