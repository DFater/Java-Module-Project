import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    List<String> menuList = new LinkedList<>();

    String stopWord = "завершить";
    String dishes;
    double price;
    static double priceSum;

    public void costCalculator() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите название еды:");
            dishes = scanner.nextLine();
            menuList.add(dishes);
            System.out.println("Введите стоимость в формате: \"'рубли.копейки' [10,45; 11,40]\"");
            while (!scanner.hasNextDouble()) {
                System.out.println("Вводить нужно только цифры! Попробуйте заново:");
                scanner.nextLine();
            }
            price = scanner.nextDouble();
            if (price > 0) {
                priceSum = priceSum + price;
                System.out.println("Товар успешно добавлен! ");
            }
            while (price <= 0) {
                if (price <= 0) {
                    System.out.println("Цена отрицательная, доходы мы еще не считаем! Введите заново: ");
                    price = scanner.nextDouble();
                    if (price > 0) {
                        priceSum = priceSum + price;
                        System.out.println("Товар успешно добавлен! ");
                        break;
                    }
                }
            }
            System.out.println("Если хотите продолжить введите - любой символ,если хотите остановиться введите 'завершить' ");
            dishes = scanner.next();
            if (dishes.equalsIgnoreCase(stopWord)) {
                break;
            }
        }
    }

    static String costRounding(double i) {
        i = Math.floor(i);
        double modularDivision = i % 10;
        if (modularDivision == 1) {
            return "рубль";
        } else if (modularDivision == 2 || modularDivision == 3 || modularDivision == 4) {
            return "рубля";
        }
        return "рублей";
    }
}

