package com.kiruha.calcul.service;

import com.kiruha.calcul.intarfece.CalculateSirviceInterface;
import org.springframework.stereotype.Service;

@Service
public class CalculateService implements CalculateSirviceInterface {

    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String plus(Double num1, Double num2) {
        return "Сложение: "+checkNumber(num1, num2, "+");
    }

    @Override
    public String minus(Double num1, Double num2) {
        return "Вычитание: " +checkNumber(num1, num2, "-");
    }

    @Override
    public String div(Double num1, Double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return "Деление: "+checkNumber(num1, num2, "/");
    }

    @Override
    public String mult(Double num1, Double num2) {
        return "Умножение: "+checkNumber(num1, num2, "*");
    }

    @Override
    public Double simvoleAndResult(Double num1, Double num2, String simbol) {
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

    @Override
    public String checkNumber(Double num1, Double num2, String simvol) {
        if (num1 == null || num2 == null) {
            return "Вы указали не полное колличество данных";
        } else {
            return num1 +" "+ simvol+ " " + num2 + "=" + simvoleAndResult(num1, num2, simvol);
        }
    }

}

