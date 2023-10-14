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
                Arguments.of("5", "5", "Сложение: " + calculateService.checkNumber(5.0, 5.0, "+")),
                Arguments.of("5", "9", "Сложение: " + calculateService.checkNumber(5.0, 9.0, "+")),
                Arguments.of("42", "1", "Сложение: " + calculateService.checkNumber(42.0, 1.0, "+")),
                Arguments.of("0", "0", "Сложение: " + calculateService.checkNumber(0.0, 0.0, "+"))
        );
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of("5", "5", "Вычитание: " + calculateService.checkNumber(5.0, 5.0, "-")),
                Arguments.of("5", "9", "Вычитание: " + calculateService.checkNumber(5.0, 9.0, "-")),
                Arguments.of("42", "1", "Вычитание: " + calculateService.checkNumber(42.0, 1.0, "-")),
                Arguments.of("0", "0", "Вычитание: " + calculateService.checkNumber(0.0, 0.0, "-"))
        );
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of("5", "5", "Умножение: " + calculateService.checkNumber(5.0, 5.0, "*")),
                Arguments.of("5", "9", "Умножение: " + calculateService.checkNumber(5.0, 9.0, "*")),
                Arguments.of("42", "1", "Умножение: " + calculateService.checkNumber(42.0, 1.0, "*")),
                Arguments.of("0", "0", "Умножение: " + calculateService.checkNumber(0.0, 0.0, "*"))
        );
    }

    public static Stream<Arguments> divParams() {
        return Stream.of(
                Arguments.of("5", "5", "Деление: " + calculateService.checkNumber(5.0, 5.0, "/")),
                Arguments.of("5", "9", "Деление: " + calculateService.checkNumber(5.0, 9.0, "/")),
                Arguments.of("42", "1", "Деление: " + calculateService.checkNumber(42.0, 1.0, "/")),
                Arguments.of("0", "1", "Деление: " + calculateService.checkNumber(0.0, 1.0, "/"))
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1, int num5, String result) {
        assertEquals(result, calculateService.plus((double) num1, (double) num5));
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1, int num5, String result) {
        assertEquals(result, calculateService.minus((double) num1, (double) num5));
    }

    @ParameterizedTest
    @MethodSource("divParams")
    void div(int num1, int num5, String result) {
        assertEquals(result, calculateService.div((double) num1, (double) num5));
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void mult(int num1, int num5, String result) {
        assertEquals(result, calculateService.mult((double) num1, (double) num5));
    }
}