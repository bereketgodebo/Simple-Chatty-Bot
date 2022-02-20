import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reads 8 words and prints them
        String jane = scanner.next();
        String kate = scanner.next();
        String john = scanner.next();
        String mary = scanner.next();
        String susan = scanner.next();
        String paul = scanner.next();
        String boris = scanner.next();
        String ann = scanner.next();

        System.out.println(
                ann + "\n" + boris + "\n" + paul + "\n"
                        + susan + "\n" + mary + "\n" + john + "\n"
                        + kate + "\n" + jane);

    }
}