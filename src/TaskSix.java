import java.util.Scanner;

public class TaskSix {
    // TODO: Напишите программу, которая определяет сезон года на основе месяца, введенного пользователем.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        int number = 0;
        // Цикл выполняется до тех пор, пока не будет введено целое число
        do {
            System.out.print("Введите номер месяца: ");
            result = scan.nextLine();
            try {
                number = Integer.parseInt(result);
                if (number >= 1 && number <= 12) {
                    break;
                } else {
                    System.out.println("Вы ввели неверный номер месяца");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число");
            }
        } while (true);

        switch (number) {
            case 12: {
                System.out.println("Декабрь находится в зимнем сезоне.");
                break;
            }
            case 1: {
                System.out.println("Январь находится в зимнем сезоне.");
                break;
            }
            case 2: {
                System.out.println("Февраль находится в зимнем сезоне.");
                break;
            }
            case 3: {
                System.out.println("Март находится в весеннем сезоне.");
                break;
            }
            case 4: {
                System.out.println("Апрель находится в весеннем сезоне.");
                break;
            }
            case 5: {
                System.out.println("Май находится в весеннем сезоне.");
                break;
            }
            case 6: {
                System.out.println("Июнь находится в летнем сезоне.");
                break;
            }
            case 7: {
                System.out.println("Июль находится в летнем сезоне.");
                break;
            }
            case 8: {
                System.out.println("Август находится в летнем сезоне.");
                break;
            }
            case 9: {
                System.out.println("Сентябрь находится в осеннем сезоне.");
                break;
            }
            case 10: {
                System.out.println("Октябрь находится в осеннем сезоне.");
                break;
            }
            case 11: {
                System.out.println("Ноябрь находится в осеннем сезоне.");
                break;
            }
        }
    }
}
