public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Dimensions
        int rowSizeA = matrixA.length;
        int columnSizeA = matrixA[0].length;
        int columnSizeB = matrixB[0].length;

        // Result matrix
        int[][] resultMatrix = new int[rowSizeA][columnSizeB];

        // Matrix multiplication
        for (int i = 0; i < rowSizeA; i++) {
            for (int j = 0; j < columnSizeB; j++) {
                for (int k = 0; k < columnSizeA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowSizeA; i++) {
            for (int j = 0; j < columnSizeB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
