import java.util.Scanner;
public class lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();
        System.out.print("Введіть значення y: ");
        double y = scanner.nextDouble();
        System.out.print("Введіть значення z: ");
        double z = scanner.nextDouble();
        double t = calculateFunction(x, y, z);
        if (!Double.isNaN(t)) {
            System.out.printf("Значення функції t: %.2f%n", t);
        } else {
            System.out.println("Увага: Результат невизначений.");
        }
    }
    public static double calculateFunction(double x, double y, double z) {
        double numerator = 3 * x / (z - 2 * y);
        double denominator = y * z - Math.pow(Math.sin(x), 2);
        if (denominator == 0) {
            System.out.println("Увага: Ділення на 0 у знаменнику. Результат невизначений.");
            return Double.NaN;
        }
        if (denominator < 0 || numerator < 0) {
            System.out.println("Увага: Взяття кореня з від'ємного числа або отримання негативного значення у чисельнику. Результат невизначений.");
            return Double.NaN;
        }
        double t = Math.sqrt(numerator - denominator);
        return t;
    }
}
