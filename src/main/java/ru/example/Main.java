package ru.example;

import lombok.extern.slf4j.Slf4j;

import static ru.example.Const.PATTERN_EXIT;
import static ru.example.Const.PATTERN_INPUT_STRING;
import static ru.example.Const.PATTERN_OPERATOR;
import static ru.example.Const.PATTERN_SPLIT;
import static ru.example.Const.RESULT;

@Slf4j
public class Main {

    private static final Integer VALUE_ONE = 0;
    private static final Integer VALUE_TWO = 1;

    public static void main(String[] args) {
        Reader reader = new Reader();
        String input;

        while (true) {
            input = reader.reader();

            if (input.equals(PATTERN_EXIT)) {
                return;
            }
            try {
                String result = calc(input);
                System.out.println(RESULT + result);
            } catch (Exception e) {
                log.error("throws Exception");
                return;
            }
        }
    }

    /**
     * Выполняет арифметическое вычисление на основе строки ввода.
     * Строка должна соответствовать определённому шаблону (`PATTERN_INPUT_STRING`).
     * Поддерживаются следующие операторы: +, -, *, /.
     *
     * @param input строка ввода, содержащая математическое выражение.
     * @return строковое представление результата вычисления.
     * @throws Exception если строка ввода не соответствует шаблону, или содержит некорректный оператор.
     */
    public static String calc(String input) throws Exception {
        if (!input.matches(PATTERN_INPUT_STRING)) {
            throw new Exception();
        }

        String[] parts = input.split(PATTERN_SPLIT);
        String operator = input.replaceAll(PATTERN_OPERATOR, "");

        int a = Integer.parseInt(parts[VALUE_ONE]);
        int b = Integer.parseInt(parts[VALUE_TWO]);
        int result;

        switch (operator) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
            default -> throw new Exception();
        }

        return String.valueOf(result);
    }
}