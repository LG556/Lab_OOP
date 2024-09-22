package com.Lab1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class NumberOperations {
    // Метод для повернення початкових чисел (без змін)
    public static ArrayList<Number> getOriginalNumbers(ArrayList<Number> numbers) {
        return new ArrayList<>(numbers);
    }

    // Метод для повернення чисел у форматі цілих чисел
    public static ArrayList<Integer> getAsIntegers(ArrayList<Number> numbers) {
        ArrayList<Integer> integerList = new ArrayList<>();
        for (Number number : numbers) {
            integerList.add(number.intValue());
        }
        return integerList;
    }

    // Метод для повернення чисел у форматі дробових чисел з 2 знаками після коми
    public static ArrayList<Double> getAsDoubles(ArrayList<Number> numbers) {
        ArrayList<Double> formattedNumbers = new ArrayList<>();

        for (Number num : numbers) {
            // Перетворення до Double
            double value = num.doubleValue();

            // Округлення до 2 знаків після коми
            BigDecimal roundedValue = new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);

            // Додавання до нового списку
            formattedNumbers.add(roundedValue.doubleValue());
        }

        return formattedNumbers;
    }

    // Метод для отримання списку цілих чисел
    public static ArrayList<Integer> extractIntegers(ArrayList<Number> numbers) {
        ArrayList<Integer> integerNumbers = new ArrayList<>();
        for (Number number : numbers) {
            if (number instanceof Integer) {
                integerNumbers.add((Integer) number);
            }
        }
        return integerNumbers;
    }

    // Метод для отримання списку дробових чисел
    public static ArrayList<Double> extractDoubles(ArrayList<Number> numbers) {
        ArrayList<Double> doubleNumbers = new ArrayList<>();
        for (Number number : numbers) {
            if (number instanceof Double) {
                doubleNumbers.add((Double) number);
            }
        }
        return doubleNumbers;
    }


    public static double productOfFirstFive(ArrayList<Number> numbers) {
        double product = 1.0; // Початкове значення добутку

        // Перебір перших п'яти чисел
        for (int i = 0; i < 5 && i < numbers.size(); i++) {
            product *= numbers.get(i).doubleValue(); // Перетворення числа до Double і множення
        }

        return product;
    }


}
