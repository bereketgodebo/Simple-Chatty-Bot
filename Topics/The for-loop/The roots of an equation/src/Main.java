import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        int coefA = scanner.nextInt();
        int coefB = scanner.nextInt();
        int coefC = scanner.nextInt();
        int coefD = scanner.nextInt();
        final int start = 0;
        final int end = 1000;
        final int numberOfCubicRoots = 3;
        int solutionCount = 0;
        
        for (int i = start; i <= end && solutionCount <= numberOfCubicRoots; i++) {
            int solution = coefA * (i * i * i) +
                    coefB * (i * i) +
                    coefC * i + coefD;
            if (solution == 0) {
                System.out.println(i);
                solutionCount++;
            }
        }
    }
}
