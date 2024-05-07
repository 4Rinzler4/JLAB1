import java.util.Scanner;

public class lab1_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = false;
        String timeNumber = "";

        while (!isValidInput) {
            System.out.println("Введіть номер години (1-24):");
            String input = scanner.nextLine();

            try {
                int n = Integer.parseInt(input);
                if (n >= 1 && n <= 24) {
                    isValidInput = true;

                    switch (n) {
                        case 1:
                            timeNumber = "Перша година ночі";
                            break;
                        case 2:
                            timeNumber = "Друга година ночі";
                            break;
                        case 3:
                            timeNumber = "Третя година ночі";
                            break;
                        case 4:
                            timeNumber = "Четверта година ночі";
                            break;
                        case 5:
                            timeNumber = "П'ята година ранку";
                            break;
                        case 6:
                            timeNumber = "Шоста година ранку";
                            break;
                        case 7:
                            timeNumber = "Сьома година ранку";
                            break;
                        case 8:
                            timeNumber = "Восьма година ранку";
                            break;
                        case 9:
                            timeNumber = "Дев'ята година ранку";
                            break;
                        case 10:
                            timeNumber = "Десята година ранку";
                            break;
                        case 11:
                            timeNumber = "Одинадцята година ранку";
                            break;
                        case 12:
                            timeNumber = "Дванадцята година дня";
                            break;
                        case 13:
                            timeNumber = "Тринадцята година дня";
                            break;
                        case 14:
                            timeNumber = "Чотирнадцята година дня";
                            break;
                        case 15:
                            timeNumber = "П'ятнадцята година дня";
                            break;
                        case 16:
                            timeNumber = "Шістнадцята година дня";
                            break;
                        case 17:
                            timeNumber = "Сімнадцята година дня";
                            break;
                        case 18:
                            timeNumber = "Вісімнадцята година вечора";
                            break;
                        case 19:
                            timeNumber = "Дев'ятнадцята година вечора";
                            break;
                        case 20:
                            timeNumber = "Двадцята година вечора";
                            break;
                        case 21:
                            timeNumber = "Двадцять перша година вечора";
                            break;
                        case 22:
                            timeNumber = "Двадцять друга година вечора";
                            break;
                        case 23:
                            timeNumber = "Двадцять третя година вечора";
                            break;
                        case 24:
                            timeNumber = "Двадцять четверта година ночі";
                            break;
                        default:
                            timeNumber = "Невірний номер години";
                            isValidInput = false;
                            break;
                    }

                    System.out.println("Період дня за номером години " + n + ": " + timeNumber);
                } else {
                    System.out.println("Невірний ввід. Будь ласка, введіть ціле число від 1 до 24.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Невірний ввід. Будь ласка, введіть ціле число від 1 до 24.");
            }
        }
    }

    public String NumberToWord(int number) {
        throw new UnsupportedOperationException();
    }
}
