public class MatrixMultiplication {
    public static void main(String[] args) {
        // Definir dos matrices A y B
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {1, 2, 3}
        };
        int[][] B = {
            {7, 8, 4, 7},
            {9, 10, 2, 5},
            {11, 12, 1, 3}
        };

        // Obtener las dimensiones de las matrices A y B
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        // Verificar si las matrices son multiplicables
        if (colsA != rowsB) {
            System.out.println("No se pueden multiplicar las matrices debido a dimensiones incorrectas.");
            return;
        }

        // Crear una matriz para el resultado C
        int[][] C = new int[rowsA][colsB];

        // Realizar la multiplicación de matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Imprimir la matriz resultante C
        System.out.println("Matriz A:");
        printMatrix(A);
        System.out.println("Matriz B:");
        printMatrix(B);
        System.out.println("Resultado de la multiplicación (Matriz C):");
        printMatrix(C);
    }

    // Método para imprimir una matriz
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
