package ru.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MainTest {

    @Test
    void testCalcAddition() throws Exception {
        String input = "2 + 3";
        String result = Main.calc(input);
        assertEquals("5", result);
    }

    @Test
    void testCalcSubtraction() throws Exception {
        String input = "10 - 7";
        String result = Main.calc(input);
        assertEquals("3", result);
    }

    @Test
    void testCalcMultiplication() throws Exception {
        String input = "4 * 5";
        String result = Main.calc(input);
        assertEquals("20", result);
    }

    @Test
    void testCalcDivision() throws Exception {
        String input = "10 / 2";
        String result = Main.calc(input);
        assertEquals("5", result);
    }

    @Test
    void testShouldReturnExceptionCalcInvalidOperator() {
        String input = "4 & 5";
        Exception exception = assertThrows(Exception.class, () -> Main.calc(input));
        assertNotNull(exception);
    }

    @Test
    void testShouldReturnExceptionCalcInvalidInput() {
        String input = "abc";
        Exception exception = assertThrows(Exception.class, () -> Main.calc(input));
        assertNotNull(exception);
    }

    @Test
    void testShouldReturnExceptionCalcDivisionByZero() {
        String input = "10 / 0";
        Exception exception = assertThrows(Exception.class, () -> Main.calc(input));
        assertNotNull(exception);
    }

    @Test
    void testShouldReturnExceptionCalcIncorrectData() {
        String input = "10+1";
        Exception exception = assertThrows(Exception.class, () -> Main.calc(input));
        assertNotNull(exception);
    }

    @Test
    void testShouldReturnExceptionCalcIncorrectDataAddedSpaceAtEnd() {
        String input = "10 + 1 ";
        Exception exception = assertThrows(Exception.class, () -> Main.calc(input));
        assertNotNull(exception);
    }

    @Test
    void testShouldReturnExceptionCalcIncorrectDataAddedSpaceAtBegin() {
        String input = " 10 + 1";
        Exception exception = assertThrows(Exception.class, () -> Main.calc(input));
        assertNotNull(exception);
    }
}