import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // check if contains <burg>
        String cityName = scanner.nextLine();
        String burg = "burg";
        final int lengthOfBurg = burg.length();
        boolean response = false;
        if (!cityName.isEmpty() && cityName.length() >= lengthOfBurg) {
            response = cityName.endsWith(burg);
        }
        System.out.println(response);
    }
}