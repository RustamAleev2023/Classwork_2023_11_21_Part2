import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    //Task1
    //Угадай случайное число
    public static void task1() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        //System.out.println(randomNumber);
        System.out.println("Угадайте число от 1 до 100");
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        int counter = 0;

        while (num != randomNumber) {
            System.out.println("Введите число");
            num = scanner.nextInt();

            if (num > randomNumber) {
                System.out.println("Меньше");
            }
            if (num < randomNumber) {
                System.out.println("Больше");
            }
            counter++;
        }

        System.out.println("Вы отгадали за " + counter + " попыток");
    }

    //Task2
    //Калькулятор матриц
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите " + i + "ый элемент матрицы");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Введите необходимое действие (сложение/вычитание/умножение)");
        String s = scanner.next();

        switch (s) {
            case "сложение" -> {
                int sum = 0;
                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                }
                System.out.println("Сумма = " + sum);
            }
            case "вычитание" -> {
                int result = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    result -= numbers[i];
                }
                System.out.println("Разность = " + result);
            }
            case "умножение" -> {
                int result = 1;
                for (int i = 0; i < numbers.length; i++) {
                    result *= numbers[i];
                }
                System.out.println("Произведение = " + result);
            }
            default -> System.out.println("Такой операции не существует");
        }
    }

    //Task3
    //Расписание занятий

    public static void task3() {
        String[] schedule = new String[7];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие (добавить/удалить/просмотреть/exit)");
            String action = scanner.next();

            if (action.equalsIgnoreCase("exit")) {
                break;
            }

            if (action.equalsIgnoreCase("добавить")) {
                System.out.println("Выберите номер дня недели (от 1 до 7)");
                int weekDay = scanner.nextInt();
                System.out.println("Введите запись");
                String notes = scanner.next();
                schedule[weekDay - 1] = notes;
            }
            if (action.equalsIgnoreCase("удалить")) {
                System.out.println("Выберите номер дня недели (от 1 до 7) расписание которого Вы хотите удалить");
                int weekDay = scanner.nextInt();
                schedule[weekDay - 1] = null;
            }
            if (action.equalsIgnoreCase("просмотреть")) {
                for (String s : schedule) {
                    System.out.println(s);
                }
            }
        }

    }
}

