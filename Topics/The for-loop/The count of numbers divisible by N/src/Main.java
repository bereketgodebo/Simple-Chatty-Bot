import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int divisibleBy = scanner.nextInt();
        int countOfNumbers = 0;

        for (int i = start; i <= end; i++) {
            if (i % divisibleBy == 0) {
                countOfNumbers++;
            }
        }
        System.out.println(countOfNumbers);


    }
}