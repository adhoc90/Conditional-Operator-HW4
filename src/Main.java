public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int age = 22;
        if (age >= 18) {
            System.out.println("Ты совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Ты не достиг совершеннолетия и нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int coldOutside = 10;
        if (coldOutside < 5) {
            System.out.println("На улице " + coldOutside + " градусов, нужно надеть шапку");
        }
        if (coldOutside > 5) {
            System.out.println("На улице " + coldOutside + " градусов, можно идти без шапки");

        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speedDriver = 100;
        if (speedDriver > 60) {
            System.out.println("Если скорость " + speedDriver + " ,то придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int age = 33;
        if (age >= 2 && age <= 6) {
            System.out.println("Тогда ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Тогда ему нужно ходить в в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Тогда ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Тогда ему нужно ходить на работу");
        } else {
            System.out.println("Данные не корректны");
        }
    }


    public static void task5() {
        System.out.println("Задача 5");

        int age = 7;
        boolean hasParent = true;

        if (age < 5) {
            System.out.println("Он не может кататься на атракционах");
        } else if (age > 5 && age < 14 && hasParent) {
            System.out.println("Может кататься в сопровождении врослого");

        } else if (age > 5 && age < 14 && !hasParent) {
            System.out.println("Если взрослого нет, то кататься нельзя");

        } else if (age > 14) {
            System.out.println("Может кататься без сопровождения взрослого");

        } else {
            System.out.println("Не корректные данные");


        }
    }

    public static void task6() {
        System.out.println("Задание 6");

        int numberOfPassengers = 90;

        if (numberOfPassengers > 0 && numberOfPassengers <= 60) {
            System.out.println("Есть сидячие места");

        } else if (numberOfPassengers > 60 && numberOfPassengers <= 102) {
            System.out.println("Есть стоячие места");

        } else {
            System.out.println("Мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Самое большое число: " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число: " + two);
        } else {
            System.out.println("Самое большое число: " + three);
        }
    }
}



