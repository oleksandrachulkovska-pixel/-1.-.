package lab1;

import java.util.Scanner;

public class Task1Formula {
    public static void run(Scanner scan) {
        System.out.print("Введіть x: ");

        if (!scan.hasNextDouble()) {
            System.out.println("Помилка! Потрібно ввести число.");
            scan.next();
            return;
        }

        double x = scan.nextDouble();
        double y = Math.sqrt(x * x + 4);

        System.out.printf("Результат: y = %.2f%n", y);
    }
}
