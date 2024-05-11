package lisenZadanie2_1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void printColumn(int[][] matrix, int columnNumber) throws InvalidInputException, ColumnNotFoundException {
        if (columnNumber < 1 || columnNumber > matrix[0].length) {
            throw new InvalidInputException("Некорректный номер столбца");
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][columnNumber - 1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = 0;
        try {
            rows = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: Введено некорректное значение для количества строк");
            return;
        }

        System.out.print("Введите количество столбцов: ");
        int columns = 0;
        try {
            columns = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: Введено некорректное значение для количества столбцов");
            return;
        }

        int[][] matrix = new int[rows][columns];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    matrix[i][j] = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода: Введено некорректное значение для элемента матрицы");
                    return;
                }
            }
        }

        System.out.print("Введите номер столбца для вывода: ");
        int columnNumber = 0;
        try {
            columnNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода: Введено некорректное значение для номера столбца");
            return;
        }

        try {
            printColumn(matrix, columnNumber);
        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ColumnNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class ColumnNotFoundException extends Exception {
    public ColumnNotFoundException(String message) {
        super(message);
    }
}

