package com.kiruha.calcul.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void plus_success() {
        //Подготовка входных данных
        int num1 = 32;
        int num2 = 14;

        //Подготовка ожидаемого результата
        String expectedResult = "Сложение: " + calculatorService.checkNumber((double)num1, (double)num2,"+");

        //Начало теста
        String actualResult = calculatorService.plus((double) num1, (double) num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success() {
        //Подготовка входных данных
        int num1 = 33;
        int num2 = 63;

        //Подготовка ожидаемого результата
        String expectedResult = "Вычитание: " + calculatorService.checkNumber((double)num1, (double)num2,"-");

        //Начало теста
        String actualResult = calculatorService.minus((double) num1, (double) num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void div_success() {
        //Подготовка входных данных
        int num1 = 1;
        int num2 = 3;

        //Подготовка ожидаемого результата
        String expectedResult = "Деление: " + calculatorService.checkNumber((double)num1, (double)num2,"/");

        //Начало теста
        String actualResult = calculatorService.div((double) num1, (double) num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void div_withException() {
        //Подготовка входных данных
        int num1 = 5;
        int num2 = 0;

        //Подготовка ожидаемого результата
        String expectedMessage = "На ноль делить нельзя!";

        //Начало теста
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculatorService.div((double) num1, (double) num2)
        );
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    void mult_success() {
        //Подготовка входных данных
        int num1 = 39;
        int num2 = 6;

        //Подготовка ожидаемого результата
        String expectedResult = "Умножение: " + calculatorService.checkNumber((double)num1, (double)num2,"*");

        //Начало теста
        String actualResult = calculatorService.mult((double) num1, (double) num2);
        assertEquals(expectedResult, actualResult);
    }
}