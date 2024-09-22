package com.Lab1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9));

        ArrayList<Number> originalNumbers = NumberOperations.getOriginalNumbers(numbers);
        printList("Числа у початковому вигляді:", originalNumbers,1);

        ArrayList<Integer> integers = NumberOperations.getAsIntegers(numbers);
        printList("Числа у форматі цілих чисел:", integers,0);

        ArrayList<Double> doubles = NumberOperations.getAsDoubles(numbers);
        printList("Числа у форматі дробових чисел з 2 знаками після коми:", doubles,2);

        ArrayList<Integer> integerNumbers = NumberOperations.extractIntegers(numbers);
        printList("Цілі числа:", integerNumbers,0);

        ArrayList<Double> doubleNumbers = NumberOperations.extractDoubles(numbers);
        printList("Дробові числа:", doubleNumbers,1);

        double product = NumberOperations.productOfFirstFive(numbers);
        System.out.printf("\nДобуток перших п'яти чисел: %.2f%n", product);
        }



    // Метод для виведення списку чисел
    public static <T> void printList(String message, ArrayList<T> list, int decimalPlaces) {
        System.out.println("\n" + message);

        // Формат для чисел з вказаною кількістю знаків після коми
        String format = "%." + decimalPlaces + "f%n";

        for (T item : list) {
            if (item instanceof Double) {
                System.out.printf(format, (Double) item);
            } else {
                System.out.println(item);
            }
        }
    }

}

