package lisen4;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1"+ e.getMessage());
        }
        System.out.println("2");
    }
}
