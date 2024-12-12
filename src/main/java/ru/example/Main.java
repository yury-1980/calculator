package ru.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String input = scanner.nextLine();
        try {
            String result = calc(input);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("throws Exception");
        }
    }

    public static String calc(String input) throws Exception {
        // Удаляем лишние пробелы и проверяем корректность ввода
       // input = input.strip();// TODO: 12.12.2024 удалить
        String regex = "^(10|[1-9])\\s([+\\-\\*/])\\s(10|[1-9])$";
        if (!input.matches(regex)) {
            throw new Exception("Некорректный формат ввода");
        }

        // Разбиваем строку на операнды и оператор
        String[] parts = input.split("\\s*[+\\-\\*/]\\s*");
        String operator = input.replaceAll("[^+\\-\\*/]", "");//.strip();

        int a = Integer.parseInt(parts[0]);//.strip());
        int b = Integer.parseInt(parts[1]);//.strip());

        // Проверяем границы значений
//        if (a < 1 || a > 10 || b < 1 || b > 10) {
//            throw new Exception("Числа должны быть в пределах от 1 до 10");
//        }

        // Выполняем операцию
        int result;
        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
//            {
//                if (b == 0) {// TODO: 12.12.2024 лишнее
//                    throw new Exception("Деление на ноль");
//                }
//            }
            default -> throw new Exception("Неизвестный оператор");
        }

        return String.valueOf(result);
    }
}