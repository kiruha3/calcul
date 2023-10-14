package com.kiruha.calcul.intarfece;

public interface CalculateSirviceInterface {
    String plus(Double num1, Double num2);

    String minus(Double num1, Double num2);

    String div(Double num1, Double num2);

    String mult(Double num1, Double num2);

    public default Double simvoleAndResult(Double num1, Double num2, String simbol) {
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

    public default String checkNumber(Double num1, Double num2, String simvol) {
        if (num1 == null || num2 == null) {
            return "Вы указали не полное колличество данных";
        } else {
            return "Сложение: " + num1 + "+" + num2 + "=" + simvoleAndResult(num1, num2, simvol);
        }
    }

}
