import java.util.Scanner;

public class lab1_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть координати першої точки (x1, y1):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Введіть координати другої точки (x2, y2):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Введіть координати третьої точки (x3, y3):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        if ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)) {
            System.out.println("Три точки лежать на одній прямій.");
        } else {
            System.out.println("Три точки не лежать на одній прямій.");
        }
    }
}
