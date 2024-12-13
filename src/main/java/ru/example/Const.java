package ru.example;

public final class Const {

    private Const() {
    }

    public static final String PATTERN_INPUT_STRING = "^(10|[1-9])\\s([+\\-\\*/])\\s(10|[1-9])$";
    public static final String PATTERN_SPLIT = "\\s*[+\\-\\*/]\\s*";
    public static final String PATTERN_OPERATOR = "[^+\\-\\*/]";
    public static final String PATTERN_EXIT = "exit";

    public static final String ENTER_EXPRESSION = "Введите выражение: ";
    public static final String RESULT = "Результат: ";
}
