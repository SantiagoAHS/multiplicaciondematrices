import java.util.Scanner;

public class Matrix2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de filas de la matriz A: ");
        int filasA = sc.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz A: ");
        int columnasA = sc.nextInt();

        System.out.println("Ingrese el número de filas de la matriz B: ");
        int filasB = sc.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz B: ");
        int columnasB = sc.nextInt();

        if (columnasA != filasB) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de la matriz A debe ser igual al número de filas de la matriz B.");
            sc.close();
            return;
        }

        int[][] a = new int[filasA][columnasA];
        int[][] b = new int[filasB][columnasB];

        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la matriz B:");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz A:");
        imprimirMatriz(a);

        System.out.println("Matriz B:");
        imprimirMatriz(b);

        int[][] c = multiplicacionMatrices(a, b);

        System.out.println("La matriz resultante de la multiplicación es:");
        imprimirMatriz(c);

        sc.close();
    }

    public static int[][] multiplicacionMatrices(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < c.length; i++)
            for (int j = 0; j < c[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
        return c;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
