package org.example;

import java.util.Random;
import java.util.Scanner;

public class MatrixApp {
    private static final int MAX_SIZE = 20;
    private static final int RANDOM_MIN = -50;
    private static final int RANDOM_MAX = 50;

    private MatrixApp() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = readInt(scanner, "Введіть кількість рядків (1-20): ", 1, MAX_SIZE);
        int cols = readInt(scanner, "Введіть кількість стовпців (1-20): ", 1, MAX_SIZE);

        System.out.print("Оберіть спосіб заповнення матриці (1 - вручну, 2 - випадково): ");
        int choice = scanner.nextInt();

        int[][] matrix = (choice == 1)
                ? fillMatrixManual(scanner, rows, cols)
                : fillMatrixRandom(rows, cols);

        System.out.println("\nМатриця:");
        printMatrix(matrix);

        int min = findMin(matrix);
        int max = findMax(matrix);
        double average = calculateAverage(matrix);

        System.out.println("\nМінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.printf("Середнє арифметичне: %.2f\n", average);

        scanner.close();
    }

    private static int readInt(Scanner scanner, String prompt, int min, int max) {
        int value;
        do {
            System.out.print(prompt);
            value = scanner.nextInt();
        } while (value < min || value > max);
        return value;
    }

    private static int[][] fillMatrixManual(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("matrix[%d][%d] = ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] fillMatrixRandom(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%5d", value);
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) min = value;
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) max = value;
            }
        }
        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }

    public static MatrixApp createMatrixApp() {
        return new MatrixApp();
    }
}
