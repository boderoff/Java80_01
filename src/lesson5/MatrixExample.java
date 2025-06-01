package lesson5;

public class MatrixExample {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = new int[size][size];
        System.out.println("Таблица умножения 5х5: ");
        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < size + 1; j++) {
                matrix[i-1][j-1] = i * j;
                System.out.print(matrix[i-1][j-1] + "\t");
            }
            System.out.println();
        }

        int diagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }
        System.out.println("Сумма диагоналей = " + diagonalSum);

    }
}
