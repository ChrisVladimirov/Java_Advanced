package Exercises.TheEnd;

import java.util.Scanner;

public class ОтКолежка {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double enemyPoints = 3000000.0;
        int playerPoints = 18500;

        int startPlayerRow = 7;
        int startPlayerColumn = 7;

        String lastSpell = "";
        boolean activeCloud = false;

        double damage = Double.parseDouble(scanner.nextLine());

        while (playerPoints > 0 && enemyPoints > 0) {
            enemyPoints -= damage;

            if (activeCloud) {
                playerPoints -= 3500;
                activeCloud = false;

                if (playerPoints < 0) {
                    break;
                }
            }

            if (enemyPoints < 0) {
                break;
            }

            String[] tokens = scanner.nextLine().split("\\s+");

            String spell = tokens[0];
            int row = Integer.parseInt(tokens[1]);
            int column = Integer.parseInt(tokens[2]);

            boolean[][] chamber = new boolean[15][15];
            for (int i = row - 1; i <= row + 1; i++) {
                if (i >= 0 && i < chamber.length) {
                    for (int j = column - 1; j <= column + 1; j++) {
                        if (j >= 0 && j < chamber[row].length) {
                            chamber[i][j] = true;
                        }
                    }
                }
            }

            if (chamber[startPlayerRow][startPlayerColumn]) {
                if (isRowWithinBounds(chamber, startPlayerRow - 1) && !chamber[startPlayerRow - 1][startPlayerColumn]) {
                    startPlayerRow--; // move up
                } else if (isColumnWithinBounds(chamber, startPlayerColumn + 1) && !chamber[startPlayerRow][startPlayerColumn + 1]) {
                    startPlayerColumn++; // move right
                } else if (isRowWithinBounds(chamber, startPlayerRow + 1) && !chamber[startPlayerRow + 1][startPlayerColumn]) {
                    startPlayerRow++; // move down
                } else if (isColumnWithinBounds(chamber, startPlayerColumn - 1) && !chamber[startPlayerRow][startPlayerColumn - 1]) {
                    startPlayerColumn--; // move left
                }

                if (chamber[startPlayerRow][startPlayerColumn]) {
                    switch (spell) {
                        case "Cloud":
                            playerPoints -= 3500;
                            activeCloud = true;
                            lastSpell = "Plague Cloud";
                            break;
                        case "Eruption":
                            playerPoints -= 6000;
                            lastSpell = spell;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid spell: " + spell);
                    }
                }
            }
        }

        if (enemyPoints > 0) {
            System.out.printf("Heigan: %.2f%n", enemyPoints);
        } else {
            System.out.println("Heigan: Defeated!");
        }
        if (playerPoints > 0) {
            System.out.printf("Player: %d%n", playerPoints);
        } else {
            System.out.println("Player: Killed by " + lastSpell);
        }

        System.out.println("Final position: " + startPlayerRow + ", " + startPlayerColumn);
    }

    private static boolean isRowWithinBounds(boolean[][] chamber, int startPlayerRow) {
        return startPlayerRow >= 0 && startPlayerRow < chamber[startPlayerRow].length;
    }

    private static boolean isColumnWithinBounds(boolean[][] chamber, int startPlayerColumn) {
        return startPlayerColumn >= 0 && startPlayerColumn < chamber.length;
    }
}