package lab1;

import java.util.Scanner;

public class Task3Vector {
    public static void run(Scanner scan) {
        System.out.print("Введіть координату x: ");

        if (!scan.hasNextDouble()) {
            System.out.println("Помилка! Потрібно ввести число.");
            scan.next();
            return;
        }

        double x = scan.nextDouble();

        if (!Double.isFinite(x)) {
            System.out.println("Координата повинна бути скінченним числом.");
            return;
        }

        System.out.print("Введіть координату y: ");

        if (!scan.hasNextDouble()) {
            System.out.println("Помилка! Потрібно ввести число.");
            scan.next();
            return;
        }

        double y = scan.nextDouble();

        if (!Double.isFinite(y)) {
            System.out.println("Координата повинна бути скінченним числом.");
            return;
        }

        double length = Math.hypot(x, y);

        System.out.printf("Довжина вектора: %.2f%n", length);
    }
}
