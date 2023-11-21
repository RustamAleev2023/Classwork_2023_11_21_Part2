import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
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
}
