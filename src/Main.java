import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
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

    //Task4
    //Конвертер
    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите что будем конвертировать (длина/объем/масса)");
            System.out.println("Для выхода наберите exit");
            String type = scanner.next();

            if (type.equalsIgnoreCase("exit")) {
                break;
            }
            if (type.equalsIgnoreCase("длина")) {
                System.out.println("Выберите, что вы хотите конвертировать (1 - метры/2 - дециметры/3 - сантиметры)");
                int from = scanner.nextInt();
                System.out.println("Введите значение");
                int valueFrom = scanner.nextInt();
                System.out.println("Выберите, во что вы хотите конвертировать (1 - метры / 2 - дециметры / 3 - сантиметры)");
                int to = scanner.nextInt();
                if (from == 1) {//метры
                    if (to == 1) { // в метры
                        System.out.println(valueFrom);
                    }
                    if (to == 2) {
                        System.out.println(valueFrom * 10);// в дециметры
                    }
                    if (to == 3) {
                        System.out.println(valueFrom * 100);// в сантиметры
                    }

                }
                if (from == 2) { // дециметры
                    if (to == 1) { // в метры
                        System.out.println(valueFrom / 10);
                    }
                    if (to == 2) { // в дециметры
                        System.out.println(valueFrom);
                    }
                    if (to == 3) { // в сантиметры
                        System.out.println(valueFrom * 10);
                    }
                }
                if (from == 3) { //сантиметры
                    if (to == 1) { // в метры
                        System.out.println(valueFrom / 100);
                    }
                    if (to == 2) { // в дециметры
                        System.out.println(valueFrom / 10);
                    }
                    if (to == 3) { // в сантиметры
                        System.out.println(valueFrom);
                    }
                }
            }
            if (type.equalsIgnoreCase("объем")) {
                System.out.println("Выберите, что вы хотите конвертировать (1 - метры куб. / 2 - дециметры куб. / 3 - сантиметры куб.)");
                int from = scanner.nextInt();
                System.out.println("Введите значение");
                int valueFrom = scanner.nextInt();
                System.out.println("Выберите, во что вы хотите конвертировать (1 - метры куб. / 2 - дециметры куб. / 3 - сантиметры куб.)");
                int to = scanner.nextInt();

                if (from == 1) {//метры куб
                    if (to == 1) { // в метры куб
                        System.out.println(valueFrom);
                    }
                    if (to == 2) {
                        System.out.println(valueFrom * 1000);// в дециметры куб
                    }
                    if (to == 3) {
                        System.out.println(valueFrom * 1_000_000);// в сантиметры куб
                    }

                }
                if (from == 2) { // дециметры куб
                    if (to == 1) { // в метры куб
                        System.out.println(valueFrom / 1000);
                    }
                    if (to == 2) { // в дециметры куб
                        System.out.println(valueFrom);
                    }
                    if (to == 3) { // в сантиметры куб
                        System.out.println(valueFrom * 1000);
                    }
                }
                if (from == 3) { //сантиметры куб
                    if (to == 1) { // в метры куб
                        System.out.println(valueFrom / 1_000_000);
                    }
                    if (to == 2) { // в дециметры куб
                        System.out.println(valueFrom / 1000);
                    }
                    if (to == 3) { // в сантиметры куб
                        System.out.println(valueFrom);
                    }
                }
            }
            if (type.equalsIgnoreCase("масса")) {
                System.out.println("Выберите, что вы хотите конвертировать (1 - тонна / 2 - килограмм / 3 - грамм)");
                int from = scanner.nextInt();
                System.out.println("Введите значение");
                int valueFrom = scanner.nextInt();
                System.out.println("Выберите, во что вы хотите конвертировать (1 - тонна / 2 - килограмм / 3 - грамм)");
                int to = scanner.nextInt();

                if (from == 1) {//тонна
                    if (to == 1) { // в тонна
                        System.out.println(valueFrom);
                    }
                    if (to == 2) {
                        System.out.println(valueFrom * 1000);// в кг
                    }
                    if (to == 3) {
                        System.out.println(valueFrom * 1_000_000);// в г
                    }

                }
                if (from == 2) { // кг
                    if (to == 1) { // в тонны
                        System.out.println(valueFrom / 1000);
                    }
                    if (to == 2) { // в кг
                        System.out.println(valueFrom);
                    }
                    if (to == 3) { // в г
                        System.out.println(valueFrom * 1000);
                    }
                }
                if (from == 3) { //г
                    if (to == 1) { // в тонны
                        System.out.println(valueFrom / 1_000_000);
                    }
                    if (to == 2) { // в кг
                        System.out.println(valueFrom / 1000);
                    }
                    if (to == 3) { // в г
                        System.out.println(valueFrom);
                    }
                }
            }
        }
    }

    //Task5
    //Крестики-нолики
    public static void task5() {
        char x = 'X';
        char o = '0';
        char empty = '_';

        //fill empty table
        char[][] field = new char[3][3];
        for (int j = 0; j < field.length; j++) {
            for (int i = 0; i < field[0].length; i++) {
                field[j][i] = empty;
            }
        }
        print(field);
    }
    public static void print(char[][] field) {
        for (int j = 0; j < field.length; j++) {
            for (int i = 0; i < field[0].length; i++) {
                System.out.print(field[j][i]);
            }
            System.out.println("");
        }

    }
}

