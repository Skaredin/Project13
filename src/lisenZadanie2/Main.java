package lisenZadanie2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            String sizeInput = scanner.nextLine();
            if (!sizeInput.matches("\\d+")) {
                throw new NumberFormatException("Ошибка: введено не число. Повторите ввод.");
            }
            int size = Integer.parseInt(sizeInput);
            if (size <= 0) {
                throw new IllegalArgumentException("Ошибка: размер массива должен быть положительным числом");
            }
            int[] array = new int[size];
            int positiveCount = 0;
            int sum = 0;
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                try {
                    String input = scanner.next();
                    int num = Integer.parseInt(input);
                    if (num > 0) {
                        positiveCount++;
                        sum += num;
                        array[i] = num;
                        System.out.println("Победа!");
                    } else {
                        throw new IllegalArgumentException("Ошибка: элемент должен быть положительным числом. Повторите ввод.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введена строка вместо числа. Повторите ввод.");
                    scanner.nextLine();
                    i--;
                }
            }
            if (positiveCount == 0) {
                System.out.println("Ошибка: положительные элементы отсутствуют.");
            } else {
                double average = (double) sum / positiveCount;
                System.out.println("Среднее значение среди положительных элементов: " + average);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}