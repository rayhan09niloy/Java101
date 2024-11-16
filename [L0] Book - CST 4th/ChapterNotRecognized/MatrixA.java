public class MatrixA {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        }; // Matrix A is 3x3; Length = 3

        int[][] matrixB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Matrix dimensions
        int numRowsA = matrixA.length;        // Rows in matrix A
        int numColsA = matrixA[0].length;     // Each row is itself an array, and the length of each row represents the number of columns in the matrix
        int numColsB = matrixB[0].length;     // Each row is itself an array, and the length of each row represents the number of columns in the matrix

        // Result matrix
        int[][] resultMatrix = new int[matrixA.length][matrixB[0].length];


        // Matrix multiplication
        for (int row = 0; row < numRowsA; row++) {
            for (int col = 0; col < numColsB; col++) {
                for (int k = 0; k < numColsA; k++) {
                    resultMatrix[row][col] += matrixA[row][k] * matrixB[k][col];
                }
            }
        }

        // Display the result
        for (int[] rowArray : resultMatrix) {
            for (int value : rowArray) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}