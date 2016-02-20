package ross.goncharuk;

public class Main {
    static public void main(String[] args) {

        int[][] m = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 3; y++) {
                System.out.print(m[y][x] + " ");
            }
            System.out.println();
        }
    }
}
