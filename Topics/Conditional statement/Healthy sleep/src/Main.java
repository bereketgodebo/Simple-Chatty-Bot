import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Check Healthy Sleeping Hours
        int minHours = scanner.nextInt();
        int maxHours = scanner.nextInt();
        int userHours = scanner.nextInt();
        String result = "";
        
        if (userHours < minHours) {
            result = "Deficiency";
        } else if (userHours <= maxHours) { 
            result = "Normal";
        } else {
            result = "Excess";
        }
        
        System.out.println(result);
    }
}
