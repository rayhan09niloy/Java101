public class MatrixMultie {
    // Doing a matrix multiplication B.A
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
        int rowsA = matrixA.length;    // Rows in matrix A
        int colsA = matrixA[0].length; // Each row is itself an array, and the length of each row represents the number of columns in the matrix
        int colsB = matrixB[0].length; // Each row is itself an array, and the length of each row represents the number of columns in the matrix

        // Result matrix
        int[][] resultMatrix = new int[rowsA][colsB]; // Result matrix is 3x3; Length = 3

        // Matrix multiplication
        //A[m][n] * B[n][p] = C[m][p]
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        } 

        // Display the result
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }        
    }
}