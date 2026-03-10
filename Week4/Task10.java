package Week4;

import java.util.*;

public class Task10 {

    static void matrixRotation(int[][] matrix, int r) {
        int m = matrix.length, n = matrix[0].length;
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            // Extract the ring into a list
            List<Integer> ring = new ArrayList<>();

            int top = layer, bottom = m - 1 - layer;
            int left = layer, right = n - 1 - layer;

            // Top row: left to right
            for (int col = left; col < right; col++)
                ring.add(matrix[top][col]);
            // Right col: top to bottom
            for (int row = top; row < bottom; row++)
                ring.add(matrix[row][right]);
            // Bottom row: right to left
            for (int col = right; col > left; col--)
                ring.add(matrix[bottom][col]);
            // Left col: bottom to top
            for (int row = bottom; row > top; row--)
                ring.add(matrix[row][left]);

            int size = ring.size();
            int shift = r % size;

            // Put back with anti-clockwise rotation (shift left)
            int idx = shift;

            for (int col = left; col < right; col++)
                matrix[top][col] = ring.get(idx++ % size);
            for (int row = top; row < bottom; row++)
                matrix[row][right] = ring.get(idx++ % size);
            for (int col = right; col > left; col--)
                matrix[bottom][col] = ring.get(idx++ % size);
            for (int row = bottom; row > top; row--)
                matrix[row][left] = ring.get(idx++ % size);
        }

        // Print result
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                if (j > 0)
                    sb.append(' ');
                sb.append(row[j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), r = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        matrixRotation(matrix, r);
    }
}
