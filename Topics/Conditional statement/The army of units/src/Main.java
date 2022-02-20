import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prints Army of Units
        int armyUnits = scanner.nextInt();
        final int noArmyUpperLimit = 1;
        final int packUpperLimit = 20;
        final int throngUpperLimit = 250;
        final int zoundsUpperLimit = 1000;
        String resultingCategory = null;
        
        // 
        if (armyUnits < noArmyUpperLimit) {
            resultingCategory = "no army";
        } else if (armyUnits < packUpperLimit) {
            resultingCategory = "pack";
        } else if (armyUnits < throngUpperLimit) {
            resultingCategory = "throng";
        } else if (armyUnits < zoundsUpperLimit) {
            resultingCategory = "zounds";
        } else {
            resultingCategory = "legion";
        }
        
        System.out.println(resultingCategory);
        
    }
}
