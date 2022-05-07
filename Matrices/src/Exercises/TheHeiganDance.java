/*
package Exercises;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] chamber = new int[15][15];
        int playerHealth = 18_500;
        double playerDamage = Double.parseDouble(scanner.nextLine());
        int playerRow = 7;
        int playerColumn = 7;

        //boss
        double bossHealth = 3_000_000;
        String previousSpell = "";
        String currentSpell = "";

        while (playerHealth > 0 && bossHealth > 0) {
            bossHealth -= playerDamage;
            if (bossHealth <= 0) {
                if (chamber[playerRow][playerColumn] > 0) {
                    playerHealth -= 3500;
                }
                continue;
            }
            String[] input = scanner.nextLine().split("\\s+");
            currentSpell = input[0];
            int rowHit = Integer.parseInt(input[1]);
            int columnHit = Integer.parseInt(input[2]);

            if ("Cloud".equals(currentSpell)) {
                if (chamber[playerRow][playerColumn] > 0) {
                    playerHealth -= 3500;
                    if (playerHealth < 0) {
                        currentSpell = previousSpell;
                        continue;
                    }
                }
                if ("Cloud".equals(previousSpell)){

                }

            } else if ("Eruption")
        }
    }
}
*/
