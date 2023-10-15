package com.kiruha.calcul.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculateServiceTest {
    private final CalculateService calculatorService = new CalculateService();

    @Test
    void calculator() {
        //Подготовка ожидаемого результата
        String expectedMessage = "Добро пожаловать в калькулятор!";

        //Начало теста
        String actualMessage = calculatorService.calculator();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void plus_success_when_num1_32_And_num2_14_ArePoitive() {
        //Подготовка входных данных
        double num1 = 32;
        double num2 = 14;

        //Подготовка ожидаемого результата
        String expectedResult = "Сложение: " + calculatorService.checkNumber(num1, num2, "+");

        //Начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_success_when_num1_deg32_And_num2_14_ArePoitive() {
        //Подготовка входных данных
        double num1 = -32;
        double num2 = 14;

        //Подготовка ожидаемого результата
        String expectedResult = "Сложение: " + calculatorService.checkNumber(num1, num2, "+");

        //Начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success_when_num1_33_And_num2_63_ArePoitive() {
        //Подготовка входных данных
        double num1 = 33;
        double num2 = 63;

        //Подготовка ожидаемого результата
        String expectedResult = "Вычитание: " + calculatorService.checkNumber(num1, num2, "-");

        //Начало теста
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success_when_num1_33_And_num2_deg63_ArePoitive() {
        //Подготовка входных данных
        double num1 = 33;
        double num2 = -63;

        //Подготовка ожидаемого результата
        String expectedResult = "Вычитание: " + calculatorService.checkNumber(num1, num2, "-");

        //Начало теста
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void div_success_when_num1_deg1_and_num2_3_ArePoitive() {
        //Подготовка входных данных
        double num1 = -1;
        double num2 = 3;

        //Подготовка ожидаемого результата
        String expectedResult = "Деление: " + calculatorService.checkNumber(num1, num2, "/");

        //Начало теста
        String actualResult = calculatorService.div(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void div_success_when_num1_1_and_num2_3_ArePoitive() {
        //Подготовка входных данных
        double num1 = 1;
        double num2 = 3;

        //Подготовка ожидаемого результата
        String expectedResult = "Деление: " + calculatorService.checkNumber(num1, num2, "/");

        //Начало теста
        String actualResult = calculatorService.div(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void div_withException() {
        //Подготовка входных данных
        double num1 = 5;
        double num2 = 0;

        //Подготовка ожидаемого результата
        String expectedMessage = "На ноль делить нельзя!";

        //Начало теста
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculatorService.div(num1, num2)
        );
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    void mult_success_when_num1_39_and_num2_6_ArePoitive() {
        //Подготовка входных данных
        double num1 = 39;
        double num2 = 6;

        //Подготовка ожидаемого результата
        String expectedResult = "Умножение: " + calculatorService.checkNumber(num1, num2, "*");

        //Начало теста
        String actualResult = calculatorService.mult(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void mult_success_when_num1_deg39_and_num2_6_ArePoitive() {
        //Подготовка входных данных
        double num1 = -39;
        double num2 = 6;

        //Подготовка ожидаемого результата
        String expectedResult = "Умножение: " + calculatorService.checkNumber(num1, num2, "*");

        //Начало теста
        String actualResult = calculatorService.mult(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
}