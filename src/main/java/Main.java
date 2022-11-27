import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей:");
        while (!scanner.hasNextInt()) {
            System.out.println("Вводить нужно только цифры! Попробуйте заново:");
            scanner.nextLine();
        }
        int numberOfPeople = scanner.nextInt();
        while (numberOfPeople <= 1) {
            if (numberOfPeople < 1) {
                System.out.println("Введенно не корректное количество людей! Попробуйте занво:");
                numberOfPeople = scanner.nextInt();
            }
            if (numberOfPeople == 1) {
                System.out.println("Вы один и платите только вы. Попробуйте занво: ");
                numberOfPeople = scanner.nextInt();
            }
        }

        Calculator calculator = new Calculator();
        calculator.costCalculator();

        double needPay = Calculator.priceSum / numberOfPeople;

        System.out.println("Список выбранных товаров: ");

        for (String str : calculator.menuList) {
            System.out.println(str);
        }
            System.out.printf("Общая сумма: %.2f %s%n", Calculator.priceSum, Calculator.costRounding(Calculator.priceSum));
            System.out.printf("Кол-во человек: %s%n", numberOfPeople);
            System.out.printf("Каждый платит по: %.2f %s%n", needPay, Calculator.costRounding(needPay));


        }
    }



