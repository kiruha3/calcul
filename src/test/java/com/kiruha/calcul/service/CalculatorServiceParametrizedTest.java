package com.kiruha.calcul.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceParametrizedTest {
    private static final CalculateService calculateService = new CalculateService();

    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of("5", "5", "Сложение: " + TestUtils.checkNumber(5.0, 5.0, "+")),
                Arguments.of("5", "9", "Сложение: " + TestUtils.checkNumber(5.0, 9.0, "+")),
                Arguments.of("42", "1", "Сложение: " + TestUtils.checkNumber(42.0, 1.0, "+")),
                Arguments.of("0", "0", "Сложение: " + TestUtils.checkNumber(0.0, 0.0, "+"))
        );
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of("5", "5", "Вычитание: " + TestUtils.checkNumber(5.0, 5.0, "-")),
                Arguments.of("5", "9", "Вычитание: " + TestUtils.checkNumber(5.0, 9.0, "-")),
                Arguments.of("42", "1", "Вычитание: " + TestUtils.checkNumber(42.0, 1.0, "-")),
                Arguments.of("0", "0", "Вычитание: " + TestUtils.checkNumber(0.0, 0.0, "-"))
        );
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of("5", "5", "Умножение: " + TestUtils.checkNumber(5.0, 5.0, "*")),
                Arguments.of("5", "9", "Умножение: " + TestUtils.checkNumber(5.0, 9.0, "*")),
                Arguments.of("42", "1", "Умножение: " + TestUtils.checkNumber(42.0, 1.0, "*")),
                Arguments.of("0", "0", "Умножение: " + TestUtils.checkNumber(0.0, 0.0, "*"))
        );
    }

    public static Stream<Arguments> divParams() {
        return Stream.of(
                Arguments.of("5", "5", "Деление: " + TestUtils.checkNumber(5.0, 5.0, "/")),
                Arguments.of("5", "9", "Деление: " + TestUtils.checkNumber(5.0, 9.0, "/")),
                Arguments.of("42", "1", "Деление: " + TestUtils.checkNumber(42.0, 1.0, "/")),
                Arguments.of("0", "1", "Деление: " + TestUtils.checkNumber(0.0, 1.0, "/"))
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(double num1, double num2, String result) {
        assertEquals(result, calculateService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(double num1, double num2, String result) {
        assertEquals(result, calculateService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("divParams")
    void div(double num1, double num2, String result) {
        assertEquals(result, calculateService.div(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void mult(double num1, double num2, String result) {
        assertEquals(result, calculateService.mult(num1, num2));
    }
}