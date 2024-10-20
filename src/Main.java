public class Main {
    public static void main(String[] args) {
        // Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Задача 1");
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Задача 1");
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Задача 1");
            System.out.println("Ошибка: не удалось определить операционную систему.");
        }
        // Задача 2
        System.out.println("Задача 2");
        int os = 0;
        int clientDeviceYear = 2015; // указываем год выпуска телефона

        if (os == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (os == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке.");
        } else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке.");
        }
        // Задача 3
        int year = 2007;
        if (year <= 1584) {
            System.out.println("Задача 3");
            System.out.println("Год должен быть больше 1584.");
        } else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Задача 3");
            System.out.println(year + " год является високосным");
        } else {
            System.out.println("Задача 3");
            System.out.println(year + " год не является високосным");
        }
        // Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int days;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            days = -1;
        }
        if (days != -1) {
            System.out.println("Потребуется дней : " + days);
        } else {
            System.out.println("Доставки нет ");
        }
        // Задача 5
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца !");

        }
    }
}