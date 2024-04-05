import java.time.LocalDate;

public class Homework {

    public static void task1() {

        int year = 2021;

        checkYearAndPrintResult(year);
    }

    public static void checkYearAndPrintResult(int year) {

        if (year > 1584 && year % 4 == 0 && !(year % 100 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static void task2() {

        int clientOS = 0;
        int clientDeviceYear = LocalDate.now().getYear();

        checkClientDeviceYearAndClientOS(clientDeviceYear, clientOS);
    }

    public static void checkClientDeviceYearAndClientOS(int year, int OS) {

        if (year < 2015 && OS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year < 2015 && OS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (year >= 2015 && OS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (year >= 2015 && OS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой версии ПО нет");
        }
    }

    public static void task3() {

        int deliveryDistance = 95;

        System.out.println("Потребуется дней: " + calculationNumberOfDays(deliveryDistance));
    }

    public static int calculationNumberOfDays(int distance) {

        int days = 0;
        if (distance >= 100) {
            throw new RuntimeException("Доставки нет");
        } else if (distance < 20) {
            days += 1;
        } else if (distance >= 20 && distance < 60) {
            days += 2;
        } else if (distance >= 60 && distance < 100) {
            days += 3;
        }
        return days;
    }
}
