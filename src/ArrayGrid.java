public class ArrayGrid {
    public static void main(String[] args) {
        String [][] grid = new String[10][10];

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                System.out.printf("- ", grid[i][j]);
            }
            System.out.println();
        }

    }
}
