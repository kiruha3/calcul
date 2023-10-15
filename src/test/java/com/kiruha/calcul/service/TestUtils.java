package com.kiruha.calcul.service;

public class TestUtils {
    public static Double simvoleAndResult(Double num1, Double num2, String simbol) {
        double result = 0;
        switch (simbol) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
        }
        return result;
    }

    public static String checkNumber(Double num1, Double num2, String simvol) {
        if (num1 == null || num2 == null) {
            return "Вы указали не полное колличество данных";
        } else {
            return num1 + " " + simvol + " " + num2 + "=" + simvoleAndResult(num1, num2, simvol);
        }
    }
}
