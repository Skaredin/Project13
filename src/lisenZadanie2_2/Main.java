package lisenZadanie2_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным числом.");
            }

            byte[] array = new byte[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                array[i] = scanner.nextByte();
            }

            byte sum = 0;
            for (byte b : array) {
                sum += b;
            }

            System.out.println("Сумма элементов массива: " + sum);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ошибка: Выход за диапазон byte.");
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
