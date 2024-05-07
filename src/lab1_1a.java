import java.util.Scanner;

public class lab1_1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення f: ");
        int f = scanner.nextInt();
        System.out.print("Введіть значення r: ");
        int r = scanner.nextInt();

        double e1 = Double.NaN;
        double e2 = Double.NaN;
        double e3 = Double.NaN;

        if (f == 5) {
            e1 = 3 * f + 2 * r;
        }
        if (f == 0) {
            System.out.println("Для f = 0 обчислення не можливе (e2 = NaN).");
        }
        if (f < -5){
            System.out.println("Обчислення не передбачено");
        }
        if (f > 5){
            System.out.println("Обчислення не передбачена");
        }
        if (f == -5) {
            e3 = f * r - 9;
        }

        if (!Double.isNaN(e1)) {
            System.out.println("Значення e1: " + e1);
        }
        if (!Double.isNaN(e2)) {
            System.out.println("Значення e2: " + e2);
        }
        if (!Double.isNaN(e3)) {
            System.out.println("Значення e3: " + e3);
        }
    }
}
