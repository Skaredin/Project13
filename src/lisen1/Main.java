package lisen1;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Исправил ошибку вывев только Message");
        } catch (RuntimeException e) {
            System.out.println("1 " + e.getMessage()); // Выводим только сообщение об ошибке
        }
        System.out.println("2");
    }
}
