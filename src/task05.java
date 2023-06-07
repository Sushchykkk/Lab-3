import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть початкову точку інтервалу: ");
        double start = scanner.nextDouble();
        System.out.print("Введіть кінцеву точку інтервалу: ");
        double end = scanner.nextDouble();
        System.out.print("Введіть крок: ");
        double step = scanner.nextDouble();
        int count = 0;

        // Використання циклу for
        System.out.println("За допомогою циклу for:");
        for (double x = start; x <= end; x += step) {
            double y = f(x);
            System.out.println("f(" + x + ") = " + y);
            if (y >= start && y <= end) {
                count++;
            }
        }
        printResult(count);

        // Використання циклу while
        System.out.println("За допомогою циклу while:");
        double x = start;
        while (x <= end) {
            double y = f(x);
            System.out.println("f(" + x + ") = " + y);
            if (y >= start && y <= end) {
                count++;
            }
            x += step;
        }
        printResult(count);
    }

    public static double f(double x) {
        // Функція, яку необхідно протабулювати
        return Math.pow(x, 2);
    }

    public static void printResult(int count) {
        if (count == 0) {
            System.out.println("Значень функції в заданому діапазоні немає");
        } else {
            System.out.println("Кількість значень функції в заданому діапазоні: " + count);
        }
    }
}
