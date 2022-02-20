import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // checks if starts with J or j
        String prefix = scanner.nextLine();
        boolean response = false;
        if (!prefix.isEmpty()) {
            char firstChar = prefix.charAt(0);
            response = firstChar == 'J' || firstChar == 'j';
        }
        System.out.println(response);

    }
}