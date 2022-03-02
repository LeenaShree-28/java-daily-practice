package arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // Multiplication of matrix
        
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] B = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        int r1 = A.length, c1 = A[0].length;
        int r2 = B.length, c2 = B[0].length;
        int[][] C = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
