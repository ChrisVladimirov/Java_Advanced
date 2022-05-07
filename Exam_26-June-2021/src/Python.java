import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Python {
    private enum Commands {
        UP(-1, 0),
        DOWN(+1, 0),
        LEFT(0, -1),
        RIGHT(0, +1);

        private final int x;
        private final int y;

        Commands(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int ROW;
    private static int COLUMN;
    private static int SNAKE_LENGTH;
    private static int FOOD_CAPACITY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int screen = Integer.parseInt(scanner.nextLine());
        List<String> commands = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());

        char[][] matrix = new char[screen][screen];
        for (int row = 0; row < matrix.length; row++) {
            String currentRow = scanner.nextLine().replace(" ", "");

            if (currentRow.contains("s")) {
                ROW = row;
                COLUMN = currentRow.indexOf("s");
            }

            for (int column = 0; column < currentRow.length(); column++) {
                if (currentRow.charAt(column) == 'f') {
                    FOOD_CAPACITY++;
                }
            }
            matrix[row] = currentRow.toCharArray();
        }

        boolean isDead = false;
        for (String command : commands) {
            switch (Commands.valueOf(command.toUpperCase())) {
                case LEFT:
                    isDead = move(matrix, ROW, COLUMN, Commands.LEFT);
                    break;
                case RIGHT:
                    isDead = move(matrix, ROW, COLUMN, Commands.RIGHT);
                    break;
                case UP:
                    isDead = move(matrix, ROW, COLUMN, Commands.UP);
                    break;
                case DOWN:
                    isDead = move(matrix, ROW, COLUMN, Commands.DOWN);
                    break;
            }

            if (isDead || FOOD_CAPACITY <= 0) {
                break;
            }

        }

        if (isDead) {
            System.out.println("You lose! Killed by an enemy!");
        } else if (FOOD_CAPACITY > 0) {
            System.out.printf("You lose! There is still %d food to be eaten.", FOOD_CAPACITY);
        } else {
            System.out.printf("You win! Final python length is %d", SNAKE_LENGTH);
        }
    }

    public static boolean move(char[][] matrix, int row, int column, Commands LEFT) {
        int newRow = isInBounds(row + LEFT.x, matrix.length);
        int newColumn = isInBounds(column + LEFT.y, matrix.length);

        if (matrix[newRow][newColumn] == 'f') {
            SNAKE_LENGTH++;
            FOOD_CAPACITY--;
        } else if (matrix[newRow][newColumn] == 'e') {
            return true;
        }

        matrix[newRow][newColumn] = 's';
        matrix[row][column] = '*';
        ROW = newRow;
        COLUMN = newColumn;

        return false;
    }

    public static int isInBounds(int index, int bounds) {
        if (index < 0) {
            index = bounds - 1;
        } else if (index >= bounds) {
            index = 0;
        }
        return index;
    }
}