package lisen3;


import java.awt.*;

public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        System.out.println("0");
        for (int i = 0; i <= 5; i++) {
            if (i == 1) {
                action1();
            } else if (i == 2) {
                action2();
            } else if (i == 3) {
                action3();
            } else if (i == 4) {
                action4();
            } else if (i == 5) {
                action5();
            }
        }
        System.out.println("6");
    }

    public static void action1() {
        try {
            throw new NullPointerException("null");
        } catch (NullPointerException e) {
            System.out.println('1'+" Выводит если null" + ANSI_RED+" Повторяется из 4 примера (NullPointerException)"+ANSI_RESET);
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }

    }

    public static void action2() {
        try {
            throw new RuntimeException("Халява");
        } catch (NullPointerException e) {
            System.out.println('1');
        } catch (RuntimeException e) {
            System.out.println("2"+ " Выводит если есть что то (Похож на Exception и RuntimeException) (NullPointerException)");
        } catch (Exception e) {
            System.out.println("3");
        }

    }

    public static void action3() {
        try {
            throw new Exception(" Выводит если есть что то (Похож на Exception и RuntimeException) (Exception)");
        } catch (NullPointerException e) {
            System.out.println('1');
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3" + e.getMessage());
        }

    }
    public static void action4() {
        try {
            throw new StackOverflowError(ANSI_RED+" Error лень делать отдельный пример из 4 примера (Error)"+ANSI_RESET);
        } catch (NullPointerException e) {
            System.out.println('1');
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Error e) {
            System.out.println("4"+e.getMessage());
        }

    }
    public static void action5() {

        try {
           int result = 5/0;
        } catch (ArithmeticException e) {
            System.out.println("5"+ANSI_YELLOW+" Выводит если try возвращает 0, Лень делать ещё 1 вью, тут добавлю (ArithmeticException)"+ANSI_RESET );
        } catch (Exception e) {
            System.out.println("2");
        }

    }
}