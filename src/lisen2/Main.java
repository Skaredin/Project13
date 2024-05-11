package lisen2;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            System.out.println("1");
            throw new Exception("Тоже самое");
        } catch (Exception e) {
            System.out.println("2 " + e.getMessage());
        }
        System.out.println("3");
    }
}
