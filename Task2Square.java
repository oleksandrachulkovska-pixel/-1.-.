package lab1;

import java.util.Scanner;

public class Task2Square {
    public static void run(Scanner scan) {
        System.out.print("Введіть сторону квадрата a: ");

        if (!scan.hasNextDouble()) {
            System.out.println("Помилка! Потрібно ввести число.");
            scan.next();
            return;
        }

        double a = scan.nextDouble();

        if (!Double.isFinite(a) || a <= 0) {
            System.out.println(
                    "Сторона квадрата повинна бути скінченним числом, більшим за 0."
            );
            return;
        }

        double area = a * a;

        System.out.printf("Площа квадрата: %.2f%n", area);
    }
}
