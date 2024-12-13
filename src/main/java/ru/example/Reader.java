package ru.example;

import java.util.Scanner;

import static ru.example.Const.ENTER_EXPRESSION;

class Reader {

    /**
     * Метод для считывания строки, введённой через консоль.
     * Выводит сообщение приглашения к вводу перед чтением.
     *
     * @return Введённая строка от пользователя.
     */
    public String reader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ENTER_EXPRESSION);
        return scanner.nextLine();
    }
}
