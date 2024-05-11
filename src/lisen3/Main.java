package lisen3;
public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }

    public static void main(String[] args) {
        System.out.println("0");
        for (int i = 0; i <= 11; i++) {
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
                System.out.println("6");
            } else if (i == 6) {
                action6();
            } else if (i == 7) {
                action7();
            } else if (i == 8) {
                System.out.println(ANSI_CYAN + "Задание к 9-10");
                System.out.println(action8()+" Вывод (NullPointerException)");
                System.out.println(ANSI_RESET);
            } else if (i == 9) {
                m(null, 0.000001);
            } else if (i == 10) {
                System.out.println(ANSI_BLUE_BACKGROUND + "Задание 13");
                try {
                    int l = 0;
                    System.out.println("размер массива= " + l);
                    int h = 10 / l;
                    args[l + 1] = "10";
                } catch (ArithmeticException e) {
                    System.out.println("Деление на ноль");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Индекс не существует");
                }try {
                    int l = 1;
                    System.out.println("размер массива= " + l);
                    int h = 10 / l;
                    args[l + 1] = "10";
                } catch (ArithmeticException e) {
                    System.out.println("Деление на ноль");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Индекс не существует");
                }
                System.out.println(ANSI_RESET);


            } else if (i == 11) {

                System.out.println(ANSI_WHITE_BACKGROUND+ "Задание 14");
                try {
                    int l = args.length;
                    System.out.println("размер массива= " + l);
                    m(l);
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка: Деление на ноль");
                }
                System.out.println(ANSI_RESET);

            }

        }

    }

    public static void action1() {
        try {
            throw new NullPointerException("null");
        } catch (NullPointerException e) {
            System.out.println('1' + " Выводит если null" + ANSI_RED + " Повторяется из 4 примера (NullPointerException)" + ANSI_RESET);
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
            System.out.println("2" + " Выводит если есть что то (Похож на Exception и RuntimeException) (NullPointerException)");
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
            throw new StackOverflowError(ANSI_RED + " Error лень делать отдельный пример из 4 примера (Error)" + ANSI_RESET);
        } catch (NullPointerException e) {
            System.out.println('1');
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Error e) {
            System.out.println("4" + e.getMessage());
        }

    }

    public static void action5() {

        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("5" + ANSI_YELLOW + " Выводит если try возвращает 0, Лень делать ещё 1 вью, тут добавлю (ArithmeticException)" + ANSI_RESET);
        } catch (Exception e) {
            System.out.println("2");
        }

    }

    public static void action6() {
        System.out.println();
        System.out.println(ANSI_BLUE + "Задание к 7");

        for (int t = -1; t <= 1; t++) {
            try {
                int result = 5 / t;
                throw new NullPointerException("null");

            } catch (NullPointerException e) {
                int d = t+1;
                System.out.println(d+ " Вывидет 2 раза так как он задан глобально (NullPointerException)");

            } catch (ArithmeticException e) {
                int d = t+1;
                System.out.println(d+" Число равняется 0 это число -->("+t+") значит выводим если не равняется то не выводим (ArithmeticException)");

            }
        }
        System.out.println(ANSI_RESET);
    }
    public static void action7() {
        System.out.println(ANSI_BLUE + "Задание к 8");

        for (int t = -1; t <= 1; t++) {
            try {
                int result = 5 / t;
                throw new NullPointerException("null");

            } catch (NullPointerException e) {
                int d = t+1;
                System.out.println(d+ " Вывидет 2 раза так как он задан глобально (NullPointerException)");

            } catch (ArithmeticException e) {
                int d = t+1;
                System.out.println(d+" Число равняется 0 это число -->("+t+") значит выводим если не равняется то не выводим (ArithmeticException)");

            }finally {
                System.out.println(ANSI_PURPLE+"Это finally"+" Он выполняется каждый раз (finally)"+ANSI_BLUE);
            }
        }
        System.out.println(ANSI_RESET);
    }
    public static int action8() {


        for (int t = -1; t <= 1; t++) {
            try {

                //Если Занчение 0 то он попадает в (ArithmeticException) и выходит из него и возвращает 10
                int result = 5 / t;
                //Если он попадает сюда (ArithmeticException) то он будет возвращать 20
                throw new NullPointerException("null");
                //Если он попадает сюда (finally) То он выводит 55, если его раскомитить
                //Если бы не было (finally) то он бы вывил 81, если закомитить 2 строки которые находятся выше(Ну или сделать что бы они не входили в catch)

            } catch (NullPointerException e) {
                int d = t+1;

                System.out.println(atec1()+" Вывод (ArithmeticException)");
                return 4;

            } catch (ArithmeticException e) {
                int d = t+1;
                System.out.println(d+" Число равняется 0 это число -->("+t+") значит выводим если не равняется то не выводим (ArithmeticException)");
                return 10;
            }

            //finally {
             //   System.out.println(ANSI_PURPLE+"Это finally"+" Он выполняется каждый раз (finally)"+ANSI_BLUE);
            //    return 55;
           // }
        }

        return 81;

    }
    public static int atec1() {


        for (int t = -1; t <= 1; t++) {
            try {

                //Если Занчение 0 то он попадает в (ArithmeticException) и выходит из него и возвращает 10
                int result = 5 / t;
                //Если он попадает сюда (ArithmeticException) то он будет возвращать 20
                //throw new NullPointerException("null");
                //Если он попадает сюда (finally) То он выводит 55, если его раскомитить
                //Если бы не было (finally) то он бы вывил 81, если закомитить 2 строки которые находятся выше(Ну или сделать что бы они не входили в catch)

            } catch (NullPointerException e) {
                int d = t+1;
                System.out.println(1+ " Вывидет 2 раза так как он задан глобально (NullPointerException)");
                return 20;

            } catch (ArithmeticException e) {
                int d = t+1;
                System.out.println(atec2()+" Вывод (finally)");
                return 3;

            }

            //finally {
            //   System.out.println(ANSI_PURPLE+"Это finally"+" Он выполняется каждый раз (finally)"+ANSI_BLUE);
            //    return 55;
            // }
        }


        return 81;

    }
    public static int atec2() {

        for (int t = -1; t <= 1; t++) {
            try {

                //Если Занчение 0 то он попадает в (ArithmeticException) и выходит из него и возвращает 10
                //int result = 5 / t;
                //Если он попадает сюда (ArithmeticException) то он будет возвращать 20
                //throw new NullPointerException("null");
                //Если он попадает сюда (finally) То он выводит 55, если его раскомитить
                //Если бы не было (finally) то он бы вывил 81, если закомитить 2 строки которые находятся выше(Ну или сделать что бы они не входили в catch)

            } catch (NullPointerException e) {
                int d = t+1;
                System.out.println(1+ " Вывидет 2 раза так как он задан глобально (NullPointerException)");
                return 20;
            } catch (ArithmeticException e) {
                int d = t+1;
                System.out.println(2+" Число равняется 0 это число -->("+t+") значит выводим если не равняется то не выводим (ArithmeticException)");
                return 10;
            }finally {
                System.out.println(atec3()+" Если try проигнорировал, catch тоже проигнорировал, и finally тоже проигнорировал, то попал в самый конец и вывил 1");
               return 2;
            }
        }


        return 81;

    }
    public static int atec3() {


        for (int t = -1; t <= 1; t++) {
            try {

                //Если Занчение 0 то он попадает в (ArithmeticException) и выходит из него и возвращает 10
                //int result = 5 / t;
                //Если он попадает сюда (ArithmeticException) то он будет возвращать 20
                //throw new NullPointerException("null");
                //Если он попадает сюда (finally) То он выводит 55, если его раскомитить
                //Если бы не было (finally) то он бы вывил 81, если закомитить 2 строки которые находятся выше(Ну или сделать что бы они не входили в catch)

            } catch (NullPointerException e) {
                int d = t+1;
                System.out.println(1+ " Вывидет 2 раза так как он задан глобально (NullPointerException)");
                return 20;
            } catch (ArithmeticException e) {
                int d = t+1;
                System.out.println(2+" Число равняется 0 это число -->("+t+") значит выводим если не равняется то не выводим (ArithmeticException)");
                return 10;
            }
        }


        return 1;

    }
    public static void m(String str, double chislo) {
        System.out.println(ANSI_WHITE + "Задание к 12");
        if (str == null) {
            try {
                throw new IllegalArgumentException("Строка введена неверно или пуста");
            } catch (IllegalArgumentException e) {
              System.out.println(e.getMessage());
            }
        }
        if (chislo > 0.001) {
            try {
                throw new IllegalArgumentException("Неверное число");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(ANSI_RESET);
    }



}